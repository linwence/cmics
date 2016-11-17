package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlRootElement(name = "subline")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"subname", "rqC001InputCsc"})
public class RqC001InputSubLineCsc {
    private String subname;

    private RqC001InputCsc rqC001InputCsc;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement(name = "subcontent")
    public RqC001InputCsc getRqC001InputCsc() {
        return rqC001InputCsc;
    }

    public void setRqC001InputCsc(RqC001InputCsc rqC001InputCsc) {
        this.rqC001InputCsc = rqC001InputCsc;
    }
}
