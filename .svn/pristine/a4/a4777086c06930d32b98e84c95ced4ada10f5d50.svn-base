package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhC001OutSublineGR {
    private String subname;
    private PhC001OutGRC01 phC001OutGRC01;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public PhC001OutGRC01 getPhC001OutGRC01() {
        return phC001OutGRC01;
    }

    public void setPhC001OutGRC01(PhC001OutGRC01 phC001OutGRC01) {
        this.phC001OutGRC01 = phC001OutGRC01;
    }

    @Override
    public String toString() {
        return "PhC001OutSublineGR{" +
                "subname='" + subname + '\'' +
                ", phC001OutGRC01=" + phC001OutGRC01 +
                '}';
    }
}
