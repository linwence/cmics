package com.el.cfg.mapper;

import com.el.cfg.domain.Fe8xlh99;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Fe8xlh99Mapper {
    @Select({
        "select",
        "LLPMUKID, LLDL02, LLMCU, LLLITM, LLLOTN, LLPTUT01, LLLOT1, LLLOT2, LLPUKID, ",
        "LLUKID, LLKCOO, LLDCTO, LLDOCO, LLLNID, LLAA05, LLCA01, LLUPRC, LLUORG, LLPTUT02, ",
        "LLUSER, LLPID, LLJOBN, LLUPMJ, LLTDAY, LLDL01, LLDL03, LLAB01, LLAB02, LLAB03, ",
        "LLEV01, LLEV02, LLDL010, LLEV03, LLEV04, LLEV05, LLEV06, LLKCO, LLDCT, LLDOC, ",
        "LLRLLN, LLIDATE, LLRDATE",
        "from FE8XLH99",
        "where LLPMUKID = #{llpmukid,jdbcType=DECIMAL}",
          "and LLDL02 = #{lldl02,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="LLPMUKID", property="llpmukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LLDL02", property="lldl02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LLMCU", property="llmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLITM", property="lllitm", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLOTN", property="lllotn", jdbcType=JdbcType.NCHAR),
        @Result(column="LLPTUT01", property="llptut01", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLOT1", property="lllot1", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLOT2", property="lllot2", jdbcType=JdbcType.NCHAR),
        @Result(column="LLPUKID", property="llpukid", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLUKID", property="llukid", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLKCOO", property="llkcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDCTO", property="lldcto", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDOCO", property="lldoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLLNID", property="lllnid", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLAA05", property="llaa05", jdbcType=JdbcType.NCHAR),
        @Result(column="LLCA01", property="llca01", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLUPRC", property="lluprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLUORG", property="lluorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLPTUT02", property="llptut02", jdbcType=JdbcType.NCHAR),
        @Result(column="LLUSER", property="lluser", jdbcType=JdbcType.NCHAR),
        @Result(column="LLPID", property="llpid", jdbcType=JdbcType.NCHAR),
        @Result(column="LLJOBN", property="lljobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LLUPMJ", property="llupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLTDAY", property="lltday", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLDL01", property="lldl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDL03", property="lldl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LLAB01", property="llab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLAB02", property="llab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLAB03", property="llab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLEV01", property="llev01", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV02", property="llev02", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDL010", property="lldl010", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV03", property="llev03", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV04", property="llev04", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV05", property="llev05", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV06", property="llev06", jdbcType=JdbcType.NCHAR),
        @Result(column="LLKCO", property="llkco", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDCT", property="lldct", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDOC", property="lldoc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLRLLN", property="llrlln", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLIDATE", property="llidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LLRDATE", property="llrdate", jdbcType=JdbcType.TIMESTAMP)
    })
    Fe8xlh99 selectByPrimaryKey(@Param("llpmukid") BigDecimal llpmukid, @Param("lldl02") String lldl02);

    @Select({
        "select",
        "LLPMUKID, LLDL02, LLMCU, LLLITM, LLLOTN, LLPTUT01, LLLOT1, LLLOT2, LLPUKID, ",
        "LLUKID, LLKCOO, LLDCTO, LLDOCO, LLLNID, LLAA05, LLCA01, LLUPRC, LLUORG, LLPTUT02, ",
        "LLUSER, LLPID, LLJOBN, LLUPMJ, LLTDAY, LLDL01, LLDL03, LLAB01, LLAB02, LLAB03, ",
        "LLEV01, LLEV02, LLDL010, LLEV03, LLEV04, LLEV05, LLEV06, LLKCO, LLDCT, LLDOC, ",
        "LLRLLN, LLIDATE, LLRDATE",
        "from FE8XLH99"
    })
    @Results({
        @Result(column="LLPMUKID", property="llpmukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LLDL02", property="lldl02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LLMCU", property="llmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLITM", property="lllitm", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLOTN", property="lllotn", jdbcType=JdbcType.NCHAR),
        @Result(column="LLPTUT01", property="llptut01", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLOT1", property="lllot1", jdbcType=JdbcType.NCHAR),
        @Result(column="LLLOT2", property="lllot2", jdbcType=JdbcType.NCHAR),
        @Result(column="LLPUKID", property="llpukid", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLUKID", property="llukid", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLKCOO", property="llkcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDCTO", property="lldcto", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDOCO", property="lldoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLLNID", property="lllnid", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLAA05", property="llaa05", jdbcType=JdbcType.NCHAR),
        @Result(column="LLCA01", property="llca01", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLUPRC", property="lluprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLUORG", property="lluorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLPTUT02", property="llptut02", jdbcType=JdbcType.NCHAR),
        @Result(column="LLUSER", property="lluser", jdbcType=JdbcType.NCHAR),
        @Result(column="LLPID", property="llpid", jdbcType=JdbcType.NCHAR),
        @Result(column="LLJOBN", property="lljobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LLUPMJ", property="llupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLTDAY", property="lltday", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLDL01", property="lldl01", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDL03", property="lldl03", jdbcType=JdbcType.NCHAR),
        @Result(column="LLAB01", property="llab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLAB02", property="llab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLAB03", property="llab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLEV01", property="llev01", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV02", property="llev02", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDL010", property="lldl010", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV03", property="llev03", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV04", property="llev04", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV05", property="llev05", jdbcType=JdbcType.NCHAR),
        @Result(column="LLEV06", property="llev06", jdbcType=JdbcType.NCHAR),
        @Result(column="LLKCO", property="llkco", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDCT", property="lldct", jdbcType=JdbcType.NCHAR),
        @Result(column="LLDOC", property="lldoc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLRLLN", property="llrlln", jdbcType=JdbcType.DECIMAL),
        @Result(column="LLIDATE", property="llidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LLRDATE", property="llrdate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Fe8xlh99> selectAll();
}