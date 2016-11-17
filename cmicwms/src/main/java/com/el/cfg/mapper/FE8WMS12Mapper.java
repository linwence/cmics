package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS12;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS12Mapper {
    @Select({
        "select",
        "QXDCTO, QXKCOO, QXDOCO, QXLNID, QXMCU, QXCA01, QXAN8, QXE8NAME, QXDL01, QXTRDJ, ",
        "QXLITM, QXUORG, QXCA02, QXLOT1, QXLOT2, QXDSC1, QXDCM, QXAUTA, QXDL02, QXDL03, ",
        "QXAB01, QXAB02, QXAB03, QXEV01, QXEV02, QXUSER, QXPID, QXUPMJ, QXTDAY, QXAOD",
        "from FE8WMS12",
        "where QXDCTO = #{qxdcto,jdbcType=NCHAR}",
          "and QXKCOO = #{qxkcoo,jdbcType=NCHAR}",
          "and QXDOCO = #{qxdoco,jdbcType=DECIMAL}",
          "and QXLNID = #{qxlnid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="QXDCTO", property="qxdcto", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="QXKCOO", property="qxkcoo", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="QXDOCO", property="qxdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QXLNID", property="qxlnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QXMCU", property="qxmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="QXCA01", property="qxca01", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAN8", property="qxan8", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXE8NAME", property="qxe8name", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDL01", property="qxdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="QXTRDJ", property="qxtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXLITM", property="qxlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="QXUORG", property="qxuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXCA02", property="qxca02", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXLOT1", property="qxlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="QXLOT2", property="qxlot2", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDSC1", property="qxdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDCM", property="qxdcm", jdbcType=JdbcType.NCHAR),
        @Result(column="QXAUTA", property="qxauta", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDL02", property="qxdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDL03", property="qxdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="QXAB01", property="qxab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAB02", property="qxab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAB03", property="qxab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXEV01", property="qxev01", jdbcType=JdbcType.NCHAR),
        @Result(column="QXEV02", property="qxev02", jdbcType=JdbcType.NCHAR),
        @Result(column="QXUSER", property="qxuser", jdbcType=JdbcType.NCHAR),
        @Result(column="QXPID", property="qxpid", jdbcType=JdbcType.NCHAR),
        @Result(column="QXUPMJ", property="qxupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXTDAY", property="qxtday", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAOD", property="qxaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS12 selectByPrimaryKey(@Param("qxdcto") String qxdcto, @Param("qxkcoo") String qxkcoo, @Param("qxdoco") BigDecimal qxdoco, @Param("qxlnid") BigDecimal qxlnid);

    @Select({
        "select",
        "QXDCTO, QXKCOO, QXDOCO, QXLNID, QXMCU, QXCA01, QXAN8, QXE8NAME, QXDL01, QXTRDJ, ",
        "QXLITM, QXUORG, QXCA02, QXLOT1, QXLOT2, QXDSC1, QXDCM, QXAUTA, QXDL02, QXDL03, ",
        "QXAB01, QXAB02, QXAB03, QXEV01, QXEV02, QXUSER, QXPID, QXUPMJ, QXTDAY, QXAOD",
        "from FE8WMS12"
    })
    @Results({
        @Result(column="QXDCTO", property="qxdcto", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="QXKCOO", property="qxkcoo", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="QXDOCO", property="qxdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QXLNID", property="qxlnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QXMCU", property="qxmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="QXCA01", property="qxca01", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAN8", property="qxan8", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXE8NAME", property="qxe8name", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDL01", property="qxdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="QXTRDJ", property="qxtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXLITM", property="qxlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="QXUORG", property="qxuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXCA02", property="qxca02", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXLOT1", property="qxlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="QXLOT2", property="qxlot2", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDSC1", property="qxdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDCM", property="qxdcm", jdbcType=JdbcType.NCHAR),
        @Result(column="QXAUTA", property="qxauta", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDL02", property="qxdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="QXDL03", property="qxdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="QXAB01", property="qxab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAB02", property="qxab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAB03", property="qxab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXEV01", property="qxev01", jdbcType=JdbcType.NCHAR),
        @Result(column="QXEV02", property="qxev02", jdbcType=JdbcType.NCHAR),
        @Result(column="QXUSER", property="qxuser", jdbcType=JdbcType.NCHAR),
        @Result(column="QXPID", property="qxpid", jdbcType=JdbcType.NCHAR),
        @Result(column="QXUPMJ", property="qxupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXTDAY", property="qxtday", jdbcType=JdbcType.DECIMAL),
        @Result(column="QXAOD", property="qxaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS12> selectAll();
}