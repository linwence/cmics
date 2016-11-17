package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841001;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/11.
 */
public class FE841001UpdateByDocoSqlProvider {
    public String updateByDoco(Fe841001 record) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.FE841001");


        if (record.getSqflag() != null) {
            sql.SET("SQFLAG = #{sqflag}");
        }

        sql.WHERE("SQUKIDP = #{squkidp}");

        return sql.toString();
    }
}
