package com.el.cfg.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Ve8ck001 implements Serializable {
    /**
     *  null - VE8CK001.MCU
     */
    private String mcu;

    /**
     *  null - VE8CK001.WMSMCU
     */
    private String wmsmcu;

    /**
     *  null - VE8CK001.DCTO
     */
    private String dcto;

    /**
     *  null - VE8CK001.CKTYPE
     */
    private String cktype;

    /**
     *  null - VE8CK001.CO
     */
    private String co;

    /**
     *  null - VE8CK001.WMSCO
     */
    private String wmsco;

    /**
     *  null - VE8CK001.DOCO
     */
    private BigDecimal doco;

    /**
     *  null - VE8CK001.AN8
     */
    private BigDecimal an8;

    /**
     *  null - VE8CK001.AT1
     */
    private BigDecimal at1;

    /**
     *  null - VE8CK001.ALPH
     */
    private String alph;

    /**
     *  null - VE8CK001.VR01
     */
    private String vr01;

    /**
     *  null - VE8CK001.REMARK
     */
    private String remark;

    /**
     *  null - VE8CK001.ADDRESS
     */
    private String address;

    /**
     *  null - VE8CK001.TRDJ
     */
    private Integer trdj;

    /**
     *  null - VE8CK001.DEPTNAME
     */
    private String deptname;

    /**
     *  null - VE8CK001.FLAG
     */
    private String flag;

    private static final long serialVersionUID = 1L;

    public String getMcu() {
        return mcu;
    }

    public void setMcu(String mcu) {
        this.mcu = mcu;
    }

    public String getWmsmcu() {
        return wmsmcu;
    }

    public void setWmsmcu(String wmsmcu) {
        this.wmsmcu = wmsmcu;
    }

    public String getDcto() {
        return dcto;
    }

    public void setDcto(String dcto) {
        this.dcto = dcto;
    }

    public String getCktype() {
        return cktype;
    }

    public void setCktype(String cktype) {
        this.cktype = cktype;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getWmsco() {
        return wmsco;
    }

    public void setWmsco(String wmsco) {
        this.wmsco = wmsco;
    }

    public BigDecimal getDoco() {
        return doco;
    }

    public void setDoco(BigDecimal doco) {
        this.doco = doco;
    }

    public BigDecimal getAn8() {
        return an8;
    }

    public void setAn8(BigDecimal an8) {
        this.an8 = an8;
    }

    public BigDecimal getAt1() {
        return at1;
    }

    public void setAt1(BigDecimal at1) {
        this.at1 = at1;
    }

    public String getAlph() {
        return alph;
    }

    public void setAlph(String alph) {
        this.alph = alph;
    }

    public String getVr01() {
        return vr01;
    }

    public void setVr01(String vr01) {
        this.vr01 = vr01;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTrdj() {
        return trdj;
    }

    public void setTrdj(Integer trdj) {
        this.trdj = trdj;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mcu=").append(mcu);
        sb.append(", wmsmcu=").append(wmsmcu);
        sb.append(", dcto=").append(dcto);
        sb.append(", cktype=").append(cktype);
        sb.append(", co=").append(co);
        sb.append(", wmsco=").append(wmsco);
        sb.append(", doco=").append(doco);
        sb.append(", an8=").append(an8);
        sb.append(", at1=").append(at1);
        sb.append(", alph=").append(alph);
        sb.append(", vr01=").append(vr01);
        sb.append(", remark=").append(remark);
        sb.append(", address=").append(address);
        sb.append(", trdj=").append(trdj);
        sb.append(", deptname=").append(deptname);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}