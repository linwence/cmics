package com.el.cmic.domain.ckback;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

import java.math.BigDecimal;

/**
 * Created by Vincent on 2016/10/26.
 */
@JSONType(orders = {"序列号","入出类型","数量","当前包装","盘点状态"})
public class CkBackSequence {
    @JSONField(name = "序列号")
    private String seqNo;

    @JSONField(name = "入出类型")
    private String aa05;

    @JSONField(name = "数量")
    private int ca01;

    @JSONField(name = "当前包装")
    private BigDecimal uprc;

    @JSONField(name = "盘点状态")
    private int uorg;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getAa05() {
        return aa05;
    }

    public void setAa05(String aa05) {
        this.aa05 = aa05;
    }

    public int getCa01() {
        return ca01;
    }

    public void setCa01(int ca01) {
        this.ca01 = ca01;
    }

    public BigDecimal getUprc() {
        return uprc;
    }

    public void setUprc(BigDecimal uprc) {
        this.uprc = uprc;
    }

    public int getUorg() {
        return uorg;
    }

    public void setUorg(int uorg) {
        this.uorg = uorg;
    }
}
