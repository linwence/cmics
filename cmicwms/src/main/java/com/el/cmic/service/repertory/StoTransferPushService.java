package com.el.cmic.service.repertory;

import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.repertory.StroTransferPush;

public interface StoTransferPushService {
	public WmsResult acceptData(String data);
	public Integer insertSTPush(StroTransferPush stroTransferPush);
	
}
