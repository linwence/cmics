package com.el.cmic.service.goods;

import java.util.List;

import com.el.cmic.domain.goods.BalePrice;

public interface BalePriceService {
	
	/**
	 * 更新  FE8SPD04  更新   EV01
	 * @return
	 */
	public List<BalePrice> selectBalePrice();
	
	/**
	 * 更新  FE8SPD04  更新   EV01
	 * @return
	 */
	public Integer  updateEV01(String status,String co,String limt);
	
	
	/**
	 * 更新  FE8SPD04  更新   EV01   接口入口
	 */
	public void callBalePriceImplement();

}
