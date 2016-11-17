package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Vincent on 2016/10/11.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"isbgz", "isqyba", "isyyzz", "iszzjgdm", "isswdjz", "isxbyyzz","pk_dwxz"})
public class RqC001InputJks {
    private String isbgz;//<isbgz>是否有报关证</isbgz>
    private String isqyba;// <isqyba>是否有出入境检验检疫报检企业备案表</isqyba>
    private String isyyzz;// <isyyzz>是否有营业执照</isyyzz>
    private String iszzjgdm;// <iszzjgma>是否有组织机构代码</iszzjgma>
    private String isswdjz;// <isswdjz>是否有税务登记证</isswdjz>
    private String isxbyyzz;// <isxbyyzz>是否有新版营业执照</isxbyyzz>

    private  String pk_dwxz;

    public String getPk_dwxz() {
        return pk_dwxz;
    }

    public void setPk_dwxz(String pk_dwxz) {
        this.pk_dwxz = pk_dwxz;
    }

    public String getIsbgz() {
        return isbgz;
    }

    public void setIsbgz(String isbgz) {
        this.isbgz = isbgz;
    }

    public String getIsqyba() {
        return isqyba;
    }

    public void setIsqyba(String isqyba) {
        this.isqyba = isqyba;
    }

    public String getIsyyzz() {
        return isyyzz;
    }

    public void setIsyyzz(String isyyzz) {
        this.isyyzz = isyyzz;
    }

    public String getIszzjgdm() {
        return iszzjgdm;
    }

    public void setIszzjgdm(String iszzjgdm) {
        this.iszzjgdm = iszzjgdm;
    }

    public String getIsswdjz() {
        return isswdjz;
    }

    public void setIsswdjz(String isswdjz) {
        this.isswdjz = isswdjz;
    }

    public String getIsxbyyzz() {
        return isxbyyzz;
    }

    public void setIsxbyyzz(String isxbyyzz) {
        this.isxbyyzz = isxbyyzz;
    }
}
