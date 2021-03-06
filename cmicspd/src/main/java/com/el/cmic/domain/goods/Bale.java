package com.el.cmic.domain.goods;


import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * 商品基础数据推送
 * @author zhanhao
 *
 */
@Component
@JSONType(orders = {"SPD系统标识","配送机构系统标识","配送机构ERP编号","配送机构名称","ERP商品编号","ERP商品名称","通用名","简称",
		"注册商标","规格","产地","生产厂商","单位","包装","中包装","条形码","批准文号","注册证号","注册证有效期至","类别属性","类别","剂型","储存条件",
		"启用唯一码管理","其他分类1","其他分类2","其他分类3","备注","封存","封存时间"})
public class Bale {
	/**
	 * SPD系统标识  VE8SPDSP.SPDBS
	 */
	 @JSONField(name = "SPD系统标识")
	private   String  spdbs;
	/**
	 * 配送机构系统标识 VE8SPDSP. ERPBS
	 */
	 @JSONField(name = "配送机构系统标识")
	private   String  erpbs;
	/**
	 * 配送机构ERP编号  	VE8SPDSP.CO
	 */
	 @JSONField(name = "配送机构ERP编号")
	private   String  co;
	/**
	 * 配送机构名称  VE8SPDSP.NAME
	 */
	 @JSONField(name = "配送机构名称")
	private String name;
	
    /**
     *  ERP商品编号  -VE8SPDSP.LITM
     */
	 @JSONField(name = "ERP商品编号")
    private String litm;
    
 /**
     *  ERP商品名称 - VE8SPDSP.E8NAME 
     */
	 @JSONField(name = "ERP商品名称")
    private String e8name;
    
    /**
     *  通用名 - VE8SPDSP.E8TYM
     */
	 @JSONField(name = "通用名")
    private String e8tym;
    
    /**
     *  简称 - VE8SPDSP.DSC1 
     */
	 @JSONField(name = "简称")
    private String dsc1;
    
    /**
     *注册商标  VE8SPDSP.ZCSB
     */
	 @JSONField(name = "注册商标")
    private String zcsb ;
    
    /**
     *  规格 - VE8SPDSP.DSC2 
     */
	 @JSONField(name = "规格")
    private String dsc2;
    
    /**
     * 产地  VE8SPDSP.CD
     */
	 @JSONField(name = "产地")
    private String cd;
     /**
     *  生产厂商 - VE8SPDSP.ALPH
     */
	 @JSONField(name = "生产厂商")
    private String alph;
    
     /**
     *  单位 - VE8SPDSP.DWMC
     */
	 @JSONField(name = "单位")
    private String dwmc;
    
	 /**
	  * 包装 VE8SPDSP.BZ
	  */
	 @JSONField(name = "包装")
    private BigDecimal bz;
    
    /**
     * 中包装  VE8SPDSP.ZBZ
     */
	 @JSONField(name = "中包装")
    private   BigDecimal zbz;
    
    /**
     * 条形码  VE8SPDSP.TM
     */
	 @JSONField(name = "条形码")
    private String tm;
    
     /**
     *  批准文号 - VE8SPDSP.E8PZWH
     */
	 @JSONField(name = "批准文号")
    private String e8pzwh;
    
     /**
     *  注册证号 - FE84101Z.ZZE8ZZBM
     */
	 @JSONField(name = "注册证号")
    private String zze8zzbm;
    
     /**
     *  注册证有效期至 - FE84101Z.ZZEXDJ
     */
	 @JSONField(name = "注册证有效期至")
    private String zzexdj;
    
    /**
     * 类别属性 VE8SPDSP.LBSX
     */
	 @JSONField(name = "类别属性")
    private String lbsx;
    
    /**
     * 类别 VE8SPDSP.LB
     */
	 @JSONField(name = "类别")
    private String lb;
    
	 /**
	  * 剂型 VE8SPDSP.JX
	  */
	 @JSONField(name = "剂型")
    private String jx;
    
	 /**
	  *  储存条件 VE8SPDSP.CCTJ
	  */
	 @JSONField(name = "储存条件")
    private String cctj;
    
	 /**
	  * 启用唯一码管理  VE8SPDSP.QYWYGL
	  */
	 @JSONField(name = "启用唯一码管理")
    private int qywygl;
    
    /**
     * 其他分类1 VE8SPDSP.QTFL1
     */
	 @JSONField(name = "其他分类1")
    private String qtfl1;
	 
	 /**
     * 其他分类2 VE8SPDSP.QTFL2
     */
	 @JSONField(name = "其他分类2")
    private String qtfl2;
	 
