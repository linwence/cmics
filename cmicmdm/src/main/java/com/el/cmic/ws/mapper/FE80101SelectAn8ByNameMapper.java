//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe80101SelectAn8ByNameMapper")
public interface FE80101SelectAn8ByNameMapper {
    @SelectProvider(
            type = FE80101SelectAn8ByNameMapper.SqlProvider.class,
            method = "FE80101Select"
    )
    String FE80101Select(@Param("schema") String var1, @Param("e8kstym") String var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String FE80101Select(@Param("schema") String schema, @Param("e8kstym") String e8kstym) {
            this.SELECT("ksan8");
            this.FROM(schema + ".FE80101");
            this.WHERE("Trim(kse8kstym)=#{e8kstym}");
            return this.toString();
        }
    }
}
