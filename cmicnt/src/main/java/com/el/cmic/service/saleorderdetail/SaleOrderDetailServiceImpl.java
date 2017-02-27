package com.el.cmic.service.saleorderdetail;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.cmic.common.NtInterfaceType;
import com.el.cmic.common.NtRequestParam;
import com.el.cmic.domain.ntcfg.Fe8NtCfg;
import com.el.cmic.domain.saleorderdetail.Fe8nt004;
import com.el.cmic.mapper.saleorderdetail.SaleOrderDetailMapper;
import com.el.cmic.service.ntcfg.NtCfgService;
import com.el.cmic.utils.HttpRequestUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by king_ on 2017/2/17.
 */
@Service
public class SaleOrderDetailServiceImpl implements SaleOrderDetailService {
    Logger logger = Logger.getLogger(SaleOrderDetailServiceImpl.class);

    @Autowired
    SaleOrderDetailMapper saleOrderDetailMapper;
    @Resource
    private NtRequestParam ntRequestParam;
    @Autowired
    private NtCfgService ntCfgServiceImpl;

    @Value("${schema}")
    private String tableSchema;
    @Resource
    private HttpRequestUtil httpRequestUtil;

    private String url;

    @Override
    public int insertFe8nt004(String tableSchema , Fe8nt004 fe8nt004){
        return saleOrderDetailMapper.insertFe8nt004(tableSchema,fe8nt004);
    }

    @Override
    public void callNtInterface() {
        Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(NtInterfaceType.SALEDETAIL_BY_TIME);
        url = fe8NtCfg.getUrl();
        Date timeBegin;
        Date timeEnd;
        if(fe8NtCfg.getSuccessdate() == null){
            Calendar calendar = Calendar.getInstance();
            timeEnd = calendar.getTime();
            calendar.set(2017,0,1,0,0,0);
            timeBegin = calendar.getTime();
        }else{
            timeBegin = fe8NtCfg.getSuccessdate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(timeBegin);

            calendar.add(Calendar.SECOND,fe8NtCfg.getIntervalTime().intValue() * 60);
            timeEnd = calendar.getTime();

        }
        Date callDate = Calendar.getInstance().getTime();
        fe8NtCfg.setCalldate(callDate);
        if (this.callNtInterface(timeBegin, timeEnd)) {
            fe8NtCfg.setSuccessflag("S");
            fe8NtCfg.setSuccessdate(callDate);
        } else {
            fe8NtCfg.setSuccessflag("E");
        }
        //记录接口调用时间
        ntCfgServiceImpl.updateFe8NtCfg(fe8NtCfg);

    }

    @Override
    public boolean callNtInterface(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd) {
        try {
            if (StringUtils.isEmpty(url)) {
                Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(NtInterfaceType.SALEDETAIL_BY_TIME);
                url = fe8NtCfg.getUrl();
            }
            ntRequestParam.setTimeBegin(timeBegin);
            ntRequestParam.setTimeEnd(timeEnd);
            String result = httpRequestUtil.sendPost(url, ntRequestParam.toMap());

            if (!afterNtResponse(result)) return false;

        } catch (Exception ex) {
            logger.error("调用纳通订单明细接口失败;error:" + ex.getMessage());
            return false;
        }
        return true;

    }

    @Override
    public boolean callNtInterface(String code) {
        Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(NtInterfaceType.SALEDETAIL_BY_KEY);
        url = fe8NtCfg.getUrl();

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userCode", ntRequestParam.getUserCode());
        hashMap.put("pwd", ntRequestParam.getPwd());
        hashMap.put("code", code);
        try {

            String result = httpRequestUtil.sendPost(url, hashMap);

            if (!afterNtResponse(result)) return false;

        } catch (Exception ex) {
            logger.error("调用纳通订单明细接口(根据主键)接口失败;error:" + ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean afterNtResponse(String result) {
        JSONObject jsonObject = JSON.parseObject(result);
        String resultCode = jsonObject.get("resultCode").toString();
        String resultMsg = jsonObject.get("resultMsg").toString();
        if (!StringUtils.isEmpty(resultCode)) {
            if (resultCode.equals("1")) {
                String data = jsonObject.getString("data");
                //根据数据插入或者更新接口临时表
                insertOrUpdateFe8nt004(data);
            } else if (resultCode.equals("0") || resultCode.equals("-1")) {
                logger.error("调用订单明细接口失败,code=" + resultCode + ";error:" + resultMsg);
                return false;
            }
        }
        return true;
    }

    @Transactional
    public void insertOrUpdateFe8nt004(String data) {
        List<Fe8nt004> fe8nt004List = JSON.parseArray(data, Fe8nt004.class);
        for (Fe8nt004 fe8nt004 : fe8nt004List
                ) {
            Fe8nt004 fe8nt = saleOrderDetailMapper.selectDateByPK(tableSchema,fe8nt004.getSde8from(),fe8nt004.getSde8type(),fe8nt004.getSde8odno(),fe8nt004.getSde8lnid());
            //判断是不是存在该商品，存在的话判断一下更新时间是不是比数据库的要新，如果新就需要更新表
            /*if (fe8nt != null) {
                int compareDateResult = fe8nt.getSdredate().compareTo(fe8nt004.getSdredate());
                if (compareDateResult < 0) {
                    saleOrderDetailMapper.updateFe8nt004ByPK(tableSchema, fe8nt004);
                }
            } else {
                //不存在就插入数据
                insertFe8nt004(tableSchema, fe8nt004);
            }*/

            if(fe8nt != null){
                saleOrderDetailMapper.deleteFe8nt004ByPK(tableSchema,fe8nt004.getSde8from(),fe8nt004.getSde8type(),fe8nt004.getSde8odno(),fe8nt004.getSde8lnid());
            }
            saleOrderDetailMapper.insertFe8nt004(tableSchema,fe8nt004);
        }
    }

}
