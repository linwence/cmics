package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhC001OutSublineJXS {
    private String subname;
    private List<PhC001OutJXSC01> phC001OutJXSC01List;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public List<PhC001OutJXSC01> getPhC001OutJXSC01List() {
        return phC001OutJXSC01List;
    }

    public void setPhC001OutJXSC01List(List<PhC001OutJXSC01> phC001OutJXSC01List) {
        this.phC001OutJXSC01List = phC001OutJXSC01List;
    }

    @Override
    public String toString() {
        return "PhC001OutSublineJXS{" +
                "subname='" + subname + '\'' +
                ", phC001OutJXSC01List=" + phC001OutJXSC01List +
                '}';
    }
}
