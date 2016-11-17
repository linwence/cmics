package com.el.cmic.common.service;

import com.el.cfg.domain.FE8WMS20;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.log.Fe8wmslg;

/**
 * Created by Vincent on 2016/10/28.
 */

public interface ValidParamService {
    WmsResult validData(String timestamp, String data, String sign);

    WmsResult validSign(FE8WMS20 fe8WMS20, String timestamp, String data, String sign);

    Fe8wmslg getLogInfo();
}
