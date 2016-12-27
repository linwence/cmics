package com.el.cmic.service.record;

import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.TransportDetail;

public interface TransportService {
	
	public  Integer insertTranportDetaol(TransportDetail transportDetail );
	
	public WmsResult  callInsertTranportDetaol(String data);

}
