package com.el.cmic.rk;

import com.el.cmic.service.inbound.InboundService;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vincent on 2016/11/2.
 */
public class TestInboundService extends TestCase {
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
    public void testCallWmsInboundPushInterface(){
        InboundService inboundService=(InboundService)context.getBean("inboundServiceImpl");
        inboundService.callWmsInboundPushInterface();
    }
}
