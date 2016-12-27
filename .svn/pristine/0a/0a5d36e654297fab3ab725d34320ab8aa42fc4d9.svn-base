package com.el.cfg.mapper;

import com.el.cfg.domain.Ve8wms20;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Ve8wms20Mapper {
    @Select({
        "select",
        "LSE8WLZXID, LSE8HZBM, LSCO, LSMCU, LSE8APPK, LSEPAPSD, CCNAME",
        "from VE8WMS20"
    })
    @Results({
        @Result(column="LSE8WLZXID", property="lse8wlzxid", jdbcType=JdbcType.NCHAR),
        @Result(column="LSE8HZBM", property="lse8hzbm", jdbcType=JdbcType.NCHAR),
        @Result(column="LSCO", property="lsco", jdbcType=JdbcType.NCHAR),
        @Result(column="LSMCU", property="lsmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="LSE8APPK", property="lse8appk", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEPAPSD", property="lsepapsd", jdbcType=JdbcType.NCHAR),
        @Result(column="CCNAME", property="ccname", jdbcType=JdbcType.NCHAR)
    })
    List<Ve8wms20> selectAll();
}