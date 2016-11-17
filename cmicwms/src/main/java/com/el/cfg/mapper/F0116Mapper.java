package com.el.cfg.mapper;

import com.el.cfg.domain.F0116;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface F0116Mapper {
    @Select({
        "select",
        "ALAN8, ALEFTB, ALEFTF, ALADD1, ALADD2, ALADD3, ALADD4, ALADDZ, ALCTY1, ALCOUN, ",
        "ALADDS, ALCRTE, ALBKML, ALCTR, ALUSER, ALPID, ALUPMJ, ALJOBN, ALUPMT, ALSYNCS, ",
        "ALCAAD",
        "from F0116",
        "where ALAN8 = #{alan8,jdbcType=DECIMAL}",
          "and ALEFTB = #{aleftb,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ALAN8", property="alan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ALEFTB", property="aleftb", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ALEFTF", property="aleftf", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD1", property="aladd1", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD2", property="aladd2", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD3", property="aladd3", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD4", property="aladd4", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADDZ", property="aladdz", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCTY1", property="alcty1", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCOUN", property="alcoun", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADDS", property="aladds", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCRTE", property="alcrte", jdbcType=JdbcType.NCHAR),
        @Result(column="ALBKML", property="albkml", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCTR", property="alctr", jdbcType=JdbcType.NCHAR),
        @Result(column="ALUSER", property="aluser", jdbcType=JdbcType.NCHAR),
        @Result(column="ALPID", property="alpid", jdbcType=JdbcType.NCHAR),
        @Result(column="ALUPMJ", property="alupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ALJOBN", property="aljobn", jdbcType=JdbcType.NCHAR),
        @Result(column="ALUPMT", property="alupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ALSYNCS", property="alsyncs", jdbcType=JdbcType.DECIMAL),
        @Result(column="ALCAAD", property="alcaad", jdbcType=JdbcType.DECIMAL)
    })
    F0116 selectByPrimaryKey(@Param("alan8") BigDecimal alan8, @Param("aleftb") Integer aleftb);

    @Select({
        "select",
        "ALAN8, ALEFTB, ALEFTF, ALADD1, ALADD2, ALADD3, ALADD4, ALADDZ, ALCTY1, ALCOUN, ",
        "ALADDS, ALCRTE, ALBKML, ALCTR, ALUSER, ALPID, ALUPMJ, ALJOBN, ALUPMT, ALSYNCS, ",
        "ALCAAD",
        "from F0116"
    })
    @Results({
        @Result(column="ALAN8", property="alan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ALEFTB", property="aleftb", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ALEFTF", property="aleftf", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD1", property="aladd1", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD2", property="aladd2", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD3", property="aladd3", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADD4", property="aladd4", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADDZ", property="aladdz", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCTY1", property="alcty1", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCOUN", property="alcoun", jdbcType=JdbcType.NCHAR),
        @Result(column="ALADDS", property="aladds", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCRTE", property="alcrte", jdbcType=JdbcType.NCHAR),
        @Result(column="ALBKML", property="albkml", jdbcType=JdbcType.NCHAR),
        @Result(column="ALCTR", property="alctr", jdbcType=JdbcType.NCHAR),
        @Result(column="ALUSER", property="aluser", jdbcType=JdbcType.NCHAR),
        @Result(column="ALPID", property="alpid", jdbcType=JdbcType.NCHAR),
        @Result(column="ALUPMJ", property="alupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ALJOBN", property="aljobn", jdbcType=JdbcType.NCHAR),
        @Result(column="ALUPMT", property="alupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ALSYNCS", property="alsyncs", jdbcType=JdbcType.DECIMAL),
        @Result(column="ALCAAD", property="alcaad", jdbcType=JdbcType.DECIMAL)
    })
    List<F0116> selectAll();
}