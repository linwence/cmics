package com.el.cmic.custom;

import com.el.cmic.service.customer.CustomPropelService;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vincent on 2016/11/1.
 */
public class TestCustomPropelServiceImpl extends TestCase{
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
        CustomPropelService customPropelService=(CustomPropelService)context.getBean("customPropelServiceImpl");
        customPropelService.callWmsCustomInterface();
    }
}
