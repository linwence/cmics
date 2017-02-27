//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.service;

import com.el.cfg.domain.F0101;
import com.el.cfg.domain.F0101z2;
import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.domain.PhM001OutMain;
import com.el.cmic.ws.mapper.F00022MapperC;
import com.el.cmic.ws.mapper.F0005Mapper;
import com.el.cmic.ws.mapper.F0101UpdateByPKMapper;
import com.el.cmic.ws.mapper.FE80101SelectAlky;
import com.el.cmic.ws.mapper.FE80101UpdateByPKMapper;
import com.el.cmic.ws.mapper.FE84202BMapperC2;
import com.el.cmic.ws.service.AddM01ToERPService;
import com.el.utils.JdeDateUtil;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public AddM01ToERPServiceImpl() {
    }

    @Transactional
    public String addM01ToERP(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain, String no) {
        this.updateF0101(phE001OutHeader, phM001OutMain, no);
        this.updateFE80101(phE001OutHeader, phM001OutMain, no);
        if(phE001OutHeader.getFunctype().equals("ADD")) {
            this.updateFe80101SON(no);
        }

        return null;
    }

    @Transactional
    public String updateFE80101(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain, String no) {
        this.logger.info("厂家开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        String formalcode = "";
        String TemporaryCode = "";
        Iterator bigDecimal = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList().iterator();

        while(bigDecimal.hasNext()) {
            PhE001OutHeaderCode f0101z2an8 = (PhE001OutHeaderCode)bigDecimal.next();
            if(f0101z2an8.getCodetype().equals("1")) {
                fe80101.setKsev01("Y");
                formalcode = f0101z2an8.getCodevalue();
                fe80101.setKse8kstym(formalcode);
            }

            if(f0101z2an8.getCodetype().equals("0")) {
                TemporaryCode = f0101z2an8.getCodevalue();
            }
        }

        BigDecimal bigDecimal1 = new BigDecimal(no);
        fe80101.setKsan8(bigDecimal1);
        fe80101.setKse8name(phM001OutMain.getMfname());
        fe80101.setKse8scxkz(phM001OutMain.getMflicense());
        fe80101.setKsdl011(phM001OutMain.getMfbrand());
        List f0101z2an81 = this.fe80101SelectAlky.selectan8(this.schema, TemporaryCode);
        this.fe80101UpdateByPKMapper.updateByPrimaryKeySelective(this.schema, fe80101, "M01");
        this.fe80101UpdateByPKMapper.updatesametym(this.schema, TemporaryCode, formalcode);
        Iterator var9 = f0101z2an81.iterator();

        while(var9.hasNext()) {
            String a = (String)var9.next();
            F0101z2 f0101z2 = this.fe80101SelectAlky.selectf0101z2PK(this.schema, a);
            String reg = ".*唯一性错误.*";
            if(phE001OutHeader.getApprovenote().matches(reg)) {
                this.fe80101SelectAlky.updateF0101z2PK(this.schema, a, "Q");
            } else {
                this.fe80101SelectAlky.updateF0101z2PK(this.schema, a, "S");
            }

            Date date = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            try {
                date = format2.parse(phE001OutHeader.getApprovedate());
            } catch (ParseException var17) {
                var17.printStackTrace();
            }

            Fe84202B fe84202B = new Fe84202B();
            fe84202B.setAlukid(new BigDecimal(f0101z2.getSzedbt()));
            if(f0101z2.getSzmcu().equals("00000")) {
                fe84202B.setAlkcoo(f0101z2.getSzmcu());
            } else {
                fe84202B.setAlkcoo("00" + f0101z2.getSzmcu());
            }

            fe84202B.setAle8splx(f0101z2.getSzedct());
            fe84202B.setAlan8(new BigDecimal(1));
            fe84202B.setAle8spyj(phE001OutHeader.getApprovenote());
            fe84202B.setAlaa02("Y");
            fe84202B.setAld1(JdeDateUtil.toJdeDate(date));
            fe84202B.setAlupmt(new BigDecimal(JdeDateUtil.toJdeTime(date).intValue()));
            fe84202B.setAluser("MDM");
            fe84202B.setAlpid("Interface");
            fe84202B.setAlupmj(JdeDateUtil.toJdeDate(new Date()));
            fe84202B.setAltday(new BigDecimal(JdeDateUtil.toJdeTime(new Date()).intValue()));
            if(phE001OutHeader.getFunctype().equals("ADD")) {
                String ukidp = "";
                ukidp = this.f00022MapperC.selectF00022(this.schema);
                this.f00022MapperC.updateByKey(this.schema);
                fe84202B.setAlukidp(new BigDecimal(ukidp));
                this.fe84202BMapperC2.insertSelective(this.schema, fe84202B);
            }
        }

        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateF0101(PhE001OutHeader phE001OutHeader, PhM001OutMain phM001OutMain, String no) {
        this.logger.info("厂家开始更新F0101");
        F0101 f0101 = new F0101();
        BigDecimal bd = new BigDecimal(no);
        String TemporaryCode = "";
        String FormalCode = "";
        Iterator var8 = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList().iterator();

        while(var8.hasNext()) {
            PhE001OutHeaderCode tmp = (PhE001OutHeaderCode)var8.next();
            if(tmp.getCodetype().equals("0")) {
                TemporaryCode = tmp.getCodevalue();
            }

            if(tmp.getCodetype().equals("1")) {
                FormalCode = tmp.getCodevalue();
            }
        }

        f0101.setAban8(bd);
        f0101.setAbalky(FormalCode);
        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFe80101SON(String no) {
        this.logger.info("客商开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        BigDecimal bd = new BigDecimal(no);
        fe80101.setKsan8(bd);
        fe80101.setKsflag("S");
        this.fe80101UpdateByPKMapper.updateByPrimaryKeySelective(this.schema, fe80101, "S");
        this.logger.info("成功");
        return null;
    }
}
