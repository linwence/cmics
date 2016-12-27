package com.el.cmic.domain.stock;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 销退入库验收推送
 * @author zhanhao
 *
 */
public class Stock {

	@JSONField(name="明细")
	public List<StockDetail>  stockDetail;

	public List<StockDetail> getStockDetail() {
		return stockDetail;
	}

	public void setStockDetail(List<StockDetail> stockDetail) {
		this.stockDetail = stockDetail;
	}

	@Override
	public String toString() {
		return "Stock [stockDetail=" + stockDetail + ", getStockDetail()="
				+ getStockDetail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
