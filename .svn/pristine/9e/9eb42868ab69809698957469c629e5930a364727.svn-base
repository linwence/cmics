package com.el.cmic.ws.service;

import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe84101;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.mapper.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by king_ on 2016/10/22.
 */
@Service("selToERPServiceImpl")
public class SELToERPServiceImpl implements SELToERPService {
    Logger logger = Logger.getLogger(SELToERPServiceImpl.class);
    @Value("${schema}")
    private String schema;
    @Autowired
    FE80101SelectAlky fe80101SelectAlky;
    @Autowired
    FE84101UpdateByLitmMapper fe84101UpdateByLitmMapper;

    @Autowired
    FE80101UpdateByPKMapper fe80101UpdateByPKMapper;
    @Autowired
    FE84101SelectAitm fe84101SelectAitm;
    @Override
    @Transactional
    public String SELToERP(PhE001OutHeader phE001OutHeader,String YN) {
        if(YN.equals("Y")){
            logger.info("开始封存");
        }else{
            logger.info("开始解封");
        }

        try {
            if (phE001OutHeader.getDatatype().equals("E01")
                    || phE001OutHeader.getDatatype().equals("E02")
                    || phE001OutHeader.getDatatype().equals("E03")
                    || phE001OutHeader.getDatatype().equals("E04")) {

                for (PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()) {
                    if (tmp.getCodetype().equals("1")) {
                        //List<String> listlitm = f4101SelectBy.F4101Select(schema,tmp.getCodevalue());
                        List<String> listlitm = fe84101SelectAitm.FE84101SelectTym(schema, tmp.getCodevalue());
                        for (String a : listlitm) {
                            Fe84101 fe84101 = new Fe84101();
                            fe84101.setSplitm(a);
                            fe84101.setSpe8sffc(YN);

                            fe84101UpdateByLitmMapper.updateByLitmSelective(schema, fe84101, "SELE");
                        }

                    }

                }

            }

            if (phE001OutHeader.getDatatype().equals("C01")) {

                for (PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()) {
                    if (tmp.getCodetype().equals("1")) {
                        // List<String> listan8 = f0101SelectBy.F0101SelectByalky(schema,tmp.getCodevalue());
                        List<String> listan8 = fe80101SelectAlky.FE80101SelectTym(schema, tmp.getCodevalue());

                        for (String a : listan8) {
                            BigDecimal bd = new BigDecimal(a);
                            Fe80101 fe80101 = new Fe80101();
                            fe80101.setKsan8(bd);
                            fe80101.setKse8sffc(YN);
                            fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema, fe80101, "SELC");
                        }


                    }

                }

            }

        }catch (Exception e){
            logger.error("------------------------------------------------------------------------------------------");
            logger.error("失败"+e.getMessage());
            logger.error("------------------------------------------------------------------------------------------");
        }
        return null;
    }
}
