package com.el.cmic.service.record.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.OutCheck;
import com.el.cmic.domain.record.OutCheckDetial;
import com.el.cmic.mapper.record.OutCheckDetailMapper;
import com.el.cmic.service.record.OutCheckService;

/**
 * 出库复核记录推送  jde  提供服务
 * @author zhanhao
 *
 */
@Service
public class OutCheckServiceImpl implements OutCheckService{

	@Autowired
	private OutCheckDetailMapper outCheckDetailMapper;
	
	/**
	 * 出库复核记录推送   insert
	 */
	@Override
	@Transactional
	public Integer insertOutCheck(OutCheckDetial outCheckDetial) {
		return outCheckDetailMapper.insertOutCheck(outCheckDetial);
	}

	@Override
	@Transactional
	public WmsResult callInsertOutCheck(String data) {
		 WmsResult wmsResult = new WmsResult(true, "0000", "成功");
		 System.out.println(data);
		 OutCheck outCheck = JSON.parseObject(data, OutCheck.class);
		 System.out.println(outCheck);
		 if(outCheck != null){
			 for(OutCheckDetial outCheckDetial:outCheck.getOutCheckDetial()){
				 this.insertOutCheck(outCheckDetial);
			 }
		 }
		return wmsResult;
	}
}
