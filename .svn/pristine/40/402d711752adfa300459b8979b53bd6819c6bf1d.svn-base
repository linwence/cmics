package com.el.cfg.mapper;

import com.el.cfg.domain.FE8SPD11;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FE8SPD11Mapper {
    @Delete({
        "delete from FE8SPD11",
        "where PHUKID = #{phukid,jdbcType=DECIMAL}",
          "and PHLNID = #{phlnid,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(@Param("phukid") BigDecimal phukid, @Param("phlnid") BigDecimal phlnid);

    @Insert({
        "insert into FE8SPD11 (PHUKID, PHLNID, ",
        "PHEV01, PHE8YLJGD, PHE8KSD, ",
        "PHE8ZDGYSE, PHE8ZDGYSN, ",
        "PHTRDJ, PHE8YYYCD, ",
        "PHE8YYYCE, PHE8YYYCN, ",
        "PHE8SGG, PHE8SCCS, PHE8SCD, ",
        "PHE8SDW, PHE8SBZ, ",
        "PHUPRC, PHUORG, ",
        "PHE8YJDHRQ)",
        "values (#{phukid,jdbcType=DECIMAL}, #{phlnid,jdbcType=DECIMAL}, ",
        "#{phev01,jdbcType=NCHAR}, #{phe8yljgd,jdbcType=NCHAR}, #{phe8ksd,jdbcType=NCHAR}, ",
        "#{phe8zdgyse,jdbcType=NCHAR}, #{phe8zdgysn,jdbcType=NCHAR}, ",
        "#{phtrdj,jdbcType=DECIMAL}, #{phe8yyycd,jdbcType=NCHAR}, ",
        "#{phe8yyyce,jdbcType=NCHAR}, #{phe8yyycn,jdbcType=NCHAR}, ",
        "#{phe8sgg,jdbcType=NCHAR}, #{phe8sccs,jdbcType=NCHAR}, #{phe8scd,jdbcType=NCHAR}, ",
        "#{phe8sdw,jdbcType=NCHAR}, #{phe8sbz,jdbcType=DECIMAL}, ",
        "#{phuprc,jdbcType=DECIMAL}, #{phuorg,jdbcType=DECIMAL}, ",
        "#{phe8yjdhrq,jdbcType=DECIMAL})"
    })
    int insert(FE8SPD11 record);

    @Select({
        "select",
        "PHUKID, PHLNID, PHEV01, PHE8YLJGD, PHE8KSD, PHE8ZDGYSE, PHE8ZDGYSN, PHTRDJ, ",
        "PHE8YYYCD, PHE8YYYCE, PHE8YYYCN, PHE8SGG, PHE8SCCS, PHE8SCD, PHE8SDW, PHE8SBZ, ",
        "PHUPRC, PHUORG, PHE8YJDHRQ",
        "from FE8SPD11",
        "where PHUKID = #{phukid,jdbcType=DECIMAL}",
          "and PHLNID = #{phlnid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="PHUKID", property="phukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PHLNID", property="phlnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PHEV01", property="phev01", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YLJGD", property="phe8yljgd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8KSD", property="phe8ksd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8ZDGYSE", property="phe8zdgyse", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8ZDGYSN", property="phe8zdgysn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHTRDJ", property="phtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHE8YYYCD", property="phe8yyycd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YYYCE", property="phe8yyyce", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YYYCN", property="phe8yyycn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SGG", property="phe8sgg", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SCCS", property="phe8sccs", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SCD", property="phe8scd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SDW", property="phe8sdw", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SBZ", property="phe8sbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHUPRC", property="phuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHUORG", property="phuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHE8YJDHRQ", property="phe8yjdhrq", jdbcType=JdbcType.DECIMAL)
    })
    FE8SPD11 selectByPrimaryKey(@Param("phukid") BigDecimal phukid, @Param("phlnid") BigDecimal phlnid);

    @Select({
        "select",
        "PHUKID, PHLNID, PHEV01, PHE8YLJGD, PHE8KSD, PHE8ZDGYSE, PHE8ZDGYSN, PHTRDJ, ",
        "PHE8YYYCD, PHE8YYYCE, PHE8YYYCN, PHE8SGG, PHE8SCCS, PHE8SCD, PHE8SDW, PHE8SBZ, ",
        "PHUPRC, PHUORG, PHE8YJDHRQ",
        "from FE8SPD11"
    })
    @Results({
        @Result(column="PHUKID", property="phukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PHLNID", property="phlnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PHEV01", property="phev01", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YLJGD", property="phe8yljgd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8KSD", property="phe8ksd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8ZDGYSE", property="phe8zdgyse", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8ZDGYSN", property="phe8zdgysn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHTRDJ", property="phtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHE8YYYCD", property="phe8yyycd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YYYCE", property="phe8yyyce", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8YYYCN", property="phe8yyycn", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SGG", property="phe8sgg", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SCCS", property="phe8sccs", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SCD", property="phe8scd", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SDW", property="phe8sdw", jdbcType=JdbcType.NCHAR),
        @Result(column="PHE8SBZ", property="phe8sbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHUPRC", property="phuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHUORG", property="phuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="PHE8YJDHRQ", property="phe8yjdhrq", jdbcType=JdbcType.DECIMAL)
    })
    List<FE8SPD11> selectAll();

    @Update({
        "update FE8SPD11",
        "set PHEV01 = #{phev01,jdbcType=NCHAR},",
          "PHE8YLJGD = #{phe8yljgd,jdbcType=NCHAR},",
          "PHE8KSD = #{phe8ksd,jdbcType=NCHAR},",
          "PHE8ZDGYSE = #{phe8zdgyse,jdbcType=NCHAR},",
          "PHE8ZDGYSN = #{phe8zdgysn,jdbcType=NCHAR},",
          "PHTRDJ = #{phtrdj,jdbcType=DECIMAL},",
          "PHE8YYYCD = #{phe8yyycd,jdbcType=NCHAR},",
          "PHE8YYYCE = #{phe8yyyce,jdbcType=NCHAR},",
          "PHE8YYYCN = #{phe8yyycn,jdbcType=NCHAR},",
          "PHE8SGG = #{phe8sgg,jdbcType=NCHAR},",
          "PHE8SCCS = #{phe8sccs,jdbcType=NCHAR},",
          "PHE8SCD = #{phe8scd,jdbcType=NCHAR},",
          "PHE8SDW = #{phe8sdw,jdbcType=NCHAR},",
          "PHE8SBZ = #{phe8sbz,jdbcType=DECIMAL},",
          "PHUPRC = #{phuprc,jdbcType=DECIMAL},",
          "PHUORG = #{phuorg,jdbcType=DECIMAL},",
          "PHE8YJDHRQ = #{phe8yjdhrq,jdbcType=DECIMAL}",
        "where PHUKID = #{phukid,jdbcType=DECIMAL}",
          "and PHLNID = #{phlnid,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(FE8SPD11 record);
}