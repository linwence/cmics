package com.el.cfg.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class F0005 implements Serializable {
    /**
     *  null - F0005.DRSY
     */
    private String drsy;

    /**
     *  null - F0005.DRRT
     */
    private String drrt;

    /**
     *  null - F0005.DRKY
     */
    private String drky;

    /**
     *  null - F0005.DRDL01
     */
    private String drdl01;

    /**
     *  null - F0005.DRDL02
     */
    private String drdl02;

    /**
     *  null - F0005.DRSPHD
     */
    private String drsphd;

    /**
     *  null - F0005.DRUDCO
     */
    private String drudco;

    /**
     *  null - F0005.DRHRDC
     */
    private String drhrdc;

    /**
     *  null - F0005.DRUSER
     */
    private String druser;

    /**
     *  null - F0005.DRPID
     */
    private String drpid;

    /**
     *  null - F0005.DRUPMJ
     */
    private Integer drupmj;

    /**
     *  null - F0005.DRJOBN
     */
    private String drjobn;

    /**
     *  null - F0005.DRUPMT
     */
    private BigDecimal drupmt;

    private static final long serialVersionUID = 1L;

    public String getDrsy() {
        return drsy;
    }

    public void setDrsy(String drsy) {
        this.drsy = drsy;
    }

    public String getDrrt() {
        return drrt;
    }

    public void setDrrt(String drrt) {
        this.drrt = drrt;
    }

    public String getDrky() {
        return drky;
    }

    public void setDrky(String drky) {
        this.drky = drky;
    }

    public String getDrdl01() {
        return drdl01;
    }

    public void setDrdl01(String drdl01) {
        this.drdl01 = drdl01;
    }

    public String getDrdl02() {
        return drdl02;
    }

    public void setDrdl02(String drdl02) {
        this.drdl02 = drdl02;
    }

    public String getDrsphd() {
        return drsphd;
    }

    public void setDrsphd(String drsphd) {
        this.drsphd = drsphd;
    }

    public String getDrudco() {
        return drudco;
    }

    public void setDrudco(String drudco) {
        this.drudco = drudco;
    }

    public String getDrhrdc() {
        return drhrdc;
    }

    public void setDrhrdc(String drhrdc) {
        this.drhrdc = drhrdc;
    }

    public String getDruser() {
        return druser;
    }

    public void setDruser(String druser) {
        this.druser = druser;
    }

    public String getDrpid() {
        return drpid;
    }

    public void setDrpid(String drpid) {
        this.drpid = drpid;
    }

    public Integer getDrupmj() {
        return drupmj;
    }

    public void setDrupmj(Integer drupmj) {
        this.drupmj = drupmj;
    }

    public String getDrjobn() {
        return drjobn;
    }

    public void setDrjobn(String drjobn) {
        this.drjobn = drjobn;
    }

    public BigDecimal getDrupmt() {
        return drupmt;
    }

    public void setDrupmt(BigDecimal drupmt) {
        this.drupmt = drupmt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drsy=").append(drsy);
        sb.append(", drrt=").append(drrt);
        sb.append(", drky=").append(drky);
        sb.append(", drdl01=").append(drdl01);
        sb.append(", drdl02=").append(drdl02);
        sb.append(", drsphd=").append(drsphd);
        sb.append(", drudco=").append(drudco);
        sb.append(", drhrdc=").append(drhrdc);
        sb.append(", druser=").append(druser);
        sb.append(", drpid=").append(drpid);
        sb.append(", drupmj=").append(drupmj);
        sb.append(", drjobn=").append(drjobn);
        sb.append(", drupmt=").append(drupmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}