package com.el.cfg.mapper;

import com.el.cfg.domain.Fe84101z;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Fe84101zMapper {
    @Select({
        "select",
        "ZZLITM, ZZE8ZZLXA, ZZE8ZZBM, ZZUKIDP, ZZDSC1, ZZE8NAME, ZZDSC2, ZZEFTJ, ZZEXDJ, ",
        "ZZFTTL, ZZURCD, ZZURDT, ZZURAT, ZZURAB, ZZDL01, ZZDL02, ZZDL03, ZZDL010, ZZDL011, ",
        "ZZEV02, ZZEV03, ZZEV04, ZZEV05, ZZUSER, ZZPID, ZZJOBN, ZZUPMJ, ZZUPMT, ZZIDATE, ",
        "ZZDF01, ZZRDATE, ZZDF02, ZZUKID, ZZSTATUS, ZZFLAG",
        "from FE84101Z",
        "where ZZLITM = #{zzlitm,jdbcType=NCHAR}",
          "and ZZE8ZZLXA = #{zze8zzlxa,jdbcType=NCHAR}",
          "and ZZE8ZZBM = #{zze8zzbm,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="ZZLITM", property="zzlitm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZE8ZZLXA", property="zze8zzlxa", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZE8ZZBM", property="zze8zzbm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZUKIDP", property="zzukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZDSC1", property="zzdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZE8NAME", property="zze8name", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDSC2", property="zzdsc2", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEFTJ", property="zzeftj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZEXDJ", property="zzexdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZFTTL", property="zzfttl", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURCD", property="zzurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURDT", property="zzurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAT", property="zzurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAB", property="zzurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZDL01", property="zzdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL02", property="zzdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL03", property="zzdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL010", property="zzdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL011", property="zzdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV02", property="zzev02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV03", property="zzev03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV04", property="zzev04", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV05", property="zzev05", jdbcType=JdbcType.NCHAR),
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
    Fe84101z selectByPrimaryKey(@Param("zzlitm") String zzlitm, @Param("zze8zzlxa") String zze8zzlxa, @Param("zze8zzbm") String zze8zzbm);

    @Select({
        "select",
        "ZZLITM, ZZE8ZZLXA, ZZE8ZZBM, ZZUKIDP, ZZDSC1, ZZE8NAME, ZZDSC2, ZZEFTJ, ZZEXDJ, ",
        "ZZFTTL, ZZURCD, ZZURDT, ZZURAT, ZZURAB, ZZDL01, ZZDL02, ZZDL03, ZZDL010, ZZDL011, ",
        "ZZEV02, ZZEV03, ZZEV04, ZZEV05, ZZUSER, ZZPID, ZZJOBN, ZZUPMJ, ZZUPMT, ZZIDATE, ",
        "ZZDF01, ZZRDATE, ZZDF02, ZZUKID, ZZSTATUS, ZZFLAG",
        "from FE84101Z"
    })
    @Results({
        @Result(column="ZZLITM", property="zzlitm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZE8ZZLXA", property="zze8zzlxa", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZE8ZZBM", property="zze8zzbm", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="ZZUKIDP", property="zzukidp", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZDSC1", property="zzdsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZE8NAME", property="zze8name", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDSC2", property="zzdsc2", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEFTJ", property="zzeftj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZEXDJ", property="zzexdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZFTTL", property="zzfttl", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURCD", property="zzurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZURDT", property="zzurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAT", property="zzurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZURAB", property="zzurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZZDL01", property="zzdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL02", property="zzdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL03", property="zzdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL010", property="zzdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZDL011", property="zzdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV02", property="zzev02", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV03", property="zzev03", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV04", property="zzev04", jdbcType=JdbcType.NCHAR),
        @Result(column="ZZEV05", property="zzev05", jdbcType=JdbcType.NCHAR),
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
    List<Fe84101z> selectAll();
}