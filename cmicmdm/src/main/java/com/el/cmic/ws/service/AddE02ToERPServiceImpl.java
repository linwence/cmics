//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.service;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.F4101z1;
import com.el.cfg.domain.Fe841001;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutBE01;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.domain.PhE001OutsublineB;
import com.el.cmic.ws.domain.PhE002OutMain;
import com.el.cmic.ws.mapper.F00022MapperC;
import com.el.cmic.ws.mapper.F0005DMapper;
import com.el.cmic.ws.mapper.F0005Mapper;
import com.el.cmic.ws.mapper.F00165MapperCustom;
import com.el.cmic.ws.mapper.F4101UpdateByLitmMapper;
import com.el.cmic.ws.mapper.FE80101SelectAn8ByNameMapper;
import com.el.cmic.ws.mapper.FE841001UpdateByDocoMapper;
import com.el.cmic.ws.mapper.FE84101SelectAitm;
import com.el.cmic.ws.mapper.FE84101UpdateByLitmMapper;
import com.el.cmic.ws.mapper.FE84101ZSelectByE8ZZBM;
import com.el.cmic.ws.mapper.FE84101ZUpdateByPKMapper;
import com.el.cmic.ws.mapper.FE84202BMapperC2;
import com.el.cmic.ws.service.AddE02ToERPService;
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
    @Autowired
    FE841001UpdateByDocoMapper fe841001UpdateByDocoMapper;
    @Autowired
    FE84101SelectAitm fe84101SelectAitm;
    @Autowired
    FE84202BMapperC2 fe84202BMapperC2;
    @Autowired
    F00022MapperC f00022MapperC;
    @Value("${ctlSchema}")
    private String dbtype;
    @Value("${schema}")
    private String schema;

    public AddE02ToERPServiceImpl() {
    }

    @Transactional
    public String addE02ToERP(PhE001OutHeader phE001OutHeader, PhE002OutMain phE002OutMain, PhE001OutsublineB phE001OutsublineB, String no, String co) {
        this.updateF4101(phE001OutHeader, phE002OutMain, no);
        this.updateFE84101(phE001OutHeader, phE002OutMain, phE001OutsublineB, no);
        if(phE001OutHeader.getFunctype().equals("ADD")) {
            this.updateFE84101YON(no);
            this.updateFe841001flag(no);
        }

        this.updateFE84101bgbs(no);
        return null;
    }

    @Transactional
    public String updateFE84101Z(PhE002OutMain phE002OutMain, PhE001OutsublineB phE001OutsublineB, String no, String co) {
        return null;
    }

    @Transactional
    public String updateFE84101(PhE001OutHeader phE001OutHeader, PhE002OutMain phE002OutMain, PhE001OutsublineB phE001OutsublineB, String no) {
        this.logger.info("E02开始更新表FE84101");
        Fe84101 fe84101 = new Fe84101();
        String TemporaryCode = "";
        String FormalCode = "";
        List phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        Iterator e8jx = phE001OutHeaderCodes.iterator();

        PhE001OutHeaderCode f4101z1litm;
        while(e8jx.hasNext()) {
            f4101z1litm = (PhE001OutHeaderCode)e8jx.next();
            if(f4101z1litm.getCodetype().equals("1")) {
                fe84101.setSpev01("Y");
            }
        }

        if(fe84101.getSpev01().equals((Object)null)) {
            fe84101.setSpev01("N");
        }

        e8jx = phE001OutHeaderCodes.iterator();

        while(e8jx.hasNext()) {
            f4101z1litm = (PhE001OutHeaderCode)e8jx.next();
            if(f4101z1litm.getCodetype().equals("0")) {
                TemporaryCode = f4101z1litm.getCodevalue();
            }

            if(f4101z1litm.getCodetype().equals("1")) {
                FormalCode = f4101z1litm.getCodevalue();
            }
        }

        fe84101.setSpe8sptym(FormalCode);
        fe84101.setSplitm(no);
        fe84101.setSpe8name(phE002OutMain.getProductname());
        fe84101.setSpe8pzwh(phE002OutMain.getFileno());
        fe84101.setSpe8zdyl(this.f0005Mapper.selectF0005(this.dbtype, "E8", "29", phE002OutMain.getPk_zdypdl()));
        fe84101.setSpe8jhg(this.f0005Mapper.selectF0005(this.dbtype, "E8", "21", phE002OutMain.getPk_jhg()));
        fe84101.setSpe8ztw(this.f0005Mapper.selectF0005(this.dbtype, "E8", "32", phE002OutMain.getPk_ztw()));
        fe84101.setSpe8gfg(this.f0005Mapper.selectF0005(this.dbtype, "E8", "33", phE002OutMain.getPk_fgjyw()));
        fe84101.setSpe8ptyp(this.f0005Mapper.selectF0005(this.dbtype, "E8", "34", phE002OutMain.getPk_ptyp()));
        fe84101.setSpe8atcdl(this.f0005Mapper.selectF0005(this.dbtype, "E8", "30", phE002OutMain.getPk_atcdl()));
        fe84101.setSpe8atcxl(this.f0005Mapper.selectF0005(this.dbtype, "E8", "31", phE002OutMain.getPk_atcxl()));
        fe84101.setSporig(phE002OutMain.getPk_mfcountry());
        fe84101.setSpe8dsc2(phE002OutMain.getProducttype());
        String e8jx1 = this.f0005Mapper.selectF0005(this.dbtype, "E8", "JX", phE002OutMain.getForm());
        if(e8jx1 == null) {
            fe84101.setSpe8jx(" ");
        } else {
            fe84101.setSpe8jx(e8jx1);
        }

        if(phE001OutsublineB.getPhE001OutBE01List() != null) {
            Iterator f4101z1litm1 = phE001OutsublineB.getPhE001OutBE01List().iterator();

            while(f4101z1litm1.hasNext()) {
                PhE001OutBE01 tmp = (PhE001OutBE01)f4101z1litm1.next();
                fe84101.setSpe8fxdj(this.f0005Mapper.selectF0005(this.dbtype, "E8", "18", tmp.getFxdj()));
                fe84101.setSpe8cctj(this.f0005Mapper.selectF0005(this.dbtype, "E8", "19", tmp.getCctj()));
                fe84101.setSpe8qtcc(tmp.getQtcctj());
                fe84101.setSpe8cpfl(tmp.getPk_productclass());
                fe84101.setSpe8jgg(this.f0005Mapper.selectF0005(this.dbtype, "E8", "35", tmp.getPk_jgg()));
            }
        }

        List f4101z1litm2 = this.fe84101SelectAitm.getlitm(this.schema, TemporaryCode);
        this.fe84101UpdateByLitmMapper.updateByLitmSelective(this.schema, fe84101, "E02");
        this.fe84101UpdateByLitmMapper.updatesametym(this.schema, TemporaryCode, FormalCode);
        Iterator tmp1 = f4101z1litm2.iterator();

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
            } catch (ParseException var19) {
                var19.printStackTrace();
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
    public String updateF4101(PhE001OutHeader phE001OutHeader, PhE002OutMain phE002OutMain, String no) {
        this.logger.info("E02开始更新表F4101");
        F4101 f4101 = new F4101();
        List phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        f4101.setImlitm(no);
        f4101.setImdsc1(phE002OutMain.getSync());
        f4101.setImuom1(this.f0005DMapper.selectF0005D(this.dbtype, "00", "UM", phE002OutMain.getPk_weight()));
        this.f4101UpdateByLitmMapper.updateByLitmSelective(this.schema, f4101, "E02");
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

    @Transactional
    public String updateFE84101bgbs(String no) {
        Fe84101 fe84101 = new Fe84101();
        fe84101.setSplitm(no);
        fe84101.setSpe8bgbs("N");
        this.fe84101UpdateByLitmMapper.updateByLitmSelective(this.schema, fe84101, "N");
        return null;
    }

    @Transactional
    public String updateFe841001flag(String no) {
        Fe841001 fe841001 = new Fe841001();
        fe841001.setSqlitm(no);
        fe841001.setSqflag("S");
        this.fe841001UpdateByDocoMapper.updatebylitm(this.schema, fe841001);
        return null;
    }
}
