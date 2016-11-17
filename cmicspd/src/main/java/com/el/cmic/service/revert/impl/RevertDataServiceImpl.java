package com.el.cmic.service.revert.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.SpdResult;
import com.el.cmic.domain.revert.RevertData;
import com.el.cmic.domain.revert.RevertDataDetail;
import com.el.cmic.mapper.revert.RevertDataMapper;
import com.el.cmic.service.revert.RevertDataDetailService;
import com.el.cmic.service.revert.RevertDataService;

@Service
public class RevertDataServiceImpl implements RevertDataService{

	@Autowired
	private RevertDataMapper revertDataMapper;
	
	@Autowired
    private RevertDataDetailService  revertDataDetailService;
	
	
	
	/**
	 * SPD请退数据接收  主数据  新增
	 * @param revertData
	 * @return
	 */
	@Override
	@Transactional
	public Integer insertRevertData(RevertData revertData) {
		return revertDataMapper.insertRevertData(revertData);
	}
	
	
	
	
	/**
	 * SPD请退数据接收  接口  入口
	 * @param data
	 * @return
	 */
	@Override
	@Transactional
	public SpdResult  callInsertRevertData(String data){
		SpdResult spdResult = new SpdResult(true, "0000", "成功");
		RevertData revertData = JSON.parseObject(data, RevertData.class);
		this.insertRevertData(revertData);
		int rlln =1;
		for(RevertDataDetail revertDataDetail:revertData.getListRevertDataDetail()){
			revertDataDetail.setQmukid(revertData.getQtukid());
			revertDataDetail.setQmrlln(new BigDecimal(rlln));
			revertDataDetail.setQmev01(revertData.getQtev01());
			revertDataDetailService.insertRevertDataDetail(revertDataDetail);
			rlln++;
		}
		return spdResult;
	}

}
