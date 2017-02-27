package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Vincent on 2016/9/20.
 */
@XmlRootElement(name = "main")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"doco","ev01","litm","kcoo","productcode", "productname", "producttype", "mfname", "pk_mfcountry",
        "sync", "pk_jhg", "pk_ztw", "interbarcode", "pk_productclass", "pk_yltsfl","modcause","creator","creationtime","creatcause","SZEDUS","SZEDBT","SZEDTN","SZEDLN"})
public class RqE001InputProductE03 {
    private String doco;
    private String ev01;
    private String litm;

    private String kcoo;

    private String productcode = "";//<productcode>产品编码</productcode>
    private String productname = ""; //<productname>产品名称(通用名)</productname>
    private String producttype = ""; //<producttype>规格型号</producttype>
    private String mfname = "";// <mfname>厂家</mfname>
    private String pk_mfcountry = "";// <pk_mfcountry>生产国</pk_mfcountry>
    private String sync = "";// <sync>商品名</sync>
    private String pk_jhg = ""; //<pk_jhg>进口/合资/国产</pk_jhg>
    private String pk_ztw = "";//<pk_ztw>自产/贴牌/外产</pk_ztw>
    private String interbarcode = "";// <interbarcode>国际条形码</interbarcode>
    private String pk_productclass = "";//  <pk_productclass>产品大类</pk_productclass>
    private String pk_yltsfl = "";//<pk_yltsfl>特殊分类</pk_yltsfl>

    private  String modcause = ""; //变更原因

    private String creator="";
    private String creationtime="";
    private String creatcause="";

    private String SZEDUS;
    private String SZEDBT;
    private String SZEDTN;
    private String SZEDLN;

    public String getSZEDUS() {
        return SZEDUS;
    }

    public void setSZEDUS(String SZEDUS) {
        this.SZEDUS = SZEDUS;
    }

    public String getSZEDBT() {
        return SZEDBT;
    }

    public void setSZEDBT(String SZEDBT) {
        this.SZEDBT = SZEDBT;
    }

    public String getSZEDTN() {
        return SZEDTN;
    }

    public void setSZEDTN(String SZEDTN) {
        this.SZEDTN = SZEDTN;
    }

    public String getSZEDLN() {
        return SZEDLN;
    }

    public void setSZEDLN(String SZEDLN) {
        this.SZEDLN = SZEDLN;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public String getCreatcause() {
        return creatcause;
    }

    public void setCreatcause(String creatcause) {
        this.creatcause = creatcause;
    }

    public String getKcoo() {
        return kcoo;
    }

    public void setKcoo(String kcoo) {
        this.kcoo = kcoo;
    }

    public String getModcause() {
        return modcause;
    }

    public void setModcause(String modcause) {
        this.modcause = modcause;
    }

    public String getLitm() {
        return litm;
    }

    public void setLitm(String litm) {
        this.litm = litm;
    }

    public String getDoco() {
        return doco;
    }

    public void setDoco(String doco) {
        this.doco = doco;
    }

    public String getEv01() {
        return ev01;
    }

    public void setEv01(String ev01) {
        this.ev01 = ev01;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getMfname() {
        return mfname;
    }

    public void setMfname(String mfname) {
        this.mfname = mfname;
    }

    public String getPk_mfcountry() {
        return pk_mfcountry;
    }

    public void setPk_mfcountry(String pk_mfcountry) {
        this.pk_mfcountry = pk_mfcountry;
    }

    public String getSync() {
        return sync;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public String getPk_jhg() {
        return pk_jhg;
    }

    public void setPk_jhg(String pk_jhg) {
        this.pk_jhg = pk_jhg;
    }

    public String getPk_ztw() {
        return pk_ztw;
    }

    public void setPk_ztw(String pk_ztw) {
        this.pk_ztw = pk_ztw;
    }

    public String getInterbarcode() {
        return interbarcode;
    }

    public void setInterbarcode(String interbarcode) {
        this.interbarcode = interbarcode;
    }

    public String getPk_productclass() {
        return pk_productclass;
    }

    public void setPk_productclass(String pk_productclass) {
        this.pk_productclass = pk_productclass;
    }

    public String getPk_yltsfl() {
        return pk_yltsfl;
    }

    public void setPk_yltsfl(String pk_yltsfl) {
        this.pk_yltsfl = pk_yltsfl;
    }

    @Override
    public String toString() {
        return "RqE001InputProductE03{" +
                "doco='" + doco + '\'' +
                ", ev01='" + ev01 + '\'' +
                ", litm='" + litm + '\'' +
                ", kcoo='" + kcoo + '\'' +
                ", productcode='" + productcode + '\'' +
                ", productname='" + productname + '\'' +
                ", producttype='" + producttype + '\'' +
                ", mfname='" + mfname + '\'' +
                ", pk_mfcountry='" + pk_mfcountry + '\'' +
                ", sync='" + sync + '\'' +
                ", pk_jhg='" + pk_jhg + '\'' +
                ", pk_ztw='" + pk_ztw + '\'' +
                ", interbarcode='" + interbarcode + '\'' +
                ", pk_productclass='" + pk_productclass + '\'' +
                ", pk_yltsfl='" + pk_yltsfl + '\'' +
                ", modcause='" + modcause + '\'' +
                ", creator='" + creator + '\'' +
                ", creationtime='" + creationtime + '\'' +
                ", creatcause='" + creatcause + '\'' +
                ", SZEDUS='" + SZEDUS + '\'' +
                ", SZEDBT='" + SZEDBT + '\'' +
                ", SZEDTN='" + SZEDTN + '\'' +
                ", SZEDLN='" + SZEDLN + '\'' +
                '}';
    }
}
