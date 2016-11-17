package com.el.cmic.domain.customer;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

import java.util.Date;

/**
 * 证照  虚拟实体类  FE84101Z  ,FE80101Z
 *
 * @author zhanhao
 */
@JSONType(orders = {"证照类型", "证号", "发证日期", "证照有效自", "证照有效至"})
public class CustomLicence {

    /**
     * 证照类型 FE84101Z
     */
    //@JSONField(name = "证照类型")
    @JSONField(serialize = false)
    private String ZZE8ZZLX;
    //FE80101Z
    @JSONField(name = "证照类型")
    private String ZZE8ZZLXA;
    /**
     * 证号
     */
    @JSONField(name = "证号")
    private String ZZE8ZZBM;
    @JSONField(name = "发证日期", format = "yyyy-MM-dd")
    private Date grantDate;
    /**
     * 证照有效自
     */
    @JSONField(name = "证照有效自", format = "yyyy-MM-dd")
    private Date ZZEFTJ;
    /**
     * 证照有效至
     */
    @JSONField(name = "证照有效至", format = "yyyy-MM-dd")
    private Date ZZEXDJ;

    public String getZZE8ZZLX() {
        return ZZE8ZZLX;
    }

    public void setZZE8ZZLX(String ZZE8ZZLX) {
        this.ZZE8ZZLX = ZZE8ZZLX;
    }

    public String getZZE8ZZLXA() {
        return ZZE8ZZLXA;
    }

    public void setZZE8ZZLXA(String ZZE8ZZLXA) {
        this.ZZE8ZZLXA = ZZE8ZZLXA;
    }

    public String getZZE8ZZBM() {
        return ZZE8ZZBM;
    }

    public void setZZE8ZZBM(String ZZE8ZZBM) {
        this.ZZE8ZZBM = ZZE8ZZBM;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public Date getZZEFTJ() {
        return ZZEFTJ;
    }

    public void setZZEFTJ(Date ZZEFTJ) {
        this.ZZEFTJ = ZZEFTJ;
    }

    public Date getZZEXDJ() {
        return ZZEXDJ;
    }

    public void setZZEXDJ(Date ZZEXDJ) {
        this.ZZEXDJ = ZZEXDJ;
    }
}
