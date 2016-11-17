package com.el.test;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.el.cmic.service.supplier.SupplierService;
public class TestSupplierServicerImpl extends TestCase{
	 private ClassPathXmlApplicationContext context;

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
	    public  void testCallWmsCustomInterface(){
	    	SupplierService supplierService = (SupplierService)context.getBean("supplierServiceImpl");
	    	supplierService.callSupplierInterface();
	    	//String str = "{\"接口类型\":\"供应商信息\",\"接收系统标识\":\"JKSPD\",\"接口数据\":{\"明细\":[{\"SPD系统标识\":\"JKSPD\",\"配送机构系统标识\":\"JDE\",\"配送机构ERP编号\":\"00101\",\"配送机构名称\":\"国药集团联合医疗器械有限公司\",\"ERP供应商编号\":\"9000001\",\"ERP供应商名称\":\"T济南迈成科贸有限公司\",\"简称\":\"\",\"备注\":\"\",\"封存\":0}]}}";
	    }
}
