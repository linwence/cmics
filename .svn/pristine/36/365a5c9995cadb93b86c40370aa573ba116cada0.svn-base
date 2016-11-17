package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by king_ on 2016/11/1.
 */
@XmlRootElement(name = "subline")
@XmlType(propOrder ={"subname","rqE001InputAttachmentList"})
public class RqE001InputSubLineA {
    private String subname;
    private List<RqE001InputAttachment>  rqE001InputAttachmentList = new ArrayList<RqE001InputAttachment>();

    @XmlElement(name = "subname")
    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @XmlElement(name = "subcontent")
    public List<RqE001InputAttachment> getRqE001InputAttachmentList() {
        return rqE001InputAttachmentList;
    }

    public void setRqE001InputAttachmentList(List<RqE001InputAttachment> rqE001InputAttachmentList) {
        this.rqE001InputAttachmentList = rqE001InputAttachmentList;
    }
}
