package com.el.cmic.service.record.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.ConserveDetail;
import com.el.cmic.domain.record.Conserver;
import com.el.cmic.mapper.record.ConserveDetailMapper;
import com.el.cmic.service.record.ConserveService;

/**
 * 养护记录推送  jde提供服务
 */
@Service
public class ConserveServiceImpl implements ConserveService{

	@Autowired
	private ConserveDetailMapper conserveDetailMapper;
	
	@Override
	@Transactional
	public Integer insertConserveDetail(ConserveDetail conserveDetail) {
		return conserveDetailMapper.insertConserveDetail(conserveDetail);
	}

	@Override
	@Transactional
	public WmsResult callInsertConserveDetail(String data) {
		 WmsResult wmsResult = new WmsResult(true, "0000", "成功");
		 Conserver conserver = JSON.parseObject(data, Conserver.class);
		 System.out.println(data);
		 System.out.println(conserver);
		 if(conserver != null){
			 for(ConserveDetail conserveDetail:conserver.getConserveDetail()){
				 this.insertConserveDetail(conserveDetail);
			 }
		 }
		return wmsResult;
	}

}
