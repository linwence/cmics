package com.el.cmic.service.validate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.el.cfg.domain.FE8SPD00;
import com.el.cmic.mapper.validate.FE8SPD00Mapper;

@Service
public class FE8SPD00ServiceImpl implements FE8SPD00Service{
	
	@Autowired
	private FE8SPD00Mapper  fE8SPD00Mapper;

	@Override
	public List<FE8SPD00> selectAllFE8SPD00() {
		return fE8SPD00Mapper.selectAllFE8SPD00();
	}

	@Override
	public FE8SPD00 selectByLsco(String lsco, String lsco01) {
		return fE8SPD00Mapper.selectByLsco(lsco, lsco01);
	}

}
