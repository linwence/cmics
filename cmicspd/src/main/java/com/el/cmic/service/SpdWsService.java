package com.el.cmic.service;

import javax.jws.WebService;

/**
 * Created by Vincent on 2016/11/1.
 */
@WebService
public interface SpdWsService {
    public String UpLoadData(String appkey, String timestamp, String data, String sign, String ver);
}
