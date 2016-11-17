package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "subline")
public class PhC001OutSublineYY {
    private String subname;
    private List<PhC001OutYYC01> phC001OutSublineYYList;

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement( name = "subcontent")
    public List<PhC001OutYYC01> getPhC001OutSublineYYList() {
        return phC001OutSublineYYList;
    }

    public void setPhC001OutSublineYYList(List<PhC001OutYYC01> phC001OutSublineYYList) {
        this.phC001OutSublineYYList = phC001OutSublineYYList;
    }

    @Override
    public String toString() {
        return "PhC001OutSublineYY{" +
                "subname='" + subname + '\'' +
                ", phC001OutSublineYYList=" + phC001OutSublineYYList +
                '}';
    }
}
