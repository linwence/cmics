package com.el.cmic.service.record;

import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.PurchaseOutDetail;

public interface PurchaseService {
	
	public Integer  insertPurchaseDetail(PurchaseOutDetail purchaseOutDetail);
	
	public WmsResult   callInsertPurchaseDetail(String data);

}
