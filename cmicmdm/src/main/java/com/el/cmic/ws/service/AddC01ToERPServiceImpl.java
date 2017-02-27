//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.service;

import com.el.cfg.domain.F0101;
import com.el.cfg.domain.F0101z2;
import com.el.cfg.domain.F0116;
import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe80101z;
import com.el.cfg.domain.Fe841003;
import com.el.cfg.domain.Fe84202B;
import com.el.cmic.ws.domain.PhC001OutBC01;
import com.el.cmic.ws.domain.PhC001OutCSCC01;
import com.el.cmic.ws.domain.PhC001OutJCYLJGC01;
import com.el.cmic.ws.domain.PhC001OutJKSC01;
import com.el.cmic.ws.domain.PhC001OutJXSC01;
import com.el.cmic.ws.domain.PhC001OutMain;
import com.el.cmic.ws.domain.PhC001OutSublineB;
import com.el.cmic.ws.domain.PhC001OutSublineCSC;
import com.el.cmic.ws.domain.PhC001OutSublineGR;
import com.el.cmic.ws.domain.PhC001OutSublineJCYLJG;
import com.el.cmic.ws.domain.PhC001OutSublineJKS;
import com.el.cmic.ws.domain.PhC001OutSublineJXS;
import com.el.cmic.ws.domain.PhC001OutSublineQT;
import com.el.cmic.ws.domain.PhC001OutSublineYY;
import com.el.cmic.ws.domain.PhC001OutYYC01;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutHeaderCode;
import com.el.cmic.ws.mapper.F00022MapperC;
import com.el.cmic.ws.mapper.F0005Mapper;
import com.el.cmic.ws.mapper.F0101UpdateByPKMapper;
import com.el.cmic.ws.mapper.F0116UpdateByAn8Mapper;
import com.el.cmic.ws.mapper.FE80101SelectAlky;
import com.el.cmic.ws.mapper.FE80101UpdateByPKMapper;
import com.el.cmic.ws.mapper.FE80101ZUpdateByE8ZZBMMapper;
import com.el.cmic.ws.mapper.FE841003UpdateByPKMapper;
import com.el.cmic.ws.mapper.FE84202BMapperC2;
import com.el.cmic.ws.service.AddC01ToERPService;
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
public class AddC01ToERPServiceImpl implements AddC01ToERPService {
    Logger logger = Logger.getLogger(AddC01ToERPServiceImpl.class);
    @Autowired
    F0101UpdateByPKMapper f0101UpdateByPKMapper;
    @Autowired
    F0116UpdateByAn8Mapper f0116UpdateByAn8Mapper;
    @Autowired
    FE80101UpdateByPKMapper fe80101UpdateByPKMapper;
    @Autowired
    FE80101ZUpdateByE8ZZBMMapper fe80101ZUpdateByE8ZZBMMapper;
    @Autowired
    F0005Mapper f0005Mapper;
    @Autowired
    FE841003UpdateByPKMapper fe841003UpdateByPKMapper;
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

    public AddC01ToERPServiceImpl() {
    }

    @Transactional
    public String addC01ToERP(PhE001OutHeader phE001OutHeader, PhC001OutMain phC001OutMain, PhC001OutSublineYY phC001OutSublineYY, PhC001OutSublineJCYLJG phC001OutSublineJCYLJG, PhC001OutSublineGR phC001OutSublineGR, PhC001OutSublineQT phC001OutSublineQT, PhC001OutSublineB phC001OutSublineB, PhC001OutSublineJXS phC001OutSublineJXS, PhC001OutSublineJKS phC001OutSublineJKS, PhC001OutSublineCSC phC001OutSublineCSC, String no, String reqno) {
        this.updateF0116(phC001OutMain, no);
        this.updateFE80101(phE001OutHeader, phC001OutMain, phC001OutSublineYY, phC001OutSublineJCYLJG, phC001OutSublineGR, phC001OutSublineQT, phC001OutSublineJXS, phC001OutSublineJKS, phC001OutSublineCSC, no);
        this.updateFE80101Z(phC001OutSublineB, no, reqno);
        if(phE001OutHeader.getFunctype().equals("ADD")) {
            this.updateFe80101SON(no);
            this.updateFe841003flag(no);
        }

        this.updateFe80101bgbs(no);
        return null;
    }

