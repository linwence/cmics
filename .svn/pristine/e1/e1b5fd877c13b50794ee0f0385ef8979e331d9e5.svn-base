package com.el.cmic.record;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.record.PurchaseService;

public class TestPurchaseOut {
	
	private ClassPathXmlApplicationContext  context;
	
	private String data;
	
	@Before
	public void testBefore(){
		context = new  ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		data ="{"
			+"\"明细\":["
							+"{"
								+"\"物流中心\":3,"
								+"\"货主\":\"01001\","
								+"\"通知单号\":\"2\","
								+"\"复核单号\":\"WMS\","
								+"\"复核日期\":\"\","
								+"\"客户编号\":\"2\","
								+"\"客户名称\":\"2\","
								+"\"货品编号\":\"0100132\","
								+"\"货品名称\":\"阿莫西林胶囊\","
								+"\"批号\":\"2016070148939\","
								+"\"灭菌批号\":\"2\","
								+"\"有效期至\":\"2012-09-09\","
								+"\"生产日期\":\"2012-09-09\","
								+"\"复核数量\":50,"
								+"\"单位\":\"2\","
								+"\"复核结论\":\"2\","
								+"\"地址\":\"2\","
								+"\"电话\":\"2\","
								+"\"复核员\":\"2\","
								+"\"业务员\":\"2\","
								//+"\"通用名\":\"2\","
								+"\"剂型\":\"2\","
								+"\"规格\":\"2\","
								+"\"产地\":\"2\","
								+"\"批准文号\":\"\","
								+"\"生产厂商\":\"\""
							+"},"
							+"{"
							+"\"物流中心\":2,"
							+"\"货主\":\"01001\","
							+"\"通知单号\":\"2\","
							+"\"复核单号\":\"WMS\","
							+"\"复核日期\":\"\","
							+"\"客户编号\":\"2\","
							+"\"客户名称\":\"2\","
							+"\"货品编号\":\"0100132\","
							+"\"货品名称\":\"阿莫西林胶囊\","
							+"\"批号\":\"2016070148939\","
							+"\"灭菌批号\":\"2\","
							+"\"有效期至\":\"2012-09-09\","
							+"\"生产日期\":\"2012-09-09\","
							+"\"复核数量\":50,"
							+"\"单位\":\"2\","
							+"\"复核结论\":\"2\","
							+"\"地址\":\"2\","
							+"\"电话\":\"2\","
							+"\"复核员\":\"2\","
							+"\"业务员\":\"2\","
							//+"\"通用名\":\"2\","
							+"\"剂型\":\"2\","
							+"\"规格\":\"2\","
							+"\"产地\":\"2\","
							+"\"批准文号\":\"\","
							+"\"生产厂商\":\"\""
						+"}"
					+"]"
			+"}";
	}

	@Test
	public void myTest(){
		PurchaseService purchaseService = (PurchaseService)context.getBean("purchaseServiceImpl");
		purchaseService.callInsertPurchaseDetail(data);
	}
}
