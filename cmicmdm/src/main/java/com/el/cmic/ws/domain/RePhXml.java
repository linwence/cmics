package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by king_ on 2016/9/22.
 */
@XmlRootElement(name = "xml")
public class RePhXml {
    private RePhXmlHeader rePhXmlHeader;

    @XmlElement(name = "header")
    public RePhXmlHeader getRePhXmlHeader() {
        return rePhXmlHeader;
    }

    public void setRePhXmlHeader(RePhXmlHeader rePhXmlHeader) {
        this.rePhXmlHeader = rePhXmlHeader;
    }

    @Override
    public String toString() {
        return "RePhXml{" +
                "rePhXmlHeader=" + rePhXmlHeader +
                '}';
    }
}
