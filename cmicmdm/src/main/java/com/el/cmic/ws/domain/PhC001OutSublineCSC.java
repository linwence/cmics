package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhC001OutSublineCSC {
    private String subname;
    private List<PhC001OutCSCC01> phC001OutCSCC01List;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public List<PhC001OutCSCC01> getPhC001OutCSCC01List() {
        return phC001OutCSCC01List;
    }

    public void setPhC001OutCSCC01List(List<PhC001OutCSCC01> phC001OutCSCC01List) {
        this.phC001OutCSCC01List = phC001OutCSCC01List;
    }

    @Override
    public String toString() {
        return "PhC001OutSublineCSC{" +
                "subname='" + subname + '\'' +
                ", phC001OutCSCC01List=" + phC001OutCSCC01List +
                '}';
    }
}
