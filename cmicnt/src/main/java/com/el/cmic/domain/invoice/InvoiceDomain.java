package com.el.cmic.domain.invoice;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

import java.util.Date;

/**
 * Created by Vincent on 2017/2/21.
 */
@JSONType(orders = {"doc", "ntdoc", "invnum", "dl01", "dl02", "indate", "redate"})
public class InvoiceDomain {
    @JSONField(name = "doc")
    private String doc;//申请号码
    @JSONField(name = "ntdoc")
    private String ntdoc;//纳通申请号码

    @JSONField(name = "invnum")
    private String invnum;//发票号
    @JSONField(name = "dl01")
    private String dl01;//说明
    @JSONField(name = "dl02")
    private String dl02;//说明02
    @JSONField(name = "indate", format = "yyyy-MM-dd HH:mm:ss")
    private Date indate;//创建日期时间
    @JSONField(name = "redate", format = "yyyy-MM-dd HH:mm:ss")
    private Date redate;//更新日期时间

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNtdoc() {
        return ntdoc;
    }

    public void setNtdoc(String ntdoc) {
        this.ntdoc = ntdoc;
    }

    public String getInvnum() {
        return invnum;
    }

    public void setInvnum(String invnum) {
        this.invnum = invnum;
    }

    public String getDl01() {
        return dl01;
    }

    public void setDl01(String dl01) {
        this.dl01 = dl01;
    }

    public String getDl02() {
        return dl02;
    }

    public void setDl02(String dl02) {
        this.dl02 = dl02;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Date getRedate() {
        return redate;
    }

    public void setRedate(Date redate) {
        this.redate = redate;
    }
}
