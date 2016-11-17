package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"isyl", "isgl", "issbdd", "pk_yygs", "pk_yljb", "istgyf", "pk_yydl",
        "pk_yyxl", "yynsr", "isyljgz", "isyyzz", "iszzjgdm", "isswdjz", "isxbyyzz"})
public class RqC001InputYYOrJcyljg {
    private String isyl;//  <isyl>是否营利</isyl>
    private String isgl;// <isgl>是否公立</isgl>
    private String issbdd;//<issbdd>是否社保定点</issbdd>
    private String pk_yygs;//<pk_yygs>医院归属</pk_yygs>
    private String pk_yljb; //<pk_yljb>医疗级别</pk_yljb>
    private String istgyf;// <istgyf>是否托管药房</istgyf>
    private String pk_yydl;//<pk_yydl>医院终端大类</pk_yydl>
    private String pk_yyxl; //<pk_yyxl>医院终端小类</pk_yyxl>
    private String yynsr;//<yynsr>医院年收入（万元）</yynsr>
    private String isyljgz; //<isyljgz>是否有医疗机构执业许可证</isyljgz>
    private String isyyzz; //<isyyzz>是否有营业执照</isyyzz>
    private String iszzjgdm;// <iszzjgdm>是否有组织机构代码</iszzjgdm>
    private String isswdjz;// <isswdjz>是否有税务登记证</isswdjz>
    private String isxbyyzz;// <isxbyyzz>是否有新版营业执照</isxbyyzz>

    public String getIsyl() {
        return isyl;
    }

    public void setIsyl(String isyl) {
        this.isyl = isyl;
    }

    public String getIsgl() {
        return isgl;
    }

    public void setIsgl(String isgl) {
        this.isgl = isgl;
    }

    public String getIssbdd() {
        return issbdd;
    }

    public void setIssbdd(String issbdd) {
        this.issbdd = issbdd;
    }

    public String getPk_yygs() {
        return pk_yygs;
    }

    public void setPk_yygs(String pk_yygs) {
        this.pk_yygs = pk_yygs;
    }

    public String getPk_yljb() {
        return pk_yljb;
    }

    public void setPk_yljb(String pk_yljb) {
        this.pk_yljb = pk_yljb;
    }

    public String getIstgyf() {
        return istgyf;
    }

    public void setIstgyf(String istgyf) {
        this.istgyf = istgyf;
    }

    public String getPk_yydl() {
        return pk_yydl;
    }

    public void setPk_yydl(String pk_yydl) {
        this.pk_yydl = pk_yydl;
    }

    public String getPk_yyxl() {
        return pk_yyxl;
    }

    public void setPk_yyxl(String pk_yyxl) {
        this.pk_yyxl = pk_yyxl;
    }

    public String getYynsr() {
        return yynsr;
    }

    public void setYynsr(String yynsr) {
        this.yynsr = yynsr;
    }

    public String getIsyljgz() {
        return isyljgz;
    }

    public void setIsyljgz(String isyljgz) {
        this.isyljgz = isyljgz;
    }

    public String getIsyyzz() {
        return isyyzz;
    }

    public void setIsyyzz(String isyyzz) {
        this.isyyzz = isyyzz;
    }

    public String getIszzjgdm() {
        return iszzjgdm;
    }

    public void setIszzjgdm(String iszzjgdm) {
        this.iszzjgdm = iszzjgdm;
    }

    public String getIsswdjz() {
        return isswdjz;
    }

    public void setIsswdjz(String isswdjz) {
        this.isswdjz = isswdjz;
    }

    public String getIsxbyyzz() {
        return isxbyyzz;
    }

    public void setIsxbyyzz(String isxbyyzz) {
        this.isxbyyzz = isxbyyzz;
    }
}
