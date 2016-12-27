package com.el.cmic.service.record.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.InputCheck;
import com.el.cmic.domain.record.InputCheckDetail;
import com.el.cmic.mapper.record.InputCheckMapper;
import com.el.cmic.service.record.InputCheckService;

/**
 * 入库验收记录推送
 * @author zhanhao
 *
 */
@Service
public class InputCheckServiceImpl implements InputCheckService{

	@Autowired
	private InputCheckMapper inputCheckMapper;
	
	@Override
	@Transactional
	public Integer insertInputCheck(InputCheckDetail inputCheckDetail) {
		return inputCheckMapper.insertInputCheck(inputCheckDetail);
	}

	@Override
	@Transactional
	public WmsResult callInsertInputCheck(String data) {
		WmsResult wmsResult = new WmsResult(true, "0000", "成功");
		InputCheck inputCheck = JSON.parseObject(data, InputCheck.class);
		if(inputCheck != null){
			for(InputCheckDetail  inputCheckDetail:inputCheck.getInputCheckDetail()){
				this.insertInputCheck(inputCheckDetail);
			}
		}
		return wmsResult;
	}

}
