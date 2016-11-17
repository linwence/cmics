package com.el.cfg.mapper;

import com.el.cfg.domain.Fe80101z;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Fe80101zMapper {
    @Select({
        "select",
        "ZZAN8, ZZE8ZZLXA, ZZE8ZZBM, ZZALPH, ZZUKIDP, ZZPF1, ZZEFTJ, ZZEXDJ, ZZE8JYFW, ",
        "ZZFTTL, ZZVR01, ZZVR02, ZZURCD, ZZURDT, ZZURAT, ZZURAB, ZZURRF, ZZEV02, ZZEV03, ",
        "ZZEV04, ZZEV05, ZZDL01, ZZDL02, ZZDL03, ZZDL010, ZZDL011, ZZUSER, ZZPID, ZZJOBN, ",
        "ZZUPMJ, ZZUPMT, ZZIDATE, ZZDF01, ZZRDATE, ZZDF02, ZZUKID, ZZSTATUS, ZZFLAG",
        "from FE80101Z",
        "where ZZAN8 = #{zzan8,jdbcType=DECIMAL}",
          "and ZZE8ZZLXA = #{zze8zzlxa,jdbcType=NCHAR}",
          "and ZZE8ZZBM = #{zze8zzbm,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="ZZAN8", property="zzan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ZZE8ZZLXA", property="zze8zzlxa", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZE8ZZBM", property="zze8zzbm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZALPH", property="zzalph", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUKIDP", property="zzukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZPF1", property="zzpf1", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEFTJ", property="zzeftj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZEXDJ", property="zzexdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZE8JYFW", property="zze8jyfw", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZFTTL", property="zzfttl", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZVR01", property="zzvr01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZVR02", property="zzvr02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURCD", property="zzurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURDT", property="zzurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAT", property="zzurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAB", property="zzurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURRF", property="zzurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV02", property="zzev02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV03", property="zzev03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV04", property="zzev04", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV05", property="zzev05", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL01", property="zzdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL02", property="zzdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL03", property="zzdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL010", property="zzdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL011", property="zzdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUSER", property="zzuser", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZPID", property="zzpid", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZJOBN", property="zzjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUPMJ", property="zzupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZUPMT", property="zzupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZIDATE", property="zzidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ZZDF01", property="zzdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZRDATE", property="zzrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ZZDF02", property="zzdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUKID", property="zzukid", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZSTATUS", property="zzstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZFLAG", property="zzflag", jdbcType=JdbcType.NCHAR)
    })
    Fe80101z selectByPrimaryKey(@Param("zzan8") BigDecimal zzan8, @Param("zze8zzlxa") String zze8zzlxa, @Param("zze8zzbm") String zze8zzbm);

    @Select({
        "select",
        "ZZAN8, ZZE8ZZLXA, ZZE8ZZBM, ZZALPH, ZZUKIDP, ZZPF1, ZZEFTJ, ZZEXDJ, ZZE8JYFW, ",
        "ZZFTTL, ZZVR01, ZZVR02, ZZURCD, ZZURDT, ZZURAT, ZZURAB, ZZURRF, ZZEV02, ZZEV03, ",
        "ZZEV04, ZZEV05, ZZDL01, ZZDL02, ZZDL03, ZZDL010, ZZDL011, ZZUSER, ZZPID, ZZJOBN, ",
        "ZZUPMJ, ZZUPMT, ZZIDATE, ZZDF01, ZZRDATE, ZZDF02, ZZUKID, ZZSTATUS, ZZFLAG",
        "from FE80101Z"
    })
    @Results({
        @Result(column="ZZAN8", property="zzan8", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ZZE8ZZLXA", property="zze8zzlxa", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZE8ZZBM", property="zze8zzbm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZALPH", property="zzalph", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUKIDP", property="zzukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZPF1", property="zzpf1", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEFTJ", property="zzeftj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZEXDJ", property="zzexdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZE8JYFW", property="zze8jyfw", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZFTTL", property="zzfttl", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZVR01", property="zzvr01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZVR02", property="zzvr02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURCD", property="zzurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURDT", property="zzurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAT", property="zzurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAB", property="zzurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURRF", property="zzurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV02", property="zzev02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV03", property="zzev03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV04", property="zzev04", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV05", property="zzev05", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL01", property="zzdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL02", property="zzdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL03", property="zzdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL010", property="zzdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL011", property="zzdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUSER", property="zzuser", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZPID", property="zzpid", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZJOBN", property="zzjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUPMJ", property="zzupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZUPMT", property="zzupmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZIDATE", property="zzidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ZZDF01", property="zzdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZRDATE", property="zzrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ZZDF02", property="zzdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZUKID", property="zzukid", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZSTATUS", property="zzstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZFLAG", property="zzflag", jdbcType=JdbcType.NCHAR)
    })
    List<Fe80101z> selectAll();
}