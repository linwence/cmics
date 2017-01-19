package com.el.cmic.domain.query;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Vincent on 2017/1/19.
 */
public class SaleQryCondition {
    @JSONField(name = "配送机构ERP编号")
    private String erpco;
    @JSONField(name = "订单号")
    private String doco;
    @JSONField(name = "订单类型")
    private String dcto;
    @JSONField(name = "订单公司")
    private String kcoo;
    @JSONField(name = "订单行号")
    private String lnid;
    @JSONField(name = "商品号")
    private String litm;
    @JSONField(name = "商品名称")
    private String dsc1;
    @JSONField(name = "订单日期")
    private Date trdj;
    @JSONField(name = "实际发运日期")
    private Date addj;
    @JSONField(name = "客户号")
    private String an8;
    @JSONField(name = "配送机构名称")
    private String e8psdwn;
    @JSONField(name = "医疗机构名称")
    private String e8yhyy;
    @JSONField(name = "请购/请退科室名称")
    private String e8yhksn;

    @JSONField(name = "入库/出库科室名称")
    private String e8shksn;
    @JSONField(name = "业务类型")
    private String e8qglx;
    @JSONField(name = "采购订单号")
    private String e8cgdd;
    @JSONField(name = "科室申请单号")
    private String e8ksd;
    @JSONField(name = "规格")
    private String e8dsc2;
    @JSONField(name = "生产厂商")
    private String e8sccs;
    @JSONField(name = "批号")
    private String lot1;
    @JSONField(name = "灭菌批号")
    private String lot2;
    @JSONField(name = "条码")
    private String e8fhdbh;
    @JSONField(name = "起始行")
    private int startRowNum;
    @JSONField(name = "截止行")
    private int endRowNum;
    public String getErpco() {
        return erpco;
    }

    public void setErpco(String erpco) {
        this.erpco = erpco;
    }

    public String getDoco() {
        return doco;
    }

    public void setDoco(String doco) {
        this.doco = doco;
    }

    public String getDcto() {
        return dcto;
    }

    public void setDcto(String dcto) {
        this.dcto = dcto;
    }

    public String getKcoo() {
        return kcoo;
    }

    public void setKcoo(String kcoo) {
        this.kcoo = kcoo;
    }

    public String getLnid() {
        return lnid;
    }

    public void setLnid(String lnid) {
        this.lnid = lnid;
    }

    public String getLitm() {
        return litm;
    }

    public void setLitm(String litm) {
        this.litm = litm;
    }

    public String getDsc1() {
        return dsc1;
    }

    public void setDsc1(String dsc1) {
        this.dsc1 = dsc1;
    }

    public Date getTrdj() {
        return trdj;
    }

    public void setTrdj(Date trdj) {
        this.trdj = trdj;
    }

    public Date getAddj() {
        return addj;
    }

    public void setAddj(Date addj) {
        this.addj = addj;
    }

    public String getAn8() {
        return an8;
    }

    public void setAn8(String an8) {
        this.an8 = an8;
    }

    public String getE8psdwn() {
        return e8psdwn;
    }

    public void setE8psdwn(String e8psdwn) {
        this.e8psdwn = e8psdwn;
    }

    public String getE8yhyy() {
        return e8yhyy;
    }

    public void setE8yhyy(String e8yhyy) {
        this.e8yhyy = e8yhyy;
    }

    public String getE8yhksn() {
        return e8yhksn;
    }

    public void setE8yhksn(String e8yhksn) {
        this.e8yhksn = e8yhksn;
    }

    public String getE8shksn() {
        return e8shksn;
    }

    public void setE8shksn(String e8shksn) {
        this.e8shksn = e8shksn;
    }

    public String getE8qglx() {
        return e8qglx;
    }

    public void setE8qglx(String e8qglx) {
        this.e8qglx = e8qglx;
    }

    public String getE8cgdd() {
        return e8cgdd;
    }

    public void setE8cgdd(String e8cgdd) {
        this.e8cgdd = e8cgdd;
    }

    public String getE8ksd() {
        return e8ksd;
    }

    public void setE8ksd(String e8ksd) {
        this.e8ksd = e8ksd;
    }

    public String getE8dsc2() {
        return e8dsc2;
    }

    public void setE8dsc2(String e8dsc2) {
        this.e8dsc2 = e8dsc2;
    }

    public String getE8sccs() {
        return e8sccs;
    }

    public void setE8sccs(String e8sccs) {
        this.e8sccs = e8sccs;
    }

    public String getLot1() {
        return lot1;
    }

    public void setLot1(String lot1) {
        this.lot1 = lot1;
    }

    public String getLot2() {
        return lot2;
    }

    public void setLot2(String lot2) {
        this.lot2 = lot2;
    }

    public String getE8fhdbh() {
        return e8fhdbh;
    }

    public void setE8fhdbh(String e8fhdbh) {
        this.e8fhdbh = e8fhdbh;
    }

    public int getStartRowNum() {
        return startRowNum;
    }

    public void setStartRowNum(int startRowNum) {
        this.startRowNum = startRowNum;
    }

    public int getEndRowNum() {
        return endRowNum;
    }

    public void setEndRowNum(int endRowNum) {
        this.endRowNum = endRowNum;
    }
}
