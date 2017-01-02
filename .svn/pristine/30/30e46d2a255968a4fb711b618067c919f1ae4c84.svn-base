package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS20;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS20Mapper {
    @Select({
        "select",
        "LSE8WLZXID, LSE8HZBM, LSCO, LSMCU, LSE8APPK, LSEPAPSD, LSUSER, LSPID, LSUPMJ, ",
        "LSTDAY, LSDL01, LSDL02, LSDL03, LSDL04, LSDL05, LSEV01, LSEV02, LSEV03, LSFIL2",
        "from FE8WMS20",
        "where LSE8WLZXID = #{lse8wlzxid,jdbcType=NCHAR}",
          "and LSE8HZBM = #{lse8hzbm,jdbcType=NCHAR}",
          "and LSCO = #{lsco,jdbcType=NCHAR}",
          "and LSMCU = #{lsmcu,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="LSE8WLZXID", property="lse8wlzxid", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSE8HZBM", property="lse8hzbm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSCO", property="lsco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSMCU", property="lsmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSE8APPK", property="lse8appk", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEPAPSD", property="lsepapsd", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUSER", property="lsuser", jdbcType=JdbcType.NCHAR),
        @Result(column="LSPID", property="lspid", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUPMJ", property="lsupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSTDAY", property="lstday", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSDL01", property="lsdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL02", property="lsdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL03", property="lsdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL04", property="lsdl04", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL05", property="lsdl05", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEV01", property="lsev01", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEV02", property="lsev02", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEV03", property="lsev03", jdbcType=JdbcType.NCHAR),
        @Result(column="LSFIL2", property="lsfil2", jdbcType=JdbcType.NCHAR)
    })
    FE8WMS20 selectByPrimaryKey(@Param("lse8wlzxid") String lse8wlzxid, @Param("lse8hzbm") String lse8hzbm, @Param("lsco") String lsco, @Param("lsmcu") String lsmcu);

    @Select({
        "select",
        "LSE8WLZXID, LSE8HZBM, LSCO, LSMCU, LSE8APPK, LSEPAPSD, LSUSER, LSPID, LSUPMJ, ",
        "LSTDAY, LSDL01, LSDL02, LSDL03, LSDL04, LSDL05, LSEV01, LSEV02, LSEV03, LSFIL2",
        "from FE8WMS20"
    })
    @Results({
        @Result(column="LSE8WLZXID", property="lse8wlzxid", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSE8HZBM", property="lse8hzbm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSCO", property="lsco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSMCU", property="lsmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LSE8APPK", property="lse8appk", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEPAPSD", property="lsepapsd", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUSER", property="lsuser", jdbcType=JdbcType.NCHAR),
        @Result(column="LSPID", property="lspid", jdbcType=JdbcType.NCHAR),
        @Result(column="LSUPMJ", property="lsupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSTDAY", property="lstday", jdbcType=JdbcType.DECIMAL),
        @Result(column="LSDL01", property="lsdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL02", property="lsdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL03", property="lsdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL04", property="lsdl04", jdbcType=JdbcType.NCHAR),
        @Result(column="LSDL05", property="lsdl05", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEV01", property="lsev01", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEV02", property="lsev02", jdbcType=JdbcType.NCHAR),
        @Result(column="LSEV03", property="lsev03", jdbcType=JdbcType.NCHAR),
        @Result(column="LSFIL2", property="lsfil2", jdbcType=JdbcType.NCHAR)
    })
    List<FE8WMS20> selectAll();
}