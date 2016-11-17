package com.el.cmic.ws.service;

import com.el.cfg.domain.F0101;
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
@Service
public class MegToERPServiceImpl implements MegToERPService {
    Logger logger = Logger.getLogger(MegToERPServiceImpl.class);
    /*@Autowired
    F4101SelectBy f4101SelectBy;*/
    @Autowired
    FE84101SelectAitm fe84101SelectAitm;
   /* @Autowired
    F0101SelectBy f0101SelectBy;*/
    @Autowired
    FE80101SelectAlky fe80101SelectAlky;
    @Autowired
    FE80101UpdateByPKMapper fe80101UpdateByPKMapper;
    @Autowired
    FE84101UpdateByLitmMapper fe84101UpdateByLitmMapper;
    @Autowired
    F4101UpdateByLitmMapper f4101UpdateByLitmMapper;
    @Autowired
    F0101UpdateByPKMapper f0101UpdateByPKMapper;
    @Value("${schema}")
    private String schema;
    @Override
    @Transactional
    public String MegToERP(PhE001OutHeader phE001OutHeader) {
        logger.info("开始合并");
        try {
            if (phE001OutHeader.getDatatype().equals("E01")
                    || phE001OutHeader.getDatatype().equals("E02")
                    || phE001OutHeader.getDatatype().equals("E03")
                    || phE001OutHeader.getDatatype().equals("E04")) {


                String formcode11 = "";
                for (PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()) {
                    if (tmp.getCodetype().equals("11")) {
                        formcode11 = tmp.getCodevalue();
                    }
                }
                for (PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()) {
                    if (tmp.getCodetype().equals("12")) {
                        //List<String> listlitm = f4101SelectBy.F4101Select(schema,tmp.getCodevalue());

                        List<String> listlitm = fe84101SelectAitm.FE84101SelectTym(schema, tmp.getCodevalue());
                        for (String a : listlitm) {
                            Fe84101 fe84101 = new Fe84101();
                            fe84101.setSplitm(a);
                            //fe84101.setSpaitm(tmp.getCodevalue());
                            fe84101.setSpe8str200(tmp.getCodevalue());
                            fe84101.setSpe8sptym(formcode11);
                            fe84101UpdateByLitmMapper.updateByLitmSelective(schema, fe84101, "MEGE");
                        }
                        //f4101UpdateByLitmMapper.updateByAitm(schema,tmp.getCodevalue(),formcode11,"MEGE");


                    }

                }

            }
            if (phE001OutHeader.getDatatype().equals("C01")) {
                String formcode11 = "";
                for (PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()) {
                    if (tmp.getCodetype().equals("11")) {
                        formcode11 = tmp.getCodevalue();
                    }
                }
                for (PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()) {
                    if (tmp.getCodetype().equals("12")) {
                        //List<String> listan8 = f0101SelectBy.F0101SelectByalky(schema,tmp.getCodevalue());

                        List<String> listan8 = fe80101SelectAlky.FE80101SelectTym(schema, tmp.getCodevalue());
                        for (String a : listan8) {
                            BigDecimal bd = new BigDecimal(a);
                            Fe80101 fe80101 = new Fe80101();
                            fe80101.setKsan8(bd);
                            //fe80101.setKsalky(tmp.getCodevalue());
                            fe80101.setKse8str200(tmp.getCodevalue());
                            fe80101.setKse8kstym(formcode11);
                            fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema, fe80101, "MEGC");
                        }
                        //f0101UpdateByPKMapper.updateByAlky(schema,tmp.getCodevalue(),formcode11,"MEGC");


                    }

                }

            }

        }catch (Exception e){
            logger.error("------------------------------------------------------------------------------------------");
            logger.error("合并失败"+e.getMessage());
            logger.error("------------------------------------------------------------------------------------------");
        }



        return null;
    }
}
