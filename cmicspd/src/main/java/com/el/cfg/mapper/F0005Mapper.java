package com.el.cfg.mapper;

import com.el.cfg.domain.F0005;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface F0005Mapper {
    @Select({
        "select",
        "DRSY, DRRT, DRKY, DRDL01, DRDL02, DRSPHD, DRUDCO, DRHRDC, DRUSER, DRPID, DRUPMJ, ",
        "DRJOBN, DRUPMT",
        "from F0005",
        "where DRSY = #{drsy,jdbcType=NCHAR}",
          "and DRRT = #{drrt,jdbcType=NCHAR}",
          "and DRKY = #{drky,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="DRSY", property="drsy", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRRT", property="drrt", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRKY", property="drky", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRDL01", property="drdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="DRDL02", property="drdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="DRSPHD", property="drsphd", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUDCO", property="drudco", jdbcType=JdbcType.NCHAR),
        @Result(column="DRHRDC", property="drhrdc", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUSER", property="druser", jdbcType=JdbcType.NCHAR),
        @Result(column="DRPID", property="drpid", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUPMJ", property="drupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="DRJOBN", property="drjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUPMT", property="drupmt", jdbcType=JdbcType.DECIMAL)
    })
    F0005 selectByPrimaryKey(@Param("drsy") String drsy, @Param("drrt") String drrt, @Param("drky") String drky);

    @Select({
        "select",
        "DRSY, DRRT, DRKY, DRDL01, DRDL02, DRSPHD, DRUDCO, DRHRDC, DRUSER, DRPID, DRUPMJ, ",
        "DRJOBN, DRUPMT",
        "from F0005"
    })
    @Results({
        @Result(column="DRSY", property="drsy", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRRT", property="drrt", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRKY", property="drky", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRDL01", property="drdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="DRDL02", property="drdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="DRSPHD", property="drsphd", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUDCO", property="drudco", jdbcType=JdbcType.NCHAR),
        @Result(column="DRHRDC", property="drhrdc", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUSER", property="druser", jdbcType=JdbcType.NCHAR),
        @Result(column="DRPID", property="drpid", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUPMJ", property="drupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="DRJOBN", property="drjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="DRUPMT", property="drupmt", jdbcType=JdbcType.DECIMAL)
    })
    List<F0005> selectAll();
}