package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS10;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS10Mapper {
    @Select({
        "select",
        "XTMCU, XTCO, XTDOCO, XTPTUT01, XTPTUT02, XTPTUT03, XTFSTR1, XTFSTR2, XTDSTL, ",
        "XTFSTR3, XTE8TYM, XTE8NAME, XTIDATE, XTRDATE, XTUPRC, XTPRRC, XTFRRC, XTCNYP, ",
        "XTFSTR4, XTFSTR5, XTDTEE, XTDTETP, XTCATL, XTADS1, XTFSTR6, XTFSTR61, XTDL011, ",
        "XTCONSTR1, XTAHL1, XTAHL2, XTFIL2, XTCONSTR2, XTFSTR62, XTFSTR63, XTDL01, XTDL02, ",
        "XTDL03, XTAB01, XTAB02, XTAB03, XTEV01, XTEV02, XTUSER, XTPID, XTUPMJ, XTTDAY, ",
        "XTAOD",
        "from FE8WMS10",
        "where XTMCU = #{xtmcu,jdbcType=NCHAR}",
          "and XTCO = #{xtco,jdbcType=NCHAR}",
          "and XTDOCO = #{xtdoco,jdbcType=DECIMAL}",
          "and XTPTUT01 = #{xtptut01,jdbcType=NCHAR}",
          "and XTPTUT02 = #{xtptut02,jdbcType=NCHAR}",
          "and XTPTUT03 = #{xtptut03,jdbcType=NCHAR}",
          "and XTFSTR1 = #{xtfstr1,jdbcType=NCHAR}",
          "and XTFSTR2 = #{xtfstr2,jdbcType=NCHAR}",
          "and XTDSTL = #{xtdstl,jdbcType=NCHAR}",
          "and XTFSTR3 = #{xtfstr3,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="XTMCU", property="xtmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTCO", property="xtco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTDOCO", property="xtdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="XTPTUT01", property="xtptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTPTUT02", property="xtptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTPTUT03", property="xtptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTFSTR1", property="xtfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTFSTR2", property="xtfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTDSTL", property="xtdstl", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTFSTR3", property="xtfstr3", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTE8TYM", property="xte8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="XTE8NAME", property="xte8name", jdbcType=JdbcType.NCHAR),
        @Result(column="XTIDATE", property="xtidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTRDATE", property="xtrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTUPRC", property="xtuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTPRRC", property="xtprrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTFRRC", property="xtfrrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTCNYP", property="xtcnyp", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR4", property="xtfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR5", property="xtfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDTEE", property="xtdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTDTETP", property="xtdtetp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTCATL", property="xtcatl", jdbcType=JdbcType.NCHAR),
        @Result(column="XTADS1", property="xtads1", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR6", property="xtfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR61", property="xtfstr61", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL011", property="xtdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="XTCONSTR1", property="xtconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="XTAHL1", property="xtahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="XTAHL2", property="xtahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFIL2", property="xtfil2", jdbcType=JdbcType.NCHAR),
        @Result(column="XTCONSTR2", property="xtconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR62", property="xtfstr62", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR63", property="xtfstr63", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL01", property="xtdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL02", property="xtdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL03", property="xtdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="XTAB01", property="xtab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTAB02", property="xtab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTAB03", property="xtab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTEV01", property="xtev01", jdbcType=JdbcType.NCHAR),
        @Result(column="XTEV02", property="xtev02", jdbcType=JdbcType.NCHAR),
        @Result(column="XTUSER", property="xtuser", jdbcType=JdbcType.NCHAR),
        @Result(column="XTPID", property="xtpid", jdbcType=JdbcType.NCHAR),
        @Result(column="XTUPMJ", property="xtupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTTDAY", property="xttday", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTAOD", property="xtaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS10 selectByPrimaryKey(@Param("xtmcu") String xtmcu, @Param("xtco") String xtco, @Param("xtdoco") BigDecimal xtdoco, @Param("xtptut01") String xtptut01, @Param("xtptut02") String xtptut02, @Param("xtptut03") String xtptut03, @Param("xtfstr1") String xtfstr1, @Param("xtfstr2") String xtfstr2, @Param("xtdstl") String xtdstl, @Param("xtfstr3") String xtfstr3);

    @Select({
        "select",
        "XTMCU, XTCO, XTDOCO, XTPTUT01, XTPTUT02, XTPTUT03, XTFSTR1, XTFSTR2, XTDSTL, ",
        "XTFSTR3, XTE8TYM, XTE8NAME, XTIDATE, XTRDATE, XTUPRC, XTPRRC, XTFRRC, XTCNYP, ",
        "XTFSTR4, XTFSTR5, XTDTEE, XTDTETP, XTCATL, XTADS1, XTFSTR6, XTFSTR61, XTDL011, ",
        "XTCONSTR1, XTAHL1, XTAHL2, XTFIL2, XTCONSTR2, XTFSTR62, XTFSTR63, XTDL01, XTDL02, ",
        "XTDL03, XTAB01, XTAB02, XTAB03, XTEV01, XTEV02, XTUSER, XTPID, XTUPMJ, XTTDAY, ",
        "XTAOD",
        "from FE8WMS10"
    })
    @Results({
        @Result(column="XTMCU", property="xtmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTCO", property="xtco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTDOCO", property="xtdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="XTPTUT01", property="xtptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTPTUT02", property="xtptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTPTUT03", property="xtptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTFSTR1", property="xtfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTFSTR2", property="xtfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTDSTL", property="xtdstl", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTFSTR3", property="xtfstr3", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="XTE8TYM", property="xte8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="XTE8NAME", property="xte8name", jdbcType=JdbcType.NCHAR),
        @Result(column="XTIDATE", property="xtidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTRDATE", property="xtrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTUPRC", property="xtuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTPRRC", property="xtprrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTFRRC", property="xtfrrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTCNYP", property="xtcnyp", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR4", property="xtfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR5", property="xtfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDTEE", property="xtdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTDTETP", property="xtdtetp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XTCATL", property="xtcatl", jdbcType=JdbcType.NCHAR),
        @Result(column="XTADS1", property="xtads1", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR6", property="xtfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR61", property="xtfstr61", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL011", property="xtdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="XTCONSTR1", property="xtconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="XTAHL1", property="xtahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="XTAHL2", property="xtahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFIL2", property="xtfil2", jdbcType=JdbcType.NCHAR),
        @Result(column="XTCONSTR2", property="xtconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR62", property="xtfstr62", jdbcType=JdbcType.NCHAR),
        @Result(column="XTFSTR63", property="xtfstr63", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL01", property="xtdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL02", property="xtdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="XTDL03", property="xtdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="XTAB01", property="xtab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTAB02", property="xtab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTAB03", property="xtab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTEV01", property="xtev01", jdbcType=JdbcType.NCHAR),
        @Result(column="XTEV02", property="xtev02", jdbcType=JdbcType.NCHAR),
        @Result(column="XTUSER", property="xtuser", jdbcType=JdbcType.NCHAR),
        @Result(column="XTPID", property="xtpid", jdbcType=JdbcType.NCHAR),
        @Result(column="XTUPMJ", property="xtupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTTDAY", property="xttday", jdbcType=JdbcType.DECIMAL),
        @Result(column="XTAOD", property="xtaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS10> selectAll();
}