package com.el.cmic.service.validate;

import java.util.List;


import com.el.cfg.domain.FE8SPD00;

public interface FE8SPD00Service {

	List<FE8SPD00> selectAllFE8SPD00();
	
	FE8SPD00  selectByLsco( String lsco,String lsco01);
}
