package com.el.cmic.ws.service;

import com.el.cfg.domain.F4101;

import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84101z;
import com.el.cmic.ws.domain.*;
import com.el.cmic.ws.mapper.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by king_ on 2016/10/8.
 */
@Service
public class AddE02ToERPServiceImpl implements AddE02ToERPService {
    Logger logger = Logger.getLogger(AddE02ToERPServiceImpl.class);
    @Autowired
    FE84101UpdateByLitmMapper fe84101UpdateByLitmMapper;
    @Autowired
    F4101UpdateByLitmMapper f4101UpdateByLitmMapper;
    @Autowired
    F0005Mapper f0005Mapper;
    @Autowired
    F0005DMapper f0005DMapper;
    @Autowired
    FE80101SelectAn8ByNameMapper fe80101SelectAn8ByNameMapper;
    @Autowired
    FE84101ZUpdateByPKMapper fe84101ZUpdateByPKMapper;
    @Autowired
    FE84101ZSelectByE8ZZBM fe84101ZSelectByE8ZZBM;
    @Autowired
    F00165MapperCustom f00165MapperCustom;

    @Value("${ctlSchema}")
    private String dbtype;
    @Value("${schema}")
    private String schema;
    @Transactional
    public String addE02ToERP(PhE001OutHeader phE001OutHeader, PhE002OutMain phE002OutMain,PhE001OutsublineB phE001OutsublineB,String no,String co) {
        try {
            updateF4101(phE001OutHeader, phE002OutMain, no);
            updateFE84101(phE001OutHeader, phE002OutMain, phE001OutsublineB, no);

            updateFE84101Z(phE002OutMain, phE001OutsublineB, no, co);
            //updateF00165(phE001OutsublineA,phE002OutMain,phE001OutsublineB);
        }catch (Exception e){
            logger.error("----------------------------------------------------------------------------------------------------");
            logger.error("E02更新失败"+e.getMessage());
            logger.error("----------------------------------------------------------------------------------------------------");
        }
        return null;
    }

