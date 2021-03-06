package com.el.cmic.record;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.record.InputCheckService;

public class TestInputCheckService {
	
	private ClassPathXmlApplicationContext  context;
	String data;
	@Before
	public void testbefore(){
		context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		data ="{"
				+"\"明细\":["
						+"{"
						+"\"物流中心\":3,"
						+"\"货主\":\"01001\","
						+"\"通知单号\":\"2\","
						+"\"验收单号\":\"1\","
						+"\"客户编号\":\"1\","
						+"\"客户名称\":\"2\","
						+"\"货品编号\":\"0100132\","
						+"\"货品名称\":\"阿莫西林胶囊\","
						+"\"批号\":\"2016070148939\","
						+"\"灭菌批号\":\"2\","
						+"\"有效期至\":\"2018-09-08\","
						+"\"生产日期\":\"2018-09-08\","
						+"\"到货数量\":50,"
						+"\"验收合格数量\":50,"
						+"\"拒收数量\":0,"
						+"\"单位\":\"2\","
						+"\"质量状况\":\"2\","
						+"\"验收结论\":\"2\","
						+"\"验收员\":\"2\","
						+"\"验收员2\":\"2\","
						+"\"验收日期\":\"2018-09-08\","
						+"\"到货日期\":\"2018-09-08\","
						+"\"检验报告书\":\"\","
						+"\"不合格事项及处理措施\":\"2\","
						+"\"通用名\":\"2\","
						+"\"剂型\":\"2\","
						+"\"规格\":\"1\","
						+"\"产地\":\"1\","
						+"\"注册证号\":\"\","
						+"\"批准文号\":\"\","
						+"\"生产企业许可证号或者备案凭证号\":\"\","
						+"\"生产厂商\":\"\","
						+"\"验收类别\":\"\","
						+"\"储存条件\":\"\""
						+"},"
						+"{"
						+"\"物流中心\":4,"
						+"\"货主\":\"01001\","
						+"\"通知单号\":\"2\","
						+"\"验收单号\":\"1\","
						+"\"客户编号\":\"1\","
						+"\"客户名称\":\"2\","
						+"\"货品编号\":\"0100132\","
						+"\"货品名称\":\"阿莫西林胶囊\","
						+"\"批号\":\"2016070148939\","
						+"\"灭菌批号\":\"2\","
						+"\"有效期至\":\"2018-09-08\","
						+"\"生产日期\":\"2018-09-08\","
						+"\"到货数量\":50,"
						+"\"验收合格数量\":50,"
						+"\"拒收数量\":0,"
						+"\"单位\":\"2\","
						+"\"质量状况\":\"2\","
						+"\"验收结论\":\"2\","
						+"\"验收员\":\"2\","
						+"\"验收员2\":\"2\","
						+"\"验收日期\":\"2018-09-08\","
						+"\"到货日期\":\"2018-09-08\","
						+"\"检验报告书\":\"\","
						+"\"不合格事项及处理措施\":\"2\","
						+"\"通用名\":\"2\","
						+"\"剂型\":\"2\","
						+"\"规格\":\"1\","
						+"\"产地\":\"1\","
						+"\"注册证号\":\"\","
						+"\"批准文号\":\"\","
						+"\"生产企业许可证号或者备案凭证号\":\"\","
						+"\"生产厂商\":\"\","
						+"\"验收类别\":\"\","
						+"\"储存条件\":\"\""
						+"}"
				+"]"
		+"}";
	}
	
	@Test
	public void myTest(){
		InputCheckService inputCheckService = (InputCheckService)context.getBean("inputCheckServiceImpl");
		inputCheckService.callInsertInputCheck(data);
	}

}
