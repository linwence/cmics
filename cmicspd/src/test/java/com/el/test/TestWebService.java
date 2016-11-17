package com.el.test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.SpdData;
import com.el.utils.DateUtil;
import com.el.utils.Md5Util;

public class TestWebService {
	
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
		 
		   byte[] decodeBytes = Base64.getDecoder().decode("eyLmjqXlj6PnsbvlnosiOiJTUETor7fpgIDmjqXlj6PooagiLCLmjqXmlLbns7vnu5/moIfor4YiOiJFUlAiLCLmjqXlj6PmlbDmja4iOnsi6YCA6LSn5Y2V5pel5pyfIjoiMjAxNC0wOC0xNiAwOToyODowMCIsIumAgOi0p+enkeWupEVSUOe8luWPtyI6IkswMDQiLCLpgIDotKfnp5HlrqTnvJblj7ciOiIwMDAwMDMiLCLphY3pgIHljZXkvY1FUlDnvJblj7ciOiIwMDAwMSIsIl9kYXRlIjoiMjAxNi0wOS0xNCAwMDowMDowMCIsIuWHuuW6k+enkeWupEVSUOe8luWPtyI6IkswMDIiLCLor7fpgIDmmI7nu4YiOlt7IuS6p+WcsCI6Ii0iLCLnlJ/kuqfljoLllYYiOiLlurfovonlmajmorDljoIiLCLop4TmoLwiOiIxeDEiLCLljIXoo4UiOjEwLjAwMDAsIueBreiPjOaJueWPtyI6Ii0iLCLmnInmlYjmnJ/oh7MiOiIyMDE5LTAxLTAyIDAwOjAwOjAwIiwi5YWl5bqT57G75Z6LIjowLCLljp/np5HlrqTor7fotK3ljZXlj7ciOiJLU1FHMDAwMSIsIuW6k+WtmOexu+WeiyI6IuWAn+i0pyIsIuWNleS9jSI6Iue7hCIsIuaJueWPtyI6IjAwIiwi55Sf5Lqn5pel5pyfIjoiIiwi5pWw6YePIjo0LjAwMDAsIuWMu+iNr+WMu+adkEVSUOe8luWPtyI6ImEwMDEiLCLpgIDotKfljZXooYzlj7ciOjEsIuWOn+WMu+mZouivt+i0reWNleWPtyI6IlFHREQyMDE0MDg3Nzc0Iiwi5Yy76I2v5Yy75p2Q5ZCN56ewIjoi5rWL6K+V5Yy75p2QMTEiLCLljLvoja/ljLvmnZDnvJblj7ciOiIwMDAwMDEifSx7IuS6p+WcsCI6Ii0iLCLnlJ/kuqfljoLllYYiOiLlurfovonlmajmorDljoIiLCLop4TmoLwiOiIxeDEiLCLljIXoo4UiOjEwLjAwMDAsIueBreiPjOaJueWPtyI6Ii0iLCLmnInmlYjmnJ/oh7MiOiIyMDE5LTAxLTAyIDAwOjAwOjAwIiwi5YWl5bqT57G75Z6LIjowLCLljp/np5HlrqTor7fotK3ljZXlj7ciOiJLU1FHMDAwMSIsIuW6k+WtmOexu+WeiyI6IuWAn+i0pyIsIuWNleS9jSI6Iue7hCIsIuaJueWPtyI6IjAwIiwi55Sf5Lqn5pel5pyfIjoiMjAxOS0wMS0wMiAwMDowMDowMCIsIuaVsOmHjyI6NC4wMDAwLCLljLvoja/ljLvmnZBFUlDnvJblj7ciOiJhMDAxIiwi6YCA6LSn5Y2V6KGM5Y+3IjoxLCLljp/ljLvpmaLor7fotK3ljZXlj7ciOiJRR0REMjAxNDA4Nzc3NCIsIuWMu+iNr+WMu+adkOWQjeensCI6Iua1i+ivleWMu+adkDExIiwi5Yy76I2v5Yy75p2Q57yW5Y+3IjoiMDAwMDAxIn1dLCJTUETns7vnu5/moIfor4YiOiJKS1NQRCIsIuWHuuW6k+enkeWupOe8luWPtyI6IjAwMDAwMiIsIumAgOi0p+enkeWupOWQjeensCI6IuesrOS4gOWMu+mZouS9j+mZoumDqCIsIuWHuuW6k+enkeWupOWQjeensCI6IuesrOS4gOWMu+mZouiuvuWkh+enkSIsIumFjemAgeWNleS9jeezu+e7n+agh+ivhiI6IueUqOWPi1U4QeW4kOWllyIsIumAgOi0p+WMu+mZokVSUOe8luWPtyI6IjAxMSIsIumAgOi0p+WMu+mZouWQjeensCI6IuesrOS4gOS6uuawkeWMu+mZoiIsIumAgOi0p+WNleWPtyI6IktTUVQyMDE0MDgwMDAyIiwi6YWN6YCB5Y2V5L2NRVJQ6YOo6Zeo57yW5Y+3IjoiMDEwMDEiLCLphY3pgIHljZXkvY3lkI3np7AiOiLnrKzkuIDljLvoja/phY3pgIHlhazlj7giLCLku7vliqHmgLvooYzmlbAiOjIsIumFjemAgeWNleS9jSI6IjAwMDAwMyIsIumAgOi0p+WMu+mZoiI6IjAwMDAwMSJ9fQ==");
           String decodeData = new String(decodeBytes, "utf-8");
           System.out.println("dddd="+decodeData);
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