    @Transactional
    public String updateFE84101Z(PhE002OutMain phE002OutMain, PhE001OutsublineB phE001OutsublineB, String no,String co) {
        logger.info("E02开始更新表FE84101Z");
        Fe84101z fe84101Z = new Fe84101z();
        if(phE001OutsublineB.getPhE001OutBE01List()!=null) {
            for (PhE001OutBE01 tmp : phE001OutsublineB.getPhE001OutBE01List()) {
                //     fe84101Z.setZze8zzlxa(tmp.getPk_licensetype());
                fe84101Z.setZze8zzlxa(f0005Mapper.selectF0005(dbtype, "E8", "28", tmp.getPk_licensetype()));
                fe84101Z.setZze8zzbm(tmp.getLicenseno());
                fe84101Z.setZzlitm(no);
                fe84101Z.setZzco(co);

                String dj = tmp.getTodate();

                if (fe84101ZSelectByE8ZZBM.Fe84101zselect(schema,no,tmp.getLicenseno(),co)  >= 1) {
                    fe84101ZUpdateByPKMapper.updateByPrimaryKeySelective(schema, fe84101Z, "E01", dj);
                }
                if (fe84101ZSelectByE8ZZBM.Fe84101zselect(schema,no,tmp.getLicenseno(),co) == 0) {
                    fe84101ZUpdateByPKMapper.insertSelective(schema, fe84101Z, dj);
                }
            }
        }

        logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFE84101(PhE001OutHeader phE001OutHeader, PhE002OutMain phE002OutMain,PhE001OutsublineB phE001OutsublineB,String no) {
        logger.info("E02开始更新表FE84101");
        Fe84101 fe84101 = new Fe84101();
        String TemporaryCode = "";
        String FormalCode = "";
        List<PhE001OutHeaderCode> phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        for(PhE001OutHeaderCode tmp :phE001OutHeaderCodes){

            if(tmp.getCodetype().equals("1")){
                fe84101.setSpev01("Y");
            }

        }
        if(fe84101.getSpev01().equals(null)){
            fe84101.setSpev01("N");
        }
        for(PhE001OutHeaderCode tmp :phE001OutHeaderCodes){
            if(tmp.getCodetype().equals("0")){
                TemporaryCode = tmp.getCodevalue();
            }
            if(tmp.getCodetype().equals("1")){
                FormalCode = tmp.getCodevalue();
            }
        }
        fe84101.setSpe8sptym(FormalCode);
        fe84101.setSplitm(no);
        fe84101.setSpe8name(phE002OutMain.getProductname());
        BigDecimal bigDecimal = new BigDecimal(fe80101SelectAn8ByNameMapper.FE80101Select(schema,phE002OutMain.getMfname()));

        fe84101.setSpan8(bigDecimal);
        fe84101.setSpe8pzwh(phE002OutMain.getFileno());
  //      fe84101.setSpe8zdyl(phE002OutMain.getPk_zdypdl());
        fe84101.setSpe8zdyl(f0005Mapper.selectF0005(dbtype,"E8","29",phE002OutMain.getPk_zdypdl()));
   //     fe84101.setSpe8jhg(phE002OutMain.getPk_jhg());
        fe84101.setSpe8jhg(f0005Mapper.selectF0005(dbtype,"E8","21",phE002OutMain.getPk_jhg()));
   //     fe84101.setSpe8ztw(phE002OutMain.getPk_ztw());
        fe84101.setSpe8ztw(f0005Mapper.selectF0005(dbtype,"E8","32",phE002OutMain.getPk_ztw()));
  //      fe84101.setSpe8gfg(phE002OutMain.getPk_fgjyw());
        fe84101.setSpe8gfg(f0005Mapper.selectF0005(dbtype,"E8","33",phE002OutMain.getPk_fgjyw()));
  //      fe84101.setSpe8ptyp(phE002OutMain.getPk_ptyp());
        fe84101.setSpe8ptyp(f0005Mapper.selectF0005(dbtype,"E8","34",phE002OutMain.getPk_ptyp()));
   //     fe84101.setSpe8atcdl(phE002OutMain.getPk_atcdl());
        fe84101.setSpe8atcdl(f0005Mapper.selectF0005(dbtype,"E8","30",phE002OutMain.getPk_atcdl()));
  //      fe84101.setSpe8atcxl(phE002OutMain.getPk_atcxl());
        fe84101.setSpe8atcxl(f0005Mapper.selectF0005(dbtype,"E8","31",phE002OutMain.getPk_atcxl()));
      //  fe84101.setSporig(phE002OutMain.getPk_mfcountry());
        fe84101.setSporig(phE002OutMain.getPk_mfcountry());
        String e8jx = f0005Mapper.selectF0005(dbtype,"E8","JX",phE002OutMain.getForm());
        if(e8jx == null) {
            fe84101.setSpe8jx(" ");
        }
        else {
            fe84101.setSpe8jx(e8jx);
        }


        if (phE001OutsublineB.getPhE001OutBE01List()!=null){
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

        fe84101UpdateByLitmMapper.updateByLitmSelective(schema,fe84101,"E02");


        logger.info("成功");
        return null;
    }
    @Transactional
    public String updateF4101(PhE001OutHeader phE001OutHeader, PhE002OutMain phE002OutMain,String no) {
        logger.info("E02开始更新表F4101");
       /* String TemporaryCode = "";
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
        //f4101.setImaitm(FormalCode);
        f4101.setImlitm(no);
        f4101.setImdsc2(phE002OutMain.getProducttype());
        //f4101.setImorig();
        f4101.setImdsc1(phE002OutMain.getSync());
        //f4101.setImuom1(phE002OutMain.getPk_weight());
        f4101.setImuom1(f0005DMapper.selectF0005D(dbtype,"00","UM",phE002OutMain.getPk_weight()));

        f4101UpdateByLitmMapper.updateByLitmSelective(schema,f4101,"E02");
        logger.info("成功");
        return null;
    }


   /* public String updateF00165(PhE001OutsublineA phE001OutsublineA,PhE002OutMain phE002OutMain,PhE001OutsublineB phE001OutsublineB) {
        if (phE001OutsublineA.getPhE001OutAE01List()!=null) {

            for (PhE001OutAE01 tmp : phE001OutsublineA.getPhE001OutAE01List()) {
                for (PhE001OutBE01 tmp1 : phE001OutsublineB.getPhE001OutBE01List()) {
                    String filename2 = tmp.getFilename2();
                    String filepath = "\\\\JDE-WEBTEST01\\JDEdwards\\" + tmp.getFilename();
                    String filename = tmp.getFilename();
                    String gdtxky = (fe80101SelectAn8ByNameMapper.FE80101Select(schema, phE002OutMain.getPk_mfname())) + "|" +
                            tmp1.getPk_licensetype() + "|" + tmp1.getLicenseno();
                    f00165MapperCustom.updateByPrimaryKeySelective(schema, filename, filename2, filepath, gdtxky);
                }
            }
        }
        return null;
    }*/
}

