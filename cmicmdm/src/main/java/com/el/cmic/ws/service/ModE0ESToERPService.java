package com.el.cmic.ws.service;



import com.el.cmic.ws.domain.PhE001OutHeader;

import java.math.BigDecimal;

/**
 * Created by king_ on 2016/10/11.
 */
public interface ModE0ESToERPService {
    public String updateFE841001(BigDecimal Doco,String EorS,String no);
    public String updateModE(BigDecimal Doco,String EorS,String no,PhE001OutHeader phE001OutHeader);
    public String insertFE84202B(BigDecimal Doco, String EorS, String no, PhE001OutHeader phE001OutHeader);
}
