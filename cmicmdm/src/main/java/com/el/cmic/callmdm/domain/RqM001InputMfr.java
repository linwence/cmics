//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(
        name = "main"
)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        propOrder = {"ukid", "ev01", "an8", "mfcd", "mfname", "mfbrand", "mflicense", "creator", "creationtime", "kcoo", "SZEDUS", "SZEDBT", "SZEDTN", "SZEDLN"}
)
public class RqM001InputMfr {
    private String ukid;
    private String ev01;
    private String an8;
    private String mfcd;
    private String mfname;
    private String mfbrand;
    private String mflicense;
    private String creator = "";
    private String creationtime = "";
    private String kcoo = "";
    private String SZEDUS;
    private String SZEDBT;
    private String SZEDTN;
    private String SZEDLN;

    public RqM001InputMfr() {
    }

    public String getSZEDUS() {
        return this.SZEDUS;
    }

    public void setSZEDUS(String SZEDUS) {
        this.SZEDUS = SZEDUS;
    }

    public String getSZEDBT() {
        return this.SZEDBT;
    }

    public void setSZEDBT(String SZEDBT) {
        this.SZEDBT = SZEDBT;
    }

    public String getSZEDTN() {
        return this.SZEDTN;
    }

    public void setSZEDTN(String SZEDTN) {
        this.SZEDTN = SZEDTN;
    }

    public String getSZEDLN() {
        return this.SZEDLN;
    }

    public void setSZEDLN(String SZEDLN) {
        this.SZEDLN = SZEDLN;
    }

    public String getKcoo() {
        return this.kcoo;
    }

    public void setKcoo(String kcoo) {
        this.kcoo = kcoo;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return this.creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public String getAn8() {
        return this.an8;
    }

    public void setAn8(String an8) {
        this.an8 = an8;
    }

    public String getUkid() {
        return this.ukid;
    }

    public void setUkid(String ukid) {
        this.ukid = ukid;
    }

    public String getEv01() {
        return this.ev01;
    }

    public void setEv01(String ev01) {
        this.ev01 = ev01;
    }

    public String getMfcd() {
        return this.mfcd;
    }

    public void setMfcd(String mfcd) {
        this.mfcd = mfcd;
    }

    public String getMfname() {
        return this.mfname;
    }

    public void setMfname(String mfname) {
        this.mfname = mfname;
    }

    public String getMfbrand() {
        return this.mfbrand;
    }

    public void setMfbrand(String mfbrand) {
        this.mfbrand = mfbrand;
    }

    public String getMflicense() {
        return this.mflicense;
    }

    public void setMflicense(String mflicense) {
        this.mflicense = mflicense;
    }
}
