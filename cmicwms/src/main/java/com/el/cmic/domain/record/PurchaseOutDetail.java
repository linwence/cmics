package com.el.cmic.domain.record;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 采退出库复核记录推送
 * @author zhanhao
 *
 */
public class PurchaseOutDetail {

	/**
     *  物流中心 - FE8WMS11.CTMCU
     */
	@JSONField(name="物流中心")
    private String ctmcu;
    
    /**
     *  货主 - FE8WMS11.CTCO
     */
	@JSONField(name="货主")
    private String ctco;
    
    /**
     *  通知单号 - FE8WMS11.CTPTUT01
     */
	@JSONField(name="通知单号")
	private String orderNo;
	@JSONField(name = "订单号")
    private String ctptut01;
	@JSONField(name = "订单类型")
	private String ctdcto;
@JSONField(name = "通知单行号")
	private long ctlnid;
    /**
     *  复核单号 - FE8WMS11.CTPTUT02
     */
	@JSONField(name="复核单号")
    private String ctptut02;
    
    /**
     *  复核日期 - FE8WMS11.CTDTEE
     */
	@JSONField(name="复核日期",format="yyyy-MM-dd")
    private Date ctdtee;
    
    /**
     *  客户编号 - FE8WMS11.CTPTUT03
     */
	@JSONField(name="客户编号")
    private String ctptut03;
    
    /**
     *  客户名称 - FE8WMS11.CTE8TYM
     */
	@JSONField(name="客户名称")
    private String cte8tym;
    
    /**
     *  货品编号 - FE8WMS11.CTFSTR1
     */
	@JSONField(name="货品编号")
    private String ctfstr1;
    
    /**
     *  货品名称 - FE8WMS11.CTE8NAME
     */
	@JSONField(name="货品名称")
    private String cte8name;
    /**
     *  批号 - FE8WMS11.CTDSTX
     */
	@JSONField(name="批号")
    private String ctdstx;
    
    /**
     *  灭菌批号 - FE8WMS11.CTFSTR2
     */
	@JSONField(name="灭菌批号")
    private String ctfstr2;
    
    /**
     *  有效期至 - FE8WMS11.CTIDATE
     */
	@JSONField(name="有效期至",format="yyyy-MM-dd")
    private Date ctidate;
    
    /**
     *  生产日期 - FE8WMS11.CTRDATE
     */
	@JSONField(name="生产日期",format="yyyy-MM-dd")
    private Date ctrdate;

    /**
     *  复核数量 - FE8WMS11.CTUPRC
     */
	@JSONField(name="复核数量")
    private BigDecimal ctuprc;
    
    /**
     *  单位 - FE8WMS11.CTFSTR3
     */
	@JSONField(name="单位")
    private String ctfstr3;
    
    /**
     *  复核结论 - FE8WMS11.CTFSTR4
     */
	@JSONField(name="复核结论")
    private String ctfstr4;
    
    /**
     *  地址 - FE8WMS11.CTCONSTR1
     */
	@JSONField(name="地址")
    private String ctconstr1;
    
    /**
     *  电话 - FE8WMS11.CTFSTR5
     */
	@JSONField(name="电话")
    private String ctfstr5;
    
    /**
     *  复核员 - FE8WMS11.CTFSTR6
     */
	@JSONField(name="复核员")
    private String ctfstr6;
    
    /**
     *  业务员 - FE8WMS11.CTFSTR61
     */
	@JSONField(name="业务员")
    private String ctfstr61;
    
    /**
     *  剂型 - FE8WMS11.CTFSTR62
     */
	@JSONField(name="剂型")
    private String ctfstr62;
    
    /**
     *  规格 - FE8WMS11.CTAHL1
     */
	@JSONField(name="规格")
    private String ctahl1;
    
    /**
     *  产地 - FE8WMS11.CTDTA1
     */
	@JSONField(name="产地")
    private String ctdta1;
    
    /**
     *  批准文号 - FE8WMS11.CTAHL2
     */
	@JSONField(name="批准文号")
    private String ctahl2;
    
    /**
     *  生产厂商 - FE8WMS11.CTCONSTR2
     */
	@JSONField(name="生产厂商")
    private String ctconstr2;
    
    /**
     *  null - FE8WMS11.CTUSER
     */
    private String ctuser;
    
    /**
     *  null - FE8WMS11.CTPID
     */
    private String ctpid;
    
    /**
     *  null - FE8WMS11.CTUPMJ
     */
    private Integer ctupmj;
    /**
     *  null - FE8WMS11.CTTDAY
     */
    private BigDecimal cttday;

	@JSONField(name = "灭菌日期",format = "yyyy-MM-dd")
	private Date mjrq;
	@JSONField(name = "灭菌批号有效期至",format = "yyyy-MM-dd")
	private Date mjsxq;

