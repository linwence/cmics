package com.el.cfg.mapper;

import com.el.cfg.domain.Fe8log02;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface Fe8log02Mapper {
    @Delete({
        "delete from FE8LOG02",
        "where LGUKID = #{lgukid,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal lgukid);

    @Insert({
        "insert into FE8LOG02 (LGUKID, LGUKIDP, ",
        "LGLITM, LGDL01, LGDL02, ",
        "LGDL03, LGDL04, LGDL010, ",
        "LGVAR1, LGUSER, LGPID, ",
        "LGJOBN, LGUPMJ, LGUPMT, ",
        "LGIDATE, LGDF01, ",
        "LGRDATE, LGDF02, ",
        "LGSTATUS, LGFLAG, LGDL05, ",
        "LGDL06, LGDL07, LGDL08, ",
        "LGDL09)",
        "values (#{lgukid,jdbcType=DECIMAL}, #{lgukidp,jdbcType=DECIMAL}, ",
        "#{lglitm,jdbcType=NCHAR}, #{lgdl01,jdbcType=NCHAR}, #{lgdl02,jdbcType=NCHAR}, ",
        "#{lgdl03,jdbcType=NCHAR}, #{lgdl04,jdbcType=NCHAR}, #{lgdl010,jdbcType=NCHAR}, ",
        "#{lgvar1,jdbcType=NCHAR}, #{lguser,jdbcType=NCHAR}, #{lgpid,jdbcType=NCHAR}, ",
        "#{lgjobn,jdbcType=NCHAR}, #{lgupmj,jdbcType=DECIMAL}, #{lgupmt,jdbcType=DECIMAL}, ",
        "#{lgidate,jdbcType=TIMESTAMP}, #{lgdf01,jdbcType=NCHAR}, ",
        "#{lgrdate,jdbcType=TIMESTAMP}, #{lgdf02,jdbcType=NCHAR}, ",
        "#{lgstatus,jdbcType=NCHAR}, #{lgflag,jdbcType=NCHAR}, #{lgdl05,jdbcType=NCHAR}, ",
        "#{lgdl06,jdbcType=NCHAR}, #{lgdl07,jdbcType=NCHAR}, #{lgdl08,jdbcType=NCHAR}, ",
        "#{lgdl09,jdbcType=NCHAR})"
    })
    @SelectKey(statement="SELECT Fe8log02_Seq.NEXTVAL FROM DUAL", keyProperty="lgukid", before=true, resultType=BigDecimal.class)
    int insert(Fe8log02 record);

    @Select({
        "select",
        "LGUKID, LGUKIDP, LGLITM, LGDL01, LGDL02, LGDL03, LGDL04, LGDL010, LGVAR1, LGUSER, ",
        "LGPID, LGJOBN, LGUPMJ, LGUPMT, LGIDATE, LGDF01, LGRDATE, LGDF02, LGSTATUS, LGFLAG, ",
        "LGDL05, LGDL06, LGDL07, LGDL08, LGDL09",
        "from FE8LOG02",
        "where LGUKID = #{lgukid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="LGUKID", property="lgukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LGUKIDP", property="lgukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="LGLITM", property="lglitm", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL01", property="lgdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL02", property="lgdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL03", property="lgdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL04", property="lgdl04", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL010", property="lgdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="LGVAR1", property="lgvar1", jdbcType=JdbcType.NCHAR),
        @Result(column="LGUSER", property="lguser", jdbcType=JdbcType.NCHAR),
        @Result(column="LGPID", property="lgpid", jdbcType=JdbcType.NCHAR),
        @Result(column="LGJOBN", property="lgjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LGUPMJ", property="lgupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LGUPMT", property="lgupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LGIDATE", property="lgidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LGDF01", property="lgdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="LGRDATE", property="lgrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LGDF02", property="lgdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="LGSTATUS", property="lgstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="LGFLAG", property="lgflag", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL05", property="lgdl05", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL06", property="lgdl06", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL07", property="lgdl07", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL08", property="lgdl08", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL09", property="lgdl09", jdbcType=JdbcType.NCHAR)
    })
    Fe8log02 selectByPrimaryKey(BigDecimal lgukid);

    @Select({
        "select",
        "LGUKID, LGUKIDP, LGLITM, LGDL01, LGDL02, LGDL03, LGDL04, LGDL010, LGVAR1, LGUSER, ",
        "LGPID, LGJOBN, LGUPMJ, LGUPMT, LGIDATE, LGDF01, LGRDATE, LGDF02, LGSTATUS, LGFLAG, ",
        "LGDL05, LGDL06, LGDL07, LGDL08, LGDL09",
        "from FE8LOG02"
    })
    @Results({
        @Result(column="LGUKID", property="lgukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LGUKIDP", property="lgukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="LGLITM", property="lglitm", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL01", property="lgdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL02", property="lgdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL03", property="lgdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL04", property="lgdl04", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL010", property="lgdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="LGVAR1", property="lgvar1", jdbcType=JdbcType.NCHAR),
        @Result(column="LGUSER", property="lguser", jdbcType=JdbcType.NCHAR),
        @Result(column="LGPID", property="lgpid", jdbcType=JdbcType.NCHAR),
        @Result(column="LGJOBN", property="lgjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LGUPMJ", property="lgupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LGUPMT", property="lgupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LGIDATE", property="lgidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LGDF01", property="lgdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="LGRDATE", property="lgrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LGDF02", property="lgdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="LGSTATUS", property="lgstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="LGFLAG", property="lgflag", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL05", property="lgdl05", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL06", property="lgdl06", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL07", property="lgdl07", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL08", property="lgdl08", jdbcType=JdbcType.NCHAR),
        @Result(column="LGDL09", property="lgdl09", jdbcType=JdbcType.NCHAR)
    })
    List<Fe8log02> selectAll();

    @Update({
        "update FE8LOG02",
        "set LGUKIDP = #{lgukidp,jdbcType=DECIMAL},",
          "LGLITM = #{lglitm,jdbcType=NCHAR},",
          "LGDL01 = #{lgdl01,jdbcType=NCHAR},",
          "LGDL02 = #{lgdl02,jdbcType=NCHAR},",
          "LGDL03 = #{lgdl03,jdbcType=NCHAR},",
          "LGDL04 = #{lgdl04,jdbcType=NCHAR},",
          "LGDL010 = #{lgdl010,jdbcType=NCHAR},",
          "LGVAR1 = #{lgvar1,jdbcType=NCHAR},",
          "LGUSER = #{lguser,jdbcType=NCHAR},",
          "LGPID = #{lgpid,jdbcType=NCHAR},",
          "LGJOBN = #{lgjobn,jdbcType=NCHAR},",
          "LGUPMJ = #{lgupmj,jdbcType=DECIMAL},",
          "LGUPMT = #{lgupmt,jdbcType=DECIMAL},",
          "LGIDATE = #{lgidate,jdbcType=TIMESTAMP},",
          "LGDF01 = #{lgdf01,jdbcType=NCHAR},",
          "LGRDATE = #{lgrdate,jdbcType=TIMESTAMP},",
          "LGDF02 = #{lgdf02,jdbcType=NCHAR},",
          "LGSTATUS = #{lgstatus,jdbcType=NCHAR},",
          "LGFLAG = #{lgflag,jdbcType=NCHAR},",
          "LGDL05 = #{lgdl05,jdbcType=NCHAR},",
          "LGDL06 = #{lgdl06,jdbcType=NCHAR},",
          "LGDL07 = #{lgdl07,jdbcType=NCHAR},",
          "LGDL08 = #{lgdl08,jdbcType=NCHAR},",
          "LGDL09 = #{lgdl09,jdbcType=NCHAR}",
        "where LGUKID = #{lgukid,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Fe8log02 record);
}