package com.el.cmic.service.record.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.record.Transport;
import com.el.cmic.domain.record.TransportDetail;
import com.el.cmic.mapper.record.TransportDetailMapper;
import com.el.cmic.service.record.TransportService;

/**
 * 运输记录推送  jde提供服务
 * @author zhanhao
 *
 */
@Service
public class TransportServiceImpl implements TransportService{

	@Autowired
	private TransportDetailMapper transportDetailMapper;
	
	@Override
	@Transactional
	public Integer insertTranportDetaol(TransportDetail transportDetail) {
		return transportDetailMapper.insertTranportDetaol(transportDetail);
	}

	@Override
	@Transactional
	public WmsResult callInsertTranportDetaol(String data) {
		WmsResult wmsResult = new WmsResult(true, "0000", "成功");
		Transport transport = JSON.parseObject(data, Transport.class);
		System.out.println(data);
		System.out.println(transport);
		if(transport != null){
			for(TransportDetail transportDetail:transport.getTransportDetail()){
				this.insertTranportDetaol(transportDetail);
			}
		}
		return wmsResult;
	}
}
