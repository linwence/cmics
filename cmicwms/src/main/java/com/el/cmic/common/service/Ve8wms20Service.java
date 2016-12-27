package com.el.cmic.common.service;

import com.el.cfg.domain.Ve8wms20;

import java.util.List;

/**
 * Created by Vincent on 2016/11/25.
 */
public interface Ve8wms20Service {
    public List<Ve8wms20> selectVe8wms20ByKcoo(String kcoo);
    public List<Ve8wms20> selectAllVe8wms20();
    List<Ve8wms20> selectVe8wms20ByWmsCo(String wmsCo,String logiticsCenterID);
}
