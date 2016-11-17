package com.el.cmic.domain.repertory;

import java.math.BigDecimal;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"通知单行号","货品编号","取消数量","库类型","批号","灭菌批号","货品名称","有效期至","生产日期","序列号明细"},ignores={"applyQuant","socn","qxev01"})
public class InInvertoryCancelItem {

	  /**
     *  通知单行号 - FE8WMS12.QXLNID
     */
	@JSONField(name="通知单行号") 
    private BigDecimal qxlnid;
    
    /**
     *  货品编号 - FE8WMS12.QXLITM
     */
	@JSONField(name="货品编号") 
    private String qxlitm;

    /**
     *  取消数量 - FE8WMS12.QXUORG
     */
	@JSONField(name="取消数量") 
    private BigDecimal qxuorg;
    
    /**
     * 固定值0
     */
	@JSONField(name="库类型") 
    private String invertoryType;
    
	/**
	 * 批号
	 */
	@JSONField(name="批号") 
	private String qxlot1;
	
	/**
	 * 灭菌批号
	 */
	@JSONField(name="灭菌批号") 
	private String qxlot2;
	
    /**
     *  货品名称 - FE8WMS12.QXDSC1
     */
	@JSONField(name="货品名称") 
    private String qxdsc1;
	
	/**
	 * 有效期至
	 */
	@JSONField(name="有效期至") 
	private String dateTo;
	
	/**
	 * 生产日期
	 */
	@JSONField(name="生产日期") 
	private String predate;
	
	
	
	  /**
     * 虚拟字段（入库取消返回推送使用）  申请取消数量
     */
	 @JSONField(name="申请取消数量") 
    private BigDecimal applyQuant;
	/**
	  * 实际取消数量（入库取消推送用  未在数据库中找到此字段  暂用此名）
	  */
	 @JSONField(name="实际取消数量") 
	 private BigDecimal socn;
	 
 	/**
     * 更新入库取消返回推送用 - FE8WMS12.QXEV01
     */
    private String qxev01;


	/**
	 * 序列号明细
	 */
	@JSONField(name = "序列号明细")
	private List<InInvertoryCancelSequence> iICIListItem;
	 
	 
	public BigDecimal getSocn() {
		return socn;
	}

	public void setSocn(BigDecimal socn) {
		this.socn = socn;
	}

	public BigDecimal getQxlnid() {
		return qxlnid;
	}

	public void setQxlnid(BigDecimal qxlnid) {
		this.qxlnid = qxlnid;
	}

	public String getQxlitm() {
		return qxlitm;
	}

	public void setQxlitm(String qxlitm) {
		this.qxlitm = qxlitm;
	}

	public BigDecimal getQxuorg() {
		return qxuorg;
	}

	public void setQxuorg(BigDecimal qxuorg) {
		this.qxuorg = qxuorg;
	}

	public String getInvertoryType() {
		return invertoryType;
	}

	public void setInvertoryType(String invertoryType) {
		this.invertoryType = invertoryType;
	}

	public String getQxdsc1() {
		return qxdsc1;
	}

	public void setQxdsc1(String qxdsc1) {
		this.qxdsc1 = qxdsc1;
	}

	public String getQxlot1() {
		return qxlot1;
	}

	public void setQxlot1(String qxlot1) {
		this.qxlot1 = qxlot1;
	}

	public String getQxlot2() {
		return qxlot2;
	}

	public void setQxlot2(String qxlot2) {
		this.qxlot2 = qxlot2;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getPredate() {
		return predate;
	}

	public void setPredate(String predate) {
		this.predate = predate;
	}

	public BigDecimal getApplyQuant() {
		return applyQuant;
	}

	public void setApplyQuant(BigDecimal applyQuant) {
		this.applyQuant = applyQuant;
	}

	public String getQxev01() {
		return qxev01;
	}

	public void setQxev01(String qxev01) {
		this.qxev01 = qxev01;
	}

	public List<InInvertoryCancelSequence> getiICIListItem() {
		return iICIListItem;
	}

	public void setiICIListItem(List<InInvertoryCancelSequence> iICIListItem) {
		this.iICIListItem = iICIListItem;
	}
}
