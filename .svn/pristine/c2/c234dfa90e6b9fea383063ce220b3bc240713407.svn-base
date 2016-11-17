package com.el.cfg.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.el.cmic.domain.log.Fe8wmslg;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface fe8wmslgMapper {
    @Select({
        "select",
        "LSUKID, LSKCOO, LSDCTO, LSDOCO, LSDL01, LSDL02, LSDL03, LSDL010, LSVAR1, LSUSER, ",
        "LSPID, LSJOBN, LSUPMJ, LSUPMT",
        "from FE8WMSLG",
        "where LSUKID = #{lsukid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="LSUKID", property="lsukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LSKCOO", property="lskcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDCTO", property="lsdcto", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDOCO", property="lsdoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSDL01", property="lsdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL02", property="lsdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL03", property="lsdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL010", property="lsdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="LSVAR1", property="lsvar1", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUSER", property="lsuser", jdbcType=JdbcType.NCHAR),
        @Result(column="LSPID", property="lspid", jdbcType=JdbcType.NCHAR),
        @Result(column="LSJOBN", property="lsjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUPMJ", property="lsupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSUPMT", property="lsupmt", jdbcType=JdbcType.DECIMAL)
    })
    Fe8wmslg selectByPrimaryKey(BigDecimal lsukid);

    @Select({
        "select",
        "LSUKID, LSKCOO, LSDCTO, LSDOCO, LSDL01, LSDL02, LSDL03, LSDL010, LSVAR1, LSUSER, ",
        "LSPID, LSJOBN, LSUPMJ, LSUPMT",
        "from FE8WMSLG"
    })
    @Results({
        @Result(column="LSUKID", property="lsukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LSKCOO", property="lskcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDCTO", property="lsdcto", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDOCO", property="lsdoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSDL01", property="lsdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL02", property="lsdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL03", property="lsdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL010", property="lsdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="LSVAR1", property="lsvar1", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUSER", property="lsuser", jdbcType=JdbcType.NCHAR),
        @Result(column="LSPID", property="lspid", jdbcType=JdbcType.NCHAR),
        @Result(column="LSJOBN", property="lsjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUPMJ", property="lsupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSUPMT", property="lsupmt", jdbcType=JdbcType.DECIMAL)
    })
    List<Fe8wmslg> selectAll();
}