package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "codeinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhE001OutHeaderCodeInfo {
    List<PhE001OutHeaderCode> PhE001OutHeaderCodeList;

    @XmlElement(name = "code")
    public List<PhE001OutHeaderCode> getPhE001OutHeaderCodeList() {
        return PhE001OutHeaderCodeList;
    }


    public void setPhE001OutHeaderCodeList(List<PhE001OutHeaderCode> phE001OutHeaderCodeList) {
        PhE001OutHeaderCodeList = phE001OutHeaderCodeList;
    }

    @Override
    public String toString() {
        return "PhE001OutHeaderCodeInfo{" +
                "PhE001OutHeaderCodeList=" + PhE001OutHeaderCodeList +
                '}';
    }
}
