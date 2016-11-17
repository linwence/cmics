package com.el.cmic.service.department;

import java.util.List;

import com.el.cmic.domain.department.DepartmentData;

public interface DepartmentDataService {
	

	/**
	 * 部门基础数据推送  查询list
	 * @return
	 */
	public List<DepartmentData>  selectDepartmentDatas();
	
	/**
	 * 更新状态  FE8SPD02.EV01
	 * @param status
	 */
	public void updateEv01(String status,String bmmcu,String bmco);
	
	
	/**
	 * 调用部门基础数据推送  接口
	 */
	public void callSpdDepartmentInterface();

}
