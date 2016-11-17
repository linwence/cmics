package com.el.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
		
@Component
public class SpdConfigInfo {
	 @Value("${spd.timer}")
	 private String spdTimer;

	public String getSpdTimer() {
		return spdTimer;
	}

	public void setSpdTimer(String spdTimer) {
		this.spdTimer = spdTimer;
	}

	  
}
