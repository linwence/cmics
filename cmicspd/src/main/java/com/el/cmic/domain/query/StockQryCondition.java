package com.el.cmic.domain.query;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by Vincent on 2017/1/18.
 */
public class StockQryCondition {
    @JSONField(name = "guid")
    private String guid;
    @JSONField(name = "配送机构ERP编号")
    private String erpco;
    @JSONField(name = "JDE商品号")
    private String litm;
    @JSONField(name = "商品名称")
    private String dsc1;
    @JSONField(name = "规格型号")
    private String e8dsc2;

    @JSONField(name = "ERP仓库编码")
    private String mcu;
    @JSONField(name = "仓库名")
    private String mcdl01;
    @JSONField(name = "公司")
    private String mcco;

    @JSONField(name = "公司名")
    private String ccname;
    @JSONField(name = "库位")
    private String locn;
    @JSONField(name = "JDE批次")
    private String lotn;
    @JSONField(name = "批号")
    private String lot1;
    @JSONField(name = "灭菌批号")
    private String lot2;
    @JSONField(name = "产品大类")
    private String cpdl;
    @JSONField(name = "特殊分类")
    private String tsfl;
    @JSONField(name = "产品分类")
    private String cpfl;
    @JSONField(name = "是否禁用")
    private String stkt;
    @JSONField(name = "生产厂家")
    private String abalph;
    @JSONField(name = "证照编码")
    private String e8zzbm;
    @JSONField(name = "起始行")
    private int startRowNum;
    @JSONField(name = "截止行")
    private int endRowNum;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getErpco() {
        return erpco;
    }

    public void setErpco(String erpco) {
        this.erpco = erpco;
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

    public String getE8dsc2() {
        return e8dsc2;
    }

    public void setE8dsc2(String e8dsc2) {
        this.e8dsc2 = e8dsc2;
    }

    public String getMcu() {
        return mcu;
    }

    public void setMcu(String mcu) {
        this.mcu = mcu;
    }

    public String getMcdl01() {
        return mcdl01;
    }

    public void setMcdl01(String mcdl01) {
        this.mcdl01 = mcdl01;
    }

    public String getMcco() {
        return mcco;
    }

    public void setMcco(String mcco) {
        this.mcco = mcco;
    }

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    public String getLocn() {
        return locn;
    }

    public void setLocn(String locn) {
        this.locn = locn;
    }

    public String getLotn() {
        return lotn;
    }

    public void setLotn(String lotn) {
        this.lotn = lotn;
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

    public String getCpdl() {
        return cpdl;
    }

    public void setCpdl(String cpdl) {
        this.cpdl = cpdl;
    }

    public String getTsfl() {
        return tsfl;
    }

    public void setTsfl(String tsfl) {
        this.tsfl = tsfl;
    }

    public String getCpfl() {
        return cpfl;
    }

    public void setCpfl(String cpfl) {
        this.cpfl = cpfl;
    }

    public String getStkt() {
        return stkt;
    }

    public void setStkt(String stkt) {
        this.stkt = stkt;
    }

    public String getAbalph() {
        return abalph;
    }

    public void setAbalph(String abalph) {
        this.abalph = abalph;
    }

    public String getE8zzbm() {
        return e8zzbm;
    }

    public void setE8zzbm(String e8zzbm) {
        this.e8zzbm = e8zzbm;
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
