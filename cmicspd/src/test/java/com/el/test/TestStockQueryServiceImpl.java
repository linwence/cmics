package com.el.test;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.SpdData;
import com.el.utils.DateUtil;
import com.el.utils.Md5Util;
import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Created by Vincent on 2017/1/18.
 */
public class TestStockQueryServiceImpl {
    private String encodeData;

    private String timestamp;

    @Before
    public void initData() throws UnsupportedEncodingException {

        String str ="{" +
                "    \"SPD系统标识\":\"SUMD-SPD-TEST\"," +
                "    \"配送机构\":\"000003\"," +
                "    \"配送机构ERP编号\":\"00101\"," +
                "    \"配送机构系统标识\":\"JDE\"," +
                "    \"生产厂家\":\"四川迈克生物科技股份有限公司\"," +
                "    \"起始行\":\"1\"," +
                "    \"截止行\":\"1000\"" +
                "}";

        SpdData SpdData = new SpdData("应急库库存查询","ERP", JSON.parse(str));
        String data = SpdData.toJson();
        System.out.println(data);
        encodeData= Base64.getEncoder().encodeToString(data.getBytes("utf-8"));
        timestamp = DateUtil.getTimeStamp();
    }
    @Test
    public void getData(){
        System.out.println("appKey=9F7DD4E4-2863-4ADA-8644-FC99C474C8FB");
        System.out.println("timestamp="+ timestamp);
        System.out.println("data="+encodeData);
        System.out.println("sign="+ Md5Util.md5s(timestamp + encodeData +"97345bde2e99a573"));
        System.out.println("ver=1");

    }
}
