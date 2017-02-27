package com.el.cmic.ws.service;

import com.el.cfg.domain.Fe841001;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.mapper.F00022MapperC;
import com.el.cmic.ws.mapper.FE841001UpdateByDocoMapper;
import com.el.cmic.ws.mapper.FE84101UpdateByLitmMapper;
import com.el.cmic.ws.mapper.FE84202BMapperC;
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
 * Created by king_ on 2016/10/11.
 */
@Service
public class ModE0ESToERPServiceImpl implements ModE0ESToERPService {
    Logger logger = Logger.getLogger(ModE0ESToERPServiceImpl.class);
    @Autowired
    FE841001UpdateByDocoMapper fe841001UpdateByDocoMapper;
    @Autowired
    FE84101UpdateByLitmMapper fe84101UpdateByLitmMapper;
    @Autowired
    FE84202BMapperC fe84202BMapperC;
    @Autowired
    F00022MapperC f00022MapperC;
    @Value("${schema}")
    private String schema;

    @Transactional
    public String updateModE(BigDecimal Doco,String EorS,String no,PhE001OutHeader phE001OutHeader){
        updateFE841001(Doco,EorS,no);
        insertFE84202B(Doco,EorS,no,phE001OutHeader);
        return null;
    }

    @Transactional
    public String insertFE84202B(BigDecimal Doco, String EorS, String no, PhE001OutHeader phE001OutHeader){
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

            fe84202BMapperC.insertSelective(schema,fe84202B);
            f00022MapperC.updateByKey(schema);
        }

        if(EorS.equals("R")) {
            fe84202B.setAlaa02("N");
            fe84202BMapperC.insertSelective(schema,fe84202B);
            f00022MapperC.updateByKey(schema);
        }

        return null;
    }


    @Transactional
    public String updateFE841001(BigDecimal Doco,String EorS,String no) {
        logger.info("商品更新成功，记录标记位");
       /* try {*/
            Fe841001 fe841001 = new Fe841001();
            fe841001.setSqukidp(Doco);
            fe841001.setSqflag(EorS);

            //fe841001.setSqlitm(Litm);
        if(EorS.equals("S")){
            Fe84101 fe84101 = new Fe84101();
            fe84101.setSplitm(no);
            fe84101.setSpe8bgbs("N");
            fe84101UpdateByLitmMapper.updateByLitmSelective(schema,fe84101,"N");

        }
            fe841001UpdateByDocoMapper.updateByDoco(schema, fe841001);
       /* }catch (Exception e){
            logger.error("------------------------------------------------------------------------------------------");
            logger.error("商品标记位失败"+e.getMessage());
            logger.error("------------------------------------------------------------------------------------------");
        }*/
        return null;
    }
}
