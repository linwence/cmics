/**
 * 
 */
package com.el.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.el.cmic.mapper.common.DailySequenceMapper;

/**
 * @author ELSIAN
 *
 */
@Component
public class DailySequence {
	// AtomicInteger i;

	@Autowired
	DailySequenceMapper dailySequenceMapper;
	
	public String next() {
		return dailySequenceMapper.selectDailySequence();
	}
}
