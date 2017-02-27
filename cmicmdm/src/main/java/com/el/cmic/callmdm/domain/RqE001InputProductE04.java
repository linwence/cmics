package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by king_ on 2016/9/22.
 */
@XmlRootElement(name = "main")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"doco","ev01","litm","productcode", "servicename","kcoo","modcause","creator","creationtime","creatcause","SZEDUS","SZEDBT","SZEDTN","SZEDLN"})
public class RqE001InputProductE04 {
    private String doco;
    private String ev01;
    private String litm;
    private String productcode = "";
    private String servicename = "";

    private String kcoo;
    private String modcause = "";//变更原因 1025

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

    public String getKcoo() {
        return kcoo;
    }

    public void setKcoo(String kcoo) {
        this.kcoo = kcoo;
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

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    @Override
    public String toString() {
        return "RqE001InputProductE04{" +
                "doco='" + doco + '\'' +
                ", ev01='" + ev01 + '\'' +
                ", litm='" + litm + '\'' +
                ", productcode='" + productcode + '\'' +
                ", servicename='" + servicename + '\'' +
                ", kcoo='" + kcoo + '\'' +
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
