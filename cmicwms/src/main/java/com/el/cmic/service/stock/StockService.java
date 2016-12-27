package com.el.cmic.service.stock;

import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.stock.StockDetail;

public interface StockService {
	
	/**
	 * 销退入库验收推送
	 * @param conserveDetail
	 * @return
	 */
	public  Integer  insertStockDetail(StockDetail stockDetail );
	
	public WmsResult   callInsertConserveDatail(String data);
}
