package com.el.cmic.domain.ckcancel;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Vincent on 2016/10/29.
 */
@JSONType(orders = {"通知单行号","货品编号","取消数量","库类型","批号","灭菌批号","有效期至","生产日期","序列号明细"})
public class CkCancelOrderDtl {
    @JSONField(name = "通知单行号")
    private BigDecimal lnid;
    @JSONField(name = "货品编号")
    private String litm;
    @JSONField(name = "取消数量")
    private BigDecimal uorg;
    @JSONField(name = "库类型")
    private int ca02;
    @JSONField(name = "批号")
    private String lot1;
    @JSONField(name = "灭菌批号")
    private String lot2;
    @JSONField(name = "货品名称")
    private String dsc1;
    @JSONField(name = "有效期至",format = "yyyy-MM-dd")
    private Date invalidDate;
    @JSONField(name = "生产日期",format = "yyyy-MM-dd")
    private Date productDate;
    @JSONField(name = "序列号明细")
    private List<CkCancelOrderSequence> ckCancelOrderSequenceList;

    public BigDecimal getLnid() {
        return lnid;
    }

    public void setLnid(BigDecimal lnid) {
        this.lnid = lnid;
    }

    public String getLitm() {
        return litm;
    }

    public void setLitm(String litm) {
        this.litm = litm;
    }

    public BigDecimal getUorg() {
        return uorg;
    }

    public void setUorg(BigDecimal uorg) {
        this.uorg = uorg;
    }

    public int getCa02() {
        return ca02;
    }

    public void setCa02(int ca02) {
        this.ca02 = ca02;
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

    public String getDsc1() {
        return dsc1;
    }

    public void setDsc1(String dsc1) {
        this.dsc1 = dsc1;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public List<CkCancelOrderSequence> getCkCancelOrderSequenceList() {
        return ckCancelOrderSequenceList;
    }

    public void setCkCancelOrderSequenceList(List<CkCancelOrderSequence> ckCancelOrderSequenceList) {
        this.ckCancelOrderSequenceList = ckCancelOrderSequenceList;
    }
}
