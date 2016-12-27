package com.el.cmic.record;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.record.OutCheckService;

public class TestOutCheck {

	private ClassPathXmlApplicationContext  context;
	
	private String data;
	@Before
	public void TestBefore(){
		context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		data="{"+"\"明细\":["
							+"{\"物流中心\":6,"
							+"\"货主\":\"01001\","
							+"\"通知单号\":1,"
							+"\"复核单号\":\"22222\","
							+"\"复核日期\":\"2012-09-08\","
							+"\"客户编号\":\"222\","
							+"\"客户名称\":\"222\","
							+"\"货品编号\":\"0100132\","
							+"\"货品名称\":\"阿莫西林胶囊\","
							+"\"批号\":\"2016070148939\","
							+"\"灭菌批号\":\"2\","
							+"\"有效期至\":\"2012-09-08\","
							+"\"生产日期\":\"2012-09-08\"," 
							+"\"复核数量\":50,"
							+"\"单位\":\"2\","
							+"\"复核结论\":\"2\","
							+"\"地址\":\"1\","
							+"\"电话\":\"1\","
							+"\"复核员\":\"1\","
							+"\"业务员\":\"2\","
							+"\"通用名\":\"2\","
							+"\"剂型\":\"2\","
							+"\"规格\":\"2\","
							+"\"产地\":\"q\","
							+"\"批准文号\":\"\","
							+"\"生产厂商\":\"\""
						+"},"
						+"{\"物流中心\":7,"
						+"\"货主\":\"01001\","
						+"\"通知单号\":1,"
						+"\"复核单号\":\"22222\","
						+"\"复核日期\":\"2012-09-08\","
						+"\"客户编号\":\"222\","
						+"\"客户名称\":\"222\","
						+"\"货品编号\":\"0100132\","
						+"\"货品名称\":\"阿莫西林胶囊\","
						+"\"批号\":\"2016070148939\","
						+"\"灭菌批号\":\"2\","
						+"\"有效期至\":\"2012-09-08\","
						+"\"生产日期\":\"2012-09-08\"," 
						+"\"复核数量\":50,"
						+"\"单位\":\"2\","
						+"\"复核结论\":\"2\","
						+"\"地址\":\"1\","
						+"\"电话\":\"1\","
						+"\"复核员\":\"1\","
						+"\"业务员\":\"2\","
						+"\"通用名\":\"2\","
						+"\"剂型\":\"2\","
						+"\"规格\":\"2\","
						+"\"产地\":\"q\","
						+"\"批准文号\":\"\","
						+"\"生产厂商\":\"\""
					+"}"
					+"]"
	+"}";

	}
	
	@Test
	public void MyTest(){
		OutCheckService outCheckService = (OutCheckService)context.getBean("outCheckServiceImpl");
		outCheckService.callInsertOutCheck(data);
	}
}
