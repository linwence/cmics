package com.el.cmic.service.salequery;

import com.alibaba.fastjson.JSON;
import com.el.cmic.domain.query.SaleQryCondition;
import com.el.cmic.domain.query.Ve8spdsales;
import com.el.cmic.mapper.query.Ve8spdsalesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**商品销售明细查询
 * Created by Vincent on 2017/1/19.
 */
@Service
public class SalesQueryServiceImpl implements SalesQueryService {
    @Autowired
    private Ve8spdsalesMapper ve8spdsalesMapper;

    @Override
    @Transactional
    public List<Ve8spdsales> acceptData(String data) {
        SaleQryCondition saleQryCondition = JSON.parseObject(data, SaleQryCondition.class);
        List<Ve8spdsales> ve8spdsalesList = ve8spdsalesMapper.selectSalesByCondition(saleQryCondition);
        return ve8spdsalesList;
    }
}
