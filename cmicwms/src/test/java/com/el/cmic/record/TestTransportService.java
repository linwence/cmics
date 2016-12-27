package com.el.cmic.record;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.record.TransportService;

public class TestTransportService {
	
	private ClassPathXmlApplicationContext  context;
	private String data;
	
	@Before
	public void testBefore(){
		context=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		data="{"
				+"\"明细\":["
					+"{"
					+"\"物流中心\":8,"
					+"\"货主\":\"01001\","
					+"\"通知单号\":\"6\","
					+"\"通知单行号\":\"6\","
					+"\"装载单号\":\"6\","
					+"\"客户编号\":\"6\","
					+"\"客户名称\":\"6\","
					+"\"货品编号\":\"0100132\","
					+"\"货品名称\":\"阿莫西林胶囊\","
					+"\"批号\":\"2016070148939\","
					+"\"灭菌批号\":\"6\","
					+"\"有效期至\":\"2018-09-07\","
					+"\"生产日期\":\"2018-09-07\","
					+"\"数量\":50,"
					+"\"单位\":\"6\","
					+"\"发货时间\":\"2018-09-07\","
					+"\"到货时间\":\"2018-09-07\","
					+"\"车牌号\":\"4\","
					+"\"外运单号\":\"6\","
					+"\"司机姓名\":\"7\","
					+"\"收货地址\":\"999\""
					+"},"
					+"{"
					+"\"物流中心\":4,"
					+"\"货主\":\"01001\","
					+"\"通知单号\":\"6\","
					+"\"通知单行号\":\"6\","
					+"\"装载单号\":\"6\","
					+"\"客户编号\":\"6\","
					+"\"客户名称\":\"6\","
					+"\"货品编号\":\"0100132\","
					+"\"货品名称\":\"阿莫西林胶囊\","
					+"\"批号\":\"2016070148939\","
					+"\"灭菌批号\":\"6\","
					+"\"有效期至\":\"2018-09-07\","
					+"\"生产日期\":\"2018-09-07\","
					+"\"数量\":50,"
					+"\"单位\":\"6\","
					+"\"发货时间\":\"2018-09-07\","
					+"\"到货时间\":\"2018-09-07\","
					+"\"车牌号\":\"4\","
					+"\"外运单号\":\"6\","
					+"\"司机姓名\":\"7\","
					+"\"收货地址\":\"999\""
					+"}"
					+"]"
					+"}";
	}
	
	@Test
	public void myTest(){
		TransportService transportService = (TransportService)context.getBean("transportServiceImpl");
		transportService.callInsertTranportDetaol(data);
	}

}
