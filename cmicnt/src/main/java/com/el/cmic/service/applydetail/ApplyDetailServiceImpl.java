package com.el.cmic.service.applydetail;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.cmic.common.NtInterfaceType;
import com.el.cmic.common.NtRequestParam;
import com.el.cmic.domain.applydetail.Fe8nt006;
import com.el.cmic.domain.ntcfg.Fe8NtCfg;
import com.el.cmic.mapper.applydetail.ApplyDetailMapper;
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
 * Created by king_ on 2017/2/21.
 */
@Service
public class ApplyDetailServiceImpl implements ApplyDetailService {
    Logger logger = Logger.getLogger(ApplyDetailServiceImpl.class);
    @Autowired
    private ApplyDetailMapper applyDetailMapper;
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
    public int insertFe8nt006(String tableSchema, Fe8nt006 fe8nt006){
        return applyDetailMapper.insertFe8nt006(tableSchema,fe8nt006);
    }

    @Override
    public void callNtInterface() {
        Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(NtInterfaceType.APPLYDETAIL_BY_TIME);
        url = fe8NtCfg.getUrl();
        Date timeBegin;
        Date timeEnd;
        //如果成功调用日期为空，说明是第一次执行，第一次执行的话，数据开始时间从2017年1月1号开始
        if (fe8NtCfg.getSuccessdate() == null) {
            Calendar calendar = Calendar.getInstance();
            timeEnd = calendar.getTime();
            calendar.set(2017, 0, 1, 0, 0, 0);
            timeBegin = calendar.getTime();
        } else {
            //执行成功的时间作为开始时间进行查询
            timeBegin = fe8NtCfg.getSuccessdate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(timeBegin);

            //时间范围从执行成功时间开始+时间间隔
            calendar.add(Calendar.SECOND, fe8NtCfg.getIntervalTime().intValue() * 60);
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
                Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(NtInterfaceType.APPLYDETAIL_BY_TIME);
                url = fe8NtCfg.getUrl();
            }
            ntRequestParam.setTimeBegin(timeBegin);
            ntRequestParam.setTimeEnd(timeEnd);
            String result = httpRequestUtil.sendPost(url, ntRequestParam.toMap());

            if (!afterNtResponse(result)) return false;

        } catch (Exception ex) {
            logger.error("调用纳通发票申请明细接口失败;error:" + ex.getMessage());
            return false;
        }
        return true;

    }

    @Override
    public boolean callNtInterface(String code) {
        Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(NtInterfaceType.APPLYDETAIL_BY_KEY);
        url = fe8NtCfg.getUrl();

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userCode", ntRequestParam.getUserCode());
        hashMap.put("pwd", ntRequestParam.getPwd());
        hashMap.put("code", code);
        try {

            String result = httpRequestUtil.sendPost(url, hashMap);

            if (!afterNtResponse(result)) return false;

        } catch (Exception ex) {
            logger.error("调用纳通发票申请明细(根据主键)接口失败;error:" + ex.getMessage());
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
                insertOrUpdateFe8nt006(data);
            } else if (resultCode.equals("0") || resultCode.equals("-1")) {
                logger.error("调用纳通发票申请明细失败,code=" + resultCode + ";error:" + resultMsg);
                return false;
            }
        }
        return true;
    }

    @Transactional
    public void insertOrUpdateFe8nt006(String data) {
        List<Fe8nt006> fe8nt006List = JSON.parseArray(data, Fe8nt006.class);
        for (Fe8nt006 fe8nt006 : fe8nt006List
                ) {
            Fe8nt006 fe8nt = applyDetailMapper.selectFe8nt006DateByPK(tableSchema,fe8nt006.getKd58bdoc(),fe8nt006.getKd58bsn(),fe8nt006.getKdlnid());
            //判断是不是存在该商品，存在的话判断一下更新时间是不是比数据库的要新，如果新就需要更新表
           /* if (fe8nt != null) {
                int compareDateResult = fe8nt.getKdredate().compareTo(fe8nt006.getKdredate());
                if (compareDateResult < 0) {
                    applyDetailMapper.updateFe8nt006ByPK(tableSchema, fe8nt006);
                }
            } else {
                //不存在就插入数据
                insertFe8nt006(tableSchema, fe8nt006);
            }*/

            if(fe8nt != null){
                applyDetailMapper.deleteFe8nt006ByPK(tableSchema,fe8nt006.getKd58bdoc(),fe8nt006.getKd58bsn(),fe8nt006.getKdlnid());
            }
            insertFe8nt006(tableSchema,fe8nt006);
        }
    }
}
