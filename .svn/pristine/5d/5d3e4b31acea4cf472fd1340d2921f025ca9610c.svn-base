package com.el.cmic.domain.ckcancel;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

import java.math.BigDecimal;

/**
 * Created by Vincent on 2016/10/29.
 */
@JSONType(orders = {"序列号", "入出类型", "数量", "当前包装"})
public class CkCancelOrderSequence {
    @JSONField(name = "序列号")
    private String sequenceNo;
    @JSONField(name = "入出类型")
    private String rcType;
    @JSONField(name = "数量")
    private int uorg;
    @JSONField(name = "当前包装")
    private BigDecimal packSize;

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getRcType() {
        return rcType;
    }

    public void setRcType(String rcType) {
        this.rcType = rcType;
    }

    public int getUorg() {
        return uorg;
    }

    public void setUorg(int uorg) {
        this.uorg = uorg;
    }

    public BigDecimal getPackSize() {
        return packSize;
    }

    public void setPackSize(BigDecimal packSize) {
        this.packSize = packSize;
    }
}
