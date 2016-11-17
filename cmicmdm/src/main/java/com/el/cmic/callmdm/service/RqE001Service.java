package com.el.cmic.callmdm.service;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.Fe841001;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84101z;
import com.el.cmic.callmdm.domain.RqInputHeader;

/**
 * Created by Vincent on 2016/10/9.
 */
public interface RqE001Service {
    int updateFe84101(Fe84101 fe84101);

    public int updateF4101(F4101 f4101);
    public int updateFe841001(Fe841001 fe841001);
    public int updateFe84101Z(Fe84101z fe84101z);
    public int selectP(String zzlitm,String schema);
}
