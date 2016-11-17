package com.el.cmic.callmdm.service;


import com.el.cfg.domain.Fe8log01;
import com.el.cmic.callmdm.mapper.Fe8Log01Mapper;
import com.el.cmic.common.domain.MdmFuncType;
import com.el.utils.JdeDateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Vincent on 2016/10/9.
 */
@Service(value = "fe8Log01ServiceImpl")
public class Fe8Log01ServiceImpl implements Fe8Log01Service {
    @Autowired
    private Fe8Log01Mapper fe8Log01Mapper;


    @Transactional
    public int insert(Fe8log01 fe8Log01) {

        return fe8Log01Mapper.insert(fe8Log01);

    }

    @Override
    @Transactional
    public int saveFe8Log01(String interActiveType,String code, String dataType, String data, String logType, String funcType, String msg) {
        Fe8log01 fe8Log01 = new Fe8log01();
        fe8Log01.setLglitm(code);
        if (msg.length() > 50) {
            msg = msg.substring(0, 50);//msg保存50字符
        }
        fe8Log01.setLgvar1(data);
        fe8Log01.setLguser("MDM");
        fe8Log01.setLgpid("Interface");
        fe8Log01.setLgjobn("Server");
        fe8Log01.setLgupmj(JdeDateUtil.toJdeDate(new Date()));
        fe8Log01.setLgupmt(new BigDecimal(JdeDateUtil.toJdeTime(new Date())));
        fe8Log01.setLgidate(new Date());
        fe8Log01.setLgdl01(logType);
        fe8Log01.setLgdl03(dataType);
        fe8Log01.setLgdl04(funcType);
        fe8Log01.setLgdl05(interActiveType);
        fe8Log01.setLgdl010(msg);

        return fe8Log01Mapper.insert(fe8Log01);
    }
}
