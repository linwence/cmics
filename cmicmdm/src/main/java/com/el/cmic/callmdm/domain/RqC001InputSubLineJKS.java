package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlRootElement(name = "subline")

@XmlType(propOrder = {"subname", "rqC001InputJks"})
public class RqC001InputSubLineJKS {
    private String subname;
    private RqC001InputJks rqC001InputJks;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement(name = "subcontent")
    public RqC001InputJks getRqC001InputJks() {
        return rqC001InputJks;
    }

    public void setRqC001InputJks(RqC001InputJks rqC001InputJks) {
        this.rqC001InputJks = rqC001InputJks;
    }
}
