package com.el.cmic.timetask;

import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.el.cmic.service.department.DepartmentDataService;
import com.el.cmic.service.supplier.SupplierService;
import com.el.utils.DateUtil;

@Component
public class SpdTimeTask extends TimerTask{

	@Autowired
	private DepartmentDataService departmentDataService;
	
	@Autowired
	private SupplierService supplierService;
	@Override
	public void run() {
		//部门基础数据推送（
		//departmentDataService.callSpdDepartmentInterface();
		
		//supplierService.callSupplierInterface();
		String timestamp = DateUtil.getTimeStamp();
		System.out.println(timestamp);
	}

}
