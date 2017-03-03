package com.el.cmic.common;

/**
 * Created by Administrator on 3/2/2017.
 */
public class NtRequestParamByCode {

    private String userCode;

    private String pwd;

    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "NtRequestParamByCode{" +
                "userCode='" + userCode + '\'' +
                ", pwd='" + pwd + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
