//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.service;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.F4101z1;
import com.el.cfg.domain.F4104;
import com.el.cfg.domain.Fe841001;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84101z;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhE001OutBE01;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.domain.PhE001OutsublineB;
import com.el.cmic.ws.domain.PhE003OutMain;
import com.el.cmic.ws.mapper.F00022MapperC;
import com.el.cmic.ws.mapper.F0005DMapper;
import com.el.cmic.ws.mapper.F0005Mapper;
import com.el.cmic.ws.mapper.F4101UpdateByLitmMapper;
import com.el.cmic.ws.mapper.F4104UpdateByLitmMapper;
import com.el.cmic.ws.mapper.FE80101SelectAn8ByNameMapper;
import com.el.cmic.ws.mapper.FE841001UpdateByDocoMapper;
import com.el.cmic.ws.mapper.FE84101SelectAitm;
import com.el.cmic.ws.mapper.FE84101UpdateByLitmMapper;
import com.el.cmic.ws.mapper.FE84101ZSelectByE8ZZBM;
import com.el.cmic.ws.mapper.FE84101ZUpdateByPKMapper;
import com.el.cmic.ws.mapper.FE84202BMapperC2;
import com.el.cmic.ws.service.AddE03ToERPService;
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
public class AddE03ToERPServiceImpl implements AddE03ToERPService {
    Logger logger = Logger.getLogger(AddE03ToERPServiceImpl.class);
    @Autowired
    F4101UpdateByLitmMapper f4101UpdateByLitmMapper;
    @Autowired
    FE84101UpdateByLitmMapper fe84101UpdateByLitmMapper;
    @Autowired
    F4104UpdateByLitmMapper f4104UpdateByLitmMapper;
    @Autowired
    F0005Mapper f0005Mapper;
    @Autowired
    F0005DMapper f0005DMapper;
    @Autowired
    FE80101SelectAn8ByNameMapper fe80101SelectAn8ByNameMapper;
    @Autowired
    FE84101ZSelectByE8ZZBM fe84101ZSelectByE8ZZBM;
    @Autowired
    FE84101ZUpdateByPKMapper fe84101ZUpdateByPKMapper;
    @Autowired
    FE841001UpdateByDocoMapper fe841001UpdateByDocoMapper;
    @Autowired
    FE84101SelectAitm fe84101SelectAitm;
    @Autowired
    FE84202BMapperC2 fe84202BMapperC2;
    @Autowired
    F00022MapperC f00022MapperC;
    @Value("${schema}")
    private String schema;
    @Value("${ctlSchema}")
    private String dbtype;

    public AddE03ToERPServiceImpl() {
    }

    @Transactional
    public String addE03ToERP(PhE001OutHeader phE001OutHeader, PhE003OutMain phE003OutMain, PhE001OutsublineB phE001OutsublineB, String no, String co, String reqno) {
        this.updateF4101(phE001OutHeader, phE003OutMain, no);
        this.updateF4104(phE001OutHeader, phE003OutMain, no);
        this.updateFE84101(phE001OutHeader, phE003OutMain, phE001OutsublineB, no);
        this.updateFE84101Z(phE003OutMain, phE001OutsublineB, no, co, reqno);
        if(phE001OutHeader.getFunctype().equals("ADD")) {
            this.updateFE84101YON(no);
            this.updateFe841001flag(no);
        }

        this.updateFE84101bgbs(no);
        return null;
    }

