package com.el.cmic.ws.service;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.F4101z1;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.domain.PhE004OutMain;
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
 * Created by king_ on 2016/10/9.
 */
@Service
public class AddE04ToERPServiceImpl implements  AddE04ToERPService{
    Logger logger = Logger.getLogger(AddE04ToERPServiceImpl.class);
    @Autowired
    F4101UpdateByLitmMapper f4101UpdateByLitmMapper;
    @Autowired
    FE84101UpdateByLitmMapper fe84101UpdateByLitmMapper;
    @Autowired
    FE84101SelectAitm fe84101SelectAitm;
    @Autowired
    FE84202BMapperC2 fe84202BMapperC2;
    @Autowired
    F00022MapperC f00022MapperC;

    @Value("${schema}")
    private String schema;
    @Transactional
    public String addE04ToERP(PhE001OutHeader phE001OutHeader, PhE004OutMain phE004OutMain,String no) {
     //   try {
            //updateF4101(phE001OutHeader, phE004OutMain, no);
            updateFE84101(phE001OutHeader, phE004OutMain, no);
            if(phE001OutHeader.getFunctype().equals("ADD")){
                updateFE84101YON(no);
            }
    /*    }catch (Exception e){
            logger.error("----------------------------------------------------------------------------------------------------");
            logger.error("E04更新失败"+e.getMessage());
            logger.error("----------------------------------------------------------------------------------------------------");
        }*/
        return null;
    }
    @Transactional
    public String updateF4101(PhE001OutHeader phE001OutHeader, PhE004OutMain phE004OutMain,String no) {
        logger.info("E04开始更新F4101");
        F4101 f4101 = new F4101();
       /* String TemporaryCode="";
        String  FormalCode="";*/
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
        f4101UpdateByLitmMapper.updateByLitmSelective(schema,f4101,"E04");
        logger.info("成功");
        return null;
    }
    @Transactional
    public String updateFE84101(PhE001OutHeader phE001OutHeader, PhE004OutMain phE004OutMain,String no) {
        logger.info("E04开始更新FE84101");
        Fe84101 fe84101 = new Fe84101();
        String TemporaryCode="";
        String  FormalCode="";

        List<PhE001OutHeaderCode> phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        for(PhE001OutHeaderCode tmp :phE001OutHeaderCodes){

            if(tmp.getCodetype().equals("1")){
                fe84101.setSpev01("Y");
            }
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
        if(fe84101.getSpev01().equals(null)){
            fe84101.setSpev01("N");
        }
        fe84101.setSplitm(no);
        fe84101.setSpe8name(phE004OutMain.getServicename());

        List<String> f4101z1litm =fe84101SelectAitm.getlitm(schema,TemporaryCode);
        fe84101UpdateByLitmMapper.updateByLitmSelective(schema,fe84101,"E04");
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
    public String updateFE84101YON(String no){
        Fe84101 fe84101 = new Fe84101();
        fe84101.setSplitm(no);
        fe84101.setSpflag("S");
        fe84101UpdateByLitmMapper.updateByLitmSelective(schema,fe84101,"S");
        return null;
    }
}
