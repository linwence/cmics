package com.el.test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.SpdData;
import com.el.utils.DateUtil;
import com.el.utils.Md5Util;

/**
 * SPD结算数据接收  生成数据
 * @author zhanhao
 *
 */
public class TestSettlementWebService {
	
	private String encodeData;
	
	private String timestamp;
	
	@Before
	public void initData() throws UnsupportedEncodingException{

		String str ="{"
		+ "\"SPD系统标识\":\"JKSPD\"," 
		+ "\"结算单位系统标识\":\"用友U8A帐套\"," 
		+ "\"结算单位\":\"000003\","
		+"\"结算单位ERP编号\":\"00001\","
		+"\"结算单位ERP部门编号\":\"01001\","
		+"\"结算单位名称\":\"第一医药配送公司\","
		+"\"出库医院\":\"000001\","
		+"\"出库医院ERP编号\":\"011\","
		+"\"出库医院名称\":\"第一人民医院\","
		+"\"业务部门ERP编号\":\"000001\","
		+"\"业务部门名称\":\"销售部\","
		+"\"业务员ERP编号\":\"000001\","
		+"\"业务员名称\":\"韩梅梅\","
		+"\"任务总行数\":1,"
		+"\"_date\":\"2015-12-24 16:50:00\","
		+"\"结算明细\":["
		+"{"
		+"\"配送单位\":\"000003\","
		+"\"配送单位ERP编号\":\"00001\","
		+"\"配送单位名称\":\"第一医药配送公司\","
		+"\"出库科室编号\":\"000002\","
		+"\"出库科室ERP编号\":\"K002\","
		+"\"出库科室名称\":\"第一医院设备科\","
		+"\"出库单号\":\"KSZT2015030001\","
		+"\"出库日期\":\"2015-03-25 10:28:00\","
		+"\"出库类型\":1,"
		+"\"数据类型\":0,"
		+"\"出库单行号\":1,"
		+"\"医药医材编号\":\"000001\","
		+"\"医药医材ERP编号\":\"a001\","
		+"\"医药医材名称\":\"测试医材11\","
		+"\"规格\":\"1x1\","
		+"\"生产厂商\":\"康辉器械厂\","
		+"\"产地\":\"-\","
		+"\"单位\":\"组\","
		+"\"批号\":\"00\","
		+"\"灭菌批号\":\"-\","
		+"\"库存类型\":\"请购\","
		+"\"有效期至\":\"2019-11-20 00:00:00\","
		+"\"生产日期\":\"2013-10-20 00:00:00\","
		+"\"包装\":10.0000,"
		+"\"数量\":2.0000,"
		+"},"
		+"{"
		+"\"配送单位\":\"000003\","
		+"\"配送单位ERP编号\":\"00001\","
		+"\"配送单位名称\":\"第一医药配送公司\","
		+"\"出库科室编号\":\"000002\","
		+"\"出库科室ERP编号\":\"K002\","
		+"\"出库科室名称\":\"第一医院设备科\","
		+"\"出库单号\":\"KSZT2015030001\","
		+"\"出库日期\":\"2015-03-25 10:28:00\","
		+"\"出库类型\":1,"
		+"\"数据类型\":0,"
		+"\"出库单行号\":1,"
		+"\"医药医材编号\":\"000001\","
		+"\"医药医材ERP编号\":\"a001\","
		+"\"医药医材名称\":\"测试医材11\","
		+"\"规格\":\"1x1\","
		+"\"生产厂商\":\"康辉器械厂\","
		+"\"产地\":\"-\","
		+"\"单位\":\"组\","
		+"\"批号\":\"00\","
		+"\"灭菌批号\":\"-\","
		+"\"库存类型\":\"请购\","
		+"\"有效期至\":\"2019-11-20 00:00:00\","
		+"\"生产日期\":\"2013-10-20 00:00:00\","
		+"\"包装\":10.0000,"
		+"\"数量\":2.0000,"
		+"}"
		+"]"
		+"}";
   	 		SpdData SpdData = new SpdData("SPD结算接口表","ERP",JSON.parse(str));
   	 		String data = SpdData.toJson();
   	 		System.out.println(data);
		 encodeData= Base64.getEncoder().encodeToString(data.getBytes("utf-8"));
		 timestamp = DateUtil.getTimeStamp();
	}
	@Test
	public void getData(){
			System.out.println("appKey=2D5FD939-3648-4951-808E-5BF3EF86451F");
			System.out.println("timestamp="+ timestamp);
			System.out.println("data="+encodeData);
			System.out.println("sign="+ Md5Util.md5s(timestamp + encodeData +"6c03968b17c917bb"));
			System.out.println("ver=1");
		
	}

}
