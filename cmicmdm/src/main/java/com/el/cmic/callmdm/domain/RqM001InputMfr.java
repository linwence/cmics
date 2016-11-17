package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Vincent on 2016/10/13.
 */
@XmlRootElement(name = "main")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"ukid","ev01","an8","mfcd","mfname","mfbrand","mflicense"})
public class RqM001InputMfr {
    private String ukid;
    private String ev01;//是否有统一码 Y是，N否
    private String an8;
    private String mfcd;//<mfcd>生产厂家编码</mfcd>
    private String mfname;// <mfname>生产厂家名称</mfname>
    private String mfbrand;// <mfbrand>厂牌</mfbrand> --输入产品名称
    private String mflicense;// <mflicense>生产许可证号</mflicense>

    public String getAn8() {
        return an8;
    }

    public void setAn8(String an8) {
        this.an8 = an8;
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

    public String getMfcd() {
        return mfcd;
    }

    public void setMfcd(String mfcd) {
        this.mfcd = mfcd;
    }

    public String getMfname() {
        return mfname;
    }

    public void setMfname(String mfname) {
        this.mfname = mfname;
    }

    public String getMfbrand() {
        return mfbrand;
    }

    public void setMfbrand(String mfbrand) {
        this.mfbrand = mfbrand;
    }

    public String getMflicense() {
        return mflicense;
    }

    public void setMflicense(String mflicense) {
        this.mflicense = mflicense;
    }
}
