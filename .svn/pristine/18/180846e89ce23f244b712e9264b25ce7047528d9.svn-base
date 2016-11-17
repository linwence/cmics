package com.el.cfg.mapper;

import com.el.cfg.domain.FE8SPD01;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8SPD01Mapper {
    @Select({
        "select",
        "SPLITM, SPEV10, SPITM, SPD10, SPBEG1, SPD09, SPBEG2, SPIDATE, SPRDATE, SPDL01, ",
        "SPDL02, SPDL03, SPAB01, SPAB02, SPAB03, SPEV01, SPEV02, SPUSER, SPPID, SPUPMJ, ",
        "SPTDAY, SPAOD",
        "from FE8SPD01",
        "where SPLITM = #{splitm,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="SPLITM", property="splitm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="SPEV10", property="spev10", jdbcType=JdbcType.NCHAR),
        @Result(column="SPITM", property="spitm", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPD10", property="spd10", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPBEG1", property="spbeg1", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPD09", property="spd09", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPBEG2", property="spbeg2", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPIDATE", property="spidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SPRDATE", property="sprdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SPDL01", property="spdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="SPDL02", property="spdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="SPDL03", property="spdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="SPAB01", property="spab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPAB02", property="spab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPAB03", property="spab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPEV01", property="spev01", jdbcType=JdbcType.NCHAR),
        @Result(column="SPEV02", property="spev02", jdbcType=JdbcType.NCHAR),
        @Result(column="SPUSER", property="spuser", jdbcType=JdbcType.NCHAR),
        @Result(column="SPPID", property="sppid", jdbcType=JdbcType.NCHAR),
        @Result(column="SPUPMJ", property="spupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPTDAY", property="sptday", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPAOD", property="spaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8SPD01 selectByPrimaryKey(String splitm);

    @Select({
        "select",
        "SPLITM, SPEV10, SPITM, SPD10, SPBEG1, SPD09, SPBEG2, SPIDATE, SPRDATE, SPDL01, ",
        "SPDL02, SPDL03, SPAB01, SPAB02, SPAB03, SPEV01, SPEV02, SPUSER, SPPID, SPUPMJ, ",
        "SPTDAY, SPAOD",
        "from FE8SPD01"
    })
    @Results({
        @Result(column="SPLITM", property="splitm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="SPEV10", property="spev10", jdbcType=JdbcType.NCHAR),
        @Result(column="SPITM", property="spitm", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPD10", property="spd10", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPBEG1", property="spbeg1", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPD09", property="spd09", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPBEG2", property="spbeg2", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPIDATE", property="spidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SPRDATE", property="sprdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SPDL01", property="spdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="SPDL02", property="spdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="SPDL03", property="spdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="SPAB01", property="spab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPAB02", property="spab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPAB03", property="spab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPEV01", property="spev01", jdbcType=JdbcType.NCHAR),
        @Result(column="SPEV02", property="spev02", jdbcType=JdbcType.NCHAR),
        @Result(column="SPUSER", property="spuser", jdbcType=JdbcType.NCHAR),
        @Result(column="SPPID", property="sppid", jdbcType=JdbcType.NCHAR),
        @Result(column="SPUPMJ", property="spupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPTDAY", property="sptday", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPAOD", property="spaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8SPD01> selectAll();
}