//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.service;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.F4101z1;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.domain.PhE004OutMain;
import com.el.cmic.ws.mapper.F00022MapperC;
import com.el.cmic.ws.mapper.F4101UpdateByLitmMapper;
import com.el.cmic.ws.mapper.FE84101SelectAitm;
import com.el.cmic.ws.mapper.FE84101UpdateByLitmMapper;
import com.el.cmic.ws.mapper.FE84202BMapperC2;
import com.el.cmic.ws.service.AddE04ToERPService;
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
public class AddE04ToERPServiceImpl implements AddE04ToERPService {
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

    public AddE04ToERPServiceImpl() {
    }

    @Transactional
    public String addE04ToERP(PhE001OutHeader phE001OutHeader, PhE004OutMain phE004OutMain, String no) {
        this.updateFE84101(phE001OutHeader, phE004OutMain, no);
        if(phE001OutHeader.getFunctype().equals("ADD")) {
            this.updateFE84101YON(no);
        }

        return null;
    }

    @Transactional
    public String updateF4101(PhE001OutHeader phE001OutHeader, PhE004OutMain phE004OutMain, String no) {
        this.logger.info("E04开始更新F4101");
        F4101 f4101 = new F4101();
        List phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        f4101.setImlitm(no);
        this.f4101UpdateByLitmMapper.updateByLitmSelective(this.schema, f4101, "E04");
        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFE84101(PhE001OutHeader phE001OutHeader, PhE004OutMain phE004OutMain, String no) {
        this.logger.info("E04开始更新FE84101");
        Fe84101 fe84101 = new Fe84101();
        String TemporaryCode = "";
        String FormalCode = "";
        List phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        Iterator f4101z1litm = phE001OutHeaderCodes.iterator();

        PhE001OutHeaderCode tmp;
        while(f4101z1litm.hasNext()) {
            tmp = (PhE001OutHeaderCode)f4101z1litm.next();
            if(tmp.getCodetype().equals("1")) {
                fe84101.setSpev01("Y");
            }
        }

        f4101z1litm = phE001OutHeaderCodes.iterator();

        while(f4101z1litm.hasNext()) {
            tmp = (PhE001OutHeaderCode)f4101z1litm.next();
            if(tmp.getCodetype().equals("0")) {
                TemporaryCode = tmp.getCodevalue();
            }

            if(tmp.getCodetype().equals("1")) {
                FormalCode = tmp.getCodevalue();
            }
        }

        fe84101.setSpe8sptym(FormalCode);
        if(fe84101.getSpev01().equals((Object)null)) {
            fe84101.setSpev01("N");
        }

        fe84101.setSplitm(no);
        fe84101.setSpe8name(phE004OutMain.getServicename());
        List f4101z1litm1 = this.fe84101SelectAitm.getlitm(this.schema, TemporaryCode);
        this.fe84101UpdateByLitmMapper.updateByLitmSelective(this.schema, fe84101, "E04");
        this.fe84101UpdateByLitmMapper.updatesametym(this.schema, TemporaryCode, FormalCode);
        Iterator tmp1 = f4101z1litm1.iterator();

        while(tmp1.hasNext()) {
            String a = (String)tmp1.next();
            F4101z1 f4101z1 = this.fe84101SelectAitm.selectF4101z1PK(this.schema, a);
            String reg = ".*唯一性错误.*";
            if(phE001OutHeader.getApprovenote().matches(reg)) {
                f4101z1.setSzifla("Q");
            } else {
                f4101z1.setSzifla("S");
            }

            this.fe84101SelectAitm.updatef4101z1(this.schema, f4101z1);
            Date date = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            try {
                date = format2.parse(phE001OutHeader.getApprovedate());
            } catch (ParseException var17) {
                var17.printStackTrace();
            }

            Fe84202B fe84202B = new Fe84202B();
            fe84202B.setAlukid(new BigDecimal(f4101z1.getSzedbt()));
            fe84202B.setAlkcoo("00" + f4101z1.getSzmmcu());
            fe84202B.setAle8splx(f4101z1.getSzedct());
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
                String ukidp = this.f00022MapperC.selectF00022(this.schema);
                this.f00022MapperC.updateByKey(this.schema);
                fe84202B.setAlukidp(new BigDecimal(ukidp));
                this.fe84202BMapperC2.insertSelective(this.schema, fe84202B);
            }
        }

        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFE84101YON(String no) {
        Fe84101 fe84101 = new Fe84101();
        fe84101.setSplitm(no);
        fe84101.setSpflag("S");
        this.fe84101UpdateByLitmMapper.updateByLitmSelective(this.schema, fe84101, "S");
        return null;
    }
}
