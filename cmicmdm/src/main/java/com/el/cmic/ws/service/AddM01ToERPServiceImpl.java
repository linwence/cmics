package com.el.cmic.ws.service;

import com.el.cfg.domain.F0101;
import com.el.cfg.domain.F0101z2;
import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.domain.PhM001OutMain;
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
 * Created by king_ on 2016/10/13.
 */
@Service
public class AddM01ToERPServiceImpl implements AddM01ToERPService {
    Logger logger = Logger.getLogger(AddM01ToERPServiceImpl.class);
    @Autowired
    FE80101UpdateByPKMapper fe80101UpdateByPKMapper;
    @Autowired
    F0101UpdateByPKMapper f0101UpdateByPKMapper;
    @Autowired
    F0005Mapper f0005Mapper;
    @Autowired
    FE80101SelectAlky fe80101SelectAlky;
    @Autowired
    FE84202BMapperC2 fe84202BMapperC2;
    @Autowired
    F00022MapperC f00022MapperC;
    @Value("${ctlSchema}")
    private String dbtype;
    @Value("${schema}")
    private String schema;
    @Transactional
    public String addM01ToERP(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain, String no) {
      //  try {
            updateF0101(phE001OutHeader, phM001OutMain, no);
            updateFE80101(phE001OutHeader, phM001OutMain, no);
            if(phE001OutHeader.getFunctype().equals("ADD")) {
                updateFe80101SON(no);
            }
      /*  }catch (Exception e){
            logger.error("----------------------------------------------------------------------------------------------------");
            logger.error("厂家更新失败"+e.getMessage());
            logger.error("----------------------------------------------------------------------------------------------------");
        }*/
        return null;
    }
    @Transactional
    public String updateFE80101(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain, String no) {
        logger.info("厂家开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        String formalcode = "";
        String TemporaryCode = "";
        for(PhE001OutHeaderCode tmp :phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()){

            if(tmp.getCodetype().equals("1")){
                fe80101.setKsev01("Y");
                formalcode = tmp.getCodevalue();
                fe80101.setKse8kstym(formalcode);
            }
            if(tmp.getCodetype().equals("0")){
                TemporaryCode=tmp.getCodevalue();
            }
        }
        BigDecimal bigDecimal = new BigDecimal(no);
        fe80101.setKsan8(bigDecimal);

        fe80101.setKse8name(phM001OutMain.getMfname());
        fe80101.setKse8scxkz(phM001OutMain.getMflicense());
        //fe80101.setKse8cp(f0005Mapper.selectF0005(dbtype,"E8","BR",phM001OutMain.getMfbrand()));
        fe80101.setKsdl011(phM001OutMain.getMfbrand());

        //
        List<String> f0101z2an8 = fe80101SelectAlky.selectan8(schema,TemporaryCode);
        //
        fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema,fe80101,"M01");
        fe80101UpdateByPKMapper.updatesametym(schema,TemporaryCode,formalcode);

        //
        for(String a : f0101z2an8){
            F0101z2 f0101z2 = fe80101SelectAlky.selectf0101z2PK(schema,a);


            String reg=".*唯一性错误.*";
            if(phE001OutHeader.getApprovenote().matches(reg)){
                fe80101SelectAlky.updateF0101z2PK(schema,a,"Q");
            }else{
                fe80101SelectAlky.updateF0101z2PK(schema,a,"S");
            }

            Date date = new Date();
            DateFormat format2= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            try{
                date = format2.parse(phE001OutHeader.getApprovedate());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Fe84202B fe84202B = new Fe84202B();
            fe84202B.setAlukid(new BigDecimal(f0101z2.getSzedbt()));
            fe84202B.setAlkcoo("00"+f0101z2.getSzmcu());
            fe84202B.setAle8splx(f0101z2.getSzedct());
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
        //


        logger.info("成功");
        return null;
    }
    @Transactional
    public String updateF0101(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain,String no) {
        logger.info("厂家开始更新F0101");
        F0101 f0101 = new F0101();
        BigDecimal bd = new BigDecimal(no);
        String TemporaryCode = "";
        String FormalCode = "";
        for(PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()){
            if(tmp.getCodetype().equals("0")){
                TemporaryCode=tmp.getCodevalue();
            }
            if(tmp.getCodetype().equals("1")){
                FormalCode = tmp.getCodevalue();
            }
        }
        f0101.setAban8(bd);
        f0101.setAbalky(FormalCode);

       // f0101UpdateByPKMapper.updateByPrimaryKeySelective(schema,f0101,"M01");
        logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFe80101SON(String no ){
        logger.info("客商开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        BigDecimal bd = new BigDecimal(no);
        fe80101.setKsan8(bd);
        fe80101.setKsflag("S");

        fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema,fe80101,"S");
        logger.info("成功");
        return null;
    }
}
