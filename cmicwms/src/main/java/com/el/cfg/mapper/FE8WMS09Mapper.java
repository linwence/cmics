package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS09;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS09Mapper {
    @Select({
        "select",
        "YSMCU, YSCO, YSDOCO, YSLNID, YSPTUT01, YSPTUT02, YSPTUT03, YSFSTR1, YSFSTR2, ",
        "YSE8TYM, YSE8NAME, YSIDATE, YSRDATE, YSUPRC, YSCNYP, YSDTEE, YSDTETP, YSFSTR3, ",
        "YSFSTR4, YSFSTR5, YSCONSTR1, YSDL01, YSDL02, YSDL03, YSAB01, YSAB02, YSAB03, ",
        "YSEV01, YSEV02, YSUSER, YSPID, YSUPMJ, YSTDAY, YSAOD",
        "from FE8WMS09",
        "where YSMCU = #{ysmcu,jdbcType=NCHAR}",
          "and YSCO = #{ysco,jdbcType=NCHAR}",
          "and YSDOCO = #{ysdoco,jdbcType=DECIMAL}",
          "and YSLNID = #{yslnid,jdbcType=DECIMAL}",
          "and YSPTUT01 = #{ysptut01,jdbcType=NCHAR}",
          "and YSPTUT02 = #{ysptut02,jdbcType=NCHAR}",
          "and YSPTUT03 = #{ysptut03,jdbcType=NCHAR}",
          "and YSFSTR1 = #{ysfstr1,jdbcType=NCHAR}",
          "and YSFSTR2 = #{ysfstr2,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="YSMCU", property="ysmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSCO", property="ysco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSDOCO", property="ysdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="YSLNID", property="yslnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="YSPTUT01", property="ysptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSPTUT02", property="ysptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSPTUT03", property="ysptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSFSTR1", property="ysfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSFSTR2", property="ysfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSE8TYM", property="yse8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="YSE8NAME", property="yse8name", jdbcType=JdbcType.NCHAR),
        @Result(column="YSIDATE", property="ysidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSRDATE", property="ysrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSUPRC", property="ysuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSCNYP", property="yscnyp", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDTEE", property="ysdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSDTETP", property="ysdtetp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSFSTR3", property="ysfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="YSFSTR4", property="ysfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="YSFSTR5", property="ysfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="YSCONSTR1", property="ysconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDL01", property="ysdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDL02", property="ysdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDL03", property="ysdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="YSAB01", property="ysab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSAB02", property="ysab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSAB03", property="ysab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSEV01", property="ysev01", jdbcType=JdbcType.NCHAR),
        @Result(column="YSEV02", property="ysev02", jdbcType=JdbcType.NCHAR),
        @Result(column="YSUSER", property="ysuser", jdbcType=JdbcType.NCHAR),
        @Result(column="YSPID", property="yspid", jdbcType=JdbcType.NCHAR),
        @Result(column="YSUPMJ", property="ysupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSTDAY", property="ystday", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSAOD", property="ysaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS09 selectByPrimaryKey(@Param("ysmcu") String ysmcu, @Param("ysco") String ysco, @Param("ysdoco") BigDecimal ysdoco, @Param("yslnid") BigDecimal yslnid, @Param("ysptut01") String ysptut01, @Param("ysptut02") String ysptut02, @Param("ysptut03") String ysptut03, @Param("ysfstr1") String ysfstr1, @Param("ysfstr2") String ysfstr2);

    @Select({
        "select",
        "YSMCU, YSCO, YSDOCO, YSLNID, YSPTUT01, YSPTUT02, YSPTUT03, YSFSTR1, YSFSTR2, ",
        "YSE8TYM, YSE8NAME, YSIDATE, YSRDATE, YSUPRC, YSCNYP, YSDTEE, YSDTETP, YSFSTR3, ",
        "YSFSTR4, YSFSTR5, YSCONSTR1, YSDL01, YSDL02, YSDL03, YSAB01, YSAB02, YSAB03, ",
        "YSEV01, YSEV02, YSUSER, YSPID, YSUPMJ, YSTDAY, YSAOD",
        "from FE8WMS09"
    })
    @Results({
        @Result(column="YSMCU", property="ysmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSCO", property="ysco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSDOCO", property="ysdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="YSLNID", property="yslnid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="YSPTUT01", property="ysptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSPTUT02", property="ysptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSPTUT03", property="ysptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSFSTR1", property="ysfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSFSTR2", property="ysfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="YSE8TYM", property="yse8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="YSE8NAME", property="yse8name", jdbcType=JdbcType.NCHAR),
        @Result(column="YSIDATE", property="ysidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSRDATE", property="ysrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSUPRC", property="ysuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSCNYP", property="yscnyp", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDTEE", property="ysdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSDTETP", property="ysdtetp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="YSFSTR3", property="ysfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="YSFSTR4", property="ysfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="YSFSTR5", property="ysfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="YSCONSTR1", property="ysconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDL01", property="ysdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDL02", property="ysdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="YSDL03", property="ysdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="YSAB01", property="ysab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSAB02", property="ysab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSAB03", property="ysab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSEV01", property="ysev01", jdbcType=JdbcType.NCHAR),
        @Result(column="YSEV02", property="ysev02", jdbcType=JdbcType.NCHAR),
        @Result(column="YSUSER", property="ysuser", jdbcType=JdbcType.NCHAR),
        @Result(column="YSPID", property="yspid", jdbcType=JdbcType.NCHAR),
        @Result(column="YSUPMJ", property="ysupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSTDAY", property="ystday", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSAOD", property="ysaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS09> selectAll();
}