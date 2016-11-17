package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/19.
 */
@Repository(value = "fe80101SelectAn8ByNameMapper")
public interface FE80101SelectAn8ByNameMapper {
    final class SqlProvider extends SQL{
        public String FE80101Select(@Param("schema")String schema,@Param("e8name")String e8name){
            SELECT("ksan8");
            FROM(schema+ ".FE80101");
            WHERE("Trim(kse8name)=#{e8name}");

            return toString();
        }
    }
    @SelectProvider(type = SqlProvider.class,method = "FE80101Select")
    String FE80101Select(@Param("schema")String schema,@Param("e8name")String e8name);

}
