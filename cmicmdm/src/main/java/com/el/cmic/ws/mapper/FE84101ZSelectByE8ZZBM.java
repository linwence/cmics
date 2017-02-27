//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe84101z;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe84101ZSelectByE8ZZBM")
public interface FE84101ZSelectByE8ZZBM {
    @SelectProvider(
            type = FE84101ZSelectByE8ZZBM.SqlProvider.class,
            method = "Fe84101zselect"
    )
    int Fe84101zselect(@Param("schema") String var1, @Param("record") Fe84101z var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String Fe84101zselect(@Param("schema") String schema, @Param("record") Fe84101z record) {
            this.SELECT("count(1)");
            this.FROM(schema + ".FE84101Z");
            this.WHERE("Trim(zzlitm)=#{record.zzlitm}");
            this.WHERE("Trim(zze8zzbm)=#{record.zze8zzbm}");
            this.WHERE("Trim(zzco)=#{record.zzco}");
            this.WHERE("Trim(zze8zzlxa)=#{record.zze8zzlxa}");
            return this.toString();
        }
    }
}
