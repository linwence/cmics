package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "main")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhE001OutMain {
    private String  productcode;
    private String productname;
    private String producttype;
    private String pk_mfname;
    private String pk_mfcountry;
    private String form;
    private String sync;
    private String fileno;
    private String pk_weight;
    private String licenseno;
    private String hibcode;
    private String gmdncode;
    private String gs1code;
    private String pk_label;
    private String pk_productclass;
    private String pk_yltsfl;
    private String pk_department;

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
        return "PhE001OutMain{" +
                "productcode=" + productcode +
                ", productname=" + productname +
                ", producttype=" + producttype +
                ", pk_mfname=" + pk_mfname +
                ", pk_mfcountry=" + pk_mfcountry +
                ", form=" + form +
                ", sync=" + sync +
                ", fileno=" + fileno +
                ", pk_weight=" + pk_weight +
                ", licenseno=" + licenseno +
                ", hibcode=" + hibcode +
                ", gmdncode=" + gmdncode +
                ", gs1code=" + gs1code +
                ", pk_label=" + pk_label +
                ", pk_productclass=" + pk_productclass +
                ", pk_yltsfl=" + pk_yltsfl +
                ", pk_department=" + pk_department +
                '}';
    }
}
