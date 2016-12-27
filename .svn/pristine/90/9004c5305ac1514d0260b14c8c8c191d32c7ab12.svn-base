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
 * spd  请退数据接收  生成数据
 * @author zhanhao
 *
 */
public class TestRevertWebService {
	
	private String encodeData;
	
	private String timestamp;
	
	@Before
	public void initData() throws UnsupportedEncodingException{
		 String  str ="{"
   			+ "\"SPD系统标识\":\"JKSPD\","
   			+ "\"配送单位系统标识\":\"用友U8A帐套\","
   			+ "\"配送单位\":\"000003\","
   			+ "\"配送单位ERP编号\":\"00001\","
   			+ "\"配送单位ERP部门编号\":\"01001\","
   			+ "\"配送单位名称\":\"第一医药配送公司\","
   			+ "\"退货医院\":\"000001\","
   			+ "\"退货医院ERP编号\":\"011\","
   			+ "\"退货医院名称\":\"第一人民医院\","
   			+ "\"退货科室编号\":\"000003\","
   			+ "\"退货科室ERP编号\":\"K004\","
   			+ "\"退货科室名称\":\"第一医院住院部\","
   			+ "\"出库科室编号\":\"000002\","
   			+ "\"出库科室ERP编号\":\"K002\","
   			+ "\"出库科室名称\":\"第一医院设备科\","
   			+ "\"_date\":\"2016-09-14 00:00:00\","
   			+ "\"退货单号\":\"KSQT2014080002\","
   			+ "\"退货单日期\":\"2014-08-16 09:28:00\","
   			+ "\"任务总行数\":2,"
   			+ "\"请退明细\":["
   			+ "{"
   			+ "\"退货单行号\":1,"
   			+ "\"原医院请购单号\":\"QGDD2014087774\","
   			+ "\"原科室请购单号\":\"KSQG0001\","
   			+ "\"医药医材编号\":\"000001\","
   			+ "\"医药医材ERP编号\":\"a001\","
   			+ "\"医药医材名称\":\"测试医材11\","
   			+ "\"规格\":\"1x1\","
   			+ "\"生产厂商\":\"康辉器械厂\","
   			+ "\"产地\":\"-\","
   			+ "\"单位\":\"组\","
   			+ "\"批号\":\"00\","
   			+ "\"灭菌批号\":\"-\","
   			+ "\"库存类型\":\"借货\","
   			+ "\"有效期至\":\"2019-01-02 00:00:00\","
   			+ "\"生产日期\":\"\","
   			+ "\"包装\":10.0000,"
   			+ "\"数量\":4.0000,"
   			+ "\"入库类型\":0},"
   			+ "{"
   	    			+ "\"退货单行号\":1,"
   	    			+ "\"原医院请购单号\":\"QGDD2014087774\","
   	    			+ "\"原科室请购单号\":\"KSQG0001\","
   	    			+ "\"医药医材编号\":\"000001\","
   	    			+ "\"医药医材ERP编号\":\"a001\","
   	    			+ "\"医药医材名称\":\"测试医材11\","
   	    			+ "\"规格\":\"1x1\","
   	    			+ "\"生产厂商\":\"康辉器械厂\","
   	    			+ "\"产地\":\"-\","
   	    			+ "\"单位\":\"组\","
   	    			+ "\"批号\":\"00\","
   	    			+ "\"灭菌批号\":\"-\","
   	    			+ "\"库存类型\":\"借货\","
   	    			+ "\"有效期至\":\"2019-01-02 00:00:00\","
   	    			+ "\"生产日期\":\"2019-01-02 00:00:00\","
   	    			+ "\"包装\":10.0000,"
   	    			+ "\"数量\":4.0000,"
   	    			+ "\"入库类型\":0}"
   			+ "]}";
   	 		SpdData SpdData = new SpdData("SPD请退接口表","ERP",JSON.parse(str));
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
