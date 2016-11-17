package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by king_ on 2016/10/22.
 */
@Repository(value = "f4101SelectBy")
public interface F4101SelectBy {
    final class SqlProvider extends SQL{
        public String F4101Select(@Param("schema")String schema, @Param("aitm")String aitm){
            SELECT("imlitm");
            FROM(schema+".F4101");
            WHERE("trim(imaitm)=#{aitm}");
            return toString();
        }

    }
    @SelectProvider(type = SqlProvider.class,method = "F4101Select")
    List<String> F4101Select(@Param("schema")String schema, @Param("aitm")String aitm);
}
