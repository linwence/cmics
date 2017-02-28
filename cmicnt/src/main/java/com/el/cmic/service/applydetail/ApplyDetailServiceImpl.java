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
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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


    @Override
    @Transactional
    public void insertOrUpdate(String data) {
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
            applyDetailMapper.insertFe8nt006(tableSchema,fe8nt006);
        }
    }
}
