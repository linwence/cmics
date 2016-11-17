package com.el.cfg.mapper;

import com.el.cfg.domain.FE8SPD12;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FE8SPD12Mapper {
    @Delete({
        "delete from FE8SPD12",
        "where JSUKID = #{jsukid,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal jsukid);

    @Insert({
        "insert into FE8SPD12 (JSUKID, JSEV01, ",
        "JSE8SPDID, JSE8ERPID, ",
        "JSE8JSDW, JSE8JSDWE, ",
        "JSE8JSDWBE, JSE8JSDWN, ",
        "JSE8CKYY, JSE8YHYYE, ",
        "JSE8YHYYN, JSE8YWBME, ",
        "JSE8YWBMN, JSE8YWYE, ",
        "JSE8YWYN, JSE8DDZHS, ",
        "JSE8XTSJ)",
        "values (#{jsukid,jdbcType=DECIMAL}, #{jsev01,jdbcType=NCHAR}, ",
        "#{jse8spdid,jdbcType=NCHAR}, #{jse8erpid,jdbcType=NCHAR}, ",
        "#{jse8jsdw,jdbcType=NCHAR}, #{jse8jsdwe,jdbcType=NCHAR}, ",
        "#{jse8jsdwbe,jdbcType=NCHAR}, #{jse8jsdwn,jdbcType=NCHAR}, ",
        "#{jse8ckyy,jdbcType=NCHAR}, #{jse8yhyye,jdbcType=NCHAR}, ",
        "#{jse8yhyyn,jdbcType=NCHAR}, #{jse8ywbme,jdbcType=NCHAR}, ",
        "#{jse8ywbmn,jdbcType=NCHAR}, #{jse8ywye,jdbcType=NCHAR}, ",
        "#{jse8ywyn,jdbcType=NCHAR}, #{jse8ddzhs,jdbcType=DECIMAL}, ",
        "#{jse8xtsj,jdbcType=DECIMAL})"
    })
    int insert(FE8SPD12 record);

    @Select({
        "select",
        "JSUKID, JSEV01, JSE8SPDID, JSE8ERPID, JSE8JSDW, JSE8JSDWE, JSE8JSDWBE, JSE8JSDWN, ",
        "JSE8CKYY, JSE8YHYYE, JSE8YHYYN, JSE8YWBME, JSE8YWBMN, JSE8YWYE, JSE8YWYN, JSE8DDZHS, ",
        "JSE8XTSJ",
        "from FE8SPD12",
        "where JSUKID = #{jsukid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="JSUKID", property="jsukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="JSEV01", property="jsev01", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8SPDID", property="jse8spdid", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8ERPID", property="jse8erpid", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDW", property="jse8jsdw", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDWE", property="jse8jsdwe", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDWBE", property="jse8jsdwbe", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDWN", property="jse8jsdwn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8CKYY", property="jse8ckyy", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YHYYE", property="jse8yhyye", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YHYYN", property="jse8yhyyn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWBME", property="jse8ywbme", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWBMN", property="jse8ywbmn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWYE", property="jse8ywye", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWYN", property="jse8ywyn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8DDZHS", property="jse8ddzhs", jdbcType=JdbcType.DECIMAL),
        @Result(column="JSE8XTSJ", property="jse8xtsj", jdbcType=JdbcType.DECIMAL)
    })
    FE8SPD12 selectByPrimaryKey(BigDecimal jsukid);

    @Select({
        "select",
        "JSUKID, JSEV01, JSE8SPDID, JSE8ERPID, JSE8JSDW, JSE8JSDWE, JSE8JSDWBE, JSE8JSDWN, ",
        "JSE8CKYY, JSE8YHYYE, JSE8YHYYN, JSE8YWBME, JSE8YWBMN, JSE8YWYE, JSE8YWYN, JSE8DDZHS, ",
        "JSE8XTSJ",
        "from FE8SPD12"
    })
    @Results({
        @Result(column="JSUKID", property="jsukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="JSEV01", property="jsev01", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8SPDID", property="jse8spdid", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8ERPID", property="jse8erpid", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDW", property="jse8jsdw", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDWE", property="jse8jsdwe", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDWBE", property="jse8jsdwbe", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8JSDWN", property="jse8jsdwn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8CKYY", property="jse8ckyy", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YHYYE", property="jse8yhyye", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YHYYN", property="jse8yhyyn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWBME", property="jse8ywbme", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWBMN", property="jse8ywbmn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWYE", property="jse8ywye", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8YWYN", property="jse8ywyn", jdbcType=JdbcType.NCHAR),
        @Result(column="JSE8DDZHS", property="jse8ddzhs", jdbcType=JdbcType.DECIMAL),
        @Result(column="JSE8XTSJ", property="jse8xtsj", jdbcType=JdbcType.DECIMAL)
    })
    List<FE8SPD12> selectAll();

    @Update({
        "update FE8SPD12",
        "set JSEV01 = #{jsev01,jdbcType=NCHAR},",
          "JSE8SPDID = #{jse8spdid,jdbcType=NCHAR},",
          "JSE8ERPID = #{jse8erpid,jdbcType=NCHAR},",
          "JSE8JSDW = #{jse8jsdw,jdbcType=NCHAR},",
          "JSE8JSDWE = #{jse8jsdwe,jdbcType=NCHAR},",
          "JSE8JSDWBE = #{jse8jsdwbe,jdbcType=NCHAR},",
          "JSE8JSDWN = #{jse8jsdwn,jdbcType=NCHAR},",
          "JSE8CKYY = #{jse8ckyy,jdbcType=NCHAR},",
          "JSE8YHYYE = #{jse8yhyye,jdbcType=NCHAR},",
          "JSE8YHYYN = #{jse8yhyyn,jdbcType=NCHAR},",
          "JSE8YWBME = #{jse8ywbme,jdbcType=NCHAR},",
          "JSE8YWBMN = #{jse8ywbmn,jdbcType=NCHAR},",
          "JSE8YWYE = #{jse8ywye,jdbcType=NCHAR},",
          "JSE8YWYN = #{jse8ywyn,jdbcType=NCHAR},",
          "JSE8DDZHS = #{jse8ddzhs,jdbcType=DECIMAL},",
          "JSE8XTSJ = #{jse8xtsj,jdbcType=DECIMAL}",
        "where JSUKID = #{jsukid,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(FE8SPD12 record);
}