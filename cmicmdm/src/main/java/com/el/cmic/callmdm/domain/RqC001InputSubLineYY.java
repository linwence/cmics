package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlRootElement(name = "subline")
@XmlType(propOrder = {"subname", "rqC001InputYYOrJcyljg"})
public class RqC001InputSubLineYY {
    private String subname;
    private RqC001InputYYOrJcyljg rqC001InputYYOrJcyljg;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement(name = "subcontent")
    public RqC001InputYYOrJcyljg getRqC001InputYYOrJcyljg() {
        return rqC001InputYYOrJcyljg;
    }

    public void setRqC001InputYYOrJcyljg(RqC001InputYYOrJcyljg rqC001InputYYOrJcyljg) {
        this.rqC001InputYYOrJcyljg = rqC001InputYYOrJcyljg;
    }
}
