package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F4101;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/8.
 */
public class F4101UpdateByLitmSqlProvider {
    public String updateByLitmSelective(@Param("record") F4101 record,@Param("datatype") String datatype) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.F4101");
        sql.SET("IMAITM = #{record.imaitm}");
        if(!datatype.equals("E04")) {
            sql.SET("IMDSC1 = #{record.imdsc1}");
            sql.SET("IMUOM1 = #{record.imuom1}");
            sql.SET("IMDSC2 = #{record.imdsc2}");
            if (datatype.equals("E01") || datatype.equals("E03")) {
             //   sql.SET("IMSRP3 = #{record.imsrp3}");
             //   sql.SET("IMSRP4 = #{record.imsrp4}");
            }
        }


        sql.WHERE("IMLITM = #{record.imlitm}");

        return sql.toString();
    }
}
