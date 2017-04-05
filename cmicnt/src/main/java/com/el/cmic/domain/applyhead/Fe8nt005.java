package com.el.cmic.domain.applyhead;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Fe8nt005 implements Serializable,Comparable {
    @JSONField(name = "hdoc")
    private String kp58bdoc;
    @JSONField(name = "sn")
    private BigDecimal kp58bsn;
    @JSONField(name = "sys")
    private String kp58bsys;
    @JSONField(name = "ift")
    private String kp58bift;
    @JSONField(name = "kco")
    private String kpkco;
    @JSONField(name = "appt")
    private String kp58bappt;
    @JSONField(name = "mcu")
    private String kpmcu;
    @JSONField(name = "co")
    private String kp58bco;
    @JSONField(name = "invt")
    private String kp58binvt;
    @JSONField(name = "invtdl")
    private String kpe8str200;
    @JSONField(name = "lmt")
    private BigDecimal kp58blmt;
    @JSONField(name = "dlt")
    private String kp58bdlt;
    @JSONField(name = "trdj")
    private Integer kptrdj;
    @JSONField(name = "an8")
    private BigDecimal kpan8;
    @JSONField(name = "e8name")
    private String kpe8name;
    @JSONField(name = "doc")
    private BigDecimal kpdoc;
    @JSONField(name = "dct")
    private String kpdct;
    @JSONField(name = "apst")
    private String kp58bapst;
    @JSONField(name = "fp")
    private String kp58bfp;
    @JSONField(name = "name")
    private String kp58bname;
    @JSONField(name = "taxnm")
    private String kp58btaxnm;
    @JSONField(name = "add")
    private String kp58badd;
    @JSONField(name = "tel")
    private String kp58btel;
    @JSONField(name = "bank")
    private String kp58bbank;
    @JSONField(name = "banknm")
    private String kp58bbanknm;
    @JSONField(name = "rmk2")
    private String kp58brmk2;
    @JSONField(name = "rmk1")
    private String kp58brmk1;
    @JSONField(name = "addsd")
    private String kp58baddsd;
    @JSONField(name = "recp")
    private String kp58brecp;
    @JSONField(name = "pcode")
    private String kp58bpcode;
    @JSONField(name = "phone")
    private String kp58bphone;
    @JSONField(name = "trd")
    private String kp58btrd;
    @JSONField(name = "ivd")
    private Integer kpivd;
    @JSONField(name = "ag")
    private BigDecimal kpag;
    @JSONField(name = "stam")
    private BigDecimal kpstam;
    @JSONField(name = "atxa")
    private BigDecimal kpatxa;
    @JSONField(name = "atx")
    private String kpdl03;
    @JSONField(name = "invnum2")
    private String kp58binvnum2;
    @JSONField(name = "dl01")
    private String kpdl01;
    @JSONField(name = "dl02")
    private String kpdl02;
    @JSONField(name = "dl04")
    private String kpdl04;
    @JSONField(name = "dl05")
    private String kpdl05;

    /**
     *  null - CRPDTA.FE8NT005.KPDL06
     */
    private String kpdl06;

    /**
     *  null - CRPDTA.FE8NT005.KPDL07
     */
    private String kpdl07;

    @JSONField(name = "indate", format = "yyyy/MM/dd HH:mm:ss")
    private Date kpindate;
    @JSONField(name = "redate", format = "yyyy/MM/dd HH:mm:ss")
    private Date kpredate;

    /**
     *  null - CRPDTA.FE8NT005.KPIR01
     */
    private String kpir01;

    /**
     *  null - CRPDTA.FE8NT005.KPIR02
     */
    private String kpir02;

    /**
     *  null - CRPDTA.FE8NT005.KPIR03
     */
    private String kpir03;

    /**
     *  null - CRPDTA.FE8NT005.KPIR04
     */
    private String kpir04;

    /**
     *  null - CRPDTA.FE8NT005.KPIR05
     */
    private String kpir05;

    /**
     *  null - CRPDTA.FE8NT005.KPHRB
     */
    private BigDecimal kphrb;

    /**
     *  null - CRPDTA.FE8NT005.KPPSAL
     */
    private BigDecimal kppsal;

    /**
     *  null - CRPDTA.FE8NT005.KPIPAY
     */
    private BigDecimal kpipay;

    /**
     *  null - CRPDTA.FE8NT005.KPTDSC
     */
    private BigDecimal kptdsc;

    /**
     *  null - CRPDTA.FE8NT005.KPEFHR
     */
    private BigDecimal kpefhr;

    /**
     *  null - CRPDTA.FE8NT005.KPCRTJ
     */
    private Integer kpcrtj;

    /**
     *  null - CRPDTA.FE8NT005.KPDIVJ
     */
    private Integer kpdivj;

    /**
     *  null - CRPDTA.FE8NT005.KPEXDJ
     */
    private Integer kpexdj;

    /**
     *  null - CRPDTA.FE8NT005.KPAFDJ
     */
    private Integer kpafdj;

    /**
     *  null - CRPDTA.FE8NT005.KPCKDT
     */
    private Integer kpckdt;

    /**
     *  null - CRPDTA.FE8NT005.KPUSER
     */
    private String kpuser;

    /**
     *  null - CRPDTA.FE8NT005.KPPID
     */
    private String kppid;

    /**
     *  null - CRPDTA.FE8NT005.KPJOBN
     */
    private String kpjobn;

    /**
     *  null - CRPDTA.FE8NT005.KPUPMJ
     */
    private Integer kpupmj;

    /**
     *  null - CRPDTA.FE8NT005.KPUPMT
     */
    private BigDecimal kpupmt;

    /**
     *  null - CRPDTA.FE8NT005.KPTDAY
     */
    private BigDecimal kptday;

    /**
     *  null - CRPDTA.FE8NT005.KPURCD
     */
    private String kpurcd;

    /**
     *  null - CRPDTA.FE8NT005.KPURDT
     */
    private Integer kpurdt;

    /**
     *  null - CRPDTA.FE8NT005.KPURAT
     */
    private BigDecimal kpurat;

    /**
     *  null - CRPDTA.FE8NT005.KPURAB
     */
    private BigDecimal kpurab;

    /**
     *  null - CRPDTA.FE8NT005.KPURRF
     */
    private String kpurrf;

    private String kpedsp;

    private static final long serialVersionUID = 1L;

    public String getKpedsp() {
        return kpedsp;
    }

    public void setKpedsp(String kpedsp) {
        this.kpedsp = kpedsp;
    }

    public String getKp58bdoc() {
        return kp58bdoc;
    }

    public void setKp58bdoc(String kp58bdoc) {
        this.kp58bdoc = kp58bdoc;
    }

    public BigDecimal getKp58bsn() {
        return kp58bsn;
    }

    public void setKp58bsn(BigDecimal kp58bsn) {
        this.kp58bsn = kp58bsn;
    }

    public String getKp58bsys() {
        return kp58bsys;
    }

    public void setKp58bsys(String kp58bsys) {
        if(!StringUtils.isEmpty(kp58bsys)){
            if(kp58bsys.equals("1")){
                kp58bsys="0"+kp58bsys;
            }
        }
        this.kp58bsys = kp58bsys;
    }

    public String getKp58bift() {
        return kp58bift;
    }

    public void setKp58bift(String kp58bift) {
        this.kp58bift = kp58bift;
    }

    public String getKpkco() {
        return kpkco;
    }

    public void setKpkco(String kpkco) {
        this.kpkco = kpkco;
    }

    public String getKp58bappt() {
        return kp58bappt;
    }

    public void setKp58bappt(String kp58bappt) {
        this.kp58bappt = kp58bappt;
    }

    public String getKpmcu() {
        return kpmcu;
    }

    public void setKpmcu(String kpmcu) {
        this.kpmcu = kpmcu;
    }

    public String getKp58bco() {
        return kp58bco;
    }

    public void setKp58bco(String kp58bco) {
        this.kp58bco = kp58bco;
    }

    public String getKp58binvt() {
        return kp58binvt;
    }

    public void setKp58binvt(String kp58binvt) {
        this.kp58binvt = kp58binvt;
    }

    public String getKpe8str200() {
        return kpe8str200;
    }

    public void setKpe8str200(String kpe8str200) {
        this.kpe8str200 = kpe8str200;
    }

    public BigDecimal getKp58blmt() {
        return kp58blmt;
    }

    public void setKp58blmt(BigDecimal kp58blmt) {
        this.kp58blmt = kp58blmt;
    }

    public String getKp58bdlt() {
        return kp58bdlt;
    }

    public void setKp58bdlt(String kp58bdlt) {
        this.kp58bdlt = kp58bdlt;
    }

    public Integer getKptrdj() {
        return kptrdj;
    }

    public void setKptrdj(Integer kptrdj) {
        this.kptrdj = kptrdj;
    }

    public BigDecimal getKpan8() {
        return kpan8;
    }

    public void setKpan8(BigDecimal kpan8) {
        this.kpan8 = kpan8;
    }

    public String getKpe8name() {
        return kpe8name;
    }

    public void setKpe8name(String kpe8name) {
        this.kpe8name = kpe8name;
    }

    public BigDecimal getKpdoc() {
        return kpdoc;
    }

    public void setKpdoc(BigDecimal kpdoc) {
        this.kpdoc = kpdoc;
    }

    public String getKpdct() {
        return kpdct;
    }

    public void setKpdct(String kpdct) {
        this.kpdct = kpdct;
    }

    public String getKp58bapst() {
        return kp58bapst;
    }

    public void setKp58bapst(String kp58bapst) {
        this.kp58bapst = kp58bapst;
    }

    public String getKp58bfp() {
        return kp58bfp;
    }

    public void setKp58bfp(String kp58bfp) {
        this.kp58bfp = kp58bfp;
    }

    public String getKp58bname() {
        return kp58bname;
    }

    public void setKp58bname(String kp58bname) {
        this.kp58bname = kp58bname;
    }

    public String getKp58btaxnm() {
        return kp58btaxnm;
    }

    public void setKp58btaxnm(String kp58btaxnm) {
        this.kp58btaxnm = kp58btaxnm;
    }

    public String getKp58badd() {
        return kp58badd;
    }

    public void setKp58badd(String kp58badd) {
        this.kp58badd = kp58badd;
    }

    public String getKp58btel() {
        return kp58btel;
    }

    public void setKp58btel(String kp58btel) {
        this.kp58btel = kp58btel;
    }

    public String getKp58bbank() {
        return kp58bbank;
    }

    public void setKp58bbank(String kp58bbank) {
        this.kp58bbank = kp58bbank;
    }

    public String getKp58bbanknm() {
        return kp58bbanknm;
    }

    public void setKp58bbanknm(String kp58bbanknm) {
        this.kp58bbanknm = kp58bbanknm;
    }

    public String getKp58brmk2() {
        return kp58brmk2;
    }

    public void setKp58brmk2(String kp58brmk2) {
        this.kp58brmk2 = kp58brmk2;
    }

    public String getKp58brmk1() {
        return kp58brmk1;
    }

    public void setKp58brmk1(String kp58brmk1) {
        this.kp58brmk1 = kp58brmk1;
    }

    public String getKp58baddsd() {
        return kp58baddsd;
    }

    public void setKp58baddsd(String kp58baddsd) {
        this.kp58baddsd = kp58baddsd;
    }

    public String getKp58brecp() {
        return kp58brecp;
    }

    public void setKp58brecp(String kp58brecp) {
        this.kp58brecp = kp58brecp;
    }

    public String getKp58bpcode() {
        return kp58bpcode;
    }

    public void setKp58bpcode(String kp58bpcode) {
        this.kp58bpcode = kp58bpcode;
    }

    public String getKp58bphone() {
        return kp58bphone;
    }

    public void setKp58bphone(String kp58bphone) {
        this.kp58bphone = kp58bphone;
    }

    public String getKp58btrd() {
        return kp58btrd;
    }

    public void setKp58btrd(String kp58btrd) {
        this.kp58btrd = kp58btrd;
    }

    public Integer getKpivd() {
        return kpivd;
    }

    public void setKpivd(Integer kpivd) {
        this.kpivd = kpivd;
    }

    public BigDecimal getKpag() {
        return kpag;
    }

    public void setKpag(BigDecimal kpag) {
        this.kpag = kpag;
    }

    public BigDecimal getKpstam() {
        return kpstam;
    }

    public void setKpstam(BigDecimal kpstam) {
        this.kpstam = kpstam;
    }

    public BigDecimal getKpatxa() {
        return kpatxa;
    }

    public void setKpatxa(BigDecimal kpatxa) {
        this.kpatxa = kpatxa;
    }

    public String getKpdl03() {
        return kpdl03;
    }

    public void setKpdl03(String kpdl03) {
        this.kpdl03 = kpdl03;
    }

    public String getKp58binvnum2() {
        return kp58binvnum2;
    }

    public void setKp58binvnum2(String kp58binvnum2) {
        this.kp58binvnum2 = kp58binvnum2;
    }

    public String getKpdl01() {
        return kpdl01;
    }

    public void setKpdl01(String kpdl01) {
        this.kpdl01 = kpdl01;
    }

    public String getKpdl02() {
        return kpdl02;
    }

    public void setKpdl02(String kpdl02) {
        this.kpdl02 = kpdl02;
    }

    public String getKpdl04() {
        return kpdl04;
    }

    public void setKpdl04(String kpdl04) {
        this.kpdl04 = kpdl04;
    }

    public String getKpdl05() {
        return kpdl05;
    }

    public void setKpdl05(String kpdl05) {
        this.kpdl05 = kpdl05;
    }

    public String getKpdl06() {
        return kpdl06;
    }

    public void setKpdl06(String kpdl06) {
        this.kpdl06 = kpdl06;
    }

    public String getKpdl07() {
        return kpdl07;
    }

    public void setKpdl07(String kpdl07) {
        this.kpdl07 = kpdl07;
    }

    public Date getKpindate() {
        return kpindate;
    }

    public void setKpindate(Date kpindate) {
        this.kpindate = kpindate;
    }

    public Date getKpredate() {
        return kpredate;
    }

    public void setKpredate(Date kpredate) {
        this.kpredate = kpredate;
    }

    public String getKpir01() {
        return kpir01;
    }

    public void setKpir01(String kpir01) {
        this.kpir01 = kpir01;
    }

    public String getKpir02() {
        return kpir02;
    }

    public void setKpir02(String kpir02) {
        this.kpir02 = kpir02;
    }

    public String getKpir03() {
        return kpir03;
    }

    public void setKpir03(String kpir03) {
        this.kpir03 = kpir03;
    }

    public String getKpir04() {
        return kpir04;
    }

    public void setKpir04(String kpir04) {
        this.kpir04 = kpir04;
    }

    public String getKpir05() {
        return kpir05;
    }

    public void setKpir05(String kpir05) {
        this.kpir05 = kpir05;
    }

    public BigDecimal getKphrb() {
        return kphrb;
    }

    public void setKphrb(BigDecimal kphrb) {
        this.kphrb = kphrb;
    }

    public BigDecimal getKppsal() {
        return kppsal;
    }

    public void setKppsal(BigDecimal kppsal) {
        this.kppsal = kppsal;
    }

    public BigDecimal getKpipay() {
        return kpipay;
    }

    public void setKpipay(BigDecimal kpipay) {
        this.kpipay = kpipay;
    }

    public BigDecimal getKptdsc() {
        return kptdsc;
    }

    public void setKptdsc(BigDecimal kptdsc) {
        this.kptdsc = kptdsc;
    }

    public BigDecimal getKpefhr() {
        return kpefhr;
    }

    public void setKpefhr(BigDecimal kpefhr) {
        this.kpefhr = kpefhr;
    }

    public Integer getKpcrtj() {
        return kpcrtj;
    }

    public void setKpcrtj(Integer kpcrtj) {
        this.kpcrtj = kpcrtj;
    }

    public Integer getKpdivj() {
        return kpdivj;
    }

    public void setKpdivj(Integer kpdivj) {
        this.kpdivj = kpdivj;
    }

    public Integer getKpexdj() {
        return kpexdj;
    }

    public void setKpexdj(Integer kpexdj) {
        this.kpexdj = kpexdj;
    }

    public Integer getKpafdj() {
        return kpafdj;
    }

    public void setKpafdj(Integer kpafdj) {
        this.kpafdj = kpafdj;
    }

    public Integer getKpckdt() {
        return kpckdt;
    }

    public void setKpckdt(Integer kpckdt) {
        this.kpckdt = kpckdt;
    }

    public String getKpuser() {
        return kpuser;
    }

    public void setKpuser(String kpuser) {
        this.kpuser = kpuser;
    }

    public String getKppid() {
        return kppid;
    }

    public void setKppid(String kppid) {
        this.kppid = kppid;
    }

    public String getKpjobn() {
        return kpjobn;
    }

    public void setKpjobn(String kpjobn) {
        this.kpjobn = kpjobn;
    }

    public Integer getKpupmj() {
        return kpupmj;
    }

    public void setKpupmj(Integer kpupmj) {
        this.kpupmj = kpupmj;
    }

    public BigDecimal getKpupmt() {
        return kpupmt;
    }

    public void setKpupmt(BigDecimal kpupmt) {
        this.kpupmt = kpupmt;
    }

    public BigDecimal getKptday() {
        return kptday;
    }

    public void setKptday(BigDecimal kptday) {
        this.kptday = kptday;
    }

    public String getKpurcd() {
        return kpurcd;
    }

    public void setKpurcd(String kpurcd) {
        this.kpurcd = kpurcd;
    }

    public Integer getKpurdt() {
        return kpurdt;
    }

    public void setKpurdt(Integer kpurdt) {
        this.kpurdt = kpurdt;
    }

    public BigDecimal getKpurat() {
        return kpurat;
    }

    public void setKpurat(BigDecimal kpurat) {
        this.kpurat = kpurat;
    }

    public BigDecimal getKpurab() {
        return kpurab;
    }

    public void setKpurab(BigDecimal kpurab) {
        this.kpurab = kpurab;
    }

    public String getKpurrf() {
        return kpurrf;
    }

    public void setKpurrf(String kpurrf) {
        this.kpurrf = kpurrf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kp58bdoc=").append(kp58bdoc);
        sb.append(", kp58bsn=").append(kp58bsn);
        sb.append(", kp58bsys=").append(kp58bsys);
        sb.append(", kp58bift=").append(kp58bift);
        sb.append(", kpkco=").append(kpkco);
        sb.append(", kp58bappt=").append(kp58bappt);
        sb.append(", kpmcu=").append(kpmcu);
        sb.append(", kp58bco=").append(kp58bco);
        sb.append(", kp58binvt=").append(kp58binvt);
        sb.append(", kpe8str200=").append(kpe8str200);
        sb.append(", kp58blmt=").append(kp58blmt);
        sb.append(", kp58bdlt=").append(kp58bdlt);
        sb.append(", kptrdj=").append(kptrdj);
        sb.append(", kpan8=").append(kpan8);
        sb.append(", kpe8name=").append(kpe8name);
        sb.append(", kpdoc=").append(kpdoc);
        sb.append(", kpdct=").append(kpdct);
        sb.append(", kp58bapst=").append(kp58bapst);
        sb.append(", kp58bfp=").append(kp58bfp);
        sb.append(", kp58bname=").append(kp58bname);
        sb.append(", kp58btaxnm=").append(kp58btaxnm);
        sb.append(", kp58badd=").append(kp58badd);
        sb.append(", kp58btel=").append(kp58btel);
        sb.append(", kp58bbank=").append(kp58bbank);
        sb.append(", kp58bbanknm=").append(kp58bbanknm);
        sb.append(", kp58brmk2=").append(kp58brmk2);
        sb.append(", kp58brmk1=").append(kp58brmk1);
        sb.append(", kp58baddsd=").append(kp58baddsd);
        sb.append(", kp58brecp=").append(kp58brecp);
        sb.append(", kp58bpcode=").append(kp58bpcode);
        sb.append(", kp58bphone=").append(kp58bphone);
        sb.append(", kp58btrd=").append(kp58btrd);
        sb.append(", kpivd=").append(kpivd);
        sb.append(", kpag=").append(kpag);
        sb.append(", kpstam=").append(kpstam);
        sb.append(", kpatxa=").append(kpatxa);
        sb.append(", kpdl03=").append(kpdl03);
        sb.append(", kp58binvnum2=").append(kp58binvnum2);
        sb.append(", kpdl01=").append(kpdl01);
        sb.append(", kpdl02=").append(kpdl02);
        sb.append(", kpdl04=").append(kpdl04);
        sb.append(", kpdl05=").append(kpdl05);
        sb.append(", kpdl06=").append(kpdl06);
        sb.append(", kpdl07=").append(kpdl07);
        sb.append(", kpindate=").append(kpindate);
        sb.append(", kpredate=").append(kpredate);
        sb.append(", kpir01=").append(kpir01);
        sb.append(", kpir02=").append(kpir02);
        sb.append(", kpir03=").append(kpir03);
        sb.append(", kpir04=").append(kpir04);
        sb.append(", kpir05=").append(kpir05);
        sb.append(", kphrb=").append(kphrb);
        sb.append(", kppsal=").append(kppsal);
        sb.append(", kpipay=").append(kpipay);
        sb.append(", kptdsc=").append(kptdsc);
        sb.append(", kpefhr=").append(kpefhr);
        sb.append(", kpcrtj=").append(kpcrtj);
        sb.append(", kpdivj=").append(kpdivj);
        sb.append(", kpexdj=").append(kpexdj);
        sb.append(", kpafdj=").append(kpafdj);
        sb.append(", kpckdt=").append(kpckdt);
        sb.append(", kpuser=").append(kpuser);
        sb.append(", kppid=").append(kppid);
        sb.append(", kpjobn=").append(kpjobn);
        sb.append(", kpupmj=").append(kpupmj);
        sb.append(", kpupmt=").append(kpupmt);
        sb.append(", kptday=").append(kptday);
        sb.append(", kpurcd=").append(kpurcd);
        sb.append(", kpurdt=").append(kpurdt);
        sb.append(", kpurat=").append(kpurat);
        sb.append(", kpurab=").append(kpurab);
        sb.append(", kpurrf=").append(kpurrf);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        if(this.getKpredate().compareTo(((Fe8nt005) o).getKpredate()) < 0){
            return -1;
        }
        if(this.getKpredate().compareTo(((Fe8nt005) o).getKpredate()) > 0){
            return 1;
        }
        return 0;
    }
}