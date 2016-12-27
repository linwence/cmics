package com.el.cmic.service.record.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.PurchaseOut;
import com.el.cmic.domain.record.PurchaseOutDetail;
import com.el.cmic.mapper.record.PurchaseDetailMapper;
import com.el.cmic.service.record.PurchaseService;
/**
 * 采退出库复核记录推送
 * @author zhanhao
 *
 */
@Service
public class PurchaseServiceImpl implements  PurchaseService {

	
	@Autowired
	private PurchaseDetailMapper purchaseDetailMapper;
	
	
	/**
	 * 采退出库复核记录推送  insert
	 * @param purchaseOutDetail
	 * @return
	 */
	@Override
	@Transactional
	public Integer insertPurchaseDetail(PurchaseOutDetail purchaseOutDetail) {
		return purchaseDetailMapper.insertPurchaseDetail(purchaseOutDetail);
	}


	@Override
	@Transactional
	public WmsResult callInsertPurchaseDetail(String data) {
		WmsResult wmsResult = new WmsResult(true, "0000", "成功");
		PurchaseOut purchaseOut = JSON.parseObject(data, PurchaseOut.class);
		if(purchaseOut != null){
			for(PurchaseOutDetail purchaseOutDetail:purchaseOut.getPurchaseOutDetail()){
				this.insertPurchaseDetail(purchaseOutDetail);
			}
		}
		return wmsResult;
	}
}
