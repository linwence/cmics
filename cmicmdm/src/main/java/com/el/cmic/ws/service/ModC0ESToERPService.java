package com.el.cmic.ws.service;

import com.el.cmic.ws.domain.PhE001OutHeader;

import java.math.BigDecimal;

/**
 * Created by king_ on 2016/10/13.
 */
public interface ModC0ESToERPService {
    public String updateFE841003(BigDecimal Doco, String EorS);
    public String updateFE80101(BigDecimal ukid,BigDecimal an8);
    String updateModC(BigDecimal Doco, String EorS, BigDecimal an8, PhE001OutHeader phE001OutHeader);
}
