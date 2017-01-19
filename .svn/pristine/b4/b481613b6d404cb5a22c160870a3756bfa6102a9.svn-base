package com.el.cmic.service.stockquery;

import com.alibaba.fastjson.JSON;
import com.el.cmic.domain.query.StockQryCondition;
import com.el.cmic.domain.query.Ve8spdF41021;
import com.el.cmic.mapper.query.Ve8spdF41021Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 应急库库存查询
 * Created by Vincent on 2017/1/18.
 */
@Service
public class StockQueryServiceImpl implements StockQueryService {
    @Autowired
    private Ve8spdF41021Mapper ve8spdF41021Mapper;

    @Override
    @Transactional
    public List<Ve8spdF41021> acceptData(String data) {
        StockQryCondition stockQryCondition = JSON.parseObject(data, StockQryCondition.class);
        List<Ve8spdF41021> ve8spdF41021List = ve8spdF41021Mapper.selectByCondition(stockQryCondition);
        return ve8spdF41021List;
    }
}
