package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"idcard"})
public class RqC001InputGR {
   private String idcard;// <idcard>身份证</idcard>
}
