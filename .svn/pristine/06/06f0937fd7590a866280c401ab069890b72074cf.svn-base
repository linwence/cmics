package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhE001OutsublineB {
    private String subname;
    private List<PhE001OutBE01> phE001OutBE01List;

    @XmlElement(name = "subcontent")
    public List<PhE001OutBE01> getPhE001OutBE01List() {
        return phE001OutBE01List;
    }

    public void setPhE001OutBE01List(List<PhE001OutBE01> phE001OutBE01List) {
        this.phE001OutBE01List = phE001OutBE01List;
    }

    @XmlElement(name = "subname")
    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @Override
    public String toString() {
        return "PhE001OutsublineB{" +
                "subname='" + subname + '\'' +
                ", phE001OutBE01List=" + phE001OutBE01List +
                '}';
    }
}
