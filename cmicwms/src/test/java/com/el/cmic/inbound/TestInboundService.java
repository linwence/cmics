/**
 * 
 */
package com.el.cmic.inbound;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.ckback.CkBackService;
import com.el.cmic.service.inbound.InboundService;

import junit.framework.TestCase;

/**
 * @author ELSIAN
 *
 */
public class TestInboundService extends TestCase {

	private ClassPathXmlApplicationContext context;

	public void testCallInboundPush() {
		InboundService inboundService = (InboundService) context.getBean("inboundServiceImpl");
		inboundService.callWmsInboundPushInterface();
	}

	public void testInboundBack() {
		InboundService inboundService = (InboundService) context.getBean("inboundServiceImpl");
		String data = "{\"物流中心\":\"1\",\"入库类型\":\"\",\"货主\":\"02001\",\"通知单号\":5033,\"客户编号\":4210001,\"预到货日期\":\"2016-10-12\",\"客户名称\":\"天泽医疗器械有限公司                              \",\"业务员\":\"\",\"通知单日期\":\"2016-10-12\",\"说明\":\" \",\"客户类型\":\"C  \",\"业务部门\":\" \",\"温控方式\":\"\",\"温控状况\":\"\",\"到货时间\":null,\"到货温度\":\"\",\"订单类型\":\"OP\",\"业务类型\":\"OP\",\"通知单明细\":[{\"通知单行号\":4,\"货品编号\":\"60000001                 \",\"数量\":-1000,\"批号\":\"\",\"灭菌批号\":\"\",\"库类型\":\"          \",\"入库日期\":\"2016-10-12\",\"货品名称\":\"显微镜                           \",\"有效期至\":null,\"生产日期\":null,\"促销批号\":0,\"币种\":\"\",\"原币金额\":null,\"本币金额\":null,\"汇率\":null,\"入直配区\":\" \",\"注册证号\":\" \",\"原出库日期\":null,\"原出库数量\":null,\"原出库单号\":\"\",\"子表ID\":null,\"其他信息\":\"\",\"序列号明细\":[{\"序列号\":\"12921\",\"入出类型\":\"2\",\"数量\":11,\"当前包装\":12,\"盘点状态\":13}],\"子件清单明细\":[{\"货品编号\":\"\",\"批号\":\"\",\"灭菌批号\":\"\",\"库存类型\":null,\"数量\":null,\"缺损数量\":null,\"货品名称\":\"\",\"生产日期\":null,\"有效期至\":null,\"备注\":\"\"}],\"归还子件清单明细\":[{\"子件编号\":\"\",\"子件批号\":\"\",\"子件灭菌批号\":\"\",\"子件有效期至\":null,\"子件生产日期\":null,\"数量\":null,\"归还数量\":null,\"缺损数量\":null}],\"子件唯一码明细\":[{\"子件编号\":\"\",\"子件批号\":\"\",\"子件灭菌批号\":\"\",\"子件供应商\":\"\",\"客户类型\":\"\",\"序列号\":\"\",\"数量\":null,\"缺损数量\":null,\"子件有效期至\":null,\"子件生产日期\":null}]},{\"通知单行号\":1,\"货品编号\":\"60000001                 \",\"数量\":-500,\"批号\":\"\",\"灭菌批号\":\"\",\"库类型\":\"          \",\"预到货日期\":\"2016-10-12\",\"货品名称\":\"显微镜                           \",\"有效期至\":null,\"生产日期\":null,\"促销批号\":0,\"币种\":\"\",\"原币金额\":null,\"本币金额\":null,\"汇率\":null,\"入直配区\":\" \",\"注册证号\":\" \",\"原出库日期\":null,\"原出库数量\":null,\"原出库单号\":\"\",\"子表ID\":null,\"其他信息\":\"\",\"序列号明细\":[{\"序列号\":\"12922\",\"入出类型\":\"\",\"数量\":null,\"当前包装\":null,\"盘点状态\":null}],\"子件清单明细\":[{\"货品编号\":\"\",\"批号\":\"\",\"灭菌批号\":\"\",\"库存类型\":null,\"数量\":null,\"缺损数量\":null,\"货品名称\":\"\",\"生产日期\":null,\"有效期至\":null,\"备注\":\"\"}],\"归还子件清单明细\":[{\"子件编号\":\"\",\"子件批号\":\"\",\"子件灭菌批号\":\"\",\"子件有效期至\":null,\"子件生产日期\":null,\"数量\":null,\"归还数量\":null,\"缺损数量\":null}],\"子件唯一码明细\":[{\"子件编号\":\"\",\"子件批号\":\"\",\"子件灭菌批号\":\"\",\"子件供应商\":\"\",\"客户类型\":\"\",\"序列号\":\"\",\"数量\":null,\"缺损数量\":null,\"子件有效期至\":null,\"子件生产日期\":null}]}]}";
		inboundService.acceptData(data);
	}

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

}
