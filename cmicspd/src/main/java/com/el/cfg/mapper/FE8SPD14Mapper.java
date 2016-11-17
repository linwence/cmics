package com.el.cfg.mapper;

import com.el.cfg.domain.FE8SPD14;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8SPD14Mapper {
    @Select({
        "select",
        "QTUKID, QTEV01, QTE8SPDID, QTE8ERPID, QTE8PSDW, QTE8PSDWE, QTE8PSDWBE, QTE8PSDWN, ",
        "QTE8THYY, QTE8THYYE, QTE8THYYN, QTE8THKS, QTE8THKSE, QTE8THKSN, QTE8CKKS, QTE8CKKSE, ",
        "QTE8CKKSN, QTE8THDH, QTE8THRQ, QTE8XTSJ, QTE8DDZHS",
        "from FE8SPD14",
        "where QTUKID = #{qtukid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="QTUKID", property="qtukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QTEV01", property="qtev01", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8SPDID", property="qte8spdid", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8ERPID", property="qte8erpid", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDW", property="qte8psdw", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDWE", property="qte8psdwe", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDWBE", property="qte8psdwbe", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDWN", property="qte8psdwn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THYY", property="qte8thyy", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THYYE", property="qte8thyye", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THYYN", property="qte8thyyn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THKS", property="qte8thks", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THKSE", property="qte8thkse", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THKSN", property="qte8thksn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8CKKS", property="qte8ckks", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8CKKSE", property="qte8ckkse", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8CKKSN", property="qte8ckksn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THDH", property="qte8thdh", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THRQ", property="qte8thrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTE8XTSJ", property="qte8xtsj", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTE8DDZHS", property="qte8ddzhs", jdbcType=JdbcType.DECIMAL)
    })
    FE8SPD14 selectByPrimaryKey(BigDecimal qtukid);

    @Select({
        "select",
        "QTUKID, QTEV01, QTE8SPDID, QTE8ERPID, QTE8PSDW, QTE8PSDWE, QTE8PSDWBE, QTE8PSDWN, ",
        "QTE8THYY, QTE8THYYE, QTE8THYYN, QTE8THKS, QTE8THKSE, QTE8THKSN, QTE8CKKS, QTE8CKKSE, ",
        "QTE8CKKSN, QTE8THDH, QTE8THRQ, QTE8XTSJ, QTE8DDZHS",
        "from FE8SPD14"
    })
    @Results({
        @Result(column="QTUKID", property="qtukid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QTEV01", property="qtev01", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8SPDID", property="qte8spdid", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8ERPID", property="qte8erpid", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDW", property="qte8psdw", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDWE", property="qte8psdwe", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDWBE", property="qte8psdwbe", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8PSDWN", property="qte8psdwn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THYY", property="qte8thyy", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THYYE", property="qte8thyye", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THYYN", property="qte8thyyn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THKS", property="qte8thks", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THKSE", property="qte8thkse", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THKSN", property="qte8thksn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8CKKS", property="qte8ckks", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8CKKSE", property="qte8ckkse", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8CKKSN", property="qte8ckksn", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THDH", property="qte8thdh", jdbcType=JdbcType.NCHAR),
        @Result(column="QTE8THRQ", property="qte8thrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTE8XTSJ", property="qte8xtsj", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTE8DDZHS", property="qte8ddzhs", jdbcType=JdbcType.DECIMAL)
    })
    List<FE8SPD14> selectAll();
}