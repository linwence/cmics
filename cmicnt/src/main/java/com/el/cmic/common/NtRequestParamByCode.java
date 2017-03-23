package com.el.cmic.common;

/**
 * Created by Administrator on 3/2/2017.
 */
public class NtRequestParamByCode {

    private String userCode;

    private String pwd;

    private String doc;

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

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "NtRequestParamByCode{" +
                "userCode='" + userCode + '\'' +
                ", pwd='" + pwd + '\'' +
                ", doc='" + doc + '\'' +
                '}';
    }
}
