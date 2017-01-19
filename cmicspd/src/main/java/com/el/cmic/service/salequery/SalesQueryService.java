package com.el.cmic.service.salequery;

import com.el.cmic.domain.query.Ve8spdF41021;
import com.el.cmic.domain.query.Ve8spdsales;

import java.util.List;

/**
 * Created by Vincent on 2017/1/19.
 */
public interface SalesQueryService {
    public List<Ve8spdsales> acceptData(String data);
}
