package com.el.cmic.domain.record;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 采退出库复核记录推送
 * @author zhanhao
 *
 */
public class PurchaseOut {

	@JSONField(name="明细")
	public List<PurchaseOutDetail> purchaseOutDetail;

	public List<PurchaseOutDetail> getPurchaseOutDetail() {
		return purchaseOutDetail;
	}

	public void setPurchaseOutDetail(List<PurchaseOutDetail> purchaseOutDetail) {
		this.purchaseOutDetail = purchaseOutDetail;
	}

	@Override
	public String toString() {
		return "PurchaseOut [purchaseOutDetail=" + purchaseOutDetail + "]";
	}
	
	
}
