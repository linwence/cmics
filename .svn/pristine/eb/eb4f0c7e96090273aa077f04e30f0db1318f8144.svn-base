package com.el.cmic.mapper.repertory;

import org.apache.ibatis.annotations.Select;

import com.el.cfg.domain.FE8WMS21;

public interface FE21Mapper {
	
	@Select("select * from FE8WMS21   where LSE8WLZXID =${value} ")
	public FE8WMS21 selectFE8WMS21ByMcu(String mcu);

}
