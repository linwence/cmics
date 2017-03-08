package com.el.cmic.service.applydetail;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.cmic.common.NtInterfaceType;
import com.el.cmic.common.NtRequestParam;
import com.el.cmic.common.service.BasicService;
import com.el.cmic.domain.applydetail.Fe8nt006;
import com.el.cmic.domain.ntcfg.Fe8NtCfg;
import com.el.cmic.mapper.applydetail.ApplyDetailMapper;
import com.el.cmic.service.ntcfg.NtCfgService;
import com.el.cmic.utils.HttpClientUtil;
import com.el.cmic.utils.HttpRequestUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.*;

/**
 * Created by king_ on 2017/2/21.
 */
@Service
public class ApplyDetailServiceImpl extends BasicService {
    @Autowired
    private ApplyDetailMapper applyDetailMapper;

    @PostConstruct
    public void init(){
        this.interFaceTypeByTime = NtInterfaceType.APPLYDETAIL_BY_TIME;
        this.interFaceTypeByCode = NtInterfaceType.APPLYDETAIL_BY_KEY;
    }


    public boolean callNtInterface(String code,String lnid) {
        Fe8NtCfg fe8NtCfg = ntCfgServiceImpl.selectFe8NtCfgByInterfaceName(this.interFaceTypeByCode);
        url = fe8NtCfg.getUrl();

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userCode", ntRequestParam.getUserCode());
        hashMap.put("pwd", ntRequestParam.getPwd());
        hashMap.put("doc", code);
        hashMap.put("lnid",lnid);
        try {

            String result = httpClientUtil.doPost(url, hashMap,"utf-8");

            if (!afterNtResponse(result)) return false;

        } catch (Exception ex) {
            logger.error("调用纳通发票申请明细信息(根据主键)接口失败;error:" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void insertOrUpdate(String data) {
        List<Fe8nt006> fe8nt006List = JSON.parseArray(data, Fe8nt006.class);

        if(fe8nt006List == null || fe8nt006List.size() == 0){
            this.rdate = null;
            return;
        }

        Collections.sort(fe8nt006List);

        logger.info(fe8nt006List.get(0).toString());
        this.rdate = fe8nt006List.get(fe8nt006List.size()-1).getKdredate();
        logger.info(fe8nt006List.get(fe8nt006List.size()-1).getKdredate());

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
                //applyDetailMapper.deleteFe8nt006ByPK(tableSchema,fe8nt006.getKd58bdoc(),fe8nt006.getKd58bsn(),fe8nt006.getKdlnid());
                logger.info("该条数据已经存在"+fe8nt.toString());
            }
            applyDetailMapper.insertFe8nt006(tableSchema,fe8nt006);
        }
    }
}
