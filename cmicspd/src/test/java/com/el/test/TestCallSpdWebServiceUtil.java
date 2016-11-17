package com.el.test;


import com.el.cmic.common.domain.SpdResult;
import com.el.utils.CallSpdWebServiceUtil;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


/**
 * Created by Vincent on 2016/11/8.
 */
@Component
public class TestCallSpdWebServiceUtil extends TestCase {
    private ClassPathXmlApplicationContext context;

    public TestCallSpdWebServiceUtil() {
        super();
    }

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

    public void testCallSpdWebService(){
        CallSpdWebServiceUtil callSpdWebServiceUtil=(CallSpdWebServiceUtil) context.getBean("callSpdWebServiceUtil");
        SpdResult spdResult= callSpdWebServiceUtil.callSpdWebService("test");
        System.out.println(spdResult.toString());
    }

}
