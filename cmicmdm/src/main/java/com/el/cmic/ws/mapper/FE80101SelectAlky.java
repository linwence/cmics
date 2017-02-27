//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F0101z2;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("FE80101SelectAlky")
public interface FE80101SelectAlky {
    @SelectProvider(
            type = FE80101SelectAlky.SqlProvider.class,
            method = "selectf0101z2PK"
    )
    F0101z2 selectf0101z2PK(@Param("schema") String var1, @Param("an8") String var2);

    @UpdateProvider(
            type = FE80101SelectAlky.SqlProvider.class,
            method = "updateF0101z2PK"
    )
    int updateF0101z2PK(@Param("schema") String var1, @Param("an8") String var2, @Param("state") String var3);

    @SelectProvider(
            type = FE80101SelectAlky.SqlProvider.class,
            method = "selectan8"
    )
    List<String> selectan8(@Param("schema") String var1, @Param("lsm") String var2);

    @SelectProvider(
            type = FE80101SelectAlky.SqlProvider.class,
            method = "FE80101Select"
    )
    String FE80101Select(@Param("schema") String var1, @Param("an8") BigDecimal var2);

    @SelectProvider(
            type = FE80101SelectAlky.SqlProvider.class,
            method = "FE80101SelectTym"
    )
    List<String> FE80101SelectTym(@Param("schema") String var1, @Param("e8kstym") String var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String FE80101Select(@Param("schema") String schema, @Param("an8") BigDecimal an8) {
            this.SELECT("KSe8str200");
            this.FROM(schema + ".FE80101");
            this.WHERE("Trim(KSAN8)=#{an8}");
            return this.toString();
        }

        public String FE80101SelectTym(@Param("schema") String schema, @Param("e8kstym") String e8kstym) {
            this.SELECT("KSAN8");
            this.FROM(schema + ".FE80101");
            this.WHERE("Trim(KSE8KSTYM)=#{e8kstym}");
            return this.toString();
        }

        public String selectan8(@Param("schema") String schema, @Param("lsm") String lsm) {
            this.SELECT("KSAN8");
            this.FROM(schema + ".FE80101");
            this.WHERE("trim(kse8kstym) = #{lsm}");
            return this.toString();
        }

        public String selectf0101z2PK(@Param("schema") String schema, @Param("an8") String an8) {
            this.SELECT("SZEDBT");
            this.SELECT("SZMCU");
            this.SELECT("SZEDCT");
            this.FROM(schema + ".F0101Z2");
            this.WHERE("SZAN8 = #{an8}");
            this.WHERE("SZEDSP = 'Y'");
            this.WHERE("SZTNAC = 'A'");
            return this.toString();
        }

        public String updateF0101z2PK(@Param("schema") String schema, @Param("an8") String an8, @Param("state") String state) {
            this.UPDATE(schema + ".f0101z2");
            this.SET("SZURRF = #{state}");
            this.WHERE("SZAN8 = #{an8}");
            this.WHERE("SZEDSP = 'Y'");
            this.WHERE("SZTNAC = 'A'");
            return this.toString();
        }
    }
}