    @Transactional
    public String updateFE84101Z(PhE003OutMain phE003OutMain, PhE001OutsublineB phE001OutsublineB, String no, String co, String reqno) {
        this.logger.info("E03开始更新FE84101Z");
        Fe84101z fe84101Z = new Fe84101z();
        if(phE001OutsublineB.getPhE001OutBE01List() != null) {
            Iterator var7 = phE001OutsublineB.getPhE001OutBE01List().iterator();

            while(var7.hasNext()) {
                PhE001OutBE01 tmp = (PhE001OutBE01)var7.next();
                fe84101Z.setZze8zzlxa(this.f0005Mapper.selectF0005(this.dbtype, "E8", "28", tmp.getPk_licensetype()));
                fe84101Z.setZze8zzbm(tmp.getLicenseno());
                fe84101Z.setZzlitm(no);
                fe84101Z.setZzco(co);
                String dj = tmp.getTodate();
                if(this.fe84101ZSelectByE8ZZBM.Fe84101zselect(this.schema, fe84101Z) >= 1) {
                    this.fe84101ZUpdateByPKMapper.updateByPrimaryKeySelective(this.schema, fe84101Z, "E01", dj);
                }

                if(this.fe84101ZSelectByE8ZZBM.Fe84101zselect(this.schema, fe84101Z) == 0) {
                    this.fe84101ZUpdateByPKMapper.insertSelective(this.schema, fe84101Z, dj, reqno);
                }
            }
        }

        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateF4101(PhE001OutHeader phE001OutHeader, PhE003OutMain phE003OutMain, String no) {
        this.logger.info("E03开始更新F4101");
        F4101 f4101 = new F4101();
        List phE001OutHeaderCodes = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList();
        f4101.setImlitm(no);
        f4101.setImdsc1(phE003OutMain.getSync());
        this.f4101UpdateByLitmMapper.updateByLitmSelective(this.schema, f4101, "E03");
        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFE84101(PhE001OutHeader phE001OutHeader, PhE003OutMain phE003OutMain, PhE001OutsublineB phE001OutsublineB, String no) {
        this.logger.info("E03开始更新FE84101");
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

        if(fe84101.getSpev01().equals((Object)null)) {
            fe84101.setSpev01("N");
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
        fe84101.setSplitm(no);
        fe84101.setSpe8name(phE003OutMain.getProductname());
        fe84101.setSpe8cpdl(this.f0005Mapper.selectF0005(this.dbtype, "E8", "14", phE003OutMain.getPk_productclass()));
        fe84101.setSpe8tsfl(this.f0005Mapper.selectF0005(this.dbtype, "E8", "15", phE003OutMain.getPk_yltsfl()));
        fe84101.setSpe8jhg(this.f0005Mapper.selectF0005(this.dbtype, "E8", "21", phE003OutMain.getPk_jhg()));
        fe84101.setSpe8ztw(this.f0005Mapper.selectF0005(this.dbtype, "E8", "32", phE003OutMain.getPk_ztw()));
        fe84101.setSpe8dsc2(phE003OutMain.getProducttype());
        fe84101.setSporig(phE003OutMain.getPk_mfcountry());
        if(phE001OutsublineB.getPhE001OutBE01List() != null) {
            f4101z1litm = phE001OutsublineB.getPhE001OutBE01List().iterator();

            while(f4101z1litm.hasNext()) {
                PhE001OutBE01 tmp1 = (PhE001OutBE01)f4101z1litm.next();
                fe84101.setSpe8fxdj(this.f0005Mapper.selectF0005(this.dbtype, "E8", "18", tmp1.getFxdj()));
                fe84101.setSpe8cctj(this.f0005Mapper.selectF0005(this.dbtype, "E8", "19", tmp1.getCctj()));
                fe84101.setSpe8qtcc(tmp1.getQtcctj());
                fe84101.setSpe8cpfl(tmp1.getPk_productclass());
                fe84101.setSpe8jgg(this.f0005Mapper.selectF0005(this.dbtype, "E8", "35", tmp1.getPk_jgg()));
            }
        }

        List f4101z1litm1 = this.fe84101SelectAitm.getlitm(this.schema, TemporaryCode);
        this.fe84101UpdateByLitmMapper.updateByLitmSelective(this.schema, fe84101, "E03");
        this.fe84101UpdateByLitmMapper.updatesametym(this.schema, TemporaryCode, FormalCode);
        Iterator tmp2 = f4101z1litm1.iterator();

        while(tmp2.hasNext()) {
            String a = (String)tmp2.next();
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
            } catch (ParseException var18) {
                var18.printStackTrace();
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
    public String updateF4104(PhE001OutHeader phE001OutHeader, PhE003OutMain phE003OutMain, String no) {
        this.logger.info("E03开始更新F4104");
        F4104 f4104 = new F4104();
        f4104.setIvcitm(phE003OutMain.getInterbarcode());
        f4104.setIvxrt("IC");
        f4104.setIvlitm(no);
        this.f4104UpdateByLitmMapper.updateByPrimaryKeySelective(this.schema, f4104);
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
