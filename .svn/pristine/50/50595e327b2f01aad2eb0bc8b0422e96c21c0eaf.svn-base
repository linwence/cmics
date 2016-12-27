package com.el.cmic.common.service;

import com.el.cfg.domain.Ve8wms20;
import com.el.cmic.common.mapper.V20Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vincent on 2016/11/25.
 */
@Service
public class Ve8wms20ServiceImpl implements Ve8wms20Service {
    @Autowired
    private V20Mapper v20Mapper;

    @Override
    public List<Ve8wms20> selectVe8wms20ByKcoo(String kcoo) {
        return v20Mapper.selectVe8wms20ByKcoo(kcoo);
    }

    @Override
    public List<Ve8wms20> selectAllVe8wms20() {
        return v20Mapper.selectAllVe8wms20();
    }

    @Override
    public List<Ve8wms20> selectVe8wms20ByWmsCo(String wmsCo,String logiticsCenterID) {
        return v20Mapper.selectVe8wms20ByWmsCo(wmsCo,logiticsCenterID);
    }
}
