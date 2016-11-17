package com.el.cmic.callmdm.service;

import com.el.cfg.domain.Fe8log01;

/**
 * Created by Vincent on 2016/10/9.
 */
public interface Fe8Log01Service {
    public final String INTER_ACTIVE_REQUEST="Request";
    public final String INTER_ACTIVE_RESPONSE="Response";
    int insert(Fe8log01 fe8Log01);

    int saveFe8Log01(String interActiveType,String code, String dataType, String data, String logType, String funcType,String msg);
}
