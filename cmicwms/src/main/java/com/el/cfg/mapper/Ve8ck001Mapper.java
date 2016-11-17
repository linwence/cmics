package com.el.cfg.mapper;

import com.el.cfg.domain.Ve8ck001;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Ve8ck001Mapper {
    @Select({
        "select",
        "MCU, WMSMCU, DCTO, CKTYPE, CO, WMSCO, DOCO, AN8, AT1, ALPH, VR01, REMARK, ADDRESS, ",
        "TRDJ, DEPTNAME, FLAG",
        "from VE8CK001"
    })
    @Results({
        @Result(column="MCU", property="mcu", jdbcType=JdbcType.NCHAR),
        @Result(column="WMSMCU", property="wmsmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="DCTO", property="dcto", jdbcType=JdbcType.NCHAR),
        @Result(column="CKTYPE", property="cktype", jdbcType=JdbcType.VARCHAR),
        @Result(column="CO", property="co", jdbcType=JdbcType.NCHAR),
        @Result(column="WMSCO", property="wmsco", jdbcType=JdbcType.NCHAR),
        @Result(column="DOCO", property="doco", jdbcType=JdbcType.DECIMAL),
        @Result(column="AN8", property="an8", jdbcType=JdbcType.DECIMAL),
        @Result(column="AT1", property="at1", jdbcType=JdbcType.DECIMAL),
        @Result(column="ALPH", property="alph", jdbcType=JdbcType.NCHAR),
        @Result(column="VR01", property="vr01", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.CHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.NCHAR),
        @Result(column="TRDJ", property="trdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="DEPTNAME", property="deptname", jdbcType=JdbcType.CHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.CHAR)
    })
    List<Ve8ck001> selectAll();
}