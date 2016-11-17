package com.el.cfg.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class VE8SPDJG implements Serializable {
    /**
     *  null - VE8SPDJG.SPDBS
     */
    private String spdbs;

    /**
     *  null - VE8SPDJG.ERPBS
     */
    private String erpbs;

    /**
     *  null - VE8SPDJG.CO
     */
    private String co;

    /**
     *  null - VE8SPDJG.NAME
     */
    private String name;

    /**
     *  null - VE8SPDJG.LITM
     */
    private String litm;

    /**
     *  null - VE8SPDJG.E8NAME
     */
    private String e8name;

    /**
     *  null - VE8SPDJG.UPRC
     */
    private BigDecimal uprc;

    private static final long serialVersionUID = 1L;

    public String getSpdbs() {
        return spdbs;
    }

    public void setSpdbs(String spdbs) {
        this.spdbs = spdbs;
    }

    public String getErpbs() {
        return erpbs;
    }

    public void setErpbs(String erpbs) {
        this.erpbs = erpbs;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLitm() {
        return litm;
    }

    public void setLitm(String litm) {
        this.litm = litm;
    }

    public String getE8name() {
        return e8name;
    }

    public void setE8name(String e8name) {
        this.e8name = e8name;
    }

    public BigDecimal getUprc() {
        return uprc;
    }

    public void setUprc(BigDecimal uprc) {
        this.uprc = uprc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spdbs=").append(spdbs);
        sb.append(", erpbs=").append(erpbs);
        sb.append(", co=").append(co);
        sb.append(", name=").append(name);
        sb.append(", litm=").append(litm);
        sb.append(", e8name=").append(e8name);
        sb.append(", uprc=").append(uprc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}