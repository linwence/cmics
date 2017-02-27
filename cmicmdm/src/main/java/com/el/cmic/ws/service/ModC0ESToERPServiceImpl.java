package com.el.cmic.ws.service;


import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe841003;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutHeader;
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

/**
 * Created by king_ on 2016/10/13.
 */
@Service
public class ModC0ESToERPServiceImpl implements ModC0ESToERPService {
    Logger logger = Logger.getLogger(ModC0ESToERPServiceImpl.class);
    @Autowired
    FE841003UpdateByPKMapper fe841003UpdateByPKMapper;
    @Autowired
    FE841003SelectByAn8Mapper fe841003SelectByAn8Mapper;
    @Autowired
    FE80101UpdateByPKMapper fe80101UpdateByPKMapper;
    @Autowired
    FE84202BMapperC3 fe84202BMapperC3;
    @Autowired
    F00022MapperC f00022MapperC;
    @Value("${schema}")
    private String schema;
    @Transactional
    public String updateModC(BigDecimal Doco, String EorS, BigDecimal an8, PhE001OutHeader phE001OutHeader){
        if(EorS == "S"){
            updateFE80101(Doco,an8);
        }
        updateFE841003(Doco,EorS);
        insertFE84202B(Doco,EorS,phE001OutHeader);
        return toString();
    }
    @Transactional
    public String updateFE841003(BigDecimal Doco, String EorS) {
        logger.info("客商更新成功，记录标记位");
       /* try {*/
            Fe841003 fe841003 = new Fe841003();
            fe841003.setSqukid(Doco);
            fe841003.setSqflag(EorS);

            fe841003UpdateByPKMapper.updateByPrimaryKeySelective(schema, fe841003);
      /*  }catch (Exception e){
            logger.error("------------------------------------------------------------------------------------------");
            logger.error("客商标记位失败"+e.getMessage());
            logger.error("------------------------------------------------------------------------------------------");
        }*/
        return null;
    }
    @Transactional
    public String updateFE80101(BigDecimal ukid,BigDecimal an8) {
        logger.info("客商更新成功，将变更单数据写入客商表");
        /*try {*/
            Fe841003 fe841003 = fe841003SelectByAn8Mapper.selectByPrimaryKey(schema,ukid);
            Fe80101 fe80101 = new Fe80101();

            fe80101.setKsan8(an8);
            if (fe841003.getSqa427() == null) {
                fe80101.setKse8jycs(" ");
            } else {
                fe80101.setKse8jycs(fe841003.getSqa427());
            }
            if (fe841003.getSqe8tym() == null) {
                fe80101.setKse8ckdz(" ");
            } else {
                fe80101.setKse8ckdz(fe841003.getSqe8tym());
            }
            if (fe841003.getSqcnem() == null) {
                fe80101.setKse8fr(" ");
            } else {
                fe80101.setKse8fr(fe841003.getSqcnem());
            }

            if (fe841003.getSqcnicl() == null) {
                fe80101.setKse8qyfzr(" ");
            } else {
                fe80101.setKse8qyfzr(fe841003.getSqcnicl());
            }

            if (fe841003.getSqcnyp() == null) {
                fe80101.setKse8ywlxr(" ");
            } else {
                fe80101.setKse8ywlxr(fe841003.getSqcnyp());
            }

            fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema, fe80101, "C011");

      /*  }catch (Exception e){
            logger.error("------------------------------------------------------------------------------------------");
            logger.error("客商将变更单数据写入客商表失败"+e.getMessage());
            logger.error("------------------------------------------------------------------------------------------");
        }*/


        return null;
    }
    @Transactional
    public String insertFE84202B(BigDecimal Doco, String EorS, PhE001OutHeader phE001OutHeader){
        logger.info("记录FE84202B");

        Date date = new Date();
        DateFormat format2= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        try{
            date = format2.parse(phE001OutHeader.getApprovedate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Fe84202B fe84202B = new Fe84202B();
        fe84202B.setAlukid(Doco);
        fe84202B.setAlan8(new BigDecimal(1));
        fe84202B.setAle8spyj(phE001OutHeader.getApprovenote());
        fe84202B.setAld1(JdeDateUtil.toJdeDate(date));
        fe84202B.setAlupmt(new BigDecimal(JdeDateUtil.toJdeTime(date)));
        fe84202B.setAluser("MDM");
        fe84202B.setAlpid("Interface");
        fe84202B.setAlupmj(JdeDateUtil.toJdeDate(new Date()));
        fe84202B.setAltday(new BigDecimal(JdeDateUtil.toJdeTime(new Date())));

        if(EorS.equals("S")) {

            fe84202B.setAlaa02("Y");

            fe84202BMapperC3.insertSelective(schema,fe84202B);
            f00022MapperC.updateByKey(schema);
        }

        if(EorS.equals("R")) {
            fe84202B.setAlaa02("N");
            fe84202BMapperC3.insertSelective(schema,fe84202B);
            f00022MapperC.updateByKey(schema);
        }

        return null;
    }
}
