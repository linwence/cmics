package com.el.cmic.mapper.ck;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by Vincent on 2016/10/26.
 */
public class TestJsonDomain {
    @JSONField(name = "类型")
    private String type;
    @JSONField(name = "数量")
    private int num;
    @JSONField(name = "明细")
    private List<TestDtlDomain> testDtlDomainList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<TestDtlDomain> getTestDtlDomainList() {
        return testDtlDomainList;
    }

    public void setTestDtlDomainList(List<TestDtlDomain> testDtlDomainList) {
        this.testDtlDomainList = testDtlDomainList;
    }

    @Override
    public String toString() {
        return "TestJsonDomain{" +
                "type='" + type + '\'' +
                ", num=" + num +
                ", testDtlDomainList=" + testDtlDomainList +
                '}';
    }
}
