package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlRootElement(name = "main")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhE004OutMain {
    private String productcode;
    private String servicename;

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    @Override
    public String toString() {
        return "PhE004OutMain{" +
                "productcode='" + productcode + '\'' +
                ", servicename='" + servicename + '\'' +
                '}';
    }
}
