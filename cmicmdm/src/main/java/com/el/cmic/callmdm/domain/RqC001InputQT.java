package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"pk_dwxz"})
public class RqC001InputQT {
    private String pk_dwxz;

    public String getPk_dwxz() {
        return pk_dwxz;
    }

    public void setPk_dwxz(String pk_dwxz) {
        this.pk_dwxz = pk_dwxz;
    }
}
