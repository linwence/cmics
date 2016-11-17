package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by king_ on 2016/10/22.
 */
@Repository(value = "FE80101SelectAlky")
public interface FE80101SelectAlky {
    final class SqlProvider extends SQL {
        public String FE80101Select(@Param("schema")String schema, @Param("an8")BigDecimal an8){
            SELECT("KSe8str200");
            FROM(schema+ ".FE80101");
            WHERE("Trim(KSAN8)=#{an8}");

            return toString();
        }
        public String FE80101SelectTym(@Param("schema")String schema, @Param("e8kstym")String e8kstym){
            SELECT("KSAN8");
            FROM(schema+ ".FE80101");
            WHERE("Trim(KSE8KSTYM)=#{e8kstym}");

            return toString();
        }
    }
    @SelectProvider(type = SqlProvider.class,method = "FE80101Select")
    String FE80101Select(@Param("schema")String schema, @Param("an8")BigDecimal an8);
    @SelectProvider(type = SqlProvider.class,method = "FE80101SelectTym")
    List<String> FE80101SelectTym(@Param("schema")String schema, @Param("e8kstym")String e8kstym);
}
