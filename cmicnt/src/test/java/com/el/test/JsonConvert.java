package com.el.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.cmic.domain.goods.Fe8nt001;

import java.util.List;

/**
 * Created by Vincent on 2017/2/27.
 */
public class JsonConvert {
    public static void main(String[] args) {
        String str="{\n" +
                "    \"resultCode\":1,\n" +
                "    \"resultMsg\":\"\",\n" +
                "    \"data\":[\n" +
                "        {\n" +
                "            \"litm\":\"ZT.T50092412\",\n" +
                "            \"dsc1\":\"螺钉\",\n" +
                "            \"dsc2\":\"（梅花锁定）φ2.5×12\",\n" +
                "            \"tym\":\"金属接骨螺钉（实心）-皮质骨螺钉\",\n" +
                "            \"uom1\":\"EA\",\n" +
                "            \"dl01\":\"个\",\n" +
                "            \"glpt\":\"101\",\n" +
                "            \"dl02\":\"\",\n" +
                "            \"sld\":\"9999\",\n" +
                "            \"e8name\":\"天津正天医疗器械有限公司\",\n" +
                "            \"orig\":\"\",\n" +
                "            \"fxdj\":\"\",\n" +
                "            \"dl03\":\"\",\n" +
                "            \"cctj\":\"999\",\n" +
                "            \"dl04\":\"其他\",\n" +
                "            \"qtcc\":\"\",\n" +
                "            \"xlhgl\":\"N\",\n" +
                "            \"zdyh\":\"N\",\n" +
                "            \"yhzq\":\"0\",\n" +
                "            \"cpfl\":\"\",\n" +
                "            \"zzlxa\":\"\",\n" +
                "            \"zzbm\":\"国食药监械(准)字2014第3460441号+变更文件\",\n" +
                "            \"eftj\":\"114072\",\n" +
                "            \"exdj\":\"118071\",\n" +
                "            \"path\":\"\",\n" +
                "            \"ir01\":\"\",\n" +
                "            \"ir02\":\"\",\n" +
                "            \"ir03\":\"\",\n" +
                "            \"ir04\":\"\",\n" +
                "            \"ir05\":\"\",\n" +
                "            \"hrb\":\"0\",\n" +
                "            \"psal\":\"0\",\n" +
                "            \"ipay\":\"0\",\n" +
                "            \"tdsc\":\"0\",\n" +
                "            \"efhr\":\"0\",\n" +
                "            \"crtj\":null,\n" +
                "            \"divj\":null,\n" +
                "            \"afdj\":null,\n" +
                "            \"ckdt\":null,\n" +
                "            \"redate\":\"\",\n" +
                "            \"indate\":\"\",\n" +
                "            \"status\":\"0\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"litm\":\"ZT.T50092412.01\",\n" +
                "            \"dsc1\":\"金属接骨螺钉(实心)\",\n" +
                "            \"dsc2\":\"φ2.5×12mm\",\n" +
                "            \"tym\":\"金属接骨螺钉-对称螺纹螺钉\",\n" +
                "            \"uom1\":\"EA\",\n" +
                "            \"dl01\":\"个\",\n" +
                "            \"glpt\":\"101\",\n" +
                "            \"dl02\":\"\",\n" +
                "            \"sld\":\"9999\",\n" +
                "            \"e8name\":\"天津正天医疗器械有限公司\",\n" +
                "            \"orig\":\"\",\n" +
                "            \"fxdj\":\"\",\n" +
                "            \"dl03\":\"\",\n" +
                "            \"cctj\":\"999\",\n" +
                "            \"dl04\":\"其他\",\n" +
                "            \"qtcc\":\"\",\n" +
                "            \"xlhgl\":\"N\",\n" +
                "            \"zdyh\":\"N\",\n" +
                "            \"yhzq\":\"0\",\n" +
                "            \"cpfl\":\"\",\n" +
                "            \"zzlxa\":\"\",\n" +
                "            \"zzbm\":\"国食药监械(准)字2011第3461112号(更)\",\n" +
                "            \"eftj\":\"112247\",\n" +
                "            \"exdj\":\"115262\",\n" +
                "            \"path\":\"\",\n" +
                "            \"ir01\":\"\",\n" +
                "            \"ir02\":\"\",\n" +
                "            \"ir03\":\"\",\n" +
                "            \"ir04\":\"\",\n" +
                "            \"ir05\":\"\",\n" +
                "            \"hrb\":\"0\",\n" +
                "            \"psal\":\"0\",\n" +
                "            \"ipay\":\"0\",\n" +
                "            \"tdsc\":\"0\",\n" +
                "            \"efhr\":\"0\",\n" +
                "            \"crtj\":null,\n" +
                "            \"divj\":null,\n" +
                "            \"afdj\":null,\n" +
                "            \"ckdt\":null,\n" +
                "            \"redate\":\"\",\n" +
                "            \"indate\":\"\",\n" +
                "            \"status\":\"0\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        JSONObject jsonObject = JSON.parseObject(str);
        String resultCode = jsonObject.get("resultCode").toString();
        String resultMsg = jsonObject.get("resultMsg").toString();
        String data = jsonObject.getString("data");
        List<Fe8nt001> fe8nt001List = JSON.parseArray(data, Fe8nt001.class);
        for (Fe8nt001 fe8nt001 : fe8nt001List
                ) {
            System.out.println(fe8nt001.toString());
        }
    }
}
