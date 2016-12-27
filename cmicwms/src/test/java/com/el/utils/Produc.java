package com.el.utils;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * Created by Vincent on 2016/12/1.
 */
@JSONType(orders = "货品编码")
public class Produc {
    @JSONField(name = "货品编码")
    private String goodsno;
    @JSONField(name = "货品名称",serialize = false)
    private String goodsname;

    public String getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }
}
