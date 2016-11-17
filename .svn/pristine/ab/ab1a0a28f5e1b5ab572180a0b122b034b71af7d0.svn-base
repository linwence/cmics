package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/17.
 */
@Repository(value = "f0005DMapper")
public interface F0005DMapper {
    final class SqlProvider extends SQL{
        public String selectF0005D(@Param("schema")String schema,@Param("drsy")String drsy,@Param("drrt")String drrt,@Param("drdl01")String drdl01){

            String strSchema = schema + ".";
            SELECT("drky");
            FROM(strSchema + "F0005D");
            WHERE("Trim(DRSY)=#{drsy}");
            WHERE("Trim(DRRT)=#{drrt}");
            WHERE("Trim(DRDL01)=#{drdl01}");
            return toString();
        }
    }
    @SelectProvider(type = F0005DMapper.SqlProvider.class,method = "selectF0005D")
    String selectF0005D (@Param("schema")String schema,@Param("drsy")String drsy,@Param("drrt")String drrt,@Param("drdl01")String drdl01);
}
