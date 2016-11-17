package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS18;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS18Mapper {
    @Select({
        "select",
        "TWVR01, TWLNID, TWMCU, TWKCOO, TWTRDJ, TWFIL2, TWLITM, TWUORG, TWLOT2, TWLOT1, ",
        "TWEV01, TWEV02, TWDSC1, TWEFFA, TWEFTA, TWDL011, TWD200, TWIR09, TWIR10, TWLOTN, ",
        "TWDOCO, TWDCTO, TWDL02, TWDL03, TWAB01, TWAB02, TWAB03, TWEV03, TWEV04, TWUSER, ",
        "TWPID, TWUPMJ, TWTDAY, TWAOD",
        "from FE8WMS18",
        "where TWVR01 = #{twvr01,jdbcType=NCHAR}",
          "and TWLNID = #{twlnid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="TWVR01", property="twvr01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="TWLNID", property="twlnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="TWMCU", property="twmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="TWKCOO", property="twkcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="TWTRDJ", property="twtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWFIL2", property="twfil2", jdbcType=JdbcType.NCHAR),
        @Result(column="TWLITM", property="twlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="TWUORG", property="twuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWLOT2", property="twlot2", jdbcType=JdbcType.NCHAR),
        @Result(column="TWLOT1", property="twlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEV01", property="twev01", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEV02", property="twev02", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDSC1", property="twdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEFFA", property="tweffa", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEFTA", property="twefta", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDL011", property="twdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="TWD200", property="twd200", jdbcType=JdbcType.NCHAR),
        @Result(column="TWIR09", property="twir09", jdbcType=JdbcType.NCHAR),
        @Result(column="TWIR10", property="twir10", jdbcType=JdbcType.NCHAR),
        @Result(column="TWLOTN", property="twlotn", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDOCO", property="twdoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWDCTO", property="twdcto", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDL02", property="twdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDL03", property="twdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="TWAB01", property="twab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWAB02", property="twab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWAB03", property="twab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWEV03", property="twev03", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEV04", property="twev04", jdbcType=JdbcType.NCHAR),
        @Result(column="TWUSER", property="twuser", jdbcType=JdbcType.NCHAR),
        @Result(column="TWPID", property="twpid", jdbcType=JdbcType.NCHAR),
        @Result(column="TWUPMJ", property="twupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWTDAY", property="twtday", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWAOD", property="twaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS18 selectByPrimaryKey(@Param("twvr01") String twvr01, @Param("twlnid") BigDecimal twlnid);

    @Select({
        "select",
        "TWVR01, TWLNID, TWMCU, TWKCOO, TWTRDJ, TWFIL2, TWLITM, TWUORG, TWLOT2, TWLOT1, ",
        "TWEV01, TWEV02, TWDSC1, TWEFFA, TWEFTA, TWDL011, TWD200, TWIR09, TWIR10, TWLOTN, ",
        "TWDOCO, TWDCTO, TWDL02, TWDL03, TWAB01, TWAB02, TWAB03, TWEV03, TWEV04, TWUSER, ",
        "TWPID, TWUPMJ, TWTDAY, TWAOD",
        "from FE8WMS18"
    })
    @Results({
        @Result(column="TWVR01", property="twvr01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="TWLNID", property="twlnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="TWMCU", property="twmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="TWKCOO", property="twkcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="TWTRDJ", property="twtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWFIL2", property="twfil2", jdbcType=JdbcType.NCHAR),
        @Result(column="TWLITM", property="twlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="TWUORG", property="twuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWLOT2", property="twlot2", jdbcType=JdbcType.NCHAR),
        @Result(column="TWLOT1", property="twlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEV01", property="twev01", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEV02", property="twev02", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDSC1", property="twdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEFFA", property="tweffa", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEFTA", property="twefta", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDL011", property="twdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="TWD200", property="twd200", jdbcType=JdbcType.NCHAR),
        @Result(column="TWIR09", property="twir09", jdbcType=JdbcType.NCHAR),
        @Result(column="TWIR10", property="twir10", jdbcType=JdbcType.NCHAR),
        @Result(column="TWLOTN", property="twlotn", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDOCO", property="twdoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWDCTO", property="twdcto", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDL02", property="twdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="TWDL03", property="twdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="TWAB01", property="twab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWAB02", property="twab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWAB03", property="twab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWEV03", property="twev03", jdbcType=JdbcType.NCHAR),
        @Result(column="TWEV04", property="twev04", jdbcType=JdbcType.NCHAR),
        @Result(column="TWUSER", property="twuser", jdbcType=JdbcType.NCHAR),
        @Result(column="TWPID", property="twpid", jdbcType=JdbcType.NCHAR),
        @Result(column="TWUPMJ", property="twupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWTDAY", property="twtday", jdbcType=JdbcType.DECIMAL),
        @Result(column="TWAOD", property="twaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS18> selectAll();
}