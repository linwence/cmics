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
 *   SPD订单数据接收  生成数据
 * @author zhanhao
 *
 */
public class TestSpdOrderWebService {
	
	private String encodeData;
	
	private String timestamp;
	
	@Before
	public void initData() throws UnsupportedEncodingException{
		
		String str ="{"
				+"\"SPD系统标识\":\"JKSPD\","
				+"\"配送单位系统标识\":\"用友U8A帐套\","
				+"\"配送单位\":\"000003\","
				+"\"配送单位ERP编号\":\"00001\","
				+"\"配送单位ERP部门编号\":\"01001\","
				+"\"配送单位名称\":\"第一医药配送公司\","
				+"\"要货医院\":\"000001\","
				+"\"要货医院ERP编号\":\"011\","
				+"\"要货医院名称\":\"第一人民医院\","
				+"\"要货科室编号\":\"000002\","
				+"\"要货科室ERP编号\":\"K002\","
				+"\"要货科室名称\":\"第一医院设备科\","
				+"\"收货科室编号\":\"000002\","
				+"\"收货科室ERP编号\":\"K002\","
				+"\"收货科室名称\":\"第一医院设备科\","
				+"\"业务部门ERP编号\":\"000001\","
				+"\"业务部门名称\":\"销售部\","
				+"\"业务员ERP编号\":\"000001\","
				+"\"业务员名称\":\"韩梅梅\","
				+"\"采购订单号\":\"QGQR2014110001\","
				+"\"_date\":\"2016-09-13 12:00:00\","
				+"\"请购类型\":\"请购\","
				+"\"订单总行数\":1,"
				+"\"采购订单明细\":["
						+"{"
						+"\"采购订单行号\":1,"
						+"\"医疗机构申请单号\":\"QGHB2014110007\","
						+"\"科室申请单号\":\"KSQG2014110003\","
						+"\"指定供应商ERP编号\":\"01010001\","
						+"\"指定供应商ERP名称\":\"ERP第一供应商\","
						+"\"采购订单日期\":\"2014-11-14 11:29:00\","
						+"\"医药医材编号\":\"000001\","
						+"\"医药医材ERP编号\":\"a001\","
						+"\"医药医材名称\":\"测试医材11\","
						+"\"规格\":\"1x1\","
						+"\"生产厂商\":\"康辉器械厂\","
						+"\"产地\":\"-\","
						+"\"单位\":\"组\","
						+"\"包装\":10.0000,"
						+"\"单价\":5.500000,"
						+"\"数量\":80.0000,"
						+"\"预计到货日期\":\"2014-11-16 00:00:00\","
						+"},"
						+"{"
						+"\"采购订单行号\":1,"
						+"\"医疗机构申请单号\":\"QGHB2014110007\","
						+"\"科室申请单号\":\"KSQG2014110003\","
						+"\"指定供应商ERP编号\":\"01010001\","
						+"\"指定供应商ERP名称\":\"ERP第一供应商\","
						+"\"采购订单日期\":\"2014-11-14 11:29:00\","
						+"\"医药医材编号\":\"000001\","
						+"\"医药医材ERP编号\":\"a001\","
						+"\"医药医材名称\":\"测试医材11\","
						+"\"规格\":\"1x1\","
						+"\"生产厂商\":\"康辉器械厂\","
						+"\"产地\":\"-\","
						+"\"单位\":\"组\","
						+"\"包装\":10.0000,"
						+"\"单价\":5.500000,"
						+"\"数量\":80.0000,"
						+"\"预计到货日期\":\"2014-11-16 00:00:00\","
						+"}"
				+"]"
		+"}";
		
   	 		SpdData SpdData = new SpdData("SPD订单接口表","ERP",JSON.parse(str));
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
