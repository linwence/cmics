package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhC001OutSublineB {
    private String subname;
    private List<PhC001OutBC01> phC001OutBC01List;

    @XmlElement( name = "subname")
    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public List<PhC001OutBC01> getPhC001OutBC01List() {
        return phC001OutBC01List;
    }

    public void setPhC001OutBC01List(List<PhC001OutBC01> phC001OutBC01List) {
        this.phC001OutBC01List = phC001OutBC01List;
    }

    @Override
    public String toString() {
        return "PhC001OutSublineB{" +
                "subname='" + subname + '\'' +
                ", phC001OutBC01List=" + phC001OutBC01List +
                '}';
    }
}
