package com.el.cmic.service.applyhead;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.cmic.common.NtInterfaceType;
import com.el.cmic.common.NtRequestParam;
import com.el.cmic.common.service.BasicService;
import com.el.cmic.domain.applyhead.Fe8nt005;
import com.el.cmic.domain.ntcfg.Fe8NtCfg;
import com.el.cmic.mapper.applyhead.ApplyHeadMapper;
import com.el.cmic.service.ntcfg.NtCfgService;
import com.el.cmic.utils.HttpClientUtil;
import com.el.cmic.utils.HttpRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
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
public class ApplyHeadServiceImpl extends BasicService {
    @Autowired
    private ApplyHeadMapper applyHeadMapper;

    @PostConstruct
    public void init(){
        this.interFaceTypeByTime = NtInterfaceType.APPLYHEAD_BY_TIME;
        this.interFaceTypeByCode = NtInterfaceType.APPLYHEAD_BY_KEY;
    }

    @Override
    @Transactional
    public void insertOrUpdate(String data) {
        List<Fe8nt005> fe8nt005List = JSON.parseArray(data, Fe8nt005.class);
        for (Fe8nt005 fe8nt005 : fe8nt005List
                ) {
            Fe8nt005 fe8nt = applyHeadMapper.selectDateByPK(tableSchema,fe8nt005.getKp58bdoc(),fe8nt005.getKp58bsn(),fe8nt005.getKp58bsys());
            //判断是不是存在该商品，存在的话判断一下更新时间是不是比数据库的要新，如果新就需要更新表
            /*if (fe8nt != null) {
                int compareDateResult = fe8nt.getKpredate().compareTo(fe8nt005.getKpredate());
                if (compareDateResult < 0) {
                    applyHeadMapper.updateFe8nt005ByPK(tableSchema, fe8nt005);
                }
            } else {
                //不存在就插入数据
                insertFe8nt005(tableSchema, fe8nt005);
            }*/
            if(fe8nt != null){
                applyHeadMapper.deleteFe8nt005ByPK(tableSchema,fe8nt005.getKp58bdoc(),fe8nt005.getKp58bsn(),fe8nt005.getKp58bsys());
            }
            applyHeadMapper.insertFe8nt005(tableSchema,fe8nt005);
        }
    }

}
