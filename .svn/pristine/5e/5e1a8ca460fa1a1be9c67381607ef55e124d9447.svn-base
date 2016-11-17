package com.el.cmic.mapper.common;

import org.apache.ibatis.annotations.Select;

public interface DailySequenceMapper {
	@Select({ "select",
			"daily_sequence() as seq",
			"from dual" })
	public String selectDailySequence();

}