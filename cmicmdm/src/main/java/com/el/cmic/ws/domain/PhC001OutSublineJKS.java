package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhC001OutSublineJKS {
    private String subname;
    private List<PhC001OutJKSC01> phC001OutJKSC01List;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public List<PhC001OutJKSC01> getPhC001OutJKSC01List() {
        return phC001OutJKSC01List;
    }

    public void setPhC001OutJKSC01List(List<PhC001OutJKSC01> phC001OutJKSC01List) {
        this.phC001OutJKSC01List = phC001OutJKSC01List;
    }

    @Override
    public String toString() {
        return "PhC001OutSublineJKS{" +
                "subname='" + subname + '\'' +
                ", phC001OutJKSC01List=" + phC001OutJKSC01List +
                '}';
    }
}
