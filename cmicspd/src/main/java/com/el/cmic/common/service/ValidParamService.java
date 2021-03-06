package com.el.cmic.common.service;

import com.el.cmic.common.domain.Fe8spdlg;
import com.el.cmic.common.domain.SpdResult;
import com.el.cmic.common.domain.Ve8spd0099;

/**
 * Created by Vincent on 2016/10/28.
 */

public interface ValidParamService {
    SpdResult validData(String timestamp, String data, String sign);

    SpdResult validSign(Ve8spd0099 ve8spd0099, String timestamp, String data, String sign);

    Fe8spdlg getLogInfo();
}
