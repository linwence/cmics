package com.el.cmic.service.goods.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.cmic.common.SpdInterfaceType;
import com.el.cmic.common.domain.SpdData;
import com.el.cmic.common.domain.SpdRequest;
import com.el.cmic.common.domain.SpdResult;
import com.el.cmic.domain.goods.Bale;
import com.el.cmic.mapper.goods.BaleMapepr;
import com.el.cmic.service.goods.BaleService;
import com.el.utils.AddSpaceUtil;
import com.el.utils.SpdClientService;

@Service
public class BaleServiceImpl implements BaleService{

	Logger logger = Logger.getLogger(BaleServiceImpl.class);
	@Autowired
	private BaleMapepr  baleMapepr;
	
	@Value("${spd.ID}")
	private String spdId;
	
	@Resource(name="spdRequest")
	private SpdRequest spdRequest;
	
	@Resource(name="spdClientService")
	private SpdClientService spdClientService;
	/**
	 * 商品基础数据推送  查询list
	 * @return
	 */
	@Override
	public List<Bale> selectBales() {
		return baleMapepr.selectBales();
	}

	/**
	 * FE8SPD01 EV01  更新状态
	 * @return
	 */
	@Override
	@Transactional
	public Integer updateEv01(String status,String spitm) {
		return baleMapepr.updateEv01(status, spitm);
	}

	
	/**
	 * 商品基础数据推送   入口
	 */
	@Override
	public void callBaleInterface() {
		List<Bale> baleList = new ArrayList<Bale>();
		baleList=this.selectBales();
		for(Bale bale : baleList){
			SpdData spdData = new SpdData(SpdInterfaceType.BALE_TYPE,spdId,bale,"明细");
			//生成data数据
			String data = spdData.toJson();
			System.out.println(data);
			//调用webservice提供的接口（
			SpdResult spdResult=spdClientService.callSpdWebService(data);
			System.out.print("接口测试结果:");
			System.out.println(spdResult);
			afterResponse(bale,spdResult);
		}
	}
	
	public void afterResponse(Bale bale,SpdResult spdResult){
		 String status = "Y";
		 //接口调用不成功  更新状态
		if(!spdResult.isSuccess()){
			status="E";
		}
		updateEv01(status,AddSpaceUtil.addSpanceRight(bale.getLitm(), 25));
	}

}
