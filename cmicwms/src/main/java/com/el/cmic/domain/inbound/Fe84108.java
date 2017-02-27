package com.el.cmic.domain.inbound;

import org.springframework.util.StringUtils;

/**
 * Created by Vincent on 2017/2/22.
 */
public class Fe84108 {
    private String dl01;

    private String dl03;

    private String lrp1;

    private Integer an81;
    private String omcu;

    public String getDl01() {
        return dl01;
    }

    public void setDl01(String dl01) {
        if(StringUtils.isEmpty(dl01)){
            dl01=" ";
        }
        this.dl01 = dl01;
    }

    public String getDl03() {
        return dl03;
    }

    public void setDl03(String dl03) {
        if(StringUtils.isEmpty(dl03)){
            dl03=" ";
        }
        this.dl03 = dl03;
    }

    public String getLrp1() {
        return lrp1;
    }

    public void setLrp1(String lrp1) {
        if(StringUtils.isEmpty(lrp1)){
            lrp1=" ";
        }
        this.lrp1 = lrp1;
    }

    public Integer getAn81() {
        return an81;
    }

    public void setAn81(Integer an81) {
        this.an81 = an81;
    }

    public String getOmcu() {
        return omcu;
    }

    public void setOmcu(String omcu) {
        if(StringUtils.isEmpty(omcu)){
            omcu=" ";
        }
        this.omcu = omcu;
    }
}
