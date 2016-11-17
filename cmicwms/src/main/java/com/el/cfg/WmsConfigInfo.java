package com.el.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Vincent on 2016/10/31.
 */
@Component
public class WmsConfigInfo {
    @Value("${wms.timer}")
    private String wmsTimer;

    public String getWmsTimer() {
        return wmsTimer;
    }

    public void setWmsTimer(String wmsTimer) {
        this.wmsTimer = wmsTimer;
    }
}
