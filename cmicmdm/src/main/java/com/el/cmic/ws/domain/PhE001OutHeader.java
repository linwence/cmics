package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "header")
@XmlType(propOrder ={"datatype",
        "functype",
        "direction",
        "errcode",
        "msg",
        "submitbillinfo",
        "approver",
        "approvedate",
        "approvenote",
        "codeinfo"
})
public class PhE001OutHeader {
    private String datatype;
    private String functype;
    private String direction;
    private String errcode;
    private String msg;
    private String submitbillinfo;

    private String approver;
    private String approvedate;
    private String approvenote;

    private PhE001OutHeaderCodeInfo codeinfo;

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(String approvedate) {
        this.approvedate = approvedate;
    }

    public String getApprovenote() {
        return approvenote;
    }

    public void setApprovenote(String approvenote) {
        this.approvenote = approvenote;
    }

    @XmlElement(name = "datatype")
    public String getDatatype() {
        return datatype;
    }


    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    @XmlElement(name = "functype")
    public String getFunctype() {
        return functype;
    }

    public void setFunctype(String functype) {
        this.functype = functype;
    }

    @XmlElement(name = "direction")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @XmlElement(name = "errcode")
    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    @XmlElement(name = "msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @XmlElement(name = "submitbillinfo")
    public String getSubmitbillinfo() {
        return submitbillinfo;
    }

    public void setSubmitbillinfo(String submitbillinfo) {
        this.submitbillinfo = submitbillinfo;
    }

    @XmlElement(name = "codeinfo")
    public PhE001OutHeaderCodeInfo getCodeinfo() {
        return codeinfo;
    }

    public void setCodeinfo(PhE001OutHeaderCodeInfo codeinfo) {
        this.codeinfo = codeinfo;
    }

    @Override
    public String toString() {
        return "PhE001OutHeader{" +
                "datatype='" + datatype + '\'' +
                ", functype='" + functype + '\'' +
                ", direction='" + direction + '\'' +
                ", errcode='" + errcode + '\'' +
                ", msg='" + msg + '\'' +
                ", submitbillinfo='" + submitbillinfo + '\'' +
                ", approver='" + approver + '\'' +
                ", approvedate='" + approvedate + '\'' +
                ", approvenote='" + approvenote + '\'' +
                ", codeinfo=" + codeinfo +
                '}';
    }
}
