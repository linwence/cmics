package com.el.cmic.ws.service;


import com.el.cfg.domain.*;
import com.el.cmic.ws.domain.*;
import com.el.cmic.ws.mapper.*;
import com.el.utils.JdeDateUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by king_ on 2016/9/29.
 */
@Service
public class AddE01ToERPServiceImpl implements AddE01ToERPService {
    Logger logger = Logger.getLogger(AddE01ToERPServiceImpl.class);
    @Autowired
    F4101UpdateByLitmMapper f4101UpdateByLitmMapper;
    @Autowired
    FE84101UpdateByLitmMapper fe84101UpdateByLitmMapper;
    @Autowired
    FE84101ZUpdateByPKMapper fe84101ZUpdateByPKMapper;
    @Autowired
    F0101UpdateByPKMapper f0101UpdateByPKMapper;
    @Autowired
    FE84101ZSelectByE8ZZBM fe84101ZSelectByE8ZZBM;
    @Autowired
    FE80101UpdateByPKMapper fe80101UpdateByPKMapper;
    @Autowired
    FE80101SelectAn8ByNameMapper fe80101SelectAn8ByNameMapper;
    @Autowired
    FE841001UpdateByDocoMapper fe841001UpdateByDocoMapper;
    @Autowired
    FE84101SelectAitm fe84101SelectAitm;
    @Autowired
    FE84202BMapperC2 fe84202BMapperC2;
    @Autowired
    F00022MapperC f00022MapperC;

    @Autowired
    F0005DMapper f0005DMapper;
    @Autowired
    F0005Mapper f0005Mapper;

    @Value("${schema}")
    private String schema;


    @Value("${ctlSchema}")
    private String dbtype;



    @Transactional
    public String AddE01ToERP(PhE001OutHeader phE001OutHeader, PhE001OutMain phE001OutMain, PhE001OutsublineB phE001OutsublineB,String no,String co,String reqno) {
       // try {
            updateF4101(phE001OutHeader, phE001OutMain, no);
            //out       updateF0101(phE001OutMain);
            updateFE84101(phE001OutHeader, phE001OutMain, phE001OutsublineB, no);
            updateFE84101Z(phE001OutMain, phE001OutsublineB, no, co,reqno);
            //updateFE80101(phE001OutMain);
            if(phE001OutHeader.getFunctype().equals("ADD")){
                updateFE84101YON(no);
                updateFe841001flag(no);
            }
      //  if(phE001OutHeader.getFunctype().equals("MOD")){
            updateFE84101bgbs(no);
    //    }

       /* }catch (Exception e){
            logger.error("----------------------------------------------------------------------------------------------------");
            logger.error("E01更新失败"+e.getMessage());
            logger.error("----------------------------------------------------------------------------------------------------");
        }*/

        return null;
    }

    @Transactional
    public String updateF4101(PhE001OutHeader phE001OutHeader,  PhE001OutMain phE001OutMain,String no){
        logger.info("E01开始更新表F4101");
        /*String TemporaryCode = "";
        String FormalCode = "";*/
        F4101 f4101 =new F4101();
        List<PhE001OutHeaderCode> phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        /*for(PhE001OutHeaderCode tmp :phE001OutHeaderCodes){
            if(tmp.getCodetype().equals("0")){
                TemporaryCode = tmp.getCodevalue();
            }

            if(tmp.getCodetype().equals("1")){
                FormalCode = tmp.getCodevalue();
            }
        }*/
        f4101.setImlitm(no);
        //f4101.setImaitm(FormalCode);
       //--------------------------------------------------------------- f4101.setImdsc2(phE001OutMain.getProducttype());
        f4101.setImdsc1(phE001OutMain.getSync());
     //   f4101.setImuom1(phE001OutMain.getPk_weight());
        f4101.setImuom1(f0005DMapper.selectF0005D(dbtype,"00","UM",phE001OutMain.getPk_weight()));
     //   f4101.setImsrp3(phE001OutMain.getPk_productclass());
      //  f4101.setImsrp3(f0005Mapper.selectF0005(dbtype,"E8","14",phE001OutMain.getPk_productclass()));
     //   f4101.setImsrp4(phE001OutMain.getPk_department());
    //    f4101.setImsrp4(f0005Mapper.selectF0005(dbtype,"E8","15",phE001OutMain.getPk_yltsfl()));

        int i =f4101UpdateByLitmMapper.updateByLitmSelective(schema,f4101,phE001OutHeader.getDatatype());
        logger.info("成功");
        return null;
        //Litm Aitm多对一问题--------------------------《count》-----------------------------------------------------------
    }

