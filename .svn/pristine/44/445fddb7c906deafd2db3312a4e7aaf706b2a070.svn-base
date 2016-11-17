package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by king_ on 2016/10/22.
 */
@Repository(value = "fe84101SelectAitm")
public interface FE84101SelectAitm {
    final class SqlProvider extends SQL{
        public String FE84101Select(@Param("schema")String schema,@Param("litm") String litm) {
            SELECT("SPe8str200");
            FROM(schema+".FE84101");
            WHERE("trim(SPLITM)=#{litm}");
            return toString();
        }
        public String FE84101SelectTym(@Param("schema")String schema,@Param("e8sptym") String e8sptym) {
            SELECT("SPLITM");
            FROM(schema+".FE84101");
            WHERE("trim(SPE8SPTYM)=#{e8sptym}");
            return toString();
        }
    }
    @SelectProvider(type = SqlProvider.class,method = "FE84101Select")
    String FE84101Select(@Param("schema")String schema,@Param("litm") String litm);
    @SelectProvider(type = SqlProvider.class,method = "FE84101SelectTym")
    List<String> FE84101SelectTym(@Param("schema")String schema,@Param("e8sptym") String e8sptym);
}
