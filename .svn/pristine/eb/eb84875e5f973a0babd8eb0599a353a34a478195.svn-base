package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhC001OutSublineQT {
    private String subname;
    private PhC001OutQTC01 phC001OutQTC01;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public PhC001OutQTC01 getPhC001OutQTC01() {
        return phC001OutQTC01;
    }

    public void setPhC001OutQTC01(PhC001OutQTC01 phC001OutQTC01) {
        this.phC001OutQTC01 = phC001OutQTC01;
    }

    @Override
    public String toString() {
        return "PhC001OutSublineQT{" +
                "subname='" + subname + '\'' +
                ", phC001OutQTC01=" + phC001OutQTC01 +
                '}';
    }
}
