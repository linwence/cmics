package com.el.cmic.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * Created by Vincent on 2017/2/14.
 */
@JSONType(orders = {"resultCode", "resultMsg", "data"})
public class NtResult {
    @JSONField(name = "resultCode")
    private String resultCode;
    @JSONField(name = "resultMsg")
    private String resultMsg;
    @JSONField(name = "data")
    private Object data;

    public NtResult() {
    }

    public NtResult(String resultCode, String resultMsg, Object data) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
