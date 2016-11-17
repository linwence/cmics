package com.el.cmic.rkcancel;

import com.el.cmic.service.repertory.InInvertoryCancelService;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vincent on 2016/11/3.
 */
public class TestRkCancelService extends TestCase {
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
    public void testCallWmsInCancelInterface(){
        InInvertoryCancelService inInvertoryCancelService=(InInvertoryCancelService)context.getBean("inInvertoryCancelServiceImpl");
        inInvertoryCancelService.callWmsInCancelInterface();
    }
}