    @Transactional
    public String updateF0101(PhE001OutHeader phE001OutHeader, PhC001OutMain phC001OutMain, String no) {
        this.logger.info("客商开始更新F0101");
        F0101 f0101 = new F0101();
        BigDecimal bd = new BigDecimal(no);
        f0101.setAban8(bd);
        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateF0116(PhC001OutMain phC001OutMain, String no) {
        this.logger.info("客商开始更新F0116");
        F0116 f0116 = new F0116();
        f0116.setAlctr(phC001OutMain.getPk_country());
        f0116.setAladds(f0005Mapper.selectF0005(dbtype, "00", "S", phC001OutMain.getPk_szq()));
        f0116.setAlcty1(phC001OutMain.getPk_counties());
        f0116.setAlcoun(phC001OutMain.getPk_cities());
        BigDecimal bd = new BigDecimal(no);
        f0116.setAlan8(bd);
        if(phC001OutMain.getAddress().length() <= 40) {
            f0116.setAladd1(phC001OutMain.getAddress());
        }

        if(phC001OutMain.getAddress().length() > 40 && phC001OutMain.getAddress().length() <= 80) {
            f0116.setAladd1(phC001OutMain.getAddress().substring(0, 40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40, phC001OutMain.getAddress().length()));
        }

        if(phC001OutMain.getAddress().length() > 80 && phC001OutMain.getAddress().length() <= 120) {
            f0116.setAladd1(phC001OutMain.getAddress().substring(0, 40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40, 80));
            f0116.setAladd3(phC001OutMain.getAddress().substring(80, phC001OutMain.getAddress().length()));
        }

        if(phC001OutMain.getAddress().length() > 120 && phC001OutMain.getAddress().length() <= 160) {
            f0116.setAladd1(phC001OutMain.getAddress().substring(0, 40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40, 80));
            f0116.setAladd3(phC001OutMain.getAddress().substring(80, 120));
            f0116.setAladd4(phC001OutMain.getAddress().substring(120, phC001OutMain.getAddress().length()));
        }

        if(phC001OutMain.getAddress().length() > 160) {
            f0116.setAladd1(phC001OutMain.getAddress().substring(0, 40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40, 80));
            f0116.setAladd3(phC001OutMain.getAddress().substring(80, 120));
            f0116.setAladd4(phC001OutMain.getAddress().substring(120, 160));
        }

        if(f0116.getAladd1() == null) {
            f0116.setAladd1(" ");
        }

        if(f0116.getAladd2() == null) {
            f0116.setAladd2(" ");
        }

        if(f0116.getAladd3() == null) {
            f0116.setAladd3(" ");
        }

        if(f0116.getAladd4() == null) {
            f0116.setAladd4(" ");
        }

        this.f0116UpdateByAn8Mapper.updateByAn8(schema, f0116, "C01");
        this.logger.info("成功");
        return null;
    }

    @Transactional
    public String updateFE80101(PhE001OutHeader phE001OutHeader, PhC001OutMain phC001OutMain, PhC001OutSublineYY phC001OutSublineYY, PhC001OutSublineJCYLJG phC001OutSublineJCYLJG, PhC001OutSublineGR phC001OutSublineGR, PhC001OutSublineQT phC001OutSublineQT, PhC001OutSublineJXS phC001OutSublineJXS, PhC001OutSublineJKS phC001OutSublineJKS, PhC001OutSublineCSC phC001OutSublineCSC, String no) {
        this.logger.info("客商开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        Iterator TemporaryCode = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList().iterator();

        while(TemporaryCode.hasNext()) {
            PhE001OutHeaderCode FormalCode = (PhE001OutHeaderCode)TemporaryCode.next();
            if(FormalCode.getCodetype().equals("1")) {
                fe80101.setKsev01("Y");
            }
        }

        if(fe80101.getKsev01().equals(null)) {
            fe80101.setKsev01("N");
        }

        String TemporaryCode1 = "";
        String FormalCode1 = "";
        Iterator bd = phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList().iterator();

        while(bd.hasNext()) {
            PhE001OutHeaderCode f0101z2an8 = (PhE001OutHeaderCode)bd.next();
            if(f0101z2an8.getCodetype().equals("0")) {
                TemporaryCode1 = f0101z2an8.getCodevalue();
            }

            if(f0101z2an8.getCodetype().equals("1")) {
                FormalCode1 = f0101z2an8.getCodevalue();
            }
        }

        fe80101.setKse8kstym(FormalCode1);
        BigDecimal bd1 = new BigDecimal(no);
        fe80101.setKsan8(bd1);
        fe80101.setKse8name(phC001OutMain.getCustname());
        fe80101.setKse8scs(phC001OutMain.getIsscs());
        fe80101.setKse8jxs(phC001OutMain.getIsjxs());
        fe80101.setKse8jks(phC001OutMain.getIsjks());
        fe80101.setKse8yy(phC001OutMain.getIsyy());
        fe80101.setKse8yljg(phC001OutMain.getIsjcyljg());
        fe80101.setKse8gr(phC001OutMain.getIsgr());
        fe80101.setKse8qt(phC001OutMain.getIsqt());
        BigDecimal a;
        long f0101z2an81;
        if(phC001OutMain.getIsyy().equals("Y")) {
            fe80101.setKse8yyyl(((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getIsyl());
            fe80101.setKse8yygl(((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getIsgl());
            fe80101.setKse8yysb(((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getIssbdd());
            fe80101.setKse8yygs(f0005Mapper.selectF0005(dbtype, "E8", "25", ((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getPk_yygs()));
            fe80101.setKse8yljb(f0005Mapper.selectF0005(dbtype, "E8", "26", ((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getIstgyf()));
            fe80101.setKse8tgyf(((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getIstgyf());
            fe80101.setKse8dl(f0005Mapper.selectF0005(dbtype, "E8", "11", ((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getPk_yydl()));
            fe80101.setKse8xl(f0005Mapper.selectF0005(dbtype, "E8", "12", ((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getPk_yyxl()));
            if(!((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getYynsr().equals("")) {
                f0101z2an81 = Long.parseLong(((PhC001OutYYC01)phC001OutSublineYY.getPhC001OutSublineYYList().get(0)).getYynsr()) * 100L;
                a = new BigDecimal(f0101z2an81);
                fe80101.setKse8yynsr(a);
            }
        }

        if(phC001OutMain.getIsjcyljg().equals("Y")) {
            fe80101.setKse8yyyl(((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getIsyl());
            fe80101.setKse8yygl(((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getIsgl());
            fe80101.setKse8yysb(((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getIssbdd());
            fe80101.setKse8yygs(this.f0005Mapper.selectF0005(this.dbtype, "E8", "25", ((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getPk_yygs()));
            fe80101.setKse8yljb(this.f0005Mapper.selectF0005(this.dbtype, "E8", "26", ((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getPk_yljb()));
            fe80101.setKse8tgyf(((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getIstgyf());
            fe80101.setKse8dl(this.f0005Mapper.selectF0005(this.dbtype, "E8", "11", ((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getPk_yydl()));
            fe80101.setKse8xl(this.f0005Mapper.selectF0005(this.dbtype, "E8", "12", ((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getPk_yyxl()));
            if(!((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).equals("")) {
                f0101z2an81 = Long.parseLong(((PhC001OutJCYLJGC01)phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0)).getYynsr()) * 100L;
                a = new BigDecimal(f0101z2an81);
                fe80101.setKse8yynsr(a);
            }
        }

        if(phC001OutMain.getIsgr().equals("Y")) {
            fe80101.setKse8sfz(phC001OutSublineGR.getPhC001OutGRC01().getIdcard());
        }

        if(phC001OutMain.getIsqt().equals("Y")) {
            fe80101.setKse8dwxz(this.f0005Mapper.selectF0005(this.dbtype, "E8", "24", phC001OutSublineQT.getPhC001OutQTC01().getPk_dwxz()));
        }

        if(phC001OutMain.getIsjxs().equals("Y")) {
            fe80101.setKse8dwxz(this.f0005Mapper.selectF0005(this.dbtype, "E8", "24", ((PhC001OutJXSC01)phC001OutSublineJXS.getPhC001OutJXSC01List().get(0)).getPk_dwxz()));
        }

        if(phC001OutMain.getIsjks().equals("Y")) {
            fe80101.setKse8dwxz(this.f0005Mapper.selectF0005(this.dbtype, "E8", "24", ((PhC001OutJKSC01)phC001OutSublineJKS.getPhC001OutJKSC01List().get(0)).getPk_dwxz()));
        }

        if(phC001OutMain.getIsscs().equals("Y")) {
            fe80101.setKse8dwxz(this.f0005Mapper.selectF0005(this.dbtype, "E8", "24", ((PhC001OutCSCC01)phC001OutSublineCSC.getPhC001OutCSCC01List().get(0)).getPk_dwxz()));
        }

        List f0101z2an82 = this.fe80101SelectAlky.selectan8(this.schema, TemporaryCode1);
        this.fe80101UpdateByPKMapper.updateByPrimaryKeySelective(this.schema, fe80101, "C01");
        this.fe80101UpdateByPKMapper.updatesametym(this.schema, TemporaryCode1, FormalCode1);
        Iterator var16 = f0101z2an82.iterator();

        while(var16.hasNext()) {
            String a1 = (String)var16.next();
            F0101z2 f0101z2 = this.fe80101SelectAlky.selectf0101z2PK(this.schema, a1);
            String reg = ".*唯一性错误.*";
            if(phE001OutHeader.getApprovenote().matches(reg)) {
                this.fe80101SelectAlky.updateF0101z2PK(this.schema, a1, "Q");
            } else {
                this.fe80101SelectAlky.updateF0101z2PK(this.schema, a1, "S");
            }

            Date date = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            try {
                date = format2.parse(phE001OutHeader.getApprovedate());
            } catch (ParseException var24) {
                var24.printStackTrace();
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
    public String updateFE80101Z(PhC001OutSublineB phC001OutSublineB, String no, String reqno) {
        this.logger.info("客商开始更新FE80101Z");
        if(phC001OutSublineB.getPhC001OutBC01List() != null) {
            Iterator var4 = phC001OutSublineB.getPhC001OutBC01List().iterator();

            while(var4.hasNext()) {
                PhC001OutBC01 tmp = (PhC001OutBC01)var4.next();
                Fe80101z fe80101Z = new Fe80101z();
                BigDecimal bigDecimal = new BigDecimal(no);
                fe80101Z.setZzan8(bigDecimal);
                fe80101Z.setZze8zzlxa(this.f0005Mapper.selectF0005(this.dbtype, "E8", "10", tmp.getPk_lictype()));
                fe80101Z.setZzfil2(tmp.getDef3());
                fe80101Z.setZze8zzbm(tmp.getLicno());
                fe80101Z.setZze8jyfw(tmp.getLicfw());
                fe80101Z.setZze8jyfw2(tmp.getLicfwt());
                fe80101Z.setZze8jyfw3(tmp.getLicfws());
                if(!reqno.equals("")) {
                    if(this.fe80101ZUpdateByE8ZZBMMapper.selectByPrimaryKey(this.schema, fe80101Z) >= 1) {
                        this.fe80101ZUpdateByE8ZZBMMapper.updateByE8ZZBM(this.schema, fe80101Z, "C01", tmp.getLictodate());
                    }

                    if(this.fe80101ZUpdateByE8ZZBMMapper.selectByPrimaryKey(this.schema, fe80101Z) == 0) {
                        this.fe80101ZUpdateByE8ZZBMMapper.insertSelective(this.schema, fe80101Z, tmp.getLictodate(), reqno);
                    }
                }
            }
        }

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

    @Transactional
    public String updateFe80101bgbs(String no) {
        this.logger.info("更新变更标识");
        Fe80101 fe80101 = new Fe80101();
        BigDecimal bd = new BigDecimal(no);
        fe80101.setKsan8(bd);
        fe80101.setKsev02("N");
        this.fe80101UpdateByPKMapper.updateByPrimaryKeySelective(this.schema, fe80101, "N");
        return null;
    }

    @Transactional
    public String updateFe841003flag(String no) {
        this.logger.info("更新变更单标识");
        Fe841003 fe841003 = new Fe841003();
        BigDecimal bd = new BigDecimal(no);
        fe841003.setSqan8(bd);
        fe841003.setSqflag("S");
        this.fe841003UpdateByPKMapper.updateByan8(this.schema, fe841003);
        return null;
    }
}
