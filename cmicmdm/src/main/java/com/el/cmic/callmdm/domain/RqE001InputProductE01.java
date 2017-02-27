package com.el.cmic.callmdm.domain;


import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Created by Vincent on 2016/9/20.
 */
@XmlRootElement(name = "main")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"doco","ev01","litm","kcoo","productcode", "productname", "producttype", "pk_mfname", "pk_mfcountry", "form", "sync", "fileno", "pk_weight", "licenseno", "hibcode", "gmdncode", "gs1code"
        , "pk_label", "pk_productclass", "pk_yltsfl", "pk_department","modcause","creator","creationtime","creatcause","SZEDUS","SZEDBT","SZEDTN","SZEDLN"})
public class RqE001InputProductE01 {
    private String doco;
    private String ev01;
    private String litm;




    private String kcoo;



    private String productcode;

    private String productname;


    private String producttype = "";

    private String pk_mfname = "";//   <pk_mfname>生产厂家</pk_mfname>

    private String pk_mfcountry = "";//<pk_mfcountry>生产国</pk_mfcountry>

    private String form = "";// <form>剂型</form>

    private String sync = "";// <sync>商品名</sync>

    private String fileno = "";//<fileno>批准文号</fileno>

    private String pk_weight = "";//<pk_weight>最小包装单位</pk_weight>

    private String licenseno = "";// <licenseno>生产企业生产许可证号</licenseno>

    private String hibcode = "";//<hibcode>HIBC编码</hibcode>

    private String gmdncode = "";//    <gmdncode>GMDN编码</gmdncode>

    private String gs1code = "";//<gs1code>GS1编码</gs1code>

    private String pk_label = "";// <pk_label>厂牌</pk_label>

    private String pk_productclass = "";//<pk_productclass>产品大类</pk_productclass>

    private String pk_yltsfl = "";//<pk_yltsfl>特殊分类</pk_yltsfl>

    private String pk_department = "";//<pk_department>应用科室</pk_department>



    private String modcause ="";//<modcause>变更理由 1025新添加

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

    public String getLitm() {
        return litm;
    }

    public void setLitm(String litm) {
        this.litm = litm;
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

    public String getPk_mfname() {
        return pk_mfname;
    }

    public void setPk_mfname(String pk_mfname) {
        this.pk_mfname = pk_mfname;
    }

    public String getPk_mfcountry() {
        return pk_mfcountry;
    }

    public void setPk_mfcountry(String pk_mfcountry) {
        this.pk_mfcountry = pk_mfcountry;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSync() {
        return sync;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    public String getPk_weight() {
        return pk_weight;
    }

    public void setPk_weight(String pk_weight) {
        this.pk_weight = pk_weight;
    }

    public String getLicenseno() {
        return licenseno;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    public String getHibcode() {
        return hibcode;
    }

    public void setHibcode(String hibcode) {
        this.hibcode = hibcode;
    }

    public String getGmdncode() {
        return gmdncode;
    }

    public void setGmdncode(String gmdncode) {
        this.gmdncode = gmdncode;
    }

    public String getGs1code() {
        return gs1code;
    }

    public void setGs1code(String gs1code) {
        this.gs1code = gs1code;
    }

    public String getPk_label() {
        return pk_label;
    }

    public void setPk_label(String pk_label) {
        this.pk_label = pk_label;
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

    public String getPk_department() {
        return pk_department;
    }

    public void setPk_department(String pk_department) {
        this.pk_department = pk_department;
    }

    @Override
    public String toString() {
        return "RqE001InputProductE01{" +
                "doco='" + doco + '\'' +
                ", ev01='" + ev01 + '\'' +
                ", litm='" + litm + '\'' +
                ", kcoo='" + kcoo + '\'' +
                ", productcode='" + productcode + '\'' +
                ", productname='" + productname + '\'' +
                ", producttype='" + producttype + '\'' +
                ", pk_mfname='" + pk_mfname + '\'' +
                ", pk_mfcountry='" + pk_mfcountry + '\'' +
                ", form='" + form + '\'' +
                ", sync='" + sync + '\'' +
                ", fileno='" + fileno + '\'' +
                ", pk_weight='" + pk_weight + '\'' +
                ", licenseno='" + licenseno + '\'' +
                ", hibcode='" + hibcode + '\'' +
                ", gmdncode='" + gmdncode + '\'' +
                ", gs1code='" + gs1code + '\'' +
                ", pk_label='" + pk_label + '\'' +
                ", pk_productclass='" + pk_productclass + '\'' +
                ", pk_yltsfl='" + pk_yltsfl + '\'' +
                ", pk_department='" + pk_department + '\'' +
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
