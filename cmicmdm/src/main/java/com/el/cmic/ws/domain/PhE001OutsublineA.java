package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhE001OutsublineA {
    private String subname;
    private List<PhE001OutAE01> phE001OutAE01List;

    @XmlElement( name = "subname")
    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public List<PhE001OutAE01> getPhE001OutAE01List() {
        return phE001OutAE01List;
    }

    public void setPhE001OutAE01List(List<PhE001OutAE01> phE001OutAE01List) {
        this.phE001OutAE01List = phE001OutAE01List;
    }

    @Override
    public String toString() {
        return "PhE001OutsublineA{" +
                "subname='" + subname + '\'' +
                ", phE001OutAE01List=" + phE001OutAE01List +
                '}';
    }
}
