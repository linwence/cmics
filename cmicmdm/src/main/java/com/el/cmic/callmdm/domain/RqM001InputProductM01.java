package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by king_ on 2016/9/22.
 */
@XmlRootElement(name = "main")
@XmlAccessorType(XmlAccessType.FIELD)
public class RqM001InputProductM01 {
    private String mfcd;
    private String mfname;
    private String mfbrand;
    private String mflicense;

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

    @Override
    public String toString() {
        return "RqM001InputProductM01{" +
                "mfcd='" + mfcd + '\'' +
                ", mfname='" + mfname + '\'' +
                ", mfbrand='" + mfbrand + '\'' +
                ", mflicense='" + mflicense + '\'' +
                '}';
    }
}
