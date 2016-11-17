package com.el.cmic.mapper.ck;

import com.alibaba.fastjson.JSON;
import com.el.cmic.service.ck.CkService;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Base64Utils;

/**
 * Created by Vincent on 2016/10/24.
 */
public class TestCkService extends TestCase {
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

    public void testCallWmsCkInterface() {
        CkService ckService = (CkService) context.getBean("ckServiceImpl");

        ckService.callWmsCkInterface();
    }

    public void testBase64Utils() {
        byte[] bytes = Base64Utils.decodeFromString("55ub5LiW5auh5aaD");
        String result = new String(bytes);
        System.out.println(result);
    }

    public void testWmsResutl() {

        TestJsonDomain wmsResult = JSON.parseObject("{\n" +
                "    \"类型\":\"货品信息\",\n" +
                "    \"数量\":1,\n" +
                "    \"明细\":[\n" +
                "        {\n" +
                "            \"名称\":\"晓明\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"名称\":\"小红\"\n" +
                "        }\n" +
                "    ]\n" +
                "}", TestJsonDomain.class);
        System.out.println( wmsResult.toString());
        for (TestDtlDomain t:wmsResult.getTestDtlDomainList()
             ) {
            System.out.println(t.toString());
        }

    }
}
