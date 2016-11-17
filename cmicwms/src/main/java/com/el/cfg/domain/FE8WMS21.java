package com.el.cfg.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class FE8WMS21 implements Serializable {
    /**
     *  null - FE8WMS21.LSMCU
     */
    private String lsmcu;

    /**
     *  null - FE8WMS21.LSE8WLZXID
     */
    private String lse8wlzxid;

    /**
     *  null - FE8WMS21.LSUSER
     */
    private String lsuser;

    /**
     *  null - FE8WMS21.LSPID
     */
    private String lspid;

    /**
     *  null - FE8WMS21.LSUPMJ
     */
    private Integer lsupmj;

    /**
     *  null - FE8WMS21.LSTDAY
     */
    private BigDecimal lstday;

    /**
     *  null - FE8WMS21.LSDL01
     */
    private String lsdl01;

    /**
     *  null - FE8WMS21.LSDL02
     */
    private String lsdl02;

    /**
     *  null - FE8WMS21.LSDL03
     */
    private String lsdl03;

    /**
     *  null - FE8WMS21.LSDL04
     */
    private String lsdl04;

    /**
     *  null - FE8WMS21.LSDL05
     */
    private String lsdl05;

    /**
     *  null - FE8WMS21.LSEV01
     */
    private String lsev01;

    /**
     *  null - FE8WMS21.LSEV02
     */
    private String lsev02;

    /**
     *  null - FE8WMS21.LSEV03
     */
    private String lsev03;

    private static final long serialVersionUID = 1L;

    public String getLsmcu() {
        return lsmcu;
    }

    public void setLsmcu(String lsmcu) {
        this.lsmcu = lsmcu;
    }

    public String getLse8wlzxid() {
        return lse8wlzxid;
    }

    public void setLse8wlzxid(String lse8wlzxid) {
        this.lse8wlzxid = lse8wlzxid;
    }

    public String getLsuser() {
        return lsuser;
    }

    public void setLsuser(String lsuser) {
        this.lsuser = lsuser;
    }

    public String getLspid() {
        return lspid;
    }

    public void setLspid(String lspid) {
        this.lspid = lspid;
    }

    public Integer getLsupmj() {
        return lsupmj;
    }

    public void setLsupmj(Integer lsupmj) {
        this.lsupmj = lsupmj;
    }

    public BigDecimal getLstday() {
        return lstday;
    }

    public void setLstday(BigDecimal lstday) {
        this.lstday = lstday;
    }

    public String getLsdl01() {
        return lsdl01;
    }

    public void setLsdl01(String lsdl01) {
        this.lsdl01 = lsdl01;
    }

    public String getLsdl02() {
        return lsdl02;
    }

    public void setLsdl02(String lsdl02) {
        this.lsdl02 = lsdl02;
    }

    public String getLsdl03() {
        return lsdl03;
    }

    public void setLsdl03(String lsdl03) {
        this.lsdl03 = lsdl03;
    }

    public String getLsdl04() {
        return lsdl04;
    }

    public void setLsdl04(String lsdl04) {
        this.lsdl04 = lsdl04;
    }

    public String getLsdl05() {
        return lsdl05;
    }

    public void setLsdl05(String lsdl05) {
        this.lsdl05 = lsdl05;
    }

    public String getLsev01() {
        return lsev01;
    }

    public void setLsev01(String lsev01) {
        this.lsev01 = lsev01;
    }

    public String getLsev02() {
        return lsev02;
    }

    public void setLsev02(String lsev02) {
        this.lsev02 = lsev02;
    }

    public String getLsev03() {
        return lsev03;
    }

    public void setLsev03(String lsev03) {
        this.lsev03 = lsev03;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lsmcu=").append(lsmcu);
        sb.append(", lse8wlzxid=").append(lse8wlzxid);
        sb.append(", lsuser=").append(lsuser);
        sb.append(", lspid=").append(lspid);
        sb.append(", lsupmj=").append(lsupmj);
        sb.append(", lstday=").append(lstday);
        sb.append(", lsdl01=").append(lsdl01);
        sb.append(", lsdl02=").append(lsdl02);
        sb.append(", lsdl03=").append(lsdl03);
        sb.append(", lsdl04=").append(lsdl04);
        sb.append(", lsdl05=").append(lsdl05);
        sb.append(", lsev01=").append(lsev01);
        sb.append(", lsev02=").append(lsev02);
        sb.append(", lsev03=").append(lsev03);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}