package com.el.cmic.domain.department;


import org.springframework.stereotype.Component;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * 部门基础数据推送
 * 
 * @author zhanhao
 *
 */
@Component
@JSONType(orders = { "SPD系统标识", "配送机构系统标识", "配送机构ERP编号", "配送机构名称", "ERP上级部门编号",
		"ERP上级部门名称", "ERP部门编号", "ERP部门名称","简称","备注","封存"})
public class DepartmentData {
	/**
	 * SPD系统标识 VE8SPDBM.SPDBS
	 */
	@JSONField(name = "SPD系统标识")
	private  String spdbs ;
	 
	/**
	 * 配送机构系统标识 VE8SPDBM.CO
	 */
	@JSONField(name = "配送机构系统标识")
	private  String co;
	
	//配送机构ERP编号
	@JSONField(name = "配送机构ERP编号")
	private  String send ;
	 
	/**
	 *  配送机构名称 VE8SPDBM.NAME
	 */
	@JSONField(name = "配送机构名称")
	private String name;

	/**
	 *  ERP上级部门编号  VE8SPDBM.SJBMID
	 */
	@JSONField(name = "ERP上级部门编号")
	private String sjbmid;
	
	/**
	 * ERP上级部门名称  VE8SPDBM.SJBMMC
	 */
	@JSONField(name = "ERP上级部门名称")
	private String sjbmmc;
	/**
	 * ERP部门编号 VE8SPDBM.MCU
	 */
	@JSONField(name = "ERP部门编号")
	private String mcu;
	
	/**
	 * ERP部门名称 VE8SPDBM.DC
	 */
	@JSONField(name = "ERP部门名称")
	private String dc;
	
	/**
	 *  简称 VE8SPDBM.JC
	 */
	@JSONField(name = "简称")
	private String jc;

	/**
	 *  备注 VE8SPDBM.BZ
	 */
	@JSONField(name = "备注")
	private String bz;

	/**
	 *  封存 VE8SPDBM.FC
	 */
	@JSONField(name = "封存")
	private int fc;

	public String getSpdbs() {
		return spdbs;
	}

	public void setSpdbs(String spdbs) {
		this.spdbs = spdbs;
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

	public String getSjbmid() {
		return sjbmid;
	}

	public void setSjbmid(String sjbmid) {
		this.sjbmid = sjbmid;
	}

	public String getSjbmmc() {
		return sjbmmc;
	}

	public void setSjbmmc(String sjbmmc) {
		this.sjbmmc = sjbmmc;
	}

	public String getMcu() {
		return mcu;
	}

	public void setMcu(String mcu) {
		this.mcu = mcu;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public String getJc() {
		return jc;
	}

	public void setJc(String jc) {
		this.jc = jc;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public int getFc() {
		return fc;
	}

	public void setFc(int fc) {
		this.fc = fc;
	}

	public String getSend() {
		return send;
	}

	public void setSend(String send) {
		this.send = send;
	}

	@Override
	public String toString() {
		return "DepartmentData [spdbs=" + spdbs + ", co=" + co + ", send="
				+ send + ", name=" + name + ", sjbmid=" + sjbmid + ", sjbmmc="
				+ sjbmmc + ", mcu=" + mcu + ", dc=" + dc + ", jc=" + jc
				+ ", bz=" + bz + ", fc=" + fc + "]";
	}
	
}
