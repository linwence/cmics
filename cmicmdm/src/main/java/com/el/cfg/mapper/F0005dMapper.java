package com.el.cfg.mapper;

import com.el.cfg.domain.F0005d;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface F0005dMapper {
    @Select({
        "select",
        "DRSY, DRRT, DRKY, DRLNGP, DRDL01, DRDL02",
        "from F0005D",
        "where DRSY = #{drsy,jdbcType=NCHAR}",
          "and DRRT = #{drrt,jdbcType=NCHAR}",
          "and DRKY = #{drky,jdbcType=NCHAR}",
          "and DRLNGP = #{drlngp,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="DRSY", property="drsy", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRRT", property="drrt", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRKY", property="drky", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRLNGP", property="drlngp", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRDL01", property="drdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="DRDL02", property="drdl02", jdbcType=JdbcType.NCHAR)
    })
    F0005d selectByPrimaryKey(@Param("drsy") String drsy, @Param("drrt") String drrt, @Param("drky") String drky, @Param("drlngp") String drlngp);

    @Select({
        "select",
        "DRSY, DRRT, DRKY, DRLNGP, DRDL01, DRDL02",
        "from F0005D"
    })
    @Results({
        @Result(column="DRSY", property="drsy", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRRT", property="drrt", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRKY", property="drky", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRLNGP", property="drlngp", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DRDL01", property="drdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="DRDL02", property="drdl02", jdbcType=JdbcType.NCHAR)
    })
    List<F0005d> selectAll();
}