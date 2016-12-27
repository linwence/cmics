package com.el.cmic.domain.record;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 运输记录推送（
 * @author zhanhao
 *
 */
public class TransportDetail {
	
	/**
     *  物流中心 - FE8WMS09.YSMCU
     */
	@JSONField(name="物流中心")
    private String ysmcu;
    
    /**
     *  货主 - FE8WMS09.YSCO
     */
	@JSONField(name="货主")
    private String ysco;
    
    /**
     *  通知单号 - FE8WMS09.YSDOCO
     */
	@JSONField(name="通知单号")
	private String orderNo;
	@JSONField(name = "订单号")
    private BigDecimal ysdoco;
	@JSONField(name = "订单类型")
	private String ysdcto;
    
    /**
     *  通知单行号 - FE8WMS09.YSLNID
     */
	@JSONField(name="通知单行号")
    private BigDecimal yslnid;
    
    /**
     *  装载单号 - FE8WMS09.YSPTUT01
     */
	@JSONField(name="装载单号")
    private String ysptut01;
    
    /**
     *  客户编号 - FE8WMS09.YSPTUT02
     */
	@JSONField(name="客户编号")
    private String ysptut02;
    
    /**
     *  客户名称 - FE8WMS09.YSE8TYM
     */
	@JSONField(name="客户名称")
    private String yse8tym;
    
    /**
     *  货品编号 - FE8WMS09.YSPTUT03
     */
	@JSONField(name="货品编号")
    private String ysptut03;
    
    /**
     *  货品名称 - FE8WMS09.YSE8NAME
     */
	@JSONField(name="货品名称")
    private String yse8name;
    
    /**
     *  批号 - FE8WMS09.YSFSTR1
     */
	@JSONField(name="批号")
    private String ysfstr1;
    
    /**
     *  灭菌批号 - FE8WMS09.YSFSTR2
     */
	@JSONField(name="灭菌批号")
    private String ysfstr2;
    
    /**
     *  有效期至 - FE8WMS09.YSIDATE
     */
	@JSONField(name="有效期至",format="yyyy-MM-dd")
    private Date ysidate;
    
    /**
     *  生产日期 - FE8WMS09.YSRDATE
     */
	@JSONField(name="生产日期",format="yyyy-MM-dd")
    private Date ysrdate;
    
    /**
     *  数量 - FE8WMS09.YSUPRC
     */
	@JSONField(name="数量")
    private BigDecimal ysuprc;
    
    /**
     *  单位 - FE8WMS09.YSCNYP
     */
	@JSONField(name="单位")
    private String yscnyp;
    
    /**
     *  发货时间 - FE8WMS09.YSDTEE
     */
	@JSONField(name="发货时间 ",format="yyyy-MM-dd")
    private Date ysdtee;
    
    /**
     *  到货时间 - FE8WMS09.YSDTETP
     */
	@JSONField(name="到货时间 ",format="yyyy-MM-dd")
    private Date ysdtetp;
    
    /**
     *  车牌号 - FE8WMS09.YSFSTR3
     */
	@JSONField(name="车牌号")
    private String ysfstr3;
    
    /**
     *  外运单号 - FE8WMS09.YSFSTR4
     */
	@JSONField(name="外运单号")
    private String ysfstr4;
    
    /**
     *  司机姓名 - FE8WMS09.YSFSTR5
     */
	@JSONField(name="司机姓名")
    private String ysfstr5;
    
    /**
     *  收货地址 - FE8WMS09.YSCONSTR1
     */
	@JSONField(name="收货地址")
    private String ysconstr1;
    
    /**
     *  null - FE8WMS09.YSUSER
     */
    private String ysuser;
    
    /**
     *  null - FE8WMS09.YSPID
     */
    private String yspid;
    
