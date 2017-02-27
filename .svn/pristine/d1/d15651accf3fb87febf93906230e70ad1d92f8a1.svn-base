package com.el.cmic.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vincent on 2017/2/14.
 */
@Component
@Scope("prototype")
public class NtRequestParam {
    @Value("${nt.userCode}")
    private String userCode;
    @Value("${nt.pwd}")
    private String pwd;

    private Date timeBegin;
    private Date timeEnd;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Date timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userCode", this.getUserCode());
        hashMap.put("pwd", this.getPwd());
        hashMap.put("timeBegin", this.getTimeBegin());
        hashMap.put("timeEnd", this.getTimeEnd());
        return hashMap;
    }
}
