package com.el.cmic.common.service;

import com.el.cmic.common.domain.SpdResult;

/**
 * Created by Vincent on 2016/10/28.
 */

public interface ValidParamService {
    SpdResult validData(String timestamp, String data, String sign);

    SpdResult validSign(String timestamp, String data, String sign);

    //Fe8wmslg getLogInfo();
}
