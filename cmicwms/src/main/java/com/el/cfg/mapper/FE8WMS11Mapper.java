package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS11;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS11Mapper {
    @Select({
        "select",
        "CTMCU, CTCO, CTPTUT01, CTPTUT02, CTPTUT03, CTFSTR1, CTDSTX, CTFSTR2, CTDTEE, ",
        "CTE8TYM, CTE8NAME, CTIDATE, CTRDATE, CTUPRC, CTFSTR3, CTFSTR4, CTCONSTR1, CTFSTR5, ",
        "CTFSTR6, CTFSTR61, CTFSTR62, CTAHL1, CTDTA1, CTAHL2, CTCONSTR2, CTDL01, CTDL02, ",
        "CTDL03, CTAB01, CTAB02, CTAB03, CTEV01, CTEV02, CTUSER, CTPID, CTUPMJ, CTTDAY, ",
        "CTAOD",
        "from FE8WMS11",
        "where CTMCU = #{ctmcu,jdbcType=NCHAR}",
          "and CTCO = #{ctco,jdbcType=NCHAR}",
          "and CTPTUT01 = #{ctptut01,jdbcType=NCHAR}",
          "and CTPTUT02 = #{ctptut02,jdbcType=NCHAR}",
          "and CTPTUT03 = #{ctptut03,jdbcType=NCHAR}",
          "and CTFSTR1 = #{ctfstr1,jdbcType=NCHAR}",
          "and CTDSTX = #{ctdstx,jdbcType=NCHAR}",
          "and CTFSTR2 = #{ctfstr2,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="CTMCU", property="ctmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTCO", property="ctco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTPTUT01", property="ctptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTPTUT02", property="ctptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTPTUT03", property="ctptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTFSTR1", property="ctfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTDSTX", property="ctdstx", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTFSTR2", property="ctfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTDTEE", property="ctdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CTE8TYM", property="cte8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="CTE8NAME", property="cte8name", jdbcType=JdbcType.NCHAR),
        @Result(column="CTIDATE", property="ctidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CTRDATE", property="ctrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CTUPRC", property="ctuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTFSTR3", property="ctfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR4", property="ctfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="CTCONSTR1", property="ctconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR5", property="ctfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR6", property="ctfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR61", property="ctfstr61", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR62", property="ctfstr62", jdbcType=JdbcType.NCHAR),
        @Result(column="CTAHL1", property="ctahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDTA1", property="ctdta1", jdbcType=JdbcType.NCHAR),
        @Result(column="CTAHL2", property="ctahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="CTCONSTR2", property="ctconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDL01", property="ctdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDL02", property="ctdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDL03", property="ctdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="CTAB01", property="ctab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTAB02", property="ctab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTAB03", property="ctab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTEV01", property="ctev01", jdbcType=JdbcType.NCHAR),
        @Result(column="CTEV02", property="ctev02", jdbcType=JdbcType.NCHAR),
        @Result(column="CTUSER", property="ctuser", jdbcType=JdbcType.NCHAR),
        @Result(column="CTPID", property="ctpid", jdbcType=JdbcType.NCHAR),
        @Result(column="CTUPMJ", property="ctupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTTDAY", property="cttday", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTAOD", property="ctaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS11 selectByPrimaryKey(@Param("ctmcu") String ctmcu, @Param("ctco") String ctco, @Param("ctptut01") String ctptut01, @Param("ctptut02") String ctptut02, @Param("ctptut03") String ctptut03, @Param("ctfstr1") String ctfstr1, @Param("ctdstx") String ctdstx, @Param("ctfstr2") String ctfstr2);

    @Select({
        "select",
        "CTMCU, CTCO, CTPTUT01, CTPTUT02, CTPTUT03, CTFSTR1, CTDSTX, CTFSTR2, CTDTEE, ",
        "CTE8TYM, CTE8NAME, CTIDATE, CTRDATE, CTUPRC, CTFSTR3, CTFSTR4, CTCONSTR1, CTFSTR5, ",
        "CTFSTR6, CTFSTR61, CTFSTR62, CTAHL1, CTDTA1, CTAHL2, CTCONSTR2, CTDL01, CTDL02, ",
        "CTDL03, CTAB01, CTAB02, CTAB03, CTEV01, CTEV02, CTUSER, CTPID, CTUPMJ, CTTDAY, ",
        "CTAOD",
        "from FE8WMS11"
    })
    @Results({
        @Result(column="CTMCU", property="ctmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTCO", property="ctco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTPTUT01", property="ctptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTPTUT02", property="ctptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTPTUT03", property="ctptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTFSTR1", property="ctfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTDSTX", property="ctdstx", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTFSTR2", property="ctfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CTDTEE", property="ctdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CTE8TYM", property="cte8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="CTE8NAME", property="cte8name", jdbcType=JdbcType.NCHAR),
        @Result(column="CTIDATE", property="ctidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CTRDATE", property="ctrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CTUPRC", property="ctuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTFSTR3", property="ctfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR4", property="ctfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="CTCONSTR1", property="ctconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR5", property="ctfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR6", property="ctfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR61", property="ctfstr61", jdbcType=JdbcType.NCHAR),
        @Result(column="CTFSTR62", property="ctfstr62", jdbcType=JdbcType.NCHAR),
        @Result(column="CTAHL1", property="ctahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDTA1", property="ctdta1", jdbcType=JdbcType.NCHAR),
        @Result(column="CTAHL2", property="ctahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="CTCONSTR2", property="ctconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDL01", property="ctdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDL02", property="ctdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="CTDL03", property="ctdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="CTAB01", property="ctab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTAB02", property="ctab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTAB03", property="ctab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTEV01", property="ctev01", jdbcType=JdbcType.NCHAR),
        @Result(column="CTEV02", property="ctev02", jdbcType=JdbcType.NCHAR),
        @Result(column="CTUSER", property="ctuser", jdbcType=JdbcType.NCHAR),
        @Result(column="CTPID", property="ctpid", jdbcType=JdbcType.NCHAR),
        @Result(column="CTUPMJ", property="ctupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTTDAY", property="cttday", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTAOD", property="ctaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS11> selectAll();
}