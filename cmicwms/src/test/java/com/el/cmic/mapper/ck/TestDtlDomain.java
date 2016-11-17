package com.el.cmic.mapper.ck;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by Vincent on 2016/10/26.
 */
public class TestDtlDomain {
    @JSONField(name = "名称")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestDtlDomain{" +
                "name='" + name + '\'' +
                '}';
    }
}
