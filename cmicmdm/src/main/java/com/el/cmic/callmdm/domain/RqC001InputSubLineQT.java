package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlRootElement(name = "subline")
@XmlType(propOrder = {"subname", "rqC001InputQT"})
public class RqC001InputSubLineQT {
    private String subname;
    private RqC001InputQT rqC001InputQT;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement(name = "subcontent")
    public RqC001InputQT getRqC001InputQT() {
        return rqC001InputQT;
    }

    public void setRqC001InputQT(RqC001InputQT rqC001InputQT) {
        this.rqC001InputQT = rqC001InputQT;
    }
}
