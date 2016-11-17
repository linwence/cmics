package com.el.cfg.mapper;

import com.el.cfg.domain.Fe8wms03;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Fe8wms03Mapper {
    @Select({
        "select",
        "BSUKID, BSEV10, BSD10, BSBEG1, BSD09, BSBEG2, BSIDATE, BSRDATE, BSDL01, BSDL02, ",
        "BSDL03, BSAB01, BSAB02, BSAB03, BSEV01, BSEV02, BSUSER, BSPID, BSUPMJ, BSTDAY, ",
        "BSAOD",
        "from FE8WMS03",
        "where BSUKID = #{bsukid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="BSUKID", property="bsukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="BSEV10", property="bsev10", jdbcType=JdbcType.NCHAR),
        @Result(column="BSD10", property="bsd10", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSBEG1", property="bsbeg1", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSD09", property="bsd09", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSBEG2", property="bsbeg2", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSIDATE", property="bsidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BSRDATE", property="bsrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BSDL01", property="bsdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="BSDL02", property="bsdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="BSDL03", property="bsdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="BSAB01", property="bsab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSAB02", property="bsab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSAB03", property="bsab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSEV01", property="bsev01", jdbcType=JdbcType.NCHAR),
        @Result(column="BSEV02", property="bsev02", jdbcType=JdbcType.NCHAR),
        @Result(column="BSUSER", property="bsuser", jdbcType=JdbcType.NCHAR),
        @Result(column="BSPID", property="bspid", jdbcType=JdbcType.NCHAR),
        @Result(column="BSUPMJ", property="bsupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSTDAY", property="bstday", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSAOD", property="bsaod", jdbcType=JdbcType.TIMESTAMP)
    })
    Fe8wms03 selectByPrimaryKey(BigDecimal bsukid);

    @Select({
        "select",
        "BSUKID, BSEV10, BSD10, BSBEG1, BSD09, BSBEG2, BSIDATE, BSRDATE, BSDL01, BSDL02, ",
        "BSDL03, BSAB01, BSAB02, BSAB03, BSEV01, BSEV02, BSUSER, BSPID, BSUPMJ, BSTDAY, ",
        "BSAOD",
        "from FE8WMS03"
    })
    @Results({
        @Result(column="BSUKID", property="bsukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="BSEV10", property="bsev10", jdbcType=JdbcType.NCHAR),
        @Result(column="BSD10", property="bsd10", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSBEG1", property="bsbeg1", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSD09", property="bsd09", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSBEG2", property="bsbeg2", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSIDATE", property="bsidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BSRDATE", property="bsrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BSDL01", property="bsdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="BSDL02", property="bsdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="BSDL03", property="bsdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="BSAB01", property="bsab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSAB02", property="bsab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSAB03", property="bsab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSEV01", property="bsev01", jdbcType=JdbcType.NCHAR),
        @Result(column="BSEV02", property="bsev02", jdbcType=JdbcType.NCHAR),
        @Result(column="BSUSER", property="bsuser", jdbcType=JdbcType.NCHAR),
        @Result(column="BSPID", property="bspid", jdbcType=JdbcType.NCHAR),
        @Result(column="BSUPMJ", property="bsupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSTDAY", property="bstday", jdbcType=JdbcType.DECIMAL),
        @Result(column="BSAOD", property="bsaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Fe8wms03> selectAll();
}