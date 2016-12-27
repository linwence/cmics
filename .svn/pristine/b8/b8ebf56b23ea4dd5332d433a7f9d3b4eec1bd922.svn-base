package com.el.cmic.account;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.account.AccountItemService;


public class TestAccount {
	 private ClassPathXmlApplicationContext context;
	private String data;
	
	@Before
	public void TestBefore(){
		System.out.println("dsf");
		context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		 data ="{"
						+"\"明细\":["
								+"{"+"\"物流中心\":1,"
								+"\"货主\":\"01001\","
								+"\"货品编号\":\"0100132\","
								+"\"货品名称\":\"阿莫西林胶囊\","
								+"\"批号\":\"2016070148939\","
								+"\"数量\":50"
								+"},"
								+"{"
								+"\"物流中心\":8,"
								+"\"货主\":\"01091\","
								+"\"货品编号\":\"0200572\","
								+"\"货品名称\":\"感冒灵胶囊\","
								+"\"批号\":\"2016030087733\","
								+"\"数量\":21"
								+"}"
						+"]"
						+"}";
}
	@Test
	public void TestBody(){
		AccountItemService accountItemServiceImpl = (AccountItemService)context.getBean("accountItemServiceImpl");
		accountItemServiceImpl.callInsertAccount(data);
	}
}
