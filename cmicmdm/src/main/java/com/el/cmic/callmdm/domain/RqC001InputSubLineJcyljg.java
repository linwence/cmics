package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlRootElement(name = "subline")
@XmlType(propOrder = {"subname", "rqC001InputJcyljg"})
public class RqC001InputSubLineJcyljg {
    private String subname;
    private RqC001InputYYOrJcyljg rqC001InputJcyljg;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement(name = "subcontent")
    public RqC001InputYYOrJcyljg getRqC001InputJcyljg() {
        return rqC001InputJcyljg;
    }

    public void setRqC001InputJcyljg(RqC001InputYYOrJcyljg rqC001InputJcyljg) {
        this.rqC001InputJcyljg = rqC001InputJcyljg;
    }
}
