package com.el.cfg.mapper;

import com.el.cfg.domain.FE8SPD15;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8SPD15Mapper {
    @Select({
        "select",
        "QMUKID, QMRLLN, QMEV01, QMLNID, QME8YYQGD, QME8KSQGD, QME8YYYCD, QME8YYYCE, ",
        "QME8YYYCN, QME8SPDGG, QME8SCCS, QME8SPDCD, QME8SPDDW, QMLOT1, QMLOT2, QME8KCLX, ",
        "QME8YXQ, QME8SCRQ, QME8SPDBZ, QMUORG, QME8RKLX",
        "from FE8SPD15",
        "where QMUKID = #{qmukid,jdbcType=DECIMAL}",
          "and QMRLLN = #{qmrlln,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="QMUKID", property="qmukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QMRLLN", property="qmrlln", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QMEV01", property="qmev01", jdbcType=JdbcType.NCHAR),
        @Result(column="QMLNID", property="qmlnid", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8YYQGD", property="qme8yyqgd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8KSQGD", property="qme8ksqgd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YYYCD", property="qme8yyycd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YYYCE", property="qme8yyyce", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YYYCN", property="qme8yyycn", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SPDGG", property="qme8spdgg", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SCCS", property="qme8sccs", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SPDCD", property="qme8spdcd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SPDDW", property="qme8spddw", jdbcType=JdbcType.NCHAR),
        @Result(column="QMLOT1", property="qmlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="QMLOT2", property="qmlot2", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8KCLX", property="qme8kclx", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YXQ", property="qme8yxq", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8SCRQ", property="qme8scrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8SPDBZ", property="qme8spdbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="QMUORG", property="qmuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8RKLX", property="qme8rklx", jdbcType=JdbcType.DECIMAL)
    })
    FE8SPD15 selectByPrimaryKey(@Param("qmukid") BigDecimal qmukid, @Param("qmrlln") BigDecimal qmrlln);

    @Select({
        "select",
        "QMUKID, QMRLLN, QMEV01, QMLNID, QME8YYQGD, QME8KSQGD, QME8YYYCD, QME8YYYCE, ",
        "QME8YYYCN, QME8SPDGG, QME8SCCS, QME8SPDCD, QME8SPDDW, QMLOT1, QMLOT2, QME8KCLX, ",
        "QME8YXQ, QME8SCRQ, QME8SPDBZ, QMUORG, QME8RKLX",
        "from FE8SPD15"
    })
    @Results({
        @Result(column="QMUKID", property="qmukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QMRLLN", property="qmrlln", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QMEV01", property="qmev01", jdbcType=JdbcType.NCHAR),
        @Result(column="QMLNID", property="qmlnid", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8YYQGD", property="qme8yyqgd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8KSQGD", property="qme8ksqgd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YYYCD", property="qme8yyycd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YYYCE", property="qme8yyyce", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YYYCN", property="qme8yyycn", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SPDGG", property="qme8spdgg", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SCCS", property="qme8sccs", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SPDCD", property="qme8spdcd", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8SPDDW", property="qme8spddw", jdbcType=JdbcType.NCHAR),
        @Result(column="QMLOT1", property="qmlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="QMLOT2", property="qmlot2", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8KCLX", property="qme8kclx", jdbcType=JdbcType.NCHAR),
        @Result(column="QME8YXQ", property="qme8yxq", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8SCRQ", property="qme8scrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8SPDBZ", property="qme8spdbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="QMUORG", property="qmuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="QME8RKLX", property="qme8rklx", jdbcType=JdbcType.DECIMAL)
    })
    List<FE8SPD15> selectAll();
}