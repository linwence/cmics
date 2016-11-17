package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841003;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/13.
 */
public class FE841003UpdateByPKSqlProvider {
    public String updateByPrimaryKeySelective(Fe841003 record) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.FE841003");



        sql.SET("SQFLAG = #{sqflag}");



        sql.WHERE("SQUKID = #{squkid}");

        return sql.toString();
    }
}
