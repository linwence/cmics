package com.el.cfg.mapper;

import com.el.cfg.domain.F4104;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface F4104Mapper {
    @Select({
        "select",
        "IVITM, IVXRT, IVAN8, IVCITM, IVEXDJ, IVCIRV, IVEFTJ, IVMCU, IVDSC1, IVDSC2, ",
        "IVALN, IVLITM, IVAITM, IVURCD, IVURDT, IVURAT, IVURAB, IVURRF, IVUSER, IVPID, ",
        "IVJOBN, IVUPMJ, IVTDAY, IVRATO, IVAPSP, IVIDEM, IVAPSS, IVADIND, IVBPIND, IVCARDNO",
        "from F4104",
        "where IVITM = #{ivitm,jdbcType=DECIMAL}",
          "and IVXRT = #{ivxrt,jdbcType=NCHAR}",
          "and IVAN8 = #{ivan8,jdbcType=DECIMAL}",
          "and IVCITM = #{ivcitm,jdbcType=NCHAR}",
          "and IVEXDJ = #{ivexdj,jdbcType=DECIMAL}",
          "and IVCIRV = #{ivcirv,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="IVITM", property="ivitm", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="IVXRT", property="ivxrt", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="IVAN8", property="ivan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="IVCITM", property="ivcitm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="IVEXDJ", property="ivexdj", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="IVCIRV", property="ivcirv", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="IVEFTJ", property="iveftj", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVMCU", property="ivmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="IVDSC1", property="ivdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="IVDSC2", property="ivdsc2", jdbcType=JdbcType.NCHAR),
        @Result(column="IVALN", property="ivaln", jdbcType=JdbcType.NCHAR),
        @Result(column="IVLITM", property="ivlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="IVAITM", property="ivaitm", jdbcType=JdbcType.NCHAR),
        @Result(column="IVURCD", property="ivurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="IVURDT", property="ivurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVURAT", property="ivurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVURAB", property="ivurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVURRF", property="ivurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="IVUSER", property="ivuser", jdbcType=JdbcType.NCHAR),
        @Result(column="IVPID", property="ivpid", jdbcType=JdbcType.NCHAR),
        @Result(column="IVJOBN", property="ivjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="IVUPMJ", property="ivupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVTDAY", property="ivtday", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVRATO", property="ivrato", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVAPSP", property="ivapsp", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVIDEM", property="ividem", jdbcType=JdbcType.NCHAR),
        @Result(column="IVAPSS", property="ivapss", jdbcType=JdbcType.NCHAR),
        @Result(column="IVADIND", property="ivadind", jdbcType=JdbcType.NCHAR),
        @Result(column="IVBPIND", property="ivbpind", jdbcType=JdbcType.NCHAR),
        @Result(column="IVCARDNO", property="ivcardno", jdbcType=JdbcType.NCHAR)
    })
    F4104 selectByPrimaryKey(@Param("ivitm") BigDecimal ivitm, @Param("ivxrt") String ivxrt, @Param("ivan8") BigDecimal ivan8, @Param("ivcitm") String ivcitm, @Param("ivexdj") Integer ivexdj, @Param("ivcirv") String ivcirv);

    @Select({
        "select",
        "IVITM, IVXRT, IVAN8, IVCITM, IVEXDJ, IVCIRV, IVEFTJ, IVMCU, IVDSC1, IVDSC2, ",
        "IVALN, IVLITM, IVAITM, IVURCD, IVURDT, IVURAT, IVURAB, IVURRF, IVUSER, IVPID, ",
        "IVJOBN, IVUPMJ, IVTDAY, IVRATO, IVAPSP, IVIDEM, IVAPSS, IVADIND, IVBPIND, IVCARDNO",
        "from F4104"
    })
    @Results({
        @Result(column="IVITM", property="ivitm", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="IVXRT", property="ivxrt", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="IVAN8", property="ivan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="IVCITM", property="ivcitm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="IVEXDJ", property="ivexdj", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="IVCIRV", property="ivcirv", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="IVEFTJ", property="iveftj", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVMCU", property="ivmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="IVDSC1", property="ivdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="IVDSC2", property="ivdsc2", jdbcType=JdbcType.NCHAR),
        @Result(column="IVALN", property="ivaln", jdbcType=JdbcType.NCHAR),
        @Result(column="IVLITM", property="ivlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="IVAITM", property="ivaitm", jdbcType=JdbcType.NCHAR),
        @Result(column="IVURCD", property="ivurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="IVURDT", property="ivurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVURAT", property="ivurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVURAB", property="ivurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVURRF", property="ivurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="IVUSER", property="ivuser", jdbcType=JdbcType.NCHAR),
        @Result(column="IVPID", property="ivpid", jdbcType=JdbcType.NCHAR),
        @Result(column="IVJOBN", property="ivjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="IVUPMJ", property="ivupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVTDAY", property="ivtday", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVRATO", property="ivrato", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVAPSP", property="ivapsp", jdbcType=JdbcType.DECIMAL),
        @Result(column="IVIDEM", property="ividem", jdbcType=JdbcType.NCHAR),
        @Result(column="IVAPSS", property="ivapss", jdbcType=JdbcType.NCHAR),
        @Result(column="IVADIND", property="ivadind", jdbcType=JdbcType.NCHAR),
        @Result(column="IVBPIND", property="ivbpind", jdbcType=JdbcType.NCHAR),
        @Result(column="IVCARDNO", property="ivcardno", jdbcType=JdbcType.NCHAR)
    })
    List<F4104> selectAll();
}