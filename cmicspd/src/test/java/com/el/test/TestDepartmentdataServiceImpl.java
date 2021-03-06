package com.el.test;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.department.DepartmentDataService;

/**
 * Created by Vincent on 2016/11/1.
 */
public class TestDepartmentdataServiceImpl extends TestCase{
    private ClassPathXmlApplicationContext context;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        context.close();
    }
    public  void testCallWmsCustomInterface(){
    	DepartmentDataService departmentDataService = (DepartmentDataService)context.getBean("departmentDataServiceImpl");
    	departmentDataService.callSpdDepartmentInterface();
    }
    
}
