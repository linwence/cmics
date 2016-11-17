package com.el.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Vincent on 2016/10/20.
 */
@Component("mdmConfigInfo")
public class MdmConfigInfo {
    @Value("${mdm.timer}")
    private String mdmTimer;

    public String getMdmTimer() {
        return mdmTimer;
    }

    public void setMdmTimer(String mdmTimer) {
        this.mdmTimer = mdmTimer;
    }
}
