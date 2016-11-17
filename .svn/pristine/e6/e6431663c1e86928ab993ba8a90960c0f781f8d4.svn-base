package com.el.cfg.mapper;

import com.el.cfg.domain.VE8SPDJG;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface VE8SPDJGMapper {
    @Select({
        "select",
        "SPDBS, ERPBS, CO, NAME, LITM, E8NAME, UPRC",
        "from VE8SPDJG"
    })
    @Results({
        @Result(column="SPDBS", property="spdbs", jdbcType=JdbcType.CHAR),
        @Result(column="ERPBS", property="erpbs", jdbcType=JdbcType.CHAR),
        @Result(column="CO", property="co", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="LITM", property="litm", jdbcType=JdbcType.NCHAR),
        @Result(column="E8NAME", property="e8name", jdbcType=JdbcType.CHAR),
        @Result(column="UPRC", property="uprc", jdbcType=JdbcType.DECIMAL)
    })
    List<VE8SPDJG> selectAll();
}