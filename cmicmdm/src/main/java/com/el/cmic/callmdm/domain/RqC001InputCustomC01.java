package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by king_ on 2016/9/22.
 */
@XmlRootElement(name = "main")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"ukid","ev01", "an8","kcoo","custcode", "custname", "pk_country", "pk_szq", "pk_cities", "pk_counties", "address", "gycode",
        "isscs", "isjxs", "isjks", "isyy", "isjcyljg", "isgr", "isqt","modcause","creator","creationtime","creatcause","SZEDUS","SZEDBT","SZEDTN","SZEDLN"})
public class RqC001InputCustomC01 {
    private String ukid;
    private String ev01;
    private String an8;
    private String kcoo;
    private String custcode = "";
    private String custname = "";
    private String pk_country = "";
    private String pk_szq = "";
    private String pk_cities = "";
    private String pk_counties = "";
    private String address = "";
    private String gycode = "";
    private String isscs = "";
    private String isjxs = "";
    private String isjks = "";
    private String isyy = "";
    private String isjcyljg = "";
    private String isgr = "";
    private String isqt = "";

    private String modcause ="";

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

    public String getUkid() {
        return ukid;
    }

    public void setUkid(String ukid) {
        this.ukid = ukid;
    }

    public String getEv01() {
        return ev01;
    }

    public void setEv01(String ev01) {
        this.ev01 = ev01;
    }

    public String getAn8() {
        return an8;
    }

    public void setAn8(String an8) {
        this.an8 = an8;
    }

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getPk_country() {
        return pk_country;
    }

    public void setPk_country(String pk_country) {
        this.pk_country = pk_country;
    }

    public String getPk_szq() {
        return pk_szq;
    }

    public void setPk_szq(String pk_szq) {
        this.pk_szq = pk_szq;
    }

    public String getPk_cities() {
        return pk_cities;
    }

    public void setPk_cities(String pk_cities) {
        this.pk_cities = pk_cities;
    }

    public String getPk_counties() {
        return pk_counties;
    }

    public void setPk_counties(String pk_counties) {
        this.pk_counties = pk_counties;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGycode() {
        return gycode;
    }

    public void setGycode(String gycode) {
        this.gycode = gycode;
    }

    public String getIsscs() {
        return isscs;
    }

    public void setIsscs(String isscs) {
        this.isscs = isscs;
    }

    public String getIsjxs() {
        return isjxs;
    }

    public void setIsjxs(String isjxs) {
        this.isjxs = isjxs;
    }

    public String getIsjks() {
        return isjks;
    }

    public void setIsjks(String isjks) {
        this.isjks = isjks;
    }

    public String getIsyy() {
        return isyy;
    }

    public void setIsyy(String isyy) {
        this.isyy = isyy;
    }

    public String getIsjcyljg() {
        return isjcyljg;
    }

    public void setIsjcyljg(String isjcyljg) {
        this.isjcyljg = isjcyljg;
    }

    public String getIsgr() {
        return isgr;
    }

    public void setIsgr(String isgr) {
        this.isgr = isgr;
    }

    public String getIsqt() {
        return isqt;
    }

    public void setIsqt(String isqt) {
        this.isqt = isqt;
    }

    @Override
    public String toString() {
        return "RqC001InputCustomC01{" +
                "ukid='" + ukid + '\'' +
                ", ev01='" + ev01 + '\'' +
                ", an8='" + an8 + '\'' +
                ", kcoo='" + kcoo + '\'' +
                ", custcode='" + custcode + '\'' +
                ", custname='" + custname + '\'' +
                ", pk_country='" + pk_country + '\'' +
                ", pk_szq='" + pk_szq + '\'' +
                ", pk_cities='" + pk_cities + '\'' +
                ", pk_counties='" + pk_counties + '\'' +
                ", address='" + address + '\'' +
                ", gycode='" + gycode + '\'' +
                ", isscs='" + isscs + '\'' +
                ", isjxs='" + isjxs + '\'' +
                ", isjks='" + isjks + '\'' +
                ", isyy='" + isyy + '\'' +
                ", isjcyljg='" + isjcyljg + '\'' +
                ", isgr='" + isgr + '\'' +
                ", isqt='" + isqt + '\'' +
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
