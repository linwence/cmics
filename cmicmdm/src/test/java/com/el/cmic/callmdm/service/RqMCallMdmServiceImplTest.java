package com.el.cmic.callmdm.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 生产厂家测试类
 * Created by Vincent on 2016/10/21.
 */
public class RqMCallMdmServiceImplTest  extends TestCase {
    private ClassPathXmlApplicationContext context;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        context=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        context.close();
    }

    public void testAddCallWS(){
        RqMCallMdmServiceImpl rqMCallMdmService= (RqMCallMdmServiceImpl) context.getBean("rqMCallMdmServiceImpl");
        rqMCallMdmService.addCallWS();
//        TestService testService=(TestService)context.getBean("testServiceImpl");
//        FE8Log01 fe8Log01=new FE8Log01();
//        //fe8Log01.setLgukid(1L);
//        fe8Log01.setLgdl01("ssssss");
//        testService.insert(fe8Log01);

    }

    public void testUpdateCallWS(){
        RqMCallMdmServiceImpl rqECallMdmService= (RqMCallMdmServiceImpl) context.getBean("rqMCallMdmServiceImpl");
        rqECallMdmService.updateCallWS();
//        TestService testService=(TestService)context.getBean("testServiceImpl");
//        FE8Log01 fe8Log01=new FE8Log01();
//        //fe8Log01.setLgukid(1L);
//        fe8Log01.setLgdl01("ssssss");
//        testService.insert(fe8Log01);

    }
}