    /**
     *  null - FE8WMS09.YSUPMJ
     */
    private Integer ysupmj;
    /**
     *  null - FE8WMS09.YSTDAY
     */
    private BigDecimal ystday;
	public String getYsmcu() {
		return ysmcu;
	}
	public void setYsmcu(String ysmcu) {
		this.ysmcu = ysmcu;
	}
	public String getYsco() {
		return ysco;
	}
	public void setYsco(String ysco) {
		this.ysco = ysco;
	}
	public BigDecimal getYsdoco() {
		return ysdoco;
	}
	public void setYsdoco(BigDecimal ysdoco) {
		this.ysdoco = ysdoco;
	}
	public BigDecimal getYslnid() {
		return yslnid;
	}
	public void setYslnid(BigDecimal yslnid) {
		this.yslnid = yslnid;
	}
	public String getYsptut01() {
		return ysptut01;
	}
	public void setYsptut01(String ysptut01) {
		this.ysptut01 = ysptut01;
	}
	public String getYsptut02() {
		return ysptut02;
	}
	public void setYsptut02(String ysptut02) {
		this.ysptut02 = ysptut02;
	}
	public String getYse8tym() {
		return yse8tym;
	}
	public void setYse8tym(String yse8tym) {
		this.yse8tym = yse8tym;
	}
	public String getYsptut03() {
		return ysptut03;
	}
	public void setYsptut03(String ysptut03) {
		this.ysptut03 = ysptut03;
	}
	public String getYse8name() {
		return yse8name;
	}
	public void setYse8name(String yse8name) {
		this.yse8name = yse8name;
	}
	public String getYsfstr1() {
		return ysfstr1;
	}
	public void setYsfstr1(String ysfstr1) {
		this.ysfstr1 = ysfstr1;
	}
	public String getYsfstr2() {
		return ysfstr2;
	}
	public void setYsfstr2(String ysfstr2) {
		this.ysfstr2 = ysfstr2;
	}
	public Date getYsidate() {
		return ysidate;
	}
	public void setYsidate(Date ysidate) {
		this.ysidate = ysidate;
	}
	public Date getYsrdate() {
		return ysrdate;
	}
	public void setYsrdate(Date ysrdate) {
		this.ysrdate = ysrdate;
	}
	public BigDecimal getYsuprc() {
		return ysuprc;
	}
	public void setYsuprc(BigDecimal ysuprc) {
		this.ysuprc = ysuprc;
	}
	public String getYscnyp() {
		return yscnyp;
	}
	public void setYscnyp(String yscnyp) {
		this.yscnyp = yscnyp;
	}
	public Date getYsdtee() {
		return ysdtee;
	}
	public void setYsdtee(Date ysdtee) {
		this.ysdtee = ysdtee;
	}
	public Date getYsdtetp() {
		return ysdtetp;
	}
	public void setYsdtetp(Date ysdtetp) {
		this.ysdtetp = ysdtetp;
	}
	public String getYsfstr3() {
		return ysfstr3;
	}
	public void setYsfstr3(String ysfstr3) {
		this.ysfstr3 = ysfstr3;
	}
	public String getYsfstr4() {
		return ysfstr4;
	}
	public void setYsfstr4(String ysfstr4) {
		this.ysfstr4 = ysfstr4;
	}
	public String getYsfstr5() {
		return ysfstr5;
	}
	public void setYsfstr5(String ysfstr5) {
		this.ysfstr5 = ysfstr5;
	}
	public String getYsconstr1() {
		return ysconstr1;
	}
	public void setYsconstr1(String ysconstr1) {
		this.ysconstr1 = ysconstr1;
	}
	public String getYsuser() {
		return ysuser;
	}
	public void setYsuser(String ysuser) {
		this.ysuser = ysuser;
	}
	public String getYspid() {
		return yspid;
	}
	public void setYspid(String yspid) {
		this.yspid = yspid;
	}
	public Integer getYsupmj() {
		return ysupmj;
	}
	public void setYsupmj(Integer ysupmj) {
		this.ysupmj = ysupmj;
	}
	public BigDecimal getYstday() {
		return ystday;
	}
	public void setYstday(BigDecimal ystday) {
		this.ystday = ystday;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getYsdcto() {
		return ysdcto;
	}

	public void setYsdcto(String ysdcto) {
		this.ysdcto = ysdcto;
	}

	@Override
	public String toString() {
		return "TransportDetail [ysmcu=" + ysmcu + ", ysco=" + ysco
				+ ", ysdoco=" + ysdoco + ", yslnid=" + yslnid + ", ysptut01="
				+ ysptut01 + ", ysptut02=" + ysptut02 + ", yse8tym=" + yse8tym
				+ ", ysptut03=" + ysptut03 + ", yse8name=" + yse8name
				+ ", ysfstr1=" + ysfstr1 + ", ysfstr2=" + ysfstr2
				+ ", ysidate=" + ysidate + ", ysrdate=" + ysrdate + ", ysuprc="
				+ ysuprc + ", yscnyp=" + yscnyp + ", ysdtee=" + ysdtee
				+ ", ysdtetp=" + ysdtetp + ", ysfstr3=" + ysfstr3
				+ ", ysfstr4=" + ysfstr4 + ", ysfstr5=" + ysfstr5
				+ ", ysconstr1=" + ysconstr1 + ", ysuser=" + ysuser
				+ ", yspid=" + yspid + ", ysupmj=" + ysupmj + ", ystday="
				+ ystday + "]";
	}

}
