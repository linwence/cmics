package com.el.cmic.domain.repertory;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * 入库单取消
 *
 * @author zhanhao
 */
@JSONType(orders = {"物流中心", "入库类型", "货主", "通知单号", "客户编号", "客户名称", "业务员", "通知单日期", "订单类型", "订单号","通知单明细", "序列号明细"},
        ignores = { "qxlnid", "qxlitm", "qxuorg", "qxdsc1", "qxkcoo", "qxmcu"})
public class InInvertoryCancel {
    @JSONField(name = "物流中心")
    private String wmsmcu;

    @JSONField(serialize = false)
    private String qxmcu;

    @JSONField(name = "入库类型")
    private String qxdl02;

    /**
     * 货主 - FE8WMS12.QXKCOO
     */
    private String qxkcoo;
    @JSONField(name = "货主")
    private String wmskcoo;
    /**
     * 通知单号 - FE8WMS12.QXDOCO
     */
    @JSONField(name = "通知单号")
    private String orderno;
    @JSONField(name = "订单号")
    private BigDecimal qxdoco;
    /**
     * 客户编号 - FE8WMS12.QXAN8
     */
    @JSONField(name = "客户编号")
    private String qxan8;

    /**
     * 客户名称 - FE8WMS12.QXE8NAME
     */
    @JSONField(name = "客户名称")
    private String qxe8name;

    /**
     * 业务员  （文档中不存在）
     */
    @JSONField(name = "业务员")
    private String qxdl01;
    /**
     * 通知单日期 - FE8WMS12.QXTRDJ
     */
    @JSONField(name = "通知单日期",format = "yyyy-MM-dd")
    private Date qxtrdj;


    /**
     * 订单类型(文档中不存在)
     */
    @JSONField(name = "订单类型")
    private String qxdcto;
    /**
     * 通知单行号 - FE8WMS12.QXLNID
     */
    @JSONField(name = "通知单行号")
    private BigDecimal qxlnid;
    /**
     * 货品编号 - FE8WMS12.QXLITM
     */
    @JSONField(name = "货品编号")
    private String qxlitm;

    /**
     * 取消数量 - FE8WMS12.QXUORG
     */
    @JSONField(name = "取消数量")
    private BigDecimal qxuorg;

    /**
     * 货品名称 - FE8WMS12.QXDSC1
     */
    @JSONField(name = "货品名称")
    private String qxdsc1;

    /**
     * 通知单明细
     */
    @JSONField(name = "通知单明细")
    private List<InInvertoryCancelItem> iICIList;


    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getWmsmcu() {
        return wmsmcu;
    }

    public void setWmsmcu(String wmsmcu) {
        this.wmsmcu = wmsmcu;
    }

    public String getQxmcu() {
        return qxmcu;
    }

    public void setQxmcu(String qxmcu) {
        this.qxmcu = qxmcu;
    }

    public String getQxdl02() {
        return qxdl02;
    }

    public void setQxdl02(String qxdl02) {
        this.qxdl02 = qxdl02;
    }

    public String getQxkcoo() {
        return qxkcoo;
    }

    public void setQxkcoo(String qxkcoo) {
        this.qxkcoo = qxkcoo;
    }

    public String getWmskcoo() {
        return wmskcoo;
    }

    public void setWmskcoo(String wmskcoo) {
        this.wmskcoo = wmskcoo;
    }

    public BigDecimal getQxdoco() {
        return qxdoco;
    }

    public void setQxdoco(BigDecimal qxdoco) {
        this.qxdoco = qxdoco;
    }

    public String getQxan8() {
        return qxan8;
    }

    public void setQxan8(String qxan8) {
        this.qxan8 = qxan8;
    }

    public String getQxe8name() {
        return qxe8name;
    }

    public void setQxe8name(String qxe8name) {
        this.qxe8name = qxe8name;
    }

    public String getQxdl01() {
        return qxdl01;
    }

    public void setQxdl01(String qxdl01) {
        this.qxdl01 = qxdl01;
    }

    public Date getQxtrdj() {
        return qxtrdj;
    }

    public void setQxtrdj(Date qxtrdj) {
        this.qxtrdj = qxtrdj;
    }

    public String getQxdcto() {
        return qxdcto;
    }

    public void setQxdcto(String qxdcto) {
        this.qxdcto = qxdcto;
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

    public String getQxdsc1() {
        return qxdsc1;
    }

    public void setQxdsc1(String qxdsc1) {
        this.qxdsc1 = qxdsc1;
    }

    public List<InInvertoryCancelItem> getiICIList() {
        return iICIList;
    }

    public void setiICIList(List<InInvertoryCancelItem> iICIList) {
        this.iICIList = iICIList;
    }

}
