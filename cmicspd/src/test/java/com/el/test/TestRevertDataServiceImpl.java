package com.el.test;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.revert.RevertDataService;

public class TestRevertDataServiceImpl extends TestCase {
	
	private ClassPathXmlApplicationContext context;

    @Override
    protected void setUp() throws Exception {
    	System.out.println("setUp");
        super.setUp();
        context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }

    @Override
    protected void tearDown() throws Exception {
    	System.out.println("tearDown");
        super.tearDown(); 
        context.close();
    }
    
    public  void testcallRevertDataServiceImpl(){
    	System.out.println("testcall");
    	RevertDataService revertDataService = (RevertDataService)context.getBean("revertDataServiceImpl");
		String str;
    	 str ="{"
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
    	 revertDataService.callInsertRevertData(str);
    }
    

}