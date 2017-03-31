package com.el.cmic.common.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.cmic.common.NtRequestParam;
import com.el.cmic.domain.ntcfg.Fe8NtCfg;
import com.el.cmic.service.ntcfg.NtCfgService;
import com.el.cmic.utils.HttpClientUtil;
import com.el.cmic.utils.HttpRequestUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Vincent on 2017/2/14.
 */
@Service
public class BasicService  {
     protected Logger logger = Logger.getLogger(BasicService.class);

    @Resource
    protected NtRequestParam ntRequestParam;
    @Autowired
    protected NtCfgService ntCfgServiceImpl;

    protected String interFaceTypeByTime;
    protected String interFaceTypeByCode;

    protected Date rdate;

    @Value("${schema}")
    protected String tableSchema;

    @Resource
    private HttpRequestUtil httpRequestUtil;

    @Resource
    protected HttpClientUtil httpClientUtil;

    protected String url;


    public void callNtInterface() {
        Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(this.interFaceTypeByTime);
        if(fe8NtCfg.getValidflag().equals("N")){
            logger.info("接口"+this.interFaceTypeByTime+"未启用");
            return;
        }
        url = fe8NtCfg.getUrl();
        Date timeBegin;
        Date timeEnd;
        Date callDate = Calendar.getInstance().getTime();
        timeEnd=Calendar.getInstance().getTime();
        //如果成功调用日期为空，说明是第一次执行，第一次执行的话，数据开始时间从2017年1月1号开始
        if (fe8NtCfg.getSuccessdate() == null) {
            Calendar calendar = Calendar.getInstance();
           // timeEnd = calendar.getTime();
            calendar.set(2017, 0, 1, 0, 0, 0);
            timeBegin = calendar.getTime();
        } else {
            //执行成功的时间作为开始时间进行查询
            timeBegin = fe8NtCfg.getSuccessdate();


            //时间范围从执行成功时间开始+时间间隔
            //calendar.add(Calendar.SECOND, fe8NtCfg.getIntervalTime().intValue() * 60);
           // timeEnd = calendar.getTime();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeBegin);
        //时间范围从执行成功时间开始+1秒
        calendar.add(Calendar.SECOND, 1);
        timeBegin=calendar.getTime();

        fe8NtCfg.setCalldate(callDate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info("[callDate]=" + simpleDateFormat.format(callDate) + "[timeBegin]=" + simpleDateFormat.format(timeBegin) + ";[timeEnd]=" + simpleDateFormat.format(timeEnd));

        if (this.callNtInterface(timeBegin, timeEnd)) {
            fe8NtCfg.setSuccessflag("S");
            /*if (callDate.compareTo(timeEnd) > 0) {
                fe8NtCfg.setSuccessdate(timeEnd);
            } else {
                fe8NtCfg.setSuccessdate(callDate);
            }*/

           // logger.info("[successDate]=" + simpleDateFormat.format(fe8NtCfg.getSuccessdate()));
        } else {
            fe8NtCfg.setSuccessflag("E");
        }
        fe8NtCfg.setSuccessdate(this.rdate);

        //记录接口调用时间
        if(this.rdate!=null){
            ntCfgServiceImpl.updateFe8NtCfg(fe8NtCfg);
        }

    }

    public boolean callNtInterface(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd) {
        try {
            if (StringUtils.isEmpty(url)) {
                Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(this.interFaceTypeByTime);
                url = fe8NtCfg.getUrl();
            }
            ntRequestParam.setTimeBegin(timeBegin);
            ntRequestParam.setTimeEnd(timeEnd);
            // String result = httpRequestUtil.sendPost(url, ntRequestParam.toMap());
            String result = httpClientUtil.doPost(url, ntRequestParam.toMap(), "UTF-8");

            //--------------------------------------------------------------------------------------
            if (!afterNtResponse(result)) return false;

        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("调用纳通商品接口失败;error:" + ex.getMessage());
            return false;
        }
        return true;

    }

    public boolean callNtInterface(String code) {
        Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(this.interFaceTypeByCode);
        url = fe8NtCfg.getUrl();

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userCode", ntRequestParam.getUserCode());
        hashMap.put("pwd", ntRequestParam.getPwd());
        hashMap.put("code", code);
        try {

            String result = httpClientUtil.doPost(url, hashMap,"utf-8");

            if (!afterNtResponse(result)) return false;

        } catch (Exception ex) {
            logger.error("调用纳通产品证照信息(根据主键)接口失败;error:" + ex.getMessage());
            return false;
        }
        return true;
    }

    /**
     * 处理纳通返回的数据
     *
     * @param result
     * @return
     */
    public boolean afterNtResponse(String result) {
        JSONObject jsonObject = JSON.parseObject(result);
        String resultCode = jsonObject.get("resultCode").toString();
        String resultMsg = jsonObject.get("resultMsg").toString();
        if (!StringUtils.isEmpty(resultCode)) {
            if (resultCode.equals("1")) {
                String data = jsonObject.getString("data");
                if (StringUtils.isEmpty(data)) {
                    return true;
                }
                //根据数据插入或者更新接口临时表
                insertOrUpdate(data);
            } else if (resultCode.equals("0") || resultCode.equals("-1")) {
                logger.error("调用纳通商品接口失败,code=" + resultCode + ";error:" + resultMsg);
                return false;
            }
        }
        return true;
    }

    public void insertOrUpdate(String data) {

    }
}
