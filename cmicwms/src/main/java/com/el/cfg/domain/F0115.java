package com.el.cfg.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class F0115 implements Serializable {
    /**
     *  null - F0115.WPAN8
     */
    private BigDecimal wpan8;

    /**
     *  null - F0115.WPIDLN
     */
    private BigDecimal wpidln;

    /**
     *  null - F0115.WPCNLN
     */
    private BigDecimal wpcnln;

    /**
     *  null - F0115.WPRCK7
     */
    private BigDecimal wprck7;

    /**
     *  null - F0115.WPPHTP
     */
    private String wpphtp;

    /**
     *  null - F0115.WPAR1
     */
    private String wpar1;

    /**
     *  null - F0115.WPPH1
     */
    private String wpph1;

    /**
     *  null - F0115.WPUSER
     */
    private String wpuser;

    /**
     *  null - F0115.WPPID
     */
    private String wppid;

    /**
     *  null - F0115.WPUPMJ
     */
    private Integer wpupmj;

    /**
     *  null - F0115.WPJOBN
     */
    private String wpjobn;

    /**
     *  null - F0115.WPUPMT
     */
    private BigDecimal wpupmt;

    /**
     *  null - F0115.WPCFNO1
     */
    private BigDecimal wpcfno1;

    /**
     *  null - F0115.WPGEN1
     */
    private String wpgen1;

    /**
     *  null - F0115.WPFALGE
     */
    private String wpfalge;

    /**
     *  null - F0115.WPSYNCS
     */
    private BigDecimal wpsyncs;

    /**
     *  null - F0115.WPCAAD
     */
    private BigDecimal wpcaad;

    private static final long serialVersionUID = 1L;

    public BigDecimal getWpan8() {
        return wpan8;
    }

    public void setWpan8(BigDecimal wpan8) {
        this.wpan8 = wpan8;
    }

    public BigDecimal getWpidln() {
        return wpidln;
    }

    public void setWpidln(BigDecimal wpidln) {
        this.wpidln = wpidln;
    }

    public BigDecimal getWpcnln() {
        return wpcnln;
    }

    public void setWpcnln(BigDecimal wpcnln) {
        this.wpcnln = wpcnln;
    }

    public BigDecimal getWprck7() {
        return wprck7;
    }

    public void setWprck7(BigDecimal wprck7) {
        this.wprck7 = wprck7;
    }

    public String getWpphtp() {
        return wpphtp;
    }

    public void setWpphtp(String wpphtp) {
        this.wpphtp = wpphtp;
    }

    public String getWpar1() {
        return wpar1;
    }

    public void setWpar1(String wpar1) {
        this.wpar1 = wpar1;
    }

    public String getWpph1() {
        return wpph1;
    }

    public void setWpph1(String wpph1) {
        this.wpph1 = wpph1;
    }

    public String getWpuser() {
        return wpuser;
    }

    public void setWpuser(String wpuser) {
        this.wpuser = wpuser;
    }

    public String getWppid() {
        return wppid;
    }

    public void setWppid(String wppid) {
        this.wppid = wppid;
    }

    public Integer getWpupmj() {
        return wpupmj;
    }

    public void setWpupmj(Integer wpupmj) {
        this.wpupmj = wpupmj;
    }

    public String getWpjobn() {
        return wpjobn;
    }

    public void setWpjobn(String wpjobn) {
        this.wpjobn = wpjobn;
    }

    public BigDecimal getWpupmt() {
        return wpupmt;
    }

    public void setWpupmt(BigDecimal wpupmt) {
        this.wpupmt = wpupmt;
    }

    public BigDecimal getWpcfno1() {
        return wpcfno1;
    }

    public void setWpcfno1(BigDecimal wpcfno1) {
        this.wpcfno1 = wpcfno1;
    }

    public String getWpgen1() {
        return wpgen1;
    }

    public void setWpgen1(String wpgen1) {
        this.wpgen1 = wpgen1;
    }

    public String getWpfalge() {
        return wpfalge;
    }

    public void setWpfalge(String wpfalge) {
        this.wpfalge = wpfalge;
    }

    public BigDecimal getWpsyncs() {
        return wpsyncs;
    }

    public void setWpsyncs(BigDecimal wpsyncs) {
        this.wpsyncs = wpsyncs;
    }

    public BigDecimal getWpcaad() {
        return wpcaad;
    }

    public void setWpcaad(BigDecimal wpcaad) {
        this.wpcaad = wpcaad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wpan8=").append(wpan8);
        sb.append(", wpidln=").append(wpidln);
        sb.append(", wpcnln=").append(wpcnln);
        sb.append(", wprck7=").append(wprck7);
        sb.append(", wpphtp=").append(wpphtp);
        sb.append(", wpar1=").append(wpar1);
        sb.append(", wpph1=").append(wpph1);
        sb.append(", wpuser=").append(wpuser);
        sb.append(", wppid=").append(wppid);
        sb.append(", wpupmj=").append(wpupmj);
        sb.append(", wpjobn=").append(wpjobn);
        sb.append(", wpupmt=").append(wpupmt);
        sb.append(", wpcfno1=").append(wpcfno1);
        sb.append(", wpgen1=").append(wpgen1);
        sb.append(", wpfalge=").append(wpfalge);
        sb.append(", wpsyncs=").append(wpsyncs);
        sb.append(", wpcaad=").append(wpcaad);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}