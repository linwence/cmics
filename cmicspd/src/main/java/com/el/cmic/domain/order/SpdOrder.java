package com.el.cmic.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.el.utils.DateUtil;

public class SpdOrder implements Serializable {
	/**
	 * null - FE8SPD10.PHUKID
	 */
	private BigDecimal phukid;

	/**
	 * null - FE8SPD10.PHEV01
	 */
	private String phev01;

	/**
	 * null - FE8SPD10.PHE8SPDID
	 */
	@JSONField(name = "SPD系统标识")
	private String phe8spdid;

	/**
	 * null - FE8SPD10.PHE8ERPID
	 */
	@JSONField(name = "配送机构系统标识")
	private String phe8erpid;

	/**
	 * null - FE8SPD10.PHE8PSDW
	 */
	@JSONField(name = "配送单位")
	private String phe8psdw;

	/**
	 * null - FE8SPD10.PHE8PSDWE
	 */
	@JSONField(name = "配送单位ERP部门编号")
	private String phe8psdwe;

	/**
	 * null - FE8SPD10.PHE8PSDWN
	 */
	@JSONField(name = "配送单位名称")
	private String phe8psdwn;

	/**
	 * null - FE8SPD10.PHE8YHYY
	 */
	@JSONField(name = "要货医院")
	private String phe8yhyy;

	/**
	 * null - FE8SPD10.PHE8YHYYE
	 */
	@JSONField(name = "要货医院ERP编号")
	private String phe8yhyye;

	/**
	 * null - FE8SPD10.PHE8YHYYN
	 */
	@JSONField(name = "要货医院名称")
	private String phe8yhyyn;

	/**
	 * null - FE8SPD10.PHE8YHKS
	 */
	@JSONField(name = "要货科室编号")
	private String phe8yhks;

	/**
	 * null - FE8SPD10.PHE8YHKSE
	 */
	@JSONField(name = "要货科室ERP编号")
	private String phe8yhkse;

	/**
	 * null - FE8SPD10.PHE8YHKSN
	 */
	@JSONField(name = "要货科室名称")
	private String phe8yhksn;

	/**
	 * null - FE8SPD10.PHE8SHKS
	 */
	@JSONField(name = "收货科室编号")
	private String phe8shks;

	/**
	 * null - FE8SPD10.PHE8SHKSE
	 */
	@JSONField(name = "收货科室ERP编号")
	private String phe8shkse;

	/**
	 * null - FE8SPD10.PHE8SHKSN
	 */
	@JSONField(name = "收货科室名称")
	private String phe8shksn;

	/**
	 * null - FE8SPD10.PHE8YWBME
	 */
	@JSONField(name = "业务部门ERP编号")
	private String phe8ywbme;

	/**
	 * null - FE8SPD10.PHE8YWBMN
	 */
	@JSONField(name = "业务部门名称")
	private String phe8ywbmn;

	/**
	 * null - FE8SPD10.PHE8YWYE
	 */
	@JSONField(name = "业务员ERP编号")
	private String phe8ywye;

	/**
	 * null - FE8SPD10.PHE8YWYN
	 */
	@JSONField(name = "业务员名称")
	private String phe8ywyn;

	/**
	 * null - FE8SPD10.PHE8CGDD
	 */
	@JSONField(name = "采购订单号")
	private String phe8cgdd;

	/**
	 * null - FE8SPD10.PHE8QGLX
	 */
	@JSONField(name = "请购类型")
	private String phe8qglx;

	/**
	 * null - FE8SPD10.PHE8XTSJ
	 */
	@JSONField(name = "_date", format="yyyy-MM-dd HH:mm:ss")
	private Date phe8xtsj;

	/**
	 * null - FE8SPD10.PHE8QGLX
	 */
	@JSONField(name = "_datej", serialize=false)
	private BigDecimal phe8xtsjj;

	/**
	 * null - FE8SPD10.PHE8DDZHS
	 */
	@JSONField(name = "订单总行数")
	private BigDecimal phe8ddzhs;

	@JSONField(name = "采购订单明细")
	private List<SpdOrderDetail> details;

	private static final long serialVersionUID = 1L;

	public BigDecimal getPhukid() {
		return phukid;
	}

	public void setPhukid(BigDecimal phukid) {
		this.phukid = phukid;
	}

	public String getPhev01() {
		return phev01;
	}

	public void setPhev01(String phev01) {
		this.phev01 = phev01;
	}

	public String getPhe8spdid() {
		return phe8spdid;
	}

	public void setPhe8spdid(String phe8spdid) {
		this.phe8spdid = phe8spdid;
	}

	public String getPhe8erpid() {
		return phe8erpid;
	}

	public void setPhe8erpid(String phe8erpid) {
		this.phe8erpid = phe8erpid;
	}

	public String getPhe8psdw() {
		return phe8psdw;
	}

	public void setPhe8psdw(String phe8psdw) {
		this.phe8psdw = phe8psdw;
	}

	public String getPhe8psdwe() {
		return phe8psdwe;
	}

	public void setPhe8psdwe(String phe8psdwe) {
		this.phe8psdwe = phe8psdwe;
	}

	public String getPhe8psdwn() {
		return phe8psdwn;
	}

	public void setPhe8psdwn(String phe8psdwn) {
		this.phe8psdwn = phe8psdwn;
	}

	public String getPhe8yhyy() {
		return phe8yhyy;
	}

	public void setPhe8yhyy(String phe8yhyy) {
		this.phe8yhyy = phe8yhyy;
	}

	public String getPhe8yhyye() {
		return phe8yhyye;
	}

	public void setPhe8yhyye(String phe8yhyye) {
		this.phe8yhyye = phe8yhyye;
	}

	public String getPhe8yhyyn() {
		return phe8yhyyn;
	}

	public void setPhe8yhyyn(String phe8yhyyn) {
		this.phe8yhyyn = phe8yhyyn;
	}

	public String getPhe8yhks() {
		return phe8yhks;
	}

	public void setPhe8yhks(String phe8yhks) {
		this.phe8yhks = phe8yhks;
	}

	public String getPhe8yhkse() {
		return phe8yhkse;
	}

	public void setPhe8yhkse(String phe8yhkse) {
		this.phe8yhkse = phe8yhkse;
	}

	public String getPhe8yhksn() {
		return phe8yhksn;
	}

	public void setPhe8yhksn(String phe8yhksn) {
		this.phe8yhksn = phe8yhksn;
	}

	public String getPhe8shks() {
		return phe8shks;
	}

	public void setPhe8shks(String phe8shks) {
		this.phe8shks = phe8shks;
	}

	public String getPhe8shkse() {
		return phe8shkse;
	}

	public void setPhe8shkse(String phe8shkse) {
		this.phe8shkse = phe8shkse;
	}

	public String getPhe8shksn() {
		return phe8shksn;
	}

	public void setPhe8shksn(String phe8shksn) {
		this.phe8shksn = phe8shksn;
	}

	public String getPhe8ywbme() {
		return phe8ywbme;
	}

	public void setPhe8ywbme(String phe8ywbme) {
		this.phe8ywbme = phe8ywbme;
	}

	public String getPhe8ywbmn() {
		return phe8ywbmn;
	}

	public void setPhe8ywbmn(String phe8ywbmn) {
		this.phe8ywbmn = phe8ywbmn;
	}

	public String getPhe8ywye() {
		return phe8ywye;
	}

	public void setPhe8ywye(String phe8ywye) {
		this.phe8ywye = phe8ywye;
	}

	public String getPhe8ywyn() {
		return phe8ywyn;
	}

	public void setPhe8ywyn(String phe8ywyn) {
		this.phe8ywyn = phe8ywyn;
	}

	public String getPhe8cgdd() {
		return phe8cgdd;
	}

	public void setPhe8cgdd(String phe8cgdd) {
		this.phe8cgdd = phe8cgdd;
	}

	public String getPhe8qglx() {
		return phe8qglx;
	}

	public void setPhe8qglx(String phe8qglx) {
		this.phe8qglx = phe8qglx;
	}

	public Date getPhe8xtsj() {
		return phe8xtsj;
	}

	public void setPhe8xtsj(Date phe8xtsj) {
		this.phe8xtsj = phe8xtsj;
		if (phe8xtsj != null) {
			this.phe8xtsjj = new BigDecimal(DateUtil.dateToJuLian(phe8xtsj));
		}
	}

	/**
	 * @return the phe8xtsjj
	 */
	public BigDecimal getPhe8xtsjj() {
		return phe8xtsjj;
	}

	/**
	 * @param phe8xtsjj the phe8xtsjj to set
	 */
	public void setPhe8xtsjj(BigDecimal phe8xtsjj) {
		this.phe8xtsjj = phe8xtsjj;
	}

	public BigDecimal getPhe8ddzhs() {
		return phe8ddzhs;
	}

	public void setPhe8ddzhs(BigDecimal phe8ddzhs) {
		this.phe8ddzhs = phe8ddzhs;
	}

	/**
	 * @return the details
	 */
	public List<SpdOrderDetail> getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(List<SpdOrderDetail> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", phukid=").append(phukid);
		sb.append(", phev01=").append(phev01);
		sb.append(", phe8spdid=").append(phe8spdid);
		sb.append(", phe8erpid=").append(phe8erpid);
		sb.append(", phe8psdw=").append(phe8psdw);
		sb.append(", phe8psdwe=").append(phe8psdwe);
		sb.append(", phe8psdwn=").append(phe8psdwn);
		sb.append(", phe8yhyy=").append(phe8yhyy);
		sb.append(", phe8yhyye=").append(phe8yhyye);
		sb.append(", phe8yhyyn=").append(phe8yhyyn);
		sb.append(", phe8yhks=").append(phe8yhks);
		sb.append(", phe8yhkse=").append(phe8yhkse);
		sb.append(", phe8yhksn=").append(phe8yhksn);
		sb.append(", phe8shks=").append(phe8shks);
		sb.append(", phe8shkse=").append(phe8shkse);
		sb.append(", phe8shksn=").append(phe8shksn);
		sb.append(", phe8ywbme=").append(phe8ywbme);
		sb.append(", phe8ywbmn=").append(phe8ywbmn);
		sb.append(", phe8ywye=").append(phe8ywye);
		sb.append(", phe8ywyn=").append(phe8ywyn);
		sb.append(", phe8cgdd=").append(phe8cgdd);
		sb.append(", phe8qglx=").append(phe8qglx);
		sb.append(", phe8xtsj=").append(phe8xtsj);
		sb.append(", phe8ddzhs=").append(phe8ddzhs);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}