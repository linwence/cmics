package com.el.cmic.service.repertory.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.el.cfg.domain.FE8WMS21;
import com.el.cmic.mapper.repertory.FE21Mapper;
import com.el.cmic.service.repertory.FE8WMS21Service;

@Service
public class FE8WMS21ServiceImpl implements FE8WMS21Service{

	@Autowired
	public FE21Mapper  fE21Mapper;
	
	@Override
	public FE8WMS21 selectFE8WMS21ByMcu(String mcu) {
		return fE21Mapper.selectFE8WMS21ByMcu(mcu);
	}

}
