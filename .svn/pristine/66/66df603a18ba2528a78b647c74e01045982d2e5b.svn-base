package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by king_ on 2016/10/22.
 */
@Repository(value = "f0101SelectBy")
public interface F0101SelectBy {
    final class SqlProvider extends SQL {
        public String F0101SelectByalky(@Param("schema")String schema, @Param("alky")String alky){
            SELECT("aban8");
            FROM(schema+".F0101");
            WHERE("trim(abalky)=#{alky}");
            return toString();
        }

    }
    @SelectProvider(type = SqlProvider.class,method = "F0101SelectByalky")
    List<String> F0101SelectByalky(@Param("schema")String schema, @Param("alky")String alky);
}
