package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F0101z2;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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

        public String selectan8(@Param("schema")String schema,@Param("lsm")String lsm){
            SELECT("KSAN8");
            FROM(schema+".FE80101");
            WHERE("trim(kse8kstym) = #{lsm}");

            return toString();

        }

        public String selectf0101z2PK(@Param("schema")String schema,@Param("an8") String an8){
            SELECT("SZEDBT");
            SELECT("SZMCU");
            SELECT("SZEDCT");
            FROM(schema+".F0101Z2");
            WHERE("SZAN8 = #{an8}");
            WHERE("SZEDSP = 'Y'");
            WHERE("SZTNAC = 'A'");
            return toString();

        }

        public String updateF0101z2PK(@Param("schema")String schema,@Param("an8") String an8,@Param("state") String state){
            UPDATE(schema+".f0101z2");
            SET("SZURCD = #{state}");
            WHERE("SZAN8 = #{an8}");
            WHERE("SZEDSP = 'Y'");
            WHERE("SZTNAC = 'A'");

            return toString();

        }
    }
    @SelectProvider(type = SqlProvider.class,method ="selectf0101z2PK")
    F0101z2 selectf0101z2PK(@Param("schema")String schema,@Param("an8") String an8);
    @UpdateProvider(type = SqlProvider.class,method = "updateF0101z2PK")
    int updateF0101z2PK(@Param("schema")String schema,@Param("an8") String an8,@Param("state") String state);
    @SelectProvider(type = SqlProvider.class,method = "selectan8")
    List<String> selectan8(@Param("schema")String schema,@Param("lsm")String lsm);
    @SelectProvider(type = SqlProvider.class,method = "FE80101Select")
    String FE80101Select(@Param("schema")String schema, @Param("an8")BigDecimal an8);
    @SelectProvider(type = SqlProvider.class,method = "FE80101SelectTym")
    List<String> FE80101SelectTym(@Param("schema")String schema, @Param("e8kstym")String e8kstym);
}
