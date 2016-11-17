package com.el.cmic.ws.service;

import com.el.cfg.domain.Fe8log02;
import com.el.cmic.ws.domain.PhE001OutHeader;

/**
 * Created by king_ on 2016/10/20.
 */
public interface Log02Service {
    public String writelog02(PhE001OutHeader phE001OutHeader,String no,String info,String ES,String reqno);
}
