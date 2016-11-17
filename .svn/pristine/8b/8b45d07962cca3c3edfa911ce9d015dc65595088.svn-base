package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F4104;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/9.
 */
public class F4104UpdateByLitmSqlprovider {
    public String updateByPrimaryKeySelective(F4104 record) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.F4104");



        sql.SET("IVCITM = #{ivcitm}");

        sql.WHERE("IVLITM = #{ivlitm}");
        sql.WHERE("IVXRT = #{ivxrt}");


        return sql.toString();
    }
}
