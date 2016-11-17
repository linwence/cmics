package com.el.cfg.mapper;

import com.el.cfg.domain.F0115;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface F0115Mapper {
    @Select({
        "select",
        "WPAN8, WPIDLN, WPCNLN, WPRCK7, WPPHTP, WPAR1, WPPH1, WPUSER, WPPID, WPUPMJ, ",
        "WPJOBN, WPUPMT, WPCFNO1, WPGEN1, WPFALGE, WPSYNCS, WPCAAD",
        "from F0115",
        "where WPAN8 = #{wpan8,jdbcType=DECIMAL}",
          "and WPIDLN = #{wpidln,jdbcType=DECIMAL}",
          "and WPCNLN = #{wpcnln,jdbcType=DECIMAL}",
          "and WPRCK7 = #{wprck7,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="WPAN8", property="wpan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPIDLN", property="wpidln", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPCNLN", property="wpcnln", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPRCK7", property="wprck7", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPPHTP", property="wpphtp", jdbcType=JdbcType.NCHAR),
        @Result(column="WPAR1", property="wpar1", jdbcType=JdbcType.NCHAR),
        @Result(column="WPPH1", property="wpph1", jdbcType=JdbcType.NCHAR),
        @Result(column="WPUSER", property="wpuser", jdbcType=JdbcType.NCHAR),
        @Result(column="WPPID", property="wppid", jdbcType=JdbcType.NCHAR),
        @Result(column="WPUPMJ", property="wpupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPJOBN", property="wpjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="WPUPMT", property="wpupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPCFNO1", property="wpcfno1", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPGEN1", property="wpgen1", jdbcType=JdbcType.NCHAR),
        @Result(column="WPFALGE", property="wpfalge", jdbcType=JdbcType.NCHAR),
        @Result(column="WPSYNCS", property="wpsyncs", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPCAAD", property="wpcaad", jdbcType=JdbcType.DECIMAL)
    })
    F0115 selectByPrimaryKey(@Param("wpan8") BigDecimal wpan8, @Param("wpidln") BigDecimal wpidln, @Param("wpcnln") BigDecimal wpcnln, @Param("wprck7") BigDecimal wprck7);

    @Select({
        "select",
        "WPAN8, WPIDLN, WPCNLN, WPRCK7, WPPHTP, WPAR1, WPPH1, WPUSER, WPPID, WPUPMJ, ",
        "WPJOBN, WPUPMT, WPCFNO1, WPGEN1, WPFALGE, WPSYNCS, WPCAAD",
        "from F0115"
    })
    @Results({
        @Result(column="WPAN8", property="wpan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPIDLN", property="wpidln", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPCNLN", property="wpcnln", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPRCK7", property="wprck7", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="WPPHTP", property="wpphtp", jdbcType=JdbcType.NCHAR),
        @Result(column="WPAR1", property="wpar1", jdbcType=JdbcType.NCHAR),
        @Result(column="WPPH1", property="wpph1", jdbcType=JdbcType.NCHAR),
        @Result(column="WPUSER", property="wpuser", jdbcType=JdbcType.NCHAR),
        @Result(column="WPPID", property="wppid", jdbcType=JdbcType.NCHAR),
        @Result(column="WPUPMJ", property="wpupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPJOBN", property="wpjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="WPUPMT", property="wpupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPCFNO1", property="wpcfno1", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPGEN1", property="wpgen1", jdbcType=JdbcType.NCHAR),
        @Result(column="WPFALGE", property="wpfalge", jdbcType=JdbcType.NCHAR),
        @Result(column="WPSYNCS", property="wpsyncs", jdbcType=JdbcType.DECIMAL),
        @Result(column="WPCAAD", property="wpcaad", jdbcType=JdbcType.DECIMAL)
    })
    List<F0115> selectAll();
}