package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS07;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS07Mapper {
    @Select({
        "select",
        "CKMCU, CKCO, CKDOCO, CKPTUT01, CKPTUT02, CKPTUT03, CKFSTR1, CKFSTR2, CKDTEE, ",
        "CKE8TYM, CKE8NAME, CKIDATE, CKRDATE, CKUPRC, CKFSTR3, CKFSTR4, CKCONSTR1, CKFSTR5, ",
        "CKFSTR6, CKFSTR61, CKFSTR62, CKAHL1, CKCONSTR2, CKAHL2, CKCONSTR3, CKDL01, CKDL02, ",
        "CKDL03, CKAB01, CKAB02, CKAB03, CKEV01, CKEV02, CKUSER, CKPID, CKUPMJ, CKTDAY, ",
        "CKAOD",
        "from FE8WMS07",
        "where CKMCU = #{ckmcu,jdbcType=NCHAR}",
          "and CKCO = #{ckco,jdbcType=NCHAR}",
          "and CKDOCO = #{ckdoco,jdbcType=DECIMAL}",
          "and CKPTUT01 = #{ckptut01,jdbcType=NCHAR}",
          "and CKPTUT02 = #{ckptut02,jdbcType=NCHAR}",
          "and CKPTUT03 = #{ckptut03,jdbcType=NCHAR}",
          "and CKFSTR1 = #{ckfstr1,jdbcType=NCHAR}",
          "and CKFSTR2 = #{ckfstr2,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="CKMCU", property="ckmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKCO", property="ckco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKDOCO", property="ckdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CKPTUT01", property="ckptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKPTUT02", property="ckptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKPTUT03", property="ckptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKFSTR1", property="ckfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKFSTR2", property="ckfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKDTEE", property="ckdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CKE8TYM", property="cke8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="CKE8NAME", property="cke8name", jdbcType=JdbcType.NCHAR),
        @Result(column="CKIDATE", property="ckidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CKRDATE", property="ckrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CKUPRC", property="ckuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKFSTR3", property="ckfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR4", property="ckfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="CKCONSTR1", property="ckconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR5", property="ckfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR6", property="ckfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR61", property="ckfstr61", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR62", property="ckfstr62", jdbcType=JdbcType.NCHAR),
        @Result(column="CKAHL1", property="ckahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="CKCONSTR2", property="ckconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="CKAHL2", property="ckahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="CKCONSTR3", property="ckconstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="CKDL01", property="ckdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="CKDL02", property="ckdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="CKDL03", property="ckdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="CKAB01", property="ckab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKAB02", property="ckab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKAB03", property="ckab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKEV01", property="ckev01", jdbcType=JdbcType.NCHAR),
        @Result(column="CKEV02", property="ckev02", jdbcType=JdbcType.NCHAR),
        @Result(column="CKUSER", property="ckuser", jdbcType=JdbcType.NCHAR),
        @Result(column="CKPID", property="ckpid", jdbcType=JdbcType.NCHAR),
        @Result(column="CKUPMJ", property="ckupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKTDAY", property="cktday", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKAOD", property="ckaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS07 selectByPrimaryKey(@Param("ckmcu") String ckmcu, @Param("ckco") String ckco, @Param("ckdoco") BigDecimal ckdoco, @Param("ckptut01") String ckptut01, @Param("ckptut02") String ckptut02, @Param("ckptut03") String ckptut03, @Param("ckfstr1") String ckfstr1, @Param("ckfstr2") String ckfstr2);

    @Select({
        "select",
        "CKMCU, CKCO, CKDOCO, CKPTUT01, CKPTUT02, CKPTUT03, CKFSTR1, CKFSTR2, CKDTEE, ",
        "CKE8TYM, CKE8NAME, CKIDATE, CKRDATE, CKUPRC, CKFSTR3, CKFSTR4, CKCONSTR1, CKFSTR5, ",
        "CKFSTR6, CKFSTR61, CKFSTR62, CKAHL1, CKCONSTR2, CKAHL2, CKCONSTR3, CKDL01, CKDL02, ",
        "CKDL03, CKAB01, CKAB02, CKAB03, CKEV01, CKEV02, CKUSER, CKPID, CKUPMJ, CKTDAY, ",
        "CKAOD",
        "from FE8WMS07"
    })
    @Results({
        @Result(column="CKMCU", property="ckmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKCO", property="ckco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKDOCO", property="ckdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CKPTUT01", property="ckptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKPTUT02", property="ckptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKPTUT03", property="ckptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKFSTR1", property="ckfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKFSTR2", property="ckfstr2", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="CKDTEE", property="ckdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CKE8TYM", property="cke8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="CKE8NAME", property="cke8name", jdbcType=JdbcType.NCHAR),
        @Result(column="CKIDATE", property="ckidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CKRDATE", property="ckrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CKUPRC", property="ckuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKFSTR3", property="ckfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR4", property="ckfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="CKCONSTR1", property="ckconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR5", property="ckfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR6", property="ckfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR61", property="ckfstr61", jdbcType=JdbcType.NCHAR),
        @Result(column="CKFSTR62", property="ckfstr62", jdbcType=JdbcType.NCHAR),
        @Result(column="CKAHL1", property="ckahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="CKCONSTR2", property="ckconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="CKAHL2", property="ckahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="CKCONSTR3", property="ckconstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="CKDL01", property="ckdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="CKDL02", property="ckdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="CKDL03", property="ckdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="CKAB01", property="ckab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKAB02", property="ckab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKAB03", property="ckab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKEV01", property="ckev01", jdbcType=JdbcType.NCHAR),
        @Result(column="CKEV02", property="ckev02", jdbcType=JdbcType.NCHAR),
        @Result(column="CKUSER", property="ckuser", jdbcType=JdbcType.NCHAR),
        @Result(column="CKPID", property="ckpid", jdbcType=JdbcType.NCHAR),
        @Result(column="CKUPMJ", property="ckupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKTDAY", property="cktday", jdbcType=JdbcType.DECIMAL),
        @Result(column="CKAOD", property="ckaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS07> selectAll();
}