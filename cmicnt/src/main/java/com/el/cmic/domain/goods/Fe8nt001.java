package com.el.cmic.domain.goods;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Fe8nt001 implements Serializable {
    @JSONField(name = "litm")
    private String spaitm;


    private String splitm;


    private BigDecimal spitm;

    @JSONField(name = "dsc1")
    private String spdsc1;

    @JSONField(name = "dsc2")
    private String spdsc2;

    @JSONField(name = "tym")
    private String spe8tym;

    @JSONField(name = "uom1")
    private String spuom1;

    @JSONField(name = "dl01")
    private String spdl01;

    @JSONField(name = "glpt")
    private String spglpt;

    @JSONField(name = "dl02")
    private String spdl02;


    private String spmmcu;


    private BigDecimal span8;

    @JSONField(name = "e8name")
    private String spe8name;

    @JSONField(name = "orig")
    private String sporig;

    @JSONField(name = "fxdj")
    private String spe8fxdj;

    @JSONField(name = "dl03")
    private String spdl03;

    @JSONField(name = "cctj")
    private String spe8cctj;

    @JSONField(name = "dl04")
    private String spdl04;

    @JSONField(name = "qtcc")
    private String spe8qtcc;

    @JSONField(name = "xlhgl")
    private String spe8xlhgl;

    @JSONField(name = "zdyh")
    private String spe8zdyh;

    @JSONField(name = "yjzq")
    private BigDecimal spe8yhzq;

    @JSONField(name = "cpfl")
    private String spe8cpfl;

    @JSONField(name = "zzlxa")
    private String spe8zzlxa;

    @JSONField(name = "zzbm")
    private String spe8zzbm;

    @JSONField(name = "eftj")
    private Integer speftj;

    @JSONField(name = "exdj")
    private Integer spexdj;

    @JSONField(name = "path")
    private String spe8path;

    @JSONField(name = "ir01")
    private String spir01;

    @JSONField(name = "ir02")
    private String spir02;

    @JSONField(name = "ir03")
    private String spir03;

    @JSONField(name = "ir04")
    private String spir04;

    @JSONField(name = "ir05")
    private String spir05;

    @JSONField(name = "hrb")
    private BigDecimal sphrb;

    @JSONField(name = "psal")
    private BigDecimal sppsal;

    @JSONField(name = "ipay")
    private BigDecimal spipay;

    @JSONField(name = "tdsc")
    private BigDecimal sptdsc;

    @JSONField(name = "efhr")
    private BigDecimal spefhr;

    @JSONField(name = "crtj")
    private Integer spcrtj;

    @JSONField(name = "divj")
    private Integer spdivj;


    @JSONField(name = "afdj")
    private Integer spafdj;

    @JSONField(name = "ckdt")
    private Integer spckdt;
    @JSONField(name = "redate", format = "yyyy/MM/dd HH:mm:ss")
    private Date sprdate;
    @JSONField(name = "indate", format = "yyyy/MM/dd HH:mm:ss")
    private Date spidate;
    @JSONField(name = "status")
    private String status;
    /**
     * null - CRPDTA.FE8NT001.SPUSER
     */
    private String spuser;

    /**
     * null - CRPDTA.FE8NT001.SPUPMJ
     */
    private Integer spupmj;

    /**
     * null - CRPDTA.FE8NT001.SPTDAY
     */
    private BigDecimal sptday;

    /**
     * null - CRPDTA.FE8NT001.SPPID
     */
    private String sppid;

    /**
     * null - CRPDTA.FE8NT001.SPJOBN
     */
    private String spjobn;

    /**
     * null - CRPDTA.FE8NT001.SPURCD
     */
    private String spurcd;

    /**
     * null - CRPDTA.FE8NT001.SPURDT
     */
    private Integer spurdt;

    /**
     * null - CRPDTA.FE8NT001.SPURAT
     */
    private BigDecimal spurat;

    /**
     * null - CRPDTA.FE8NT001.SPURAB
     */
    private BigDecimal spurab;

    /**
     * null - CRPDTA.FE8NT001.SPURRF
     */
    private String spurrf;

    /**
     * null - CRPDTA.FE8NT001.SPFLAG
     */
    private String spflag;

    /**
     * null - CRPDTA.FE8NT001.SPEDSP
     */
    private String spedsp;

    /**
     * null - CRPDTA.FE8NT001.SPEV01
     */
    private String spev01;

    /**
     * null - CRPDTA.FE8NT001.SPEV02
     */
    private String spev02;

    /**
     * null - CRPDTA.FE8NT001.SPEV03
     */
    private String spev03;

    private static final long serialVersionUID = 1L;

    public String getSpaitm() {
        return spaitm;
    }

    public void setSpaitm(String spaitm) {
        this.spaitm = spaitm;
    }

    public String getSplitm() {
        return splitm;
    }

    public void setSplitm(String splitm) {
        this.splitm = splitm;
    }

    public BigDecimal getSpitm() {
        return spitm;
    }

    public void setSpitm(BigDecimal spitm) {
        this.spitm = spitm;
    }

    public String getSpdsc1() {
        return spdsc1;
    }

    public void setSpdsc1(String spdsc1) {
        this.spdsc1 = spdsc1;
    }

    public String getSpdsc2() {
        return spdsc2;
    }

    public void setSpdsc2(String spdsc2) {
        this.spdsc2 = spdsc2;
    }

    public String getSpe8tym() {
        return spe8tym;
    }

    public void setSpe8tym(String spe8tym) {
        this.spe8tym = spe8tym;
    }

    public String getSpuom1() {
        return spuom1;
    }

    public void setSpuom1(String spuom1) {
        this.spuom1 = spuom1;
    }

    public String getSpdl01() {
        return spdl01;
    }

    public void setSpdl01(String spdl01) {
        this.spdl01 = spdl01;
    }

    public String getSpglpt() {
        return spglpt;
    }

    public void setSpglpt(String spglpt) {
        this.spglpt = spglpt;
    }

    public String getSpdl02() {
        return spdl02;
    }

    public void setSpdl02(String spdl02) {
        this.spdl02 = spdl02;
    }

    public String getSpmmcu() {
        return spmmcu;
    }

    public void setSpmmcu(String spmmcu) {
        this.spmmcu = spmmcu;
    }

    public BigDecimal getSpan8() {
        return span8;
    }

    public void setSpan8(BigDecimal span8) {
        this.span8 = span8;
    }

    public String getSpe8name() {
        return spe8name;
    }

    public void setSpe8name(String spe8name) {
        this.spe8name = spe8name;
    }

    public String getSporig() {
        return sporig;
    }

    public void setSporig(String sporig) {
        this.sporig = sporig;
    }

    public String getSpe8fxdj() {
        return spe8fxdj;
    }

    public void setSpe8fxdj(String spe8fxdj) {
        this.spe8fxdj = spe8fxdj;
    }

    public String getSpdl03() {
        return spdl03;
    }

    public void setSpdl03(String spdl03) {
        this.spdl03 = spdl03;
    }

    public String getSpe8cctj() {
        return spe8cctj;
    }

    public void setSpe8cctj(String spe8cctj) {
        this.spe8cctj = spe8cctj;
    }

    public String getSpdl04() {
        return spdl04;
    }

    public void setSpdl04(String spdl04) {
        this.spdl04 = spdl04;
    }

    public String getSpe8qtcc() {
        return spe8qtcc;
    }

    public void setSpe8qtcc(String spe8qtcc) {
        this.spe8qtcc = spe8qtcc;
    }

    public String getSpe8xlhgl() {
        return spe8xlhgl;
    }

    public void setSpe8xlhgl(String spe8xlhgl) {
        this.spe8xlhgl = spe8xlhgl;
    }

    public String getSpe8zdyh() {
        return spe8zdyh;
    }

    public void setSpe8zdyh(String spe8zdyh) {
        this.spe8zdyh = spe8zdyh;
    }

    public BigDecimal getSpe8yhzq() {
        return spe8yhzq;
    }

    public void setSpe8yhzq(BigDecimal spe8yhzq) {
        this.spe8yhzq = spe8yhzq;
    }

    public String getSpe8cpfl() {
        return spe8cpfl;
    }

    public void setSpe8cpfl(String spe8cpfl) {
        this.spe8cpfl = spe8cpfl;
    }

    public String getSpe8zzlxa() {
        return spe8zzlxa;
    }

    public void setSpe8zzlxa(String spe8zzlxa) {
        this.spe8zzlxa = spe8zzlxa;
    }

    public String getSpe8zzbm() {
        return spe8zzbm;
    }

    public void setSpe8zzbm(String spe8zzbm) {
        this.spe8zzbm = spe8zzbm;
    }

    public Integer getSpeftj() {
        return speftj;
    }

    public void setSpeftj(Integer speftj) {
        this.speftj = speftj;
    }

    public Integer getSpexdj() {
        return spexdj;
    }

    public void setSpexdj(Integer spexdj) {
        this.spexdj = spexdj;
    }

    public String getSpe8path() {
        return spe8path;
    }

    public void setSpe8path(String spe8path) {
        this.spe8path = spe8path;
    }

    public String getSpir01() {
        return spir01;
    }

    public void setSpir01(String spir01) {
        this.spir01 = spir01;
    }

    public String getSpir02() {
        return spir02;
    }

    public void setSpir02(String spir02) {
        this.spir02 = spir02;
    }

    public String getSpir03() {
        return spir03;
    }

    public void setSpir03(String spir03) {
        this.spir03 = spir03;
    }

    public String getSpir04() {
        return spir04;
    }

    public void setSpir04(String spir04) {
        this.spir04 = spir04;
    }

    public String getSpir05() {
        return spir05;
    }

    public void setSpir05(String spir05) {
        this.spir05 = spir05;
    }

    public BigDecimal getSphrb() {
        return sphrb;
    }

    public void setSphrb(BigDecimal sphrb) {
        this.sphrb = sphrb;
    }

    public BigDecimal getSppsal() {
        return sppsal;
    }

    public void setSppsal(BigDecimal sppsal) {
        this.sppsal = sppsal;
    }

    public BigDecimal getSpipay() {
        return spipay;
    }

    public void setSpipay(BigDecimal spipay) {
        this.spipay = spipay;
    }

    public BigDecimal getSptdsc() {
        return sptdsc;
    }

    public void setSptdsc(BigDecimal sptdsc) {
        this.sptdsc = sptdsc;
    }

    public BigDecimal getSpefhr() {
        return spefhr;
    }

    public void setSpefhr(BigDecimal spefhr) {
        this.spefhr = spefhr;
    }

    public Integer getSpcrtj() {
        return spcrtj;
    }

    public void setSpcrtj(Integer spcrtj) {
        this.spcrtj = spcrtj;
    }

    public Integer getSpdivj() {
        return spdivj;
    }

    public void setSpdivj(Integer spdivj) {
        this.spdivj = spdivj;
    }

    public Integer getSpafdj() {
        return spafdj;
    }

    public void setSpafdj(Integer spafdj) {
        this.spafdj = spafdj;
    }

    public Integer getSpckdt() {
        return spckdt;
    }

    public void setSpckdt(Integer spckdt) {
        this.spckdt = spckdt;
    }

    public String getSpuser() {
        return spuser;
    }

    public void setSpuser(String spuser) {
        this.spuser = spuser;
    }

    public Integer getSpupmj() {
        return spupmj;
    }

    public void setSpupmj(Integer spupmj) {
        this.spupmj = spupmj;
    }

    public BigDecimal getSptday() {
        return sptday;
    }

    public void setSptday(BigDecimal sptday) {
        this.sptday = sptday;
    }

    public String getSppid() {
        return sppid;
    }

    public void setSppid(String sppid) {
        this.sppid = sppid;
    }

    public String getSpjobn() {
        return spjobn;
    }

    public void setSpjobn(String spjobn) {
        this.spjobn = spjobn;
    }

    public String getSpurcd() {
        return spurcd;
    }

    public void setSpurcd(String spurcd) {
        this.spurcd = spurcd;
    }

    public Integer getSpurdt() {
        return spurdt;
    }

    public void setSpurdt(Integer spurdt) {
        this.spurdt = spurdt;
    }

    public BigDecimal getSpurat() {
        return spurat;
    }

    public void setSpurat(BigDecimal spurat) {
        this.spurat = spurat;
    }

    public BigDecimal getSpurab() {
        return spurab;
    }

    public void setSpurab(BigDecimal spurab) {
        this.spurab = spurab;
    }

    public String getSpurrf() {
        return spurrf;
    }

    public void setSpurrf(String spurrf) {
        this.spurrf = spurrf;
    }

    public String getSpflag() {
        return spflag;
    }

    public void setSpflag(String spflag) {
        this.spflag = spflag;
    }

    public String getSpedsp() {
        return spedsp;
    }

    public void setSpedsp(String spedsp) {
        this.spedsp = spedsp;
    }

    public String getSpev01() {
        return spev01;
    }

    public void setSpev01(String spev01) {
        this.spev01 = spev01;
    }

    public String getSpev02() {
        return spev02;
    }

    public void setSpev02(String spev02) {
        this.spev02 = spev02;
    }

    public String getSpev03() {
        return spev03;
    }

    public void setSpev03(String spev03) {
        this.spev03 = spev03;
    }

    public Date getSprdate() {
        return sprdate;
    }

    public void setSprdate(Date sprdate) {
       /* if(sprdate==null){
            Calendar calendar=Calendar.getInstance();
            calendar.set(1900,0,1,0,0,0);
            sprdate=calendar.getTime();
        }*/
        this.sprdate = sprdate;
    }

    public Date getSpidate() {
        return spidate;
    }

    public void setSpidate(Date spidate) {
      /*  if(spidate==null){
            Calendar calendar=Calendar.getInstance();
            calendar.set(1900,0,1,0,0,0);
            spidate=calendar.getTime();
        }*/
        this.spidate = spidate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spaitm=").append(spaitm);
        sb.append(", splitm=").append(splitm);
        sb.append(", spitm=").append(spitm);
        sb.append(", spdsc1=").append(spdsc1);
        sb.append(", spdsc2=").append(spdsc2);
        sb.append(", spe8tym=").append(spe8tym);
        sb.append(", spuom1=").append(spuom1);
        sb.append(", spdl01=").append(spdl01);
        sb.append(", spglpt=").append(spglpt);
        sb.append(", spdl02=").append(spdl02);
        sb.append(", spmmcu=").append(spmmcu);
        sb.append(", span8=").append(span8);
        sb.append(", spe8name=").append(spe8name);
        sb.append(", sporig=").append(sporig);
        sb.append(", spe8fxdj=").append(spe8fxdj);
        sb.append(", spdl03=").append(spdl03);
        sb.append(", spe8cctj=").append(spe8cctj);
        sb.append(", spdl04=").append(spdl04);
        sb.append(", spe8qtcc=").append(spe8qtcc);
        sb.append(", spe8xlhgl=").append(spe8xlhgl);
        sb.append(", spe8zdyh=").append(spe8zdyh);
        sb.append(", spe8yhzq=").append(spe8yhzq);
        sb.append(", spe8cpfl=").append(spe8cpfl);
        sb.append(", spe8zzlxa=").append(spe8zzlxa);
        sb.append(", spe8zzbm=").append(spe8zzbm);
        sb.append(", speftj=").append(speftj);
        sb.append(", spexdj=").append(spexdj);
        sb.append(", spe8path=").append(spe8path);
        sb.append(", spir01=").append(spir01);
        sb.append(", spir02=").append(spir02);
        sb.append(", spir03=").append(spir03);
        sb.append(", spir04=").append(spir04);
        sb.append(", spir05=").append(spir05);
        sb.append(", sphrb=").append(sphrb);
        sb.append(", sppsal=").append(sppsal);
        sb.append(", spipay=").append(spipay);
        sb.append(", sptdsc=").append(sptdsc);
        sb.append(", spefhr=").append(spefhr);
        sb.append(", spcrtj=").append(spcrtj);
        sb.append(", spdivj=").append(spdivj);
        sb.append(", spafdj=").append(spafdj);
        sb.append(", spckdt=").append(spckdt);
        sb.append(", spuser=").append(spuser);
        sb.append(", spupmj=").append(spupmj);
        sb.append(", sptday=").append(sptday);
        sb.append(", sppid=").append(sppid);
        sb.append(", spjobn=").append(spjobn);
        sb.append(", spurcd=").append(spurcd);
        sb.append(", spurdt=").append(spurdt);
        sb.append(", spurat=").append(spurat);
        sb.append(", spurab=").append(spurab);
        sb.append(", spurrf=").append(spurrf);
        sb.append(", spflag=").append(spflag);
        sb.append(", spedsp=").append(spedsp);
        sb.append(", spev01=").append(spev01);
        sb.append(", spev02=").append(spev02);
        sb.append(", spev03=").append(spev03);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}