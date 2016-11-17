package com.el.cfg.mapper;

import com.el.cfg.domain.Fe841005;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Fe841005Mapper {
    @Select({
        "select",
        "SCUKID, SCAN8, SCALPH, SCE8NAME, SCUKIDP, SCEV01, SCALKY, SCAC28, SCE8SCXKZ, ",
        "SCE8SCBAH, SCURCD, SCURDT, SCURAT, SCURAB, SCURRF, SCEV02, SCEV03, SCEV04, SCEV05, ",
        "SCDL01, SCDL02, SCDL03, SCDL010, SCDL011, SCUSER, SCPID, SCJOBN, SCUPMJ, SCUPMT, ",
        "SCIDATE, SCDF01, SCRDATE, SCDF02, SCSTATUS, SCFLAG",
        "from FE841005",
        "where SCUKID = #{scukid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="SCUKID", property="scukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SCAN8", property="scan8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCALPH", property="scalph", jdbcType=JdbcType.NCHAR),
        @Result(column="SCE8NAME", property="sce8name", jdbcType=JdbcType.NCHAR),
        @Result(column="SCUKIDP", property="scukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCEV01", property="scev01", jdbcType=JdbcType.NCHAR),
        @Result(column="SCALKY", property="scalky", jdbcType=JdbcType.NCHAR),
        @Result(column="SCAC28", property="scac28", jdbcType=JdbcType.NCHAR),
        @Result(column="SCE8SCXKZ", property="sce8scxkz", jdbcType=JdbcType.NCHAR),
        @Result(column="SCE8SCBAH", property="sce8scbah", jdbcType=JdbcType.NCHAR),
        @Result(column="SCURCD", property="scurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="SCURDT", property="scurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCURAT", property="scurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCURAB", property="scurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCURRF", property="scurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV02", property="scev02", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV03", property="scev03", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV04", property="scev04", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV05", property="scev05", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL01", property="scdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL02", property="scdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL03", property="scdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL010", property="scdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL011", property="scdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="SCUSER", property="scuser", jdbcType=JdbcType.NCHAR),
        @Result(column="SCPID", property="scpid", jdbcType=JdbcType.NCHAR),
        @Result(column="SCJOBN", property="scjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="SCUPMJ", property="scupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCUPMT", property="scupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCIDATE", property="scidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SCDF01", property="scdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="SCRDATE", property="scrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SCDF02", property="scdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="SCSTATUS", property="scstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SCFLAG", property="scflag", jdbcType=JdbcType.NCHAR)
    })
    Fe841005 selectByPrimaryKey(BigDecimal scukid);

    @Select({
        "select",
        "SCUKID, SCAN8, SCALPH, SCE8NAME, SCUKIDP, SCEV01, SCALKY, SCAC28, SCE8SCXKZ, ",
        "SCE8SCBAH, SCURCD, SCURDT, SCURAT, SCURAB, SCURRF, SCEV02, SCEV03, SCEV04, SCEV05, ",
        "SCDL01, SCDL02, SCDL03, SCDL010, SCDL011, SCUSER, SCPID, SCJOBN, SCUPMJ, SCUPMT, ",
        "SCIDATE, SCDF01, SCRDATE, SCDF02, SCSTATUS, SCFLAG",
        "from FE841005"
    })
    @Results({
        @Result(column="SCUKID", property="scukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SCAN8", property="scan8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCALPH", property="scalph", jdbcType=JdbcType.NCHAR),
        @Result(column="SCE8NAME", property="sce8name", jdbcType=JdbcType.NCHAR),
        @Result(column="SCUKIDP", property="scukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCEV01", property="scev01", jdbcType=JdbcType.NCHAR),
        @Result(column="SCALKY", property="scalky", jdbcType=JdbcType.NCHAR),
        @Result(column="SCAC28", property="scac28", jdbcType=JdbcType.NCHAR),
        @Result(column="SCE8SCXKZ", property="sce8scxkz", jdbcType=JdbcType.NCHAR),
        @Result(column="SCE8SCBAH", property="sce8scbah", jdbcType=JdbcType.NCHAR),
        @Result(column="SCURCD", property="scurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="SCURDT", property="scurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCURAT", property="scurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCURAB", property="scurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCURRF", property="scurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV02", property="scev02", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV03", property="scev03", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV04", property="scev04", jdbcType=JdbcType.NCHAR),
        @Result(column="SCEV05", property="scev05", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL01", property="scdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL02", property="scdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL03", property="scdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL010", property="scdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="SCDL011", property="scdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="SCUSER", property="scuser", jdbcType=JdbcType.NCHAR),
        @Result(column="SCPID", property="scpid", jdbcType=JdbcType.NCHAR),
        @Result(column="SCJOBN", property="scjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="SCUPMJ", property="scupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCUPMT", property="scupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCIDATE", property="scidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SCDF01", property="scdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="SCRDATE", property="scrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SCDF02", property="scdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="SCSTATUS", property="scstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SCFLAG", property="scflag", jdbcType=JdbcType.NCHAR)
    })
    List<Fe841005> selectAll();
}