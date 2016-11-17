package com.el.cfg.mapper;

import com.el.cfg.domain.FE8SPD10;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FE8SPD10Mapper {
    @Delete({
        "delete from FE8SPD10",
        "where PHUKID = #{phukid,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal phukid);

    @Insert({
        "insert into FE8SPD10 (PHUKID, PHEV01, ",
        "PHE8SPDID, PHE8ERPID, ",
        "PHEIPSDW, PHE8PSDWE, ",
        "PHE8PSDWN, PHE8YHYY, ",
        "PHE8YHYYE, PHE8YHYYN, ",
        "PHE8YHKS, PHE8YHKSE, ",
        "PHE8YHKSN, PHE8SHKS, ",
        "PHE8SHKSE, PHE8SHKSN, ",
        "PHE8YWBME, PHE8YWBMN, ",
        "PHE8YWYE, PHE8YWYN, ",
        "PHE8CGDD, PHE8QGLX, ",
        "PHE8XTSJ, PHE8DDZHS)",
        "values (#{phukid,jdbcType=DECIMAL}, #{phev01,jdbcType=NCHAR}, ",
        "#{phe8spdid,jdbcType=NCHAR}, #{phe8erpid,jdbcType=NCHAR}, ",
        "#{pheipsdw,jdbcType=NCHAR}, #{phe8psdwe,jdbcType=NCHAR}, ",
        "#{phe8psdwn,jdbcType=NCHAR}, #{phe8yhyy,jdbcType=NCHAR}, ",
        "#{phe8yhyye,jdbcType=NCHAR}, #{phe8yhyyn,jdbcType=NCHAR}, ",
        "#{phe8yhks,jdbcType=NCHAR}, #{phe8yhkse,jdbcType=NCHAR}, ",
        "#{phe8yhksn,jdbcType=NCHAR}, #{phe8shks,jdbcType=NCHAR}, ",
        "#{phe8shkse,jdbcType=NCHAR}, #{phe8shksn,jdbcType=NCHAR}, ",
        "#{phe8ywbme,jdbcType=NCHAR}, #{phe8ywbmn,jdbcType=NCHAR}, ",
        "#{phe8ywye,jdbcType=NCHAR}, #{phe8ywyn,jdbcType=NCHAR}, ",
        "#{phe8cgdd,jdbcType=NCHAR}, #{phe8qglx,jdbcType=NCHAR}, ",
        "#{phe8xtsj,jdbcType=DECIMAL}, #{phe8ddzhs,jdbcType=DECIMAL})"
    })
    int insert(FE8SPD10 record);

    @Select({
        "select",
        "PHUKID, PHEV01, PHE8SPDID, PHE8ERPID, PHEIPSDW, PHE8PSDWE, PHE8PSDWN, PHE8YHYY, ",
        "PHE8YHYYE, PHE8YHYYN, PHE8YHKS, PHE8YHKSE, PHE8YHKSN, PHE8SHKS, PHE8SHKSE, PHE8SHKSN, ",
        "PHE8YWBME, PHE8YWBMN, PHE8YWYE, PHE8YWYN, PHE8CGDD, PHE8QGLX, PHE8XTSJ, PHE8DDZHS",
        "from FE8SPD10",
        "where PHUKID = #{phukid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="PHUKID", property="phukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PHEV01", property="phev01", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SPDID", property="phe8spdid", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8ERPID", property="phe8erpid", jdbcType=JdbcType.NCHAR),
        @Result(column="PHEIPSDW", property="pheipsdw", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8PSDWE", property="phe8psdwe", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8PSDWN", property="phe8psdwn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHYY", property="phe8yhyy", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHYYE", property="phe8yhyye", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHYYN", property="phe8yhyyn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHKS", property="phe8yhks", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHKSE", property="phe8yhkse", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHKSN", property="phe8yhksn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SHKS", property="phe8shks", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SHKSE", property="phe8shkse", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SHKSN", property="phe8shksn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWBME", property="phe8ywbme", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWBMN", property="phe8ywbmn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWYE", property="phe8ywye", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWYN", property="phe8ywyn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8CGDD", property="phe8cgdd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8QGLX", property="phe8qglx", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8XTSJ", property="phe8xtsj", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHE8DDZHS", property="phe8ddzhs", jdbcType=JdbcType.DECIMAL)
    })
    FE8SPD10 selectByPrimaryKey(BigDecimal phukid);

    @Select({
        "select",
        "PHUKID, PHEV01, PHE8SPDID, PHE8ERPID, PHEIPSDW, PHE8PSDWE, PHE8PSDWN, PHE8YHYY, ",
        "PHE8YHYYE, PHE8YHYYN, PHE8YHKS, PHE8YHKSE, PHE8YHKSN, PHE8SHKS, PHE8SHKSE, PHE8SHKSN, ",
        "PHE8YWBME, PHE8YWBMN, PHE8YWYE, PHE8YWYN, PHE8CGDD, PHE8QGLX, PHE8XTSJ, PHE8DDZHS",
        "from FE8SPD10"
    })
    @Results({
        @Result(column="PHUKID", property="phukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PHEV01", property="phev01", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SPDID", property="phe8spdid", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8ERPID", property="phe8erpid", jdbcType=JdbcType.NCHAR),
        @Result(column="PHEIPSDW", property="pheipsdw", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8PSDWE", property="phe8psdwe", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8PSDWN", property="phe8psdwn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHYY", property="phe8yhyy", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHYYE", property="phe8yhyye", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHYYN", property="phe8yhyyn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHKS", property="phe8yhks", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHKSE", property="phe8yhkse", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YHKSN", property="phe8yhksn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SHKS", property="phe8shks", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SHKSE", property="phe8shkse", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SHKSN", property="phe8shksn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWBME", property="phe8ywbme", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWBMN", property="phe8ywbmn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWYE", property="phe8ywye", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YWYN", property="phe8ywyn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8CGDD", property="phe8cgdd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8QGLX", property="phe8qglx", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8XTSJ", property="phe8xtsj", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHE8DDZHS", property="phe8ddzhs", jdbcType=JdbcType.DECIMAL)
    })
    List<FE8SPD10> selectAll();

    @Update({
        "update FE8SPD10",
        "set PHEV01 = #{phev01,jdbcType=NCHAR},",
          "PHE8SPDID = #{phe8spdid,jdbcType=NCHAR},",
          "PHE8ERPID = #{phe8erpid,jdbcType=NCHAR},",
          "PHEIPSDW = #{pheipsdw,jdbcType=NCHAR},",
          "PHE8PSDWE = #{phe8psdwe,jdbcType=NCHAR},",
          "PHE8PSDWN = #{phe8psdwn,jdbcType=NCHAR},",
          "PHE8YHYY = #{phe8yhyy,jdbcType=NCHAR},",
          "PHE8YHYYE = #{phe8yhyye,jdbcType=NCHAR},",
          "PHE8YHYYN = #{phe8yhyyn,jdbcType=NCHAR},",
          "PHE8YHKS = #{phe8yhks,jdbcType=NCHAR},",
          "PHE8YHKSE = #{phe8yhkse,jdbcType=NCHAR},",
          "PHE8YHKSN = #{phe8yhksn,jdbcType=NCHAR},",
          "PHE8SHKS = #{phe8shks,jdbcType=NCHAR},",
          "PHE8SHKSE = #{phe8shkse,jdbcType=NCHAR},",
          "PHE8SHKSN = #{phe8shksn,jdbcType=NCHAR},",
          "PHE8YWBME = #{phe8ywbme,jdbcType=NCHAR},",
          "PHE8YWBMN = #{phe8ywbmn,jdbcType=NCHAR},",
          "PHE8YWYE = #{phe8ywye,jdbcType=NCHAR},",
          "PHE8YWYN = #{phe8ywyn,jdbcType=NCHAR},",
          "PHE8CGDD = #{phe8cgdd,jdbcType=NCHAR},",
          "PHE8QGLX = #{phe8qglx,jdbcType=NCHAR},",
          "PHE8XTSJ = #{phe8xtsj,jdbcType=DECIMAL},",
          "PHE8DDZHS = #{phe8ddzhs,jdbcType=DECIMAL}",
        "where PHUKID = #{phukid,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(FE8SPD10 record);
}