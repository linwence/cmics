package com.el.cmic.record;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.record.ConserveService;

public class TestConserver {
	private  ClassPathXmlApplicationContext  context;
	private String data;
	
	@Before
	public void testBefore(){
		context=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		data="{"+"\"明细\":["
					+"{"
					+"\"物流中心\":1,"
					+"\"货主\":\"01001\","
					+"\"养护类型\":\"2\","
					+"\"养护日期\":\"2012-09-08\","
					+"\"货品编号\":\"132\","
					+"\"货品名称\":\"阿莫西林胶囊\","
					+"\"批号\":\"2016070148939\","
					+"\"灭菌批号\":\"2\","
					+"\"有效期至\":\"2012-09-08\","
					+"\"生产日期\":\"2012-09-08\","
					+"\"数量\":50,"
					+"\"单位\":\"3\","
					+"\"库区\":\"3\","
					+"\"货位\":\"3\","
					+"\"质量状况\":\"3\","
					+"\"处理意见\":\"3\","
					+"\"养护结论\":\"4\","
					+"\"疑问说明\":\"4\","
					+"\"养护员\":\"1\","
					+"\"通用名\":\"3\","
					+"\"剂型\":\"2\","
					+"\"规格\":\"2\","
					+"\"产地\":\"2\","
					+"\"注册证号\":\"2\","
					+"\"批准文号\":\"2\","
					//+"\"生产企业许可证号或者备案凭证号\":\"\","
					+"\"生产厂商\":\"2\""
					+"},"
					+"{"
					+"\"物流中心\":1,"
					+"\"货主\":\"01001\","
					+"\"养护类型\":\"2\","
					+"\"养护日期\":\"2012-09-08\","
					+"\"货品编号\":\"132\","
					+"\"货品名称\":\"阿莫西林胶囊\","
					+"\"批号\":\"2016070148939\","
					+"\"灭菌批号\":\"2\","
					+"\"有效期至\":\"2012-09-08\","
					+"\"生产日期\":\"2012-09-08\","
					+"\"数量\":50,"
					+"\"单位\":\"3\","
					+"\"库区\":\"3\","
					+"\"货位\":\"3\","
					+"\"质量状况\":\"3\","
					+"\"处理意见\":\"3\","
					+"\"养护结论\":\"4\","
					+"\"疑问说明\":\"4\","
					+"\"养护员\":\"1\","
					+"\"通用名\":\"3\","
					+"\"剂型\":\"2\","
					+"\"规格\":\"2\","
					+"\"产地\":\"2\","
					+"\"注册证号\":\"2\","
					+"\"批准文号\":\"2\","
					//+"\"生产企业许可证号或者备案凭证号\":\"\","
					+"\"生产厂商\":\"2\""
					+"}"
				+"]"
			+"}";
	}
	@Test
	public void myTest(){
		ConserveService conserveService	= (ConserveService)context.getBean("conserveServiceImpl");
		conserveService.callInsertConserveDetail(data);
	}
}
