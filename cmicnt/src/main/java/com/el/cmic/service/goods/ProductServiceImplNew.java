package com.el.cmic.service.goods;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.NtInterfaceType;
import com.el.cmic.common.service.BasicService;
import com.el.cmic.domain.goods.Fe8nt001;
import com.el.cmic.mapper.goods.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Administrator on 2/28/2017.
 */
@Service
public class ProductServiceImplNew extends BasicService {
    @Autowired
    private ProductMapper productMapper;


    @PostConstruct
    public void init() {
        this.interFaceTypeByTime = NtInterfaceType.PRODUCT_BY_TIME;
        this.interFaceTypeByCode = NtInterfaceType.PRODUCT_BY_KEY;
    }

    @Override
    @Transactional
    public void insertOrUpdate(String data) {
        List<Fe8nt001> fe8nt001List = JSON.parseArray(data, Fe8nt001.class);
        if (fe8nt001List == null || fe8nt001List.size() == 0) {
            return;
        }
        for (Fe8nt001 fe8nt001 : fe8nt001List
                ) {
            if (StringUtils.isEmpty(fe8nt001.getSpaitm())) {
                continue;
            }
            Fe8nt001 fe8nt = productMapper.selectFe8nt001ByLitm(fe8nt001.getSpaitm());
            //判断是不是存在该商品，存在的话判断一下更新时间是不是比数据库的要新，如果新就需要更新表
            if (fe8nt != null) {
                int compareDateResult = fe8nt.getSprdate().compareTo(fe8nt001.getSprdate());
                if (compareDateResult < 0) {
                    productMapper.updateFe8nt001(tableSchema, fe8nt001);
                }
            } else {
                //不存在就插入数据
                productMapper.insertFe8nt001(tableSchema, fe8nt001);
            }
        }
    }
}
