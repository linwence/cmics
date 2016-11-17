package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.*;
import javax.xml.soap.Name;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlRootElement(name = "subline")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"subname", "rqC001InputJXS"})
public class RqC001InputSubLineJXS {
    private String subname;
    private RqC001InputJXS rqC001InputJXS;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement(name = "subcontent")
    public RqC001InputJXS getRqC001InputJXS() {
        return rqC001InputJXS;
    }

    public void setRqC001InputJXS(RqC001InputJXS rqC001InputJXS) {
        this.rqC001InputJXS = rqC001InputJXS;
    }
}
