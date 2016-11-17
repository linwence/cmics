package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe84101z;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/8.
 */
public class FE84101ZUpdateByPKSqlProvider {
    public String updateByPrimaryKeySelective(@Param("record") Fe84101z record, @Param("datatype") String datatype) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.FE84101Z");
        if(datatype.equals("E01")) {


            sql.SET("ZZEXDJ = #{record.zzexdj}");
            sql.SET("ZZE8ZZLX = #{record.zze8zzlx}");


        }
        sql.WHERE("ZZLITM = #{record.zzlitm}");
        sql.WHERE("ZZE8ZZBM = #{record.zze8zzbm}");

        return sql.toString();
    }

    public String insertSelective(Fe84101z record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("CRPDTA.FE84101Z");

        if (record.getZzlitm() != null) {
            sql.VALUES("ZZLITM", "#{zzlitm}");
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


        return sql.toString();
    }
}
