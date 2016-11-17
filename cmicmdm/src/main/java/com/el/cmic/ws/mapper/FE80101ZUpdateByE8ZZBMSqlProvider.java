package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe80101z;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/11.
 */
public class FE80101ZUpdateByE8ZZBMSqlProvider {
    public String updateByE8ZZBM(@Param("record") Fe80101z record, @Param("datatype") String datatype) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.FE80101Z");

        if(datatype.equals("C01")){
            sql.SET("ZZE8ZZLX = #{record.zze8zzlx}");
            sql.SET("ZZE8JYFW = #{record.zze8jyfw}");
            sql.SET("ZZEXDJ = #{record.zzexdj}");

        }

        sql.WHERE("ZZE8ZZBM = #{record.zze8zzbm}");
        sql.WHERE("ZZAN8 = #{record.zzan8}");

        return sql.toString();
    }

    public String insertSelective(Fe80101z record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("CRPDTA.FE80101Z");

        if (record.getZzan8() != null) {
            sql.VALUES("ZZAN8", "#{zzan8}");
        }

        if (record.getZze8zzlxa() != null) {
            sql.VALUES("ZZE8ZZLXA", "#{zze8zzlxa}");
        }

        if (record.getZze8zzbm() != null) {
            sql.VALUES("ZZE8ZZBM", "#{zze8zzbm}");
        }

        if (record.getZzexdj() != null) {
            sql.VALUES("ZZEXDJ", "#{zzexdj}");
        }

        if (record.getZze8jyfw() != null) {
            sql.VALUES("ZZE8JYFW", "#{zze8jyfw}");
        }

        return sql.toString();
    }
}
