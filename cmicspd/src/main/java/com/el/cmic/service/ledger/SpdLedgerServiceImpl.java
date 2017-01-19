package com.el.cmic.service.ledger;

import com.alibaba.fastjson.JSON;
import com.el.cmic.domain.query.LedgerQryCondition;
import com.el.cmic.domain.query.Ve8spdf4111;
import com.el.cmic.mapper.query.Ve8spdf4111Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 应急库分类账查询
 * Created by Vincent on 2017/1/17.
 */
@Service
public class SpdLedgerServiceImpl implements SpdLedgerService {
    @Autowired
    private Ve8spdf4111Mapper ve8spdf4111Mapper;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Ve8spdf4111> acceptData(String data) {
        LedgerQryCondition ledgerQryCondition = JSON.parseObject(data, LedgerQryCondition.class);
        List<Ve8spdf4111> ve8spdf4111List = ve8spdf4111Mapper.selectF4111(ledgerQryCondition);
        return ve8spdf4111List;
    }
}