	 /**
     * 其他分类3 VE8SPDSP.QTFL3
     */
	 @JSONField(name = "其他分类3")
    private String qtfl3;
    
    
	 /**
	  * 备注 VE8SPDSP.BZ1
	  */
	 @JSONField(name = "备注")
    private String bz1;
    
	 /**
	  * 封存  VE8SPDSP.STKT
	  */
	 @JSONField(name = "封存")
    private String stkt;
    
	 /**
	  *  封存时间 VE8SPDSP.FCSJ
	  */
	 @JSONField(name = "封存时间")
    private String fcsj;

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

	public String getE8tym() {
		return e8tym;
	}

	public void setE8tym(String e8tym) {
		this.e8tym = e8tym;
	}

	public String getDsc1() {
		return dsc1;
	}

	public void setDsc1(String dsc1) {
		this.dsc1 = dsc1;
	}

	public String getZcsb() {
		return zcsb;
	}

	public void setZcsb(String zcsb) {
		this.zcsb = zcsb;
	}

	public String getDsc2() {
		return dsc2;
	}

	public void setDsc2(String dsc2) {
		this.dsc2 = dsc2;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getAlph() {
		return alph;
	}

	public void setAlph(String alph) {
		this.alph = alph;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public int getQywygl() {
		return qywygl;
	}

	public void setQywygl(int qywygl) {
		this.qywygl = qywygl;
	}

	public BigDecimal getBz() {
		return bz;
	}

	public void setBz(BigDecimal bz) {
		this.bz = bz;
	}

	public BigDecimal getZbz() {
		return zbz;
	}

	public void setZbz(BigDecimal zbz) {
		this.zbz = zbz;
	}

	public String getTm() {
		return tm;
	}

	public void setTm(String tm) {
		this.tm = tm;
	}

	public String getE8pzwh() {
		return e8pzwh;
	}

	public void setE8pzwh(String e8pzwh) {
		this.e8pzwh = e8pzwh;
	}

	public String getZze8zzbm() {
		return zze8zzbm;
	}

	public void setZze8zzbm(String zze8zzbm) {
		this.zze8zzbm = zze8zzbm;
	}

	public String getZzexdj() {
		return zzexdj;
	}

	public void setZzexdj(String zzexdj) {
		this.zzexdj = zzexdj;
	}

	public String getLbsx() {
		return lbsx;
	}

	public void setLbsx(String lbsx) {
		this.lbsx = lbsx;
	}

	public String getLb() {
		return lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	public String getJx() {
		return jx;
	}

	public void setJx(String jx) {
		this.jx = jx;
	}

	public String getCctj() {
		return cctj;
	}

	public void setCctj(String cctj) {
		this.cctj = cctj;
	}



	public String getQtfl1() {
		return qtfl1;
	}

	public void setQtfl1(String qtfl1) {
		this.qtfl1 = qtfl1;
	}

	public String getQtfl2() {
		return qtfl2;
	}

	public void setQtfl2(String qtfl2) {
		this.qtfl2 = qtfl2;
	}

	public String getQtfl3() {
		return qtfl3;
	}

	public void setQtfl3(String qtfl3) {
		this.qtfl3 = qtfl3;
	}

	public String getBz1() {
		return bz1;
	}

	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}

	public String getStkt() {
		return stkt;
	}

	public void setStkt(String stkt) {
		this.stkt = stkt;
	}

	public String getFcsj() {
		return fcsj;
	}

	public void setFcsj(String fcsj) {
		this.fcsj = fcsj;
	}

	@Override
	public String toString() {
		return "Bale [spdbs=" + spdbs + ", erpbs=" + erpbs + ", co=" + co
				+ ", name=" + name + ", litm=" + litm + ", e8name=" + e8name
				+ ", e8tym=" + e8tym + ", dsc1=" + dsc1 + ", zcsb=" + zcsb
				+ ", dsc2=" + dsc2 + ", cd=" + cd + ", alph=" + alph
				+ ", dwmc=" + dwmc + ", bz=" + bz + ", zbz=" + zbz + ", tm="
				+ tm + ", e8pzwh=" + e8pzwh + ", zze8zzbm=" + zze8zzbm
				+ ", zzexdj=" + zzexdj + ", lbsx=" + lbsx + ", lb=" + lb
				+ ", jx=" + jx + ", cctj=" + cctj + ", qywygl=" + qywygl
				+ ", qtfl1=" + qtfl1 + ", qtfl2=" + qtfl2 + ", qtfl3=" + qtfl3
				+ ", bz1=" + bz1 + ", stkt=" + stkt + ", fcsj=" + fcsj + "]";
	}
	
}
