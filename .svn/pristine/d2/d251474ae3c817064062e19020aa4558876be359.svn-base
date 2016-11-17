package com.el.cmic.mapper.ck;

import com.el.cmic.service.ckback.CkBackService;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vincent on 2016/10/27.
 */
public class TestCkBackService extends TestCase {
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
    public void testCkBackService(){
        CkBackService ckBackService=(CkBackService)context.getBean("ckBackServiceImpl");
        String data="{\n" +
                "    \"接口类型\":\"\",\n" +
                "    \"接收系统标识\":\"\",\n" +
                "    \"接口数据\":{\n" +
                "        \"物流中心\":1,\n" +
                "        \"出库类型\":11,\n" +
                "        \"货主\":\"01001\",\n" +
                "        \"通知单号\":\"201707010001\",\n" +
                "        \"订单类型\":\"SO\",\n" +
                "        \"业务类型\":\"IA\",\n" +
                "        \"通知单明细\":[\n" +
                "            {\n" +
                "                \"通知单行号\":1,\n" +
                "                \"货品编号\":\"0100132\",\n" +
                "                \"批号 \":\"2016070148939\",\n" +
                "                \"灭菌批号\":\"-\",\n" +
                "                \"库类型\":0,\n" +
                "                \"出库数量\":50,\n" +
                "                \"差异数量\":0,\n" +
                "                \"开票数量\":50,\n" +
                "                \"出库日期\":\"2016-10-27\",\n" +
                "                \"货品名称\":\"\",\n" +
                "                \"有效期至\":\"2016-10-28\",\n" +
                "                \"生产日期\":\"2016-10-29\",\n" +
                "                \"包装\":\"\",\n" +
                "                \"说明\":\"\",\n" +
                "                \"打包流水号\":\"\",\n" +
                "                \"币种\":\"\",\n" +
                "                \"汇率\":\"\",\n" +
                "                \"原币金额\":\"\",\n" +
                "                \"本币金额\":\"\",\n" +
                "                \"快递信息\":\"\",\n" +
                "                \"装箱打包号\":\"\",\n" +
                "                \"序列号明细\":[\n" +
                "                    {\n" +
                "                        \"序列号\":\"11111\",\n" +
                "                        \"入出类型\":\"出\",\n" +
                "                        \"数量\":\"1\",\n" +
                "                        \"当前包装\":\"111\",\n" +
                "                        \"盘点状态\":\"0\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"通知单行号\":2,\n" +
                "                \"货品编号\":\"0200572\",\n" +
                "                \"货品名称\":\"\",\n" +
                "                \"批号 \":\"2016030087733\",\n" +
                "                \"灭菌批号\":\"-\",\n" +
                "                \"库类型\":0,\n" +
                "                \"出库数量\":9,\n" +
                "                \"差异数量\":1,\n" +
                "                \"开票数量\":10,\n" +
                "                \"出库日期\":\"2016-10-27\",\n" +
                "                \"有效期至\":\"2017-10-27\",\n" +
                "                \"生产日期\":\"2016-05-01\",\n" +
                "                \"包装\":\"\",\n" +
                "                \"说明\":\"\",\n" +
                "                \"打包流水号\":\"\",\n" +
                "                \"币种\":\"\",\n" +
                "                \"汇率\":\"\",\n" +
                "                \"原币金额\":\"\",\n" +
                "                \"本币金额\":\"\",\n" +
                "                \"快递信息\":\"\",\n" +
                "                \"装箱打包号\":\"\",\n" +
                "                \"序列号明细\":[\n" +
                "                    {\n" +
                "                        \"序列号\":\"1112\",\n" +
                "                        \"入出类型\":\"出\",\n" +
                "                        \"数量\":\"1\",\n" +
                "                        \"当前包装\":\"222\",\n" +
                "                        \"盘点状态\":\"0\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
        ckBackService.acceptData(data);
    }
}
