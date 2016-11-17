package com.el.cmic.common.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.cmic.common.SpdInterfaceType;
import com.el.cmic.common.domain.SpdResult;
import com.el.utils.Md5Util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Base64;

/**
 * Created by Vincent on 2016/10/28.
 */
@Service
public class ValidParamServiceImpl implements ValidParamService {
    @Value("${spd.AppPassword}")
    private String appPassword;


    @Override
    public SpdResult validData(String timestamp, String data, String sign) {
        //需要对数据进行处理
        SpdResult spdResult = new SpdResult(true, "0000", "成功");
        String[] interfaceTypes = new String[]{SpdInterfaceType.SPD_ORDER_TYPE, SpdInterfaceType.SPD_SETTLE_TYPE,
                SpdInterfaceType.SPD_REVERT_TYPE};
        try {
            //TODO 测试时先注释 验证签名
            spdResult = validSign(timestamp, data, sign);
            //=========================================
            if (!spdResult.isSuccess()) {
                return spdResult;
            }
            //TODO 测试时先注释
            byte[] decodeBytes = Base64Utils.decodeFromString(data);
          //  byte[] decodeBytes = Base64.getDecoder().decode(data);
            String decodeData = new String(decodeBytes, "utf-8");
            //JSONObject jsonObject = JSON.parseObject(data);
            //===================================================
            JSONObject jsonObject = JSON.parseObject(decodeData);

            Object object = jsonObject.get("接口类型");
            if (object == null) {
                throw new Exception("缺少接口类型");
            } else {
                String interfaceType = object.toString();
                if (!Arrays.asList(interfaceTypes).contains(interfaceType)) {
                    throw new Exception("接口类型不识别,接收到的接口类型[" + interfaceType + "]");
                }
            }
            object = jsonObject.get("接口数据");
            if (object == null) {
                throw new Exception("缺少接口数据");
            } else {

                /*jsonObject = JSON.parseObject(object.toString());
                Object objDoco = jsonObject.get("通知单号");

                if (objDoco != null) {
                    fe8wmslg.setLsdoco(new BigDecimal(objDoco.toString()));
                }
                Object objDcto = jsonObject.get("订单类型");
                if (objDcto != null) {
                    fe8wmslg.setLsdcto(objDcto.toString());
                }
                Object objKcoo = jsonObject.get("货主");
                if (objKcoo != null) {
                    fe8wmslg.setLskcoo(objKcoo.toString());
                }
                object = jsonObject.get("通知单明细");
                if (object == null) {
                    object = jsonObject.get("明细");
                    if (object == null) {
                        throw new Exception("缺少明细数据");
                    }
                }*/
            }
        } catch (Exception e) {
            spdResult.setSuccess(false);
            spdResult.setCode("1005");
            spdResult.setMessage("数据格式错误,解析失败:" + e.getMessage());
        }

        return spdResult;
    }

    @Override
    public SpdResult validSign(String timestamp, String data, String sign) {
        SpdResult spdResult = new SpdResult(true, "0000", "成功");
        String calcSign = Md5Util.getMD5(timestamp, data, appPassword);
        if (!sign.equals(calcSign)) {
            spdResult.setSuccess(false);
            spdResult.setCode("1001");
            spdResult.setMessage("签名不合法,接收到的Sign=" + sign + ";计算出的Sign=" + calcSign);
            // return wmsResult;
        }
        return spdResult;
    }
}
