package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/17.
 */
@Repository(value = "f0005Mapper")
public interface F0005Mapper {
    final class SqlProvider extends SQL{

        public String selectF0005 (@Param("schema")String schema,@Param("drsy")String drsy,@Param("drrt")String drrt,@Param("drdl01")String drdl01){

            String strSchema = schema + ".";
            SELECT("drky");
            FROM(strSchema + "F0005");
            WHERE("Trim(DRSY)=#{drsy}");
            WHERE("Trim(DRRT)=#{drrt}");
            WHERE("Trim(DRDL01)=#{drdl01}");
            return toString();

        }


    }
    @SelectProvider(type = F0005Mapper.SqlProvider.class,method = "selectF0005")
    String selectF0005(@Param("schema")String schema,@Param("drsy")String drsy,@Param("drrt")String drrt,@Param("drdl01")String drdl01);
}
