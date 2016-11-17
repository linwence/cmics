package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841003;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by king_ on 2016/10/14.
 */
@Repository(value = "fe841003SelectByAn8Mapper")
public interface FE841003SelectByAn8Mapper {
    @Select({
            "select",
            "SQA427, SQE8TYM, SQCNEM, SQCNICL, SQCNYP ",
            "from CRPDTA.FE841003",
            "where SQUKID = #{ukid}"
    })

    Fe841003 selectByPrimaryKey(BigDecimal ukid);
}
