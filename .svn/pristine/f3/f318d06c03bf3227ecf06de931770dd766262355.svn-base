package com.el.cmic.ckcancel;

import com.el.cmic.service.ck.CkService;
import com.el.cmic.service.ck.CkServiceImpl;
import com.el.cmic.service.ckcancel.CkCancelService;
import com.el.cmic.service.ckcancel.CkCancelServiceImpl;
import com.el.utils.HttpRequest;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vincent on 2016/11/1.
 */
public class TestCkCancelService extends TestCase {
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
    public void testCkMapper() {
        CkCancelService ckCancelService = (CkCancelService) context.getBean("ckCancelServiceImpl");

        ckCancelService.callWmsCkCancelInterface();
       // HttpRequest httpRequest1= ckCancelService.getHttpRequest();
       // CkService ckService = (CkService) context.getBean("ckServiceImpl");
        //ckService.callWmsCkInterface();
       // if (httpRequest1==httpRequest2){
         //   System.out.println("httpRequest1==httpRequest2");
        //}

    }
}