    @Transactional
    public String updateFE84101(PhE001OutHeader phE001OutHeader,PhE001OutMain phE001OutMain,PhE001OutsublineB phE001OutsublineB,String no){
        logger.info("E01开始更新表FE84101");
        Fe84101 fe84101 = new Fe84101();
        String TemporaryCode = "";
        String FormalCode = "";

        List<PhE001OutHeaderCode> phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        for(PhE001OutHeaderCode tmp :phE001OutHeaderCodes){
            if(tmp.getCodetype().equals("0")){
                TemporaryCode = tmp.getCodevalue();
            }

            if(tmp.getCodetype().equals("1")){
                FormalCode = tmp.getCodevalue();
            }
        }
        fe84101.setSpe8sptym(FormalCode);
        for(PhE001OutHeaderCode tmp :phE001OutHeaderCodes){

            if(tmp.getCodetype().equals("1")){
                fe84101.setSpev01("Y");
            }
        }
        if(fe84101.getSpev01().equals(null)) {
            fe84101.setSpev01("N");
        }
        fe84101.setSplitm(no);
        fe84101.setSpe8name(phE001OutMain.getProductname());


      //  BigDecimal bigDecimal = new BigDecimal(fe80101SelectAn8ByNameMapper.FE80101Select(schema,phE001OutMain.getPk_mfname()));
      //  fe84101.setSpan8(bigDecimal);
        //fe84101.setSpan8(fe80101SelectAn8Mapper.FE84101selectAn8(phE001OutMain.getPk_mfname(),schema));
        fe84101.setSpe8pzwh(phE001OutMain.getFileno());
        fe84101.setSpe8yyks(phE001OutMain.getPk_department());
        fe84101.setSpe8cpdl(f0005Mapper.selectF0005(dbtype,"E8","14",phE001OutMain.getPk_productclass()));
        fe84101.setSpe8tsfl(f0005Mapper.selectF0005(dbtype,"E8","15",phE001OutMain.getPk_yltsfl()));

        fe84101.setSpe8dsc2(phE001OutMain.getProducttype());
        String e8jx = f0005Mapper.selectF0005(dbtype,"E8","JX",phE001OutMain.getForm());
        if(e8jx != null){
            fe84101.setSpe8jx(" ");
        }
        else{
            fe84101.setSpe8jx(e8jx);
        }

        fe84101.setSporig(phE001OutMain.getPk_mfcountry());
     //   fe84101.setSporig(f0005Mapper.selectF0005(dbtype,"E8","17",phE001OutMain.getPk_mfcountry()));//
        if(phE001OutsublineB.getPhE001OutBE01List()!=null) {
            for (PhE001OutBE01 tmp : phE001OutsublineB.getPhE001OutBE01List()) {
                //fe84101.setSpe8fxdj(tmp.getFxdj());
                //  String a = f0005Mapper.selectF0005(dbtype,"E8","19",tmp.getFxdj());
                fe84101.setSpe8fxdj(f0005Mapper.selectF0005(dbtype, "E8", "18", tmp.getFxdj()));
                //  fe84101.setSpe8cctj(tmp.getCctj());
                fe84101.setSpe8cctj(f0005Mapper.selectF0005(dbtype, "E8", "19", tmp.getCctj()));
                fe84101.setSpe8qtcc(tmp.getQtcctj());

                fe84101.setSpe8cpfl(tmp.getPk_productclass());
                //  fe84101.setSpe8jgg(tmp.getPk_jgg());
                fe84101.setSpe8jgg(f0005Mapper.selectF0005(dbtype, "E8", "35", tmp.getPk_jgg()));

            }
        }
        //证件类型维护主表附表问题--------------------------------------------------------------------------------------
        List<String> f4101z1litm =fe84101SelectAitm.getlitm(schema,TemporaryCode);

        fe84101UpdateByLitmMapper.updateByLitmSelective(schema,fe84101,phE001OutHeader.getDatatype());
        fe84101UpdateByLitmMapper.updatesametym(schema,TemporaryCode,FormalCode);


        for(String a :f4101z1litm){
            F4101z1 f4101z1 = fe84101SelectAitm.selectF4101z1PK(schema,a);

            String reg=".*唯一性错误.*";
            if(phE001OutHeader.getApprovenote().matches(reg)) {
                f4101z1.setSzurcd("Q");
            }else{
                f4101z1.setSzurcd("S");
            }

            fe84101SelectAitm.updatef4101z1(schema,f4101z1);


            Date date = new Date();
            DateFormat format2= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            try{
                date = format2.parse(phE001OutHeader.getApprovedate());
            } catch (ParseException e) {
                e.printStackTrace();
            }


            Fe84202B fe84202B = new Fe84202B();
            fe84202B.setAlukid(new BigDecimal(f4101z1.getSzedbt()));
            fe84202B.setAlkcoo("00"+f4101z1.getSzmmcu());
            fe84202B.setAle8splx(f4101z1.getSzedct());
            fe84202B.setAlan8(new BigDecimal(1));
            fe84202B.setAle8spyj(phE001OutHeader.getApprovenote());
            fe84202B.setAlaa02("Y");
            fe84202B.setAld1(JdeDateUtil.toJdeDate(date));
            fe84202B.setAlupmt(new BigDecimal(JdeDateUtil.toJdeTime(date)));
            fe84202B.setAluser("MDM");
            fe84202B.setAlpid("Interface");
            fe84202B.setAlupmj(JdeDateUtil.toJdeDate(new Date()));
            fe84202B.setAltday(new BigDecimal(JdeDateUtil.toJdeTime(new Date())));





            if(phE001OutHeader.getFunctype().equals("ADD")) {
                fe84202BMapperC2.insertSelective(schema, fe84202B);
                f00022MapperC.updateByKey(schema);
            }




        }

        logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFE84101Z(PhE001OutMain phE001OutMain,PhE001OutsublineB phE001OutsublineB,String no,String co,String reqno){
        logger.info("E01开始更新表FE84101Z");
        Fe84101z fe84101Z = new Fe84101z();
        if(phE001OutsublineB.getPhE001OutBE01List()!=null) {
            for (PhE001OutBE01 tmp : phE001OutsublineB.getPhE001OutBE01List()) {
                //     fe84101Z.setZze8zzlxa(tmp.getPk_licensetype());
                fe84101Z.setZze8zzlxa(f0005Mapper.selectF0005(dbtype, "E8", "28", tmp.getPk_licensetype()));
                fe84101Z.setZze8zzbm(tmp.getLicenseno());
                fe84101Z.setZzlitm(no);
                fe84101Z.setZzco(co);


                String dj = tmp.getTodate();
//            Integer bd = Integer.parseInt(tmp.getTodate());
//            fe84101Z.setZzexdj(bd);
                //fe84101Z.setZzlitm(phE001OutMain.getProductcode());
                if (fe84101ZSelectByE8ZZBM.Fe84101zselect(schema,fe84101Z) >= 1) {
                  //  fe84101ZUpdateByPKMapper.updateByPrimaryKeySelective(schema, fe84101Z, "E01", dj);
                }
                if (fe84101ZSelectByE8ZZBM.Fe84101zselect(schema,fe84101Z) == 0) {
                    fe84101ZUpdateByPKMapper.insertSelective(schema, fe84101Z, dj,reqno);
                }

          /*  String zznum =fe84101ZSelectByE8ZZBM.selectByPrimaryKey(tmp.getLicenseno());
            FE84101 fe84101 = new FE84101();
            //fe84101.setSplitm(zznum);
            fe84101.setSpe8fxdj(tmp.getFxdj());
            fe84101.setSpe8cctj(tmp.getCctj());
            fe84101.setSpe8qtcc(tmp.getQtcctj());
            fe84101.setSpe8jgg(tmp.getPk_jgg());
             fe84101UpdateByLitmMapper.updateByLitmSelective(fe84101,"E011");*/
            }
        }
        logger.info("成功");
        return null;
    }

    @Transactional
    public String updateF0101(PhE001OutMain phE001OutMain){
        logger.info("E01开始更新表F0101");
        F0101 f0101 = new F0101();
        f0101.setAbac28(phE001OutMain.getPk_label());

        BigDecimal bd=new BigDecimal(fe80101SelectAn8ByNameMapper.FE80101Select(schema,phE001OutMain.getPk_mfname()));
        f0101.setAban8(bd);

        f0101UpdateByPKMapper.updateByPrimaryKeySelective(schema,f0101,"E01");
        logger.info("成功");
        return  null;
    }

    @Transactional
    public String updateFE80101(PhE001OutMain phE001OutMain) {
        logger.info("E01开始更新表FE80101");
        Fe80101 fe80101 = new Fe80101();
        BigDecimal bigDecimal = new BigDecimal(fe80101SelectAn8ByNameMapper.FE80101Select(schema,phE001OutMain.getPk_mfname()));
        fe80101.setKsan8(bigDecimal);
        fe80101.setKse8cp(f0005Mapper.selectF0005(dbtype,"E8","BR",phE001OutMain.getPk_label()));
        fe80101.setKse8scxkz(phE001OutMain.getLicenseno());
        fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema,fe80101,"E01");
        logger.info("成功");
        return null;
    }
    @Transactional
    public String updateFE84101YON(String no){
        Fe84101 fe84101 = new Fe84101();
        fe84101.setSplitm(no);
        fe84101.setSpflag("S");
        fe84101UpdateByLitmMapper.updateByLitmSelective(schema,fe84101,"S");
        return null;
    }
    @Transactional
    public String updateFE84101bgbs(String no){
        Fe84101 fe84101 = new Fe84101();
        fe84101.setSplitm(no);
        //fe84101.setSpev02("N");
        fe84101.setSpe8bgbs("N");
        fe84101UpdateByLitmMapper.updateByLitmSelective(schema,fe84101,"N");
        return null;
    }
    @Transactional
    public String updateFe841001flag(String no){
        Fe841001 fe841001 = new Fe841001();

        fe841001.setSqlitm(no);
        fe841001.setSqflag("S");
        fe841001UpdateByDocoMapper.updatebylitm(schema,fe841001);
        return null;
    }
}