	public String getCtmcu() {
		return ctmcu;
	}
	public void setCtmcu(String ctmcu) {
		this.ctmcu = ctmcu;
	}
	public String getCtco() {
		return ctco;
	}
	public void setCtco(String ctco) {
		this.ctco = ctco;
	}
	public String getCtptut01() {
		return ctptut01;
	}
	public void setCtptut01(String ctptut01) {
		this.ctptut01 = ctptut01;
	}
	public String getCtptut02() {
		return ctptut02;
	}
	public void setCtptut02(String ctptut02) {
		this.ctptut02 = ctptut02;
	}
	public Date getCtdtee() {
		return ctdtee;
	}
	public void setCtdtee(Date ctdtee) {
		this.ctdtee = ctdtee;
	}
	public String getCtptut03() {
		return ctptut03;
	}
	public void setCtptut03(String ctptut03) {
		this.ctptut03 = ctptut03;
	}
	public String getCte8tym() {
		return cte8tym;
	}
	public void setCte8tym(String cte8tym) {
		this.cte8tym = cte8tym;
	}
	public String getCtfstr1() {
		return ctfstr1;
	}
	public void setCtfstr1(String ctfstr1) {
		this.ctfstr1 = ctfstr1;
	}
	public String getCte8name() {
		return cte8name;
	}
	public void setCte8name(String cte8name) {
		this.cte8name = cte8name;
	}
	public String getCtdstx() {
		return ctdstx;
	}
	public void setCtdstx(String ctdstx) {
		this.ctdstx = ctdstx;
	}
	public String getCtfstr2() {
		return ctfstr2;
	}
	public void setCtfstr2(String ctfstr2) {
		this.ctfstr2 = ctfstr2;
	}
	public Date getCtidate() {
		return ctidate;
	}
	public void setCtidate(Date ctidate) {
		this.ctidate = ctidate;
	}
	public Date getCtrdate() {
		return ctrdate;
	}
	public void setCtrdate(Date ctrdate) {
		this.ctrdate = ctrdate;
	}
	public BigDecimal getCtuprc() {
		return ctuprc;
	}
	public void setCtuprc(BigDecimal ctuprc) {
		this.ctuprc = ctuprc;
	}
	public String getCtfstr3() {
		return ctfstr3;
	}
	public void setCtfstr3(String ctfstr3) {
		this.ctfstr3 = ctfstr3;
	}
	public String getCtfstr4() {
		return ctfstr4;
	}
	public void setCtfstr4(String ctfstr4) {
		this.ctfstr4 = ctfstr4;
	}
	public String getCtconstr1() {
		return ctconstr1;
	}
	public void setCtconstr1(String ctconstr1) {
		this.ctconstr1 = ctconstr1;
	}
	public String getCtfstr5() {
		return ctfstr5;
	}
	public void setCtfstr5(String ctfstr5) {
		this.ctfstr5 = ctfstr5;
	}
	public String getCtfstr6() {
		return ctfstr6;
	}
	public void setCtfstr6(String ctfstr6) {
		this.ctfstr6 = ctfstr6;
	}
	public String getCtfstr61() {
		return ctfstr61;
	}
	public void setCtfstr61(String ctfstr61) {
		this.ctfstr61 = ctfstr61;
	}
	public String getCtfstr62() {
		return ctfstr62;
	}
	public void setCtfstr62(String ctfstr62) {
		this.ctfstr62 = ctfstr62;
	}
	public String getCtahl1() {
		return ctahl1;
	}
	public void setCtahl1(String ctahl1) {
		this.ctahl1 = ctahl1;
	}
	public String getCtdta1() {
		return ctdta1;
	}
	public void setCtdta1(String ctdta1) {
		this.ctdta1 = ctdta1;
	}
	public String getCtahl2() {
		return ctahl2;
	}
	public void setCtahl2(String ctahl2) {
		this.ctahl2 = ctahl2;
	}
	public String getCtconstr2() {
		return ctconstr2;
	}
	public void setCtconstr2(String ctconstr2) {
		this.ctconstr2 = ctconstr2;
	}
	public String getCtuser() {
		return ctuser;
	}
	public void setCtuser(String ctuser) {
		this.ctuser = ctuser;
	}
	public String getCtpid() {
		return ctpid;
	}
	public void setCtpid(String ctpid) {
		this.ctpid = ctpid;
	}
	public Integer getCtupmj() {
		return ctupmj;
	}
	public void setCtupmj(Integer ctupmj) {
		this.ctupmj = ctupmj;
	}
	public BigDecimal getCttday() {
		return cttday;
	}
	public void setCttday(BigDecimal cttday) {
		this.cttday = cttday;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCtdcto() {
		return ctdcto;
	}

	public void setCtdcto(String ctdcto) {
		this.ctdcto = ctdcto;
	}

	public Date getMjrq() {
		return mjrq;
	}

	public void setMjrq(Date mjrq) {
		this.mjrq = mjrq;
	}

	public Date getMjsxq() {
		return mjsxq;
	}

	public void setMjsxq(Date mjsxq) {
		this.mjsxq = mjsxq;
	}

	public long getCtlnid() {
		return ctlnid;
	}

	public void setCtlnid(long ctlnid) {
		this.ctlnid = ctlnid;
	}

	@Override
	public String toString() {
		return "PurchaseOutDetail [ctmcu=" + ctmcu + ", ctco=" + ctco
				+ ", ctptut01=" + ctptut01 + ", ctptut02=" + ctptut02
				+ ", ctdtee=" + ctdtee + ", ctptut03=" + ctptut03
				+ ", cte8tym=" + cte8tym + ", ctfstr1=" + ctfstr1
				+ ", cte8name=" + cte8name + ", ctdstx=" + ctdstx
				+ ", ctfstr2=" + ctfstr2 + ", ctidate=" + ctidate
				+ ", ctrdate=" + ctrdate + ", ctuprc=" + ctuprc + ", ctfstr3="
				+ ctfstr3 + ", ctfstr4=" + ctfstr4 + ", ctconstr1=" + ctconstr1
				+ ", ctfstr5=" + ctfstr5 + ", ctfstr6=" + ctfstr6
				+ ", ctfstr61=" + ctfstr61 + ", ctfstr62=" + ctfstr62
				+ ", ctahl1=" + ctahl1 + ", ctdta1=" + ctdta1 + ", ctahl2="
				+ ctahl2 + ", ctconstr2=" + ctconstr2 + ", ctuser=" + ctuser
				+ ", ctpid=" + ctpid + ", ctupmj=" + ctupmj + ", cttday="
				+ cttday + "]";
	}
   
}
