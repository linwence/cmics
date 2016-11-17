package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F0116;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/11.
 */
public class F0116UpdateByAn8SqlProvider {

    public String updateByAn8(@Param("record") F0116 record, @Param("datatype") String datatype) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.F0116");

        if(datatype.equals("C01")){
            sql.SET("ALCTR = #{record.alctr}");
            sql.SET("ALADDS = #{record.aladds}");
            if(record.getAlcty1()=="") {
                sql.SET("ALCTY1 = #{record.alcty1}");
            }
            sql.SET("ALCOUN = #{record.alcoun}");
            sql.SET("ALADD1 = #{record.aladd1}");
            sql.SET("ALADD2 = #{record.aladd2}");
            sql.SET("ALADD3 = #{record.aladd3}");
            sql.SET("ALADD4 = #{record.aladd4}");
        }


        sql.WHERE("ALAN8 = #{record.alan8}");

        return sql.toString();
    }
}
