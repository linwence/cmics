package com.el.cmic.ws.service;

import com.el.cfg.domain.Fe841005;
import com.el.cmic.ws.mapper.FE841005UpdateByUkidpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by king_ on 2016/10/13.
 */
@Service
public class ModM0ESToERPServiceImpl implements  ModM0ESToERPService{
    @Autowired
    FE841005UpdateByUkidpMapper fe841005UpdateByUkidpMapper;
    @Value("${schema}")
    private String schema;
    @Transactional
    public String updateFE841005(BigDecimal reqno, String EoS) {
        Fe841005 fe841005 = new Fe841005();
        fe841005.setScukidp(reqno);
        fe841005.setScflag(EoS);
        fe841005UpdateByUkidpMapper.updateByUkidp(schema,fe841005);
        return null;
    }
}
