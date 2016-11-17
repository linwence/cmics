package com.el.test;


import org.junit.After;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.orderback.SpdOrderBackService;

public class TestSpdOrderBackServiceImpl {
	private ClassPathXmlApplicationContext context;
	
	@org.junit.Before
	public void testBefore(){
		context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
	}
	
	@After
	public void testAfter(){
		 context.close();
	}
	@Test
	public void test() {
		SpdOrderBackService spdOrderBackService = (SpdOrderBackService)context.getBean("spdOrderBackServiceImpl");
		spdOrderBackService.CallSpdOrderBackInterface();
	}

}
