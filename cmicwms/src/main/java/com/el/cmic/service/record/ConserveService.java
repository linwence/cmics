package com.el.cmic.service.record;

import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.ConserveDetail;

public interface ConserveService {
	
	public Integer  insertConserveDetail(ConserveDetail conserveDetail );
	
	public WmsResult callInsertConserveDetail(String data) ;

}
