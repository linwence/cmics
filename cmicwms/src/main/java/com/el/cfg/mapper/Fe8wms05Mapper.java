package com.el.cfg.mapper;

import com.el.cfg.domain.Fe8wms05;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Fe8wms05Mapper {
    @Select({
        "select",
        "XLKCOO, XLLNID, XLMCU, XLCA01, XLDCTO, XLDOCO, XLCF01, XLLITM, XLPTUT01, XLPTUT02, ",
        "XLCA02, XLUPRC, XLPRRC, XLAMC3, XLTRDJ, XLE8NAME, XLPEFJ, XLPSDJ, XLGRWT, XLDL010, ",
        "XLDL01, XLDL02, XLDL03, XLAB01, XLAB02, XLAB03, XLEV01, XLEV02, XLUSER, XLPID, ",
        "XLUPMJ, XLTDAY, XLAOD, XLDS50",
        "from FE8WMS05",
        "where XLKCOO = #{xlkcoo,jdbcType=NCHAR}",
          "and XLLNID = #{xllnid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="XLKCOO", property="xlkcoo", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XLLNID", property="xllnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="XLMCU", property="xlmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="XLCA01", property="xlca01", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLDCTO", property="xldcto", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDOCO", property="xldoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLCF01", property="xlcf01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLLITM", property="xllitm", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPTUT01", property="xlptut01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPTUT02", property="xlptut02", jdbcType=JdbcType.NCHAR),
        @Result(column="XLCA02", property="xlca02", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLUPRC", property="xluprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLPRRC", property="xlprrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAMC3", property="xlamc3", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLTRDJ", property="xltrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLE8NAME", property="xle8name", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPEFJ", property="xlpefj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLPSDJ", property="xlpsdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLGRWT", property="xlgrwt", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLDL010", property="xldl010", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDL01", property="xldl01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDL02", property="xldl02", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDL03", property="xldl03", jdbcType=JdbcType.NCHAR),
        @Result(column="XLAB01", property="xlab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAB02", property="xlab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAB03", property="xlab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLEV01", property="xlev01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLEV02", property="xlev02", jdbcType=JdbcType.NCHAR),
        @Result(column="XLUSER", property="xluser", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPID", property="xlpid", jdbcType=JdbcType.NCHAR),
        @Result(column="XLUPMJ", property="xlupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLTDAY", property="xltday", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAOD", property="xlaod", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XLDS50", property="xlds50", jdbcType=JdbcType.NCHAR)
    })
    Fe8wms05 selectByPrimaryKey(@Param("xlkcoo") String xlkcoo, @Param("xllnid") BigDecimal xllnid);

    @Select({
        "select",
        "XLKCOO, XLLNID, XLMCU, XLCA01, XLDCTO, XLDOCO, XLCF01, XLLITM, XLPTUT01, XLPTUT02, ",
        "XLCA02, XLUPRC, XLPRRC, XLAMC3, XLTRDJ, XLE8NAME, XLPEFJ, XLPSDJ, XLGRWT, XLDL010, ",
        "XLDL01, XLDL02, XLDL03, XLAB01, XLAB02, XLAB03, XLEV01, XLEV02, XLUSER, XLPID, ",
        "XLUPMJ, XLTDAY, XLAOD, XLDS50",
        "from FE8WMS05"
    })
    @Results({
        @Result(column="XLKCOO", property="xlkcoo", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XLLNID", property="xllnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="XLMCU", property="xlmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="XLCA01", property="xlca01", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLDCTO", property="xldcto", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDOCO", property="xldoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLCF01", property="xlcf01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLLITM", property="xllitm", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPTUT01", property="xlptut01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPTUT02", property="xlptut02", jdbcType=JdbcType.NCHAR),
        @Result(column="XLCA02", property="xlca02", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLUPRC", property="xluprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLPRRC", property="xlprrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAMC3", property="xlamc3", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLTRDJ", property="xltrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLE8NAME", property="xle8name", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPEFJ", property="xlpefj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLPSDJ", property="xlpsdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLGRWT", property="xlgrwt", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLDL010", property="xldl010", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDL01", property="xldl01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDL02", property="xldl02", jdbcType=JdbcType.NCHAR),
        @Result(column="XLDL03", property="xldl03", jdbcType=JdbcType.NCHAR),
        @Result(column="XLAB01", property="xlab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAB02", property="xlab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAB03", property="xlab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLEV01", property="xlev01", jdbcType=JdbcType.NCHAR),
        @Result(column="XLEV02", property="xlev02", jdbcType=JdbcType.NCHAR),
        @Result(column="XLUSER", property="xluser", jdbcType=JdbcType.NCHAR),
        @Result(column="XLPID", property="xlpid", jdbcType=JdbcType.NCHAR),
        @Result(column="XLUPMJ", property="xlupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLTDAY", property="xltday", jdbcType=JdbcType.DECIMAL),
        @Result(column="XLAOD", property="xlaod", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XLDS50", property="xlds50", jdbcType=JdbcType.NCHAR)
    })
    List<Fe8wms05> selectAll();
}