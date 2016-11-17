package com.el.cmic.service.supplier;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.el.cmic.domain.supplier.Supplier;

public interface SupplierService {

	/**
	 * 供应商数据推送  查询list
	 * @return
	 */
	public List<Supplier>  selectSupplier();
	
	
	/**
	 * FE8SPD03 EV01  更新状态
	 * @return
	 */
	public Integer  updateEv01(String status,String span8, String spco);
	
	
	/**
	 * 供应商数据推送    接口调用 入口
	 */
	public void callSupplierInterface();
}
