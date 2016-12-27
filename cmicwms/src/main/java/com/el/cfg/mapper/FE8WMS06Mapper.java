package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS06;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS06Mapper {
    @Select({
        "select",
        "RKMCU, RKCO, RKDOCO, RKPTUT01, RKPTUT02, RKPTUT03, RKFFDS3, RKFFDS4, RKFNDN, ",
        "RKFSTR1, RKE8TYM, RKE8NAME, RKIDATE, RKRDATE, RKUPRC, RKPRRC, RKFRRC, RKFMTX, ",
        "RKFSTR2, RKFSTR3, RKDTEE, RKDTETP, RKAIRD, RKADS1, RKFSTR4, RKE8JX, RKDL011, ",
        "RKCONSTR1, RKAHL1, RKAHL2, RKCONSTR2, RKCONSTR3, RKFSTR5, RKFSTR6, RKDL01, RKDL02, ",
        "RKDL03, RKAB01, RKAB02, RKAB03, RKEV01, RKEV02, RKUSER, RKPID, RKUPMJ, RKTDAY, ",
        "RKAOD",
        "from FE8WMS06",
        "where RKMCU = #{rkmcu,jdbcType=NCHAR}",
          "and RKCO = #{rkco,jdbcType=NCHAR}",
          "and RKDOCO = #{rkdoco,jdbcType=DECIMAL}",
          "and RKPTUT01 = #{rkptut01,jdbcType=NCHAR}",
          "and RKPTUT02 = #{rkptut02,jdbcType=NCHAR}",
          "and RKPTUT03 = #{rkptut03,jdbcType=NCHAR}",
          "and RKFFDS3 = #{rkffds3,jdbcType=NCHAR}",
          "and RKFFDS4 = #{rkffds4,jdbcType=NCHAR}",
          "and RKFNDN = #{rkfndn,jdbcType=NCHAR}",
          "and RKFSTR1 = #{rkfstr1,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="RKMCU", property="rkmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKCO", property="rkco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKDOCO", property="rkdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="RKPTUT01", property="rkptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKPTUT02", property="rkptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKPTUT03", property="rkptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFFDS3", property="rkffds3", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFFDS4", property="rkffds4", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFNDN", property="rkfndn", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFSTR1", property="rkfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKE8TYM", property="rke8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="RKE8NAME", property="rke8name", jdbcType=JdbcType.NCHAR),
        @Result(column="RKIDATE", property="rkidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKRDATE", property="rkrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKUPRC", property="rkuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKPRRC", property="rkprrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKFRRC", property="rkfrrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKFMTX", property="rkfmtx", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR2", property="rkfstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR3", property="rkfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDTEE", property="rkdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKDTETP", property="rkdtetp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKAIRD", property="rkaird", jdbcType=JdbcType.NCHAR),
        @Result(column="RKADS1", property="rkads1", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR4", property="rkfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="RKE8JX", property="rke8jx", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL011", property="rkdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="RKCONSTR1", property="rkconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="RKAHL1", property="rkahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="RKAHL2", property="rkahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="RKCONSTR2", property="rkconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="RKCONSTR3", property="rkconstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR5", property="rkfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR6", property="rkfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL01", property="rkdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL02", property="rkdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL03", property="rkdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="RKAB01", property="rkab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKAB02", property="rkab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKAB03", property="rkab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKEV01", property="rkev01", jdbcType=JdbcType.NCHAR),
        @Result(column="RKEV02", property="rkev02", jdbcType=JdbcType.NCHAR),
        @Result(column="RKUSER", property="rkuser", jdbcType=JdbcType.NCHAR),
        @Result(column="RKPID", property="rkpid", jdbcType=JdbcType.NCHAR),
        @Result(column="RKUPMJ", property="rkupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKTDAY", property="rktday", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKAOD", property="rkaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS06 selectByPrimaryKey(@Param("rkmcu") String rkmcu, @Param("rkco") String rkco, @Param("rkdoco") BigDecimal rkdoco, @Param("rkptut01") String rkptut01, @Param("rkptut02") String rkptut02, @Param("rkptut03") String rkptut03, @Param("rkffds3") String rkffds3, @Param("rkffds4") String rkffds4, @Param("rkfndn") String rkfndn, @Param("rkfstr1") String rkfstr1);

    @Select({
        "select",
        "RKMCU, RKCO, RKDOCO, RKPTUT01, RKPTUT02, RKPTUT03, RKFFDS3, RKFFDS4, RKFNDN, ",
        "RKFSTR1, RKE8TYM, RKE8NAME, RKIDATE, RKRDATE, RKUPRC, RKPRRC, RKFRRC, RKFMTX, ",
        "RKFSTR2, RKFSTR3, RKDTEE, RKDTETP, RKAIRD, RKADS1, RKFSTR4, RKE8JX, RKDL011, ",
        "RKCONSTR1, RKAHL1, RKAHL2, RKCONSTR2, RKCONSTR3, RKFSTR5, RKFSTR6, RKDL01, RKDL02, ",
        "RKDL03, RKAB01, RKAB02, RKAB03, RKEV01, RKEV02, RKUSER, RKPID, RKUPMJ, RKTDAY, ",
        "RKAOD",
        "from FE8WMS06"
    })
    @Results({
        @Result(column="RKMCU", property="rkmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKCO", property="rkco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKDOCO", property="rkdoco", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="RKPTUT01", property="rkptut01", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKPTUT02", property="rkptut02", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKPTUT03", property="rkptut03", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFFDS3", property="rkffds3", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFFDS4", property="rkffds4", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFNDN", property="rkfndn", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKFSTR1", property="rkfstr1", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="RKE8TYM", property="rke8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="RKE8NAME", property="rke8name", jdbcType=JdbcType.NCHAR),
        @Result(column="RKIDATE", property="rkidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKRDATE", property="rkrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKUPRC", property="rkuprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKPRRC", property="rkprrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKFRRC", property="rkfrrc", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKFMTX", property="rkfmtx", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR2", property="rkfstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR3", property="rkfstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDTEE", property="rkdtee", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKDTETP", property="rkdtetp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RKAIRD", property="rkaird", jdbcType=JdbcType.NCHAR),
        @Result(column="RKADS1", property="rkads1", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR4", property="rkfstr4", jdbcType=JdbcType.NCHAR),
        @Result(column="RKE8JX", property="rke8jx", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL011", property="rkdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="RKCONSTR1", property="rkconstr1", jdbcType=JdbcType.NCHAR),
        @Result(column="RKAHL1", property="rkahl1", jdbcType=JdbcType.NCHAR),
        @Result(column="RKAHL2", property="rkahl2", jdbcType=JdbcType.NCHAR),
        @Result(column="RKCONSTR2", property="rkconstr2", jdbcType=JdbcType.NCHAR),
        @Result(column="RKCONSTR3", property="rkconstr3", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR5", property="rkfstr5", jdbcType=JdbcType.NCHAR),
        @Result(column="RKFSTR6", property="rkfstr6", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL01", property="rkdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL02", property="rkdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="RKDL03", property="rkdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="RKAB01", property="rkab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKAB02", property="rkab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKAB03", property="rkab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKEV01", property="rkev01", jdbcType=JdbcType.NCHAR),
        @Result(column="RKEV02", property="rkev02", jdbcType=JdbcType.NCHAR),
        @Result(column="RKUSER", property="rkuser", jdbcType=JdbcType.NCHAR),
        @Result(column="RKPID", property="rkpid", jdbcType=JdbcType.NCHAR),
        @Result(column="RKUPMJ", property="rkupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKTDAY", property="rktday", jdbcType=JdbcType.DECIMAL),
        @Result(column="RKAOD", property="rkaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS06> selectAll();
}