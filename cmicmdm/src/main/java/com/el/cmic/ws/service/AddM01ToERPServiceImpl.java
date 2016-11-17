package com.el.cmic.ws.service;

import com.el.cfg.domain.F0101;
import com.el.cfg.domain.Fe80101;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.domain.PhM001OutMain;
import com.el.cmic.ws.mapper.F0005Mapper;
import com.el.cmic.ws.mapper.F0101UpdateByPKMapper;
import com.el.cmic.ws.mapper.FE80101UpdateByPKMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

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
    @Value("${ctlSchema}")
    private String dbtype;
    @Value("${schema}")
    private String schema;
    @Transactional
    public String addM01ToERP(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain, String no) {
        try {
            updateF0101(phE001OutHeader, phM001OutMain, no);
            updateFE80101(phE001OutHeader, phM001OutMain, no);
        }catch (Exception e){
            logger.error("----------------------------------------------------------------------------------------------------");
            logger.error("厂家更新失败"+e.getMessage());
            logger.error("----------------------------------------------------------------------------------------------------");
        }
        return null;
    }
    @Transactional
    public String updateFE80101(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain, String no) {
        logger.info("厂家开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        for(PhE001OutHeaderCode tmp :phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()){

            if(tmp.getCodetype().equals("1")){
                fe80101.setKsev01("Y");
            }
        }
        BigDecimal bigDecimal = new BigDecimal(no);
        fe80101.setKsan8(bigDecimal);
        fe80101.setKse8name(phM001OutMain.getMfname());
        fe80101.setKse8scxkz(phM001OutMain.getMflicense());
        fe80101.setKse8cp(f0005Mapper.selectF0005(dbtype,"E8","BR",phM001OutMain.getMfbrand()));
        fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema,fe80101,"M01");
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

        f0101UpdateByPKMapper.updateByPrimaryKeySelective(schema,f0101,"M01");
        logger.info("成功");
        return null;
    }
}
