package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841005;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/13.
 */
public class FE841005UpdateByUkidpSqlProvider {
    public String updateByUpidp(Fe841005 record) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.FE841005");


            sql.SET("SCFLAG = #{scflag}");


        sql.WHERE("SCUKIDP = #{scukidp}");

        return sql.toString();
    }
}
