package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F0101;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/8.
 */
public class F0101UpdateByPKSqlProvider {
    public String updateByPrimaryKeySelective(@Param("record") F0101 record, @Param("datatype") String datatype) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.F0101");

        if (datatype.equals("E01")) {
            sql.SET("ABAC28 = #{record.abac28}");
        }
        if(datatype.equals("C01")) {
            sql.SET("ABALKY = #{record.abalky}");
        }
        if(datatype.equals("M01")){
            sql.SET("ABALKY = #{record.abalky}");
            sql.SET("ABAC28 = #{record.abac28}");
        }

        sql.WHERE("ABAN8 = #{record.aban8}");

        return sql.toString();
    }
}
