package com.el.cmic.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Created by king_ on 2016/9/21.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PhE001OutHeaderCode {
    private String codetype;
    private String codevalue;

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    public String getCodevalue() {
        return codevalue;
    }

    public void setCodevalue(String codevalue) {
        this.codevalue = codevalue;
    }

    @Override
    public String toString() {
        return "PhE001OutHeaderCode{" +
                "codetype='" + codetype + '\'' +
                ", codevalue='" + codevalue + '\'' +
                '}';
    }
}
