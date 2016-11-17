package com.el.cfg.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class FE8SPD11 implements Serializable {
    /**
     *  null - FE8SPD11.PHUKID
     */
    private BigDecimal phukid;

    /**
     *  null - FE8SPD11.PHLNID
     */
    private BigDecimal phlnid;

    /**
     *  null - FE8SPD11.PHEV01
     */
    private String phev01;

    /**
     *  null - FE8SPD11.PHE8YLJGD
     */
    private String phe8yljgd;

    /**
     *  null - FE8SPD11.PHE8KSD
     */
    private String phe8ksd;

    /**
     *  null - FE8SPD11.PHE8ZDGYSE
     */
    private String phe8zdgyse;

    /**
     *  null - FE8SPD11.PHE8ZDGYSN
     */
    private String phe8zdgysn;

    /**
     *  null - FE8SPD11.PHTRDJ
     */
    private Integer phtrdj;

    /**
     *  null - FE8SPD11.PHE8YYYCD
     */
    private String phe8yyycd;

    /**
     *  null - FE8SPD11.PHE8YYYCE
     */
    private String phe8yyyce;

    /**
     *  null - FE8SPD11.PHE8YYYCN
     */
    private String phe8yyycn;

    /**
     *  null - FE8SPD11.PHE8SGG
     */
    private String phe8sgg;

    /**
     *  null - FE8SPD11.PHE8SCCS
     */
    private String phe8sccs;

    /**
     *  null - FE8SPD11.PHE8SCD
     */
    private String phe8scd;

    /**
     *  null - FE8SPD11.PHE8SDW
     */
    private String phe8sdw;

    /**
     *  null - FE8SPD11.PHE8SBZ
     */
    private BigDecimal phe8sbz;

    /**
     *  null - FE8SPD11.PHUPRC
     */
    private BigDecimal phuprc;

    /**
     *  null - FE8SPD11.PHUORG
     */
    private BigDecimal phuorg;

    /**
     *  null - FE8SPD11.PHE8YJDHRQ
     */
    private Integer phe8yjdhrq;

    private static final long serialVersionUID = 1L;

    public BigDecimal getPhukid() {
        return phukid;
    }

    public void setPhukid(BigDecimal phukid) {
        this.phukid = phukid;
    }

    public BigDecimal getPhlnid() {
        return phlnid;
    }

    public void setPhlnid(BigDecimal phlnid) {
        this.phlnid = phlnid;
    }

    public String getPhev01() {
        return phev01;
    }

    public void setPhev01(String phev01) {
        this.phev01 = phev01;
    }

    public String getPhe8yljgd() {
        return phe8yljgd;
    }

    public void setPhe8yljgd(String phe8yljgd) {
        this.phe8yljgd = phe8yljgd;
    }

    public String getPhe8ksd() {
        return phe8ksd;
    }

    public void setPhe8ksd(String phe8ksd) {
        this.phe8ksd = phe8ksd;
    }

    public String getPhe8zdgyse() {
        return phe8zdgyse;
    }

    public void setPhe8zdgyse(String phe8zdgyse) {
        this.phe8zdgyse = phe8zdgyse;
    }

    public String getPhe8zdgysn() {
        return phe8zdgysn;
    }

    public void setPhe8zdgysn(String phe8zdgysn) {
        this.phe8zdgysn = phe8zdgysn;
    }

    public Integer getPhtrdj() {
        return phtrdj;
    }

    public void setPhtrdj(Integer phtrdj) {
        this.phtrdj = phtrdj;
    }

    public String getPhe8yyycd() {
        return phe8yyycd;
    }

    public void setPhe8yyycd(String phe8yyycd) {
        this.phe8yyycd = phe8yyycd;
    }

    public String getPhe8yyyce() {
        return phe8yyyce;
    }

    public void setPhe8yyyce(String phe8yyyce) {
        this.phe8yyyce = phe8yyyce;
    }

    public String getPhe8yyycn() {
        return phe8yyycn;
    }

    public void setPhe8yyycn(String phe8yyycn) {
        this.phe8yyycn = phe8yyycn;
    }

    public String getPhe8sgg() {
        return phe8sgg;
    }

    public void setPhe8sgg(String phe8sgg) {
        this.phe8sgg = phe8sgg;
    }

    public String getPhe8sccs() {
        return phe8sccs;
    }

    public void setPhe8sccs(String phe8sccs) {
        this.phe8sccs = phe8sccs;
    }

    public String getPhe8scd() {
        return phe8scd;
    }

    public void setPhe8scd(String phe8scd) {
        this.phe8scd = phe8scd;
    }

    public String getPhe8sdw() {
        return phe8sdw;
    }

    public void setPhe8sdw(String phe8sdw) {
        this.phe8sdw = phe8sdw;
    }

    public BigDecimal getPhe8sbz() {
        return phe8sbz;
    }

    public void setPhe8sbz(BigDecimal phe8sbz) {
        this.phe8sbz = phe8sbz;
    }

    public BigDecimal getPhuprc() {
        return phuprc;
    }

    public void setPhuprc(BigDecimal phuprc) {
        this.phuprc = phuprc;
    }

    public BigDecimal getPhuorg() {
        return phuorg;
    }

    public void setPhuorg(BigDecimal phuorg) {
        this.phuorg = phuorg;
    }

    public Integer getPhe8yjdhrq() {
        return phe8yjdhrq;
    }

    public void setPhe8yjdhrq(Integer phe8yjdhrq) {
        this.phe8yjdhrq = phe8yjdhrq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phukid=").append(phukid);
        sb.append(", phlnid=").append(phlnid);
        sb.append(", phev01=").append(phev01);
        sb.append(", phe8yljgd=").append(phe8yljgd);
        sb.append(", phe8ksd=").append(phe8ksd);
        sb.append(", phe8zdgyse=").append(phe8zdgyse);
        sb.append(", phe8zdgysn=").append(phe8zdgysn);
        sb.append(", phtrdj=").append(phtrdj);
        sb.append(", phe8yyycd=").append(phe8yyycd);
        sb.append(", phe8yyyce=").append(phe8yyyce);
        sb.append(", phe8yyycn=").append(phe8yyycn);
        sb.append(", phe8sgg=").append(phe8sgg);
        sb.append(", phe8sccs=").append(phe8sccs);
        sb.append(", phe8scd=").append(phe8scd);
        sb.append(", phe8sdw=").append(phe8sdw);
        sb.append(", phe8sbz=").append(phe8sbz);
        sb.append(", phuprc=").append(phuprc);
        sb.append(", phuorg=").append(phuorg);
        sb.append(", phe8yjdhrq=").append(phe8yjdhrq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}