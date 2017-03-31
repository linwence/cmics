package com.el.cmic.domain.ntcfg;

import java.util.Date;

/**
 * Created by Vincent on 2017/2/15.
 */
public class Fe8NtCfg {
    private String interfacename;

    private Date calldate;

    private String successflag;

    private Date successdate;

    private String url;

    private Integer intervalTime;
    private String validflag;

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename;
    }

    public Date getCalldate() {
        return calldate;
    }

    public void setCalldate(Date calldate) {
        this.calldate = calldate;
    }

    public String getSuccessflag() {
        return successflag;
    }

    public void setSuccessflag(String successflag) {
        this.successflag = successflag;
    }

    public Date getSuccessdate() {
        return successdate;
    }

    public void setSuccessdate(Date successdate) {
        this.successdate = successdate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getValidflag() {
        return validflag;
    }

    public void setValidflag(String validflag) {
        this.validflag = validflag;
    }
}
