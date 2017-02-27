package com.el.cmic.domain.saleorderdetail;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Fe8nt004 implements Serializable {
    @JSONField(name = "from")
    private String sde8from;

    @JSONField(name = "ftype")
    private String sde8type;

    @JSONField(name = "vr02")
    private String sde8odno;

    @JSONField(name = "dlnid")
    private BigDecimal sde8lnid;

    @JSONField(name = "edsp")
    private String sdedsp;

    @JSONField(name = "kcoo")
    private String sdrkco;

    @JSONField(name = "dcto")
    private String sdrcto;

    @JSONField(name = "doco")
    private String sdrorn;

    @JSONField(name = "lnid")
    private BigDecimal sdrlln;

    @JSONField(name = "kcoo")
    private String sdkcoo;

    @JSONField(name = "dcto")
    private String sddcto;

    @JSONField(name = "rorn")
    private BigDecimal sddoco;

    @JSONField(name = "rlln")
    private BigDecimal sdlnid;

    @JSONField(name = "co")
    private String sdco;

    @JSONField(name = "coname")
    private String sdalph;

    @JSONField(name = "mcu")
    private String sdmcu;

    @JSONField(name = "litm")
    private String sdaitm;

    /**
     *  null - CRPDTA.FE8NT004.SDLITM
     */
    private String sdlitm;

    @JSONField(name = "lotn")
    private String sdlotn;

    @JSONField(name = "dlej")
    private Integer sddlej;

    @JSONField(name = "mmej")
    private Integer sdmmej;

    @JSONField(name = "dsc")
    private String sde8zzbm;

    @JSONField(name = "dsc3")
    private String sde8dsc1;

    @JSONField(name = "dsc1")
    private String sde8dsc2;

    @JSONField(name = "uom1")
    private String sduom;

    @JSONField(name = "uom3")
    private String sduom3;

    @JSONField(name = "uorg")
    private BigDecimal sduorg;

    @JSONField(name = "tuprc")
    private BigDecimal sdtuprc;

    @JSONField(name = "taexp")
    private BigDecimal sdtaexp;

    @JSONField(name = "uprc")
    private BigDecimal sde8tprrc;

    @JSONField(name = "aexp")
    private BigDecimal sde8taexp;

    @JSONField(name = "an8")
    private BigDecimal sdan8;

    @JSONField(name = "alph")
    private String sddsc1;

    @JSONField(name = "ppdj")
    private Integer sde8dsy;

    @JSONField(name = "shan")
    private BigDecimal sdshan;

    @JSONField(name = "drqj")
    private Integer sddrqj;

    @JSONField(name = "trdj")
    private Integer sdtrdj;

    @JSONField(name = "addj")
    private Integer sdaddj;

    @JSONField(name = "dl01")
    private String sddl01;

    @JSONField(name = "dl02")
    private String sddl02;

    @JSONField(name = "dl03")
    private String sddl03;

    @JSONField(name = "dl04")
    private String sddl04;

    @JSONField(name = "dl05")
    private String sddl05;

    @JSONField(name = "dl06")
    private String sddl06;

    @JSONField(name = "dl07")
    private String sddl07;

    @JSONField(name = "dl08")
    private String sddl08;

    @JSONField(name = "dl09")
    private String sddl09;

    @JSONField(name = "dl10")
    private String sddl10;

    @JSONField(name = "indate", format = "yyyy-MM-dd hh:mi:ss")
    private Date sdindate;

    @JSONField(name = "redate", format = "yyyy-MM-dd hh:mi:ss")
    private Date sdredate;


    @JSONField(name = "doc")
    private String sdir01;

    @JSONField(name = "ir02")
    private String sdir02;

    @JSONField(name = "ir03")
    private String sdir03;

    @JSONField(name = "ir04")
    private String sdir04;

    @JSONField(name = "ir05")
    private String sdir05;

    @JSONField(name = "hrb")
    private BigDecimal sdhrb;

    @JSONField(name = "psal")
    private BigDecimal sdpsal;

    @JSONField(name = "ipay")
    private BigDecimal sdipay;

    @JSONField(name = "tdsc")
    private BigDecimal sdtdsc;

    @JSONField(name = "efhr")
    private BigDecimal sdefhr;

    @JSONField(name = "crtj")
    private Integer sdcrtj;

    @JSONField(name = "divj")
    private Integer sddivj;

    @JSONField(name = "exdj")
    private Integer sdexdj;

    @JSONField(name = "afdj")
    private Integer sdafdj;

    @JSONField(name = "ckdt")
    private Integer sdckdt;

    /**
     *  null - CRPDTA.FE8NT004.SDUSER
     */
    private String sduser;

    /**
     *  null - CRPDTA.FE8NT004.SDUPMJ
     */
    private Integer sdupmj;

    /**
     *  null - CRPDTA.FE8NT004.SDTDAY
     */
    private BigDecimal sdtday;

    /**
     *  null - CRPDTA.FE8NT004.SDPID
     */
    private String sdpid;

    /**
     *  null - CRPDTA.FE8NT004.SDJOBN
     */
    private String sdjobn;

    /**
     *  null - CRPDTA.FE8NT004.SDURCD
     */
    private String sdurcd;

    /**
     *  null - CRPDTA.FE8NT004.SDURDT
     */
    private Integer sdurdt;

    /**
     *  null - CRPDTA.FE8NT004.SDURAT
     */
    private BigDecimal sdurat;

    /**
     *  null - CRPDTA.FE8NT004.SDURAB
     */
    private BigDecimal sdurab;

    /**
     *  null - CRPDTA.FE8NT004.SDURRF
     */
    private String sdurrf;

    private static final long serialVersionUID = 1L;

    public String getSde8from() {
        return sde8from;
    }

    public void setSde8from(String sde8from) {
        this.sde8from = sde8from;
    }

    public String getSde8type() {
        return sde8type;
    }

    public void setSde8type(String sde8type) {
        this.sde8type = sde8type;
    }

    public String getSde8odno() {
        return sde8odno;
    }

    public void setSde8odno(String sde8odno) {
        this.sde8odno = sde8odno;
    }

    public BigDecimal getSde8lnid() {
        return sde8lnid;
    }

    public void setSde8lnid(BigDecimal sde8lnid) {
        this.sde8lnid = sde8lnid;
    }

    public String getSdedsp() {
        return sdedsp;
    }

    public void setSdedsp(String sdedsp) {
        this.sdedsp = sdedsp;
    }

    public String getSdrkco() {
        return sdrkco;
    }

    public void setSdrkco(String sdrkco) {
        this.sdrkco = sdrkco;
    }

    public String getSdrcto() {
        return sdrcto;
    }

    public void setSdrcto(String sdrcto) {
        this.sdrcto = sdrcto;
    }

    public String getSdrorn() {
        return sdrorn;
    }

    public void setSdrorn(String sdrorn) {
        this.sdrorn = sdrorn;
    }

    public BigDecimal getSdrlln() {
        return sdrlln;
    }

    public void setSdrlln(BigDecimal sdrlln) {
        this.sdrlln = sdrlln;
    }

    public String getSdkcoo() {
        return sdkcoo;
    }

    public void setSdkcoo(String sdkcoo) {
        this.sdkcoo = sdkcoo;
    }

    public String getSddcto() {
        return sddcto;
    }

    public void setSddcto(String sddcto) {
        this.sddcto = sddcto;
    }

    public BigDecimal getSddoco() {
        return sddoco;
    }

    public void setSddoco(BigDecimal sddoco) {
        this.sddoco = sddoco;
    }

    public BigDecimal getSdlnid() {
        return sdlnid;
    }

    public void setSdlnid(BigDecimal sdlnid) {
        this.sdlnid = sdlnid;
    }

    public String getSdco() {
        return sdco;
    }

    public void setSdco(String sdco) {
        this.sdco = sdco;
    }

    public String getSdalph() {
        return sdalph;
    }

    public void setSdalph(String sdalph) {
        this.sdalph = sdalph;
    }

    public String getSdmcu() {
        return sdmcu;
    }

    public void setSdmcu(String sdmcu) {
        this.sdmcu = sdmcu;
    }

    public String getSdaitm() {
        return sdaitm;
    }

    public void setSdaitm(String sdaitm) {
        this.sdaitm = sdaitm;
    }

    public String getSdlitm() {
        return sdlitm;
    }

    public void setSdlitm(String sdlitm) {
        this.sdlitm = sdlitm;
    }

    public String getSdlotn() {
        return sdlotn;
    }

    public void setSdlotn(String sdlotn) {
        this.sdlotn = sdlotn;
    }

    public Integer getSddlej() {
        return sddlej;
    }

    public void setSddlej(Integer sddlej) {
        this.sddlej = sddlej;
    }

    public Integer getSdmmej() {
        return sdmmej;
    }

    public void setSdmmej(Integer sdmmej) {
        this.sdmmej = sdmmej;
    }

    public String getSde8zzbm() {
        return sde8zzbm;
    }

    public void setSde8zzbm(String sde8zzbm) {
        this.sde8zzbm = sde8zzbm;
    }

    public String getSde8dsc1() {
        return sde8dsc1;
    }

    public void setSde8dsc1(String sde8dsc1) {
        this.sde8dsc1 = sde8dsc1;
    }

    public String getSde8dsc2() {
        return sde8dsc2;
    }

    public void setSde8dsc2(String sde8dsc2) {
        this.sde8dsc2 = sde8dsc2;
    }

    public String getSduom() {
        return sduom;
    }

    public void setSduom(String sduom) {
        this.sduom = sduom;
    }

    public String getSduom3() {
        return sduom3;
    }

    public void setSduom3(String sduom3) {
        this.sduom3 = sduom3;
    }

    public BigDecimal getSduorg() {
        return sduorg;
    }

    public void setSduorg(BigDecimal sduorg) {
        this.sduorg = sduorg;
    }

    public BigDecimal getSdtuprc() {
        return sdtuprc;
    }

    public void setSdtuprc(BigDecimal sdtuprc) {
        this.sdtuprc = sdtuprc;
    }

    public BigDecimal getSdtaexp() {
        return sdtaexp;
    }

    public void setSdtaexp(BigDecimal sdtaexp) {
        this.sdtaexp = sdtaexp;
    }

    public BigDecimal getSde8tprrc() {
        return sde8tprrc;
    }

    public void setSde8tprrc(BigDecimal sde8tprrc) {
        this.sde8tprrc = sde8tprrc;
    }

    public BigDecimal getSde8taexp() {
        return sde8taexp;
    }

    public void setSde8taexp(BigDecimal sde8taexp) {
        this.sde8taexp = sde8taexp;
    }

    public BigDecimal getSdan8() {
        return sdan8;
    }

    public void setSdan8(BigDecimal sdan8) {
        this.sdan8 = sdan8;
    }

    public String getSddsc1() {
        return sddsc1;
    }

    public void setSddsc1(String sddsc1) {
        this.sddsc1 = sddsc1;
    }

    public Integer getSde8dsy() {
        return sde8dsy;
    }

    public void setSde8dsy(Integer sde8dsy) {
        this.sde8dsy = sde8dsy;
    }

    public BigDecimal getSdshan() {
        return sdshan;
    }

    public void setSdshan(BigDecimal sdshan) {
        this.sdshan = sdshan;
    }

    public Integer getSddrqj() {
        return sddrqj;
    }

    public void setSddrqj(Integer sddrqj) {
        this.sddrqj = sddrqj;
    }

    public Integer getSdtrdj() {
        return sdtrdj;
    }

    public void setSdtrdj(Integer sdtrdj) {
        this.sdtrdj = sdtrdj;
    }

    public Integer getSdaddj() {
        return sdaddj;
    }

    public void setSdaddj(Integer sdaddj) {
        this.sdaddj = sdaddj;
    }

    public String getSddl01() {
        return sddl01;
    }

    public void setSddl01(String sddl01) {
        this.sddl01 = sddl01;
    }

    public String getSddl02() {
        return sddl02;
    }

    public void setSddl02(String sddl02) {
        this.sddl02 = sddl02;
    }

    public String getSddl03() {
        return sddl03;
    }

    public void setSddl03(String sddl03) {
        this.sddl03 = sddl03;
    }

    public String getSddl04() {
        return sddl04;
    }

    public void setSddl04(String sddl04) {
        this.sddl04 = sddl04;
    }

    public String getSddl05() {
        return sddl05;
    }

    public void setSddl05(String sddl05) {
        this.sddl05 = sddl05;
    }

    public String getSddl06() {
        return sddl06;
    }

    public void setSddl06(String sddl06) {
        this.sddl06 = sddl06;
    }

    public String getSddl07() {
        return sddl07;
    }

    public void setSddl07(String sddl07) {
        this.sddl07 = sddl07;
    }

    public String getSddl08() {
        return sddl08;
    }

    public void setSddl08(String sddl08) {
        this.sddl08 = sddl08;
    }

    public String getSddl09() {
        return sddl09;
    }

    public void setSddl09(String sddl09) {
        this.sddl09 = sddl09;
    }

    public String getSddl10() {
        return sddl10;
    }

    public void setSddl10(String sddl10) {
        this.sddl10 = sddl10;
    }

    public Date getSdindate() {
        return sdindate;
    }

    public void setSdindate(Date sdindate) {
        this.sdindate = sdindate;
    }

    public Date getSdredate() {
        return sdredate;
    }

    public void setSdredate(Date sdredate) {
        this.sdredate = sdredate;
    }

    public String getSdir01() {
        return sdir01;
    }

    public void setSdir01(String sdir01) {
        this.sdir01 = sdir01;
    }

    public String getSdir02() {
        return sdir02;
    }

    public void setSdir02(String sdir02) {
        this.sdir02 = sdir02;
    }

    public String getSdir03() {
        return sdir03;
    }

    public void setSdir03(String sdir03) {
        this.sdir03 = sdir03;
    }

    public String getSdir04() {
        return sdir04;
    }

    public void setSdir04(String sdir04) {
        this.sdir04 = sdir04;
    }

    public String getSdir05() {
        return sdir05;
    }

    public void setSdir05(String sdir05) {
        this.sdir05 = sdir05;
    }

    public BigDecimal getSdhrb() {
        return sdhrb;
    }

    public void setSdhrb(BigDecimal sdhrb) {
        this.sdhrb = sdhrb;
    }

    public BigDecimal getSdpsal() {
        return sdpsal;
    }

    public void setSdpsal(BigDecimal sdpsal) {
        this.sdpsal = sdpsal;
    }

    public BigDecimal getSdipay() {
        return sdipay;
    }

    public void setSdipay(BigDecimal sdipay) {
        this.sdipay = sdipay;
    }

    public BigDecimal getSdtdsc() {
        return sdtdsc;
    }

    public void setSdtdsc(BigDecimal sdtdsc) {
        this.sdtdsc = sdtdsc;
    }

    public BigDecimal getSdefhr() {
        return sdefhr;
    }

    public void setSdefhr(BigDecimal sdefhr) {
        this.sdefhr = sdefhr;
    }

    public Integer getSdcrtj() {
        return sdcrtj;
    }

    public void setSdcrtj(Integer sdcrtj) {
        this.sdcrtj = sdcrtj;
    }

    public Integer getSddivj() {
        return sddivj;
    }

    public void setSddivj(Integer sddivj) {
        this.sddivj = sddivj;
    }

    public Integer getSdexdj() {
        return sdexdj;
    }

    public void setSdexdj(Integer sdexdj) {
        this.sdexdj = sdexdj;
    }

    public Integer getSdafdj() {
        return sdafdj;
    }

    public void setSdafdj(Integer sdafdj) {
        this.sdafdj = sdafdj;
    }

    public Integer getSdckdt() {
        return sdckdt;
    }

    public void setSdckdt(Integer sdckdt) {
        this.sdckdt = sdckdt;
    }

    public String getSduser() {
        return sduser;
    }

    public void setSduser(String sduser) {
        this.sduser = sduser;
    }

    public Integer getSdupmj() {
        return sdupmj;
    }

    public void setSdupmj(Integer sdupmj) {
        this.sdupmj = sdupmj;
    }

    public BigDecimal getSdtday() {
        return sdtday;
    }

    public void setSdtday(BigDecimal sdtday) {
        this.sdtday = sdtday;
    }

    public String getSdpid() {
        return sdpid;
    }

    public void setSdpid(String sdpid) {
        this.sdpid = sdpid;
    }

    public String getSdjobn() {
        return sdjobn;
    }

    public void setSdjobn(String sdjobn) {
        this.sdjobn = sdjobn;
    }

    public String getSdurcd() {
        return sdurcd;
    }

    public void setSdurcd(String sdurcd) {
        this.sdurcd = sdurcd;
    }

    public Integer getSdurdt() {
        return sdurdt;
    }

    public void setSdurdt(Integer sdurdt) {
        this.sdurdt = sdurdt;
    }

    public BigDecimal getSdurat() {
        return sdurat;
    }

    public void setSdurat(BigDecimal sdurat) {
        this.sdurat = sdurat;
    }

    public BigDecimal getSdurab() {
        return sdurab;
    }

    public void setSdurab(BigDecimal sdurab) {
        this.sdurab = sdurab;
    }

    public String getSdurrf() {
        return sdurrf;
    }

    public void setSdurrf(String sdurrf) {
        this.sdurrf = sdurrf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sde8from=").append(sde8from);
        sb.append(", sde8type=").append(sde8type);
        sb.append(", sde8odno=").append(sde8odno);
        sb.append(", sde8lnid=").append(sde8lnid);
        sb.append(", sdedsp=").append(sdedsp);
        sb.append(", sdrkco=").append(sdrkco);
        sb.append(", sdrcto=").append(sdrcto);
        sb.append(", sdrorn=").append(sdrorn);
        sb.append(", sdrlln=").append(sdrlln);
        sb.append(", sdkcoo=").append(sdkcoo);
        sb.append(", sddcto=").append(sddcto);
        sb.append(", sddoco=").append(sddoco);
        sb.append(", sdlnid=").append(sdlnid);
        sb.append(", sdco=").append(sdco);
        sb.append(", sdalph=").append(sdalph);
        sb.append(", sdmcu=").append(sdmcu);
        sb.append(", sdaitm=").append(sdaitm);
        sb.append(", sdlitm=").append(sdlitm);
        sb.append(", sdlotn=").append(sdlotn);
        sb.append(", sddlej=").append(sddlej);
        sb.append(", sdmmej=").append(sdmmej);
        sb.append(", sde8zzbm=").append(sde8zzbm);
        sb.append(", sde8dsc1=").append(sde8dsc1);
        sb.append(", sde8dsc2=").append(sde8dsc2);
        sb.append(", sduom=").append(sduom);
        sb.append(", sduom3=").append(sduom3);
        sb.append(", sduorg=").append(sduorg);
        sb.append(", sdtuprc=").append(sdtuprc);
        sb.append(", sdtaexp=").append(sdtaexp);
        sb.append(", sde8tprrc=").append(sde8tprrc);
        sb.append(", sde8taexp=").append(sde8taexp);
        sb.append(", sdan8=").append(sdan8);
        sb.append(", sddsc1=").append(sddsc1);
        sb.append(", sde8dsy=").append(sde8dsy);
        sb.append(", sdshan=").append(sdshan);
        sb.append(", sddrqj=").append(sddrqj);
        sb.append(", sdtrdj=").append(sdtrdj);
        sb.append(", sdaddj=").append(sdaddj);
        sb.append(", sddl01=").append(sddl01);
        sb.append(", sddl02=").append(sddl02);
        sb.append(", sddl03=").append(sddl03);
        sb.append(", sddl04=").append(sddl04);
        sb.append(", sddl05=").append(sddl05);
        sb.append(", sddl06=").append(sddl06);
        sb.append(", sddl07=").append(sddl07);
        sb.append(", sddl08=").append(sddl08);
        sb.append(", sddl09=").append(sddl09);
        sb.append(", sddl10=").append(sddl10);
        sb.append(", sdindate=").append(sdindate);
        sb.append(", sdredate=").append(sdredate);
        sb.append(", sdir01=").append(sdir01);
        sb.append(", sdir02=").append(sdir02);
        sb.append(", sdir03=").append(sdir03);
        sb.append(", sdir04=").append(sdir04);
        sb.append(", sdir05=").append(sdir05);
        sb.append(", sdhrb=").append(sdhrb);
        sb.append(", sdpsal=").append(sdpsal);
        sb.append(", sdipay=").append(sdipay);
        sb.append(", sdtdsc=").append(sdtdsc);
        sb.append(", sdefhr=").append(sdefhr);
        sb.append(", sdcrtj=").append(sdcrtj);
        sb.append(", sddivj=").append(sddivj);
        sb.append(", sdexdj=").append(sdexdj);
        sb.append(", sdafdj=").append(sdafdj);
        sb.append(", sdckdt=").append(sdckdt);
        sb.append(", sduser=").append(sduser);
        sb.append(", sdupmj=").append(sdupmj);
        sb.append(", sdtday=").append(sdtday);
        sb.append(", sdpid=").append(sdpid);
        sb.append(", sdjobn=").append(sdjobn);
        sb.append(", sdurcd=").append(sdurcd);
        sb.append(", sdurdt=").append(sdurdt);
        sb.append(", sdurat=").append(sdurat);
        sb.append(", sdurab=").append(sdurab);
        sb.append(", sdurrf=").append(sdurrf);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}