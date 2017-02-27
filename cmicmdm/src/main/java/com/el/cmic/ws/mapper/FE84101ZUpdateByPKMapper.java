//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe84101z;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe84101ZUpdateByPKMapper")
public interface FE84101ZUpdateByPKMapper {
    @UpdateProvider(
            type = FE84101ZUpdateByPKMapper.SqlProvider.class,
            method = "updateByPrimaryKeySelective"
    )
    int updateByPrimaryKeySelective(@Param("schema") String var1, @Param("record") Fe84101z var2, @Param("datatype") String var3, @Param("dj") String var4);

    @InsertProvider(
            type = FE84101ZUpdateByPKMapper.SqlProvider.class,
            method = "insertSelective"
    )
    int insertSelective(@Param("schema") String var1, @Param("record") Fe84101z var2, @Param("dj") String var3, @Param("reqno") String var4);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String updateByPrimaryKeySelective(@Param("schema") String schema, @Param("record") Fe84101z record, @Param("datatype") String datatype, @Param("dj") String dj) {
            this.UPDATE(schema + ".FE84101Z");
            if(dj != null) {
                this.SET("ZZEXDJ = (SELECT TO_CHAR(TO_DATE(#{dj}, \'yyyy- mm-dd\'), \'yyyy\') * 1000 +TO_CHAR(TO_DATE(#{dj}, \'yyyy-mm- dd\'), \'ddd \') - 1900000 FROM DUAL)");
            }

            this.WHERE("ZZE8ZZLXA = #{record.zze8zzlxa}");
            this.WHERE("Trim(ZZLITM) = #{record.zzlitm}");
            this.WHERE("Trim(ZZE8ZZBM) = #{record.zze8zzbm}");
            this.WHERE("Trim(ZZCO) = #{record.zzco}");
            return this.toString();
        }

        public String insertSelective(@Param("schema") String schema, @Param("record") Fe84101z record, @Param("dj") String dj, @Param("reqno") String reqno) {
            this.INSERT_INTO(schema + ".FE84101Z");
            if(record.getZzco() != null) {
                this.VALUES("ZZCO", "#{record.zzco}");
            }

            if(record.getZzlitm() != null) {
                this.VALUES("ZZLITM", "#{record.zzlitm}");
            }

            if(record.getZze8zzlxa() != null) {
                this.VALUES("ZZE8ZZLXA", "#{record.zze8zzlxa}");
            }

            if(record.getZze8zzbm() != null) {
                this.VALUES("ZZE8ZZBM", "#{record.zze8zzbm}");
            }

            if(reqno != null && !reqno.equals("")) {
                this.VALUES("ZZEFTJ", "(select zzeftj from " + schema + ".FE841002 where trim(zzukidp)=#{reqno} and trim(zzlitm) = #{record.zzlitm} and trim(zze8zzlxa)=#{record.zze8zzlxa} and trim(zze8zzbm)=#{record.zze8zzbm} and trim(zzev02)=\'Y\')");
                this.VALUES("ZZDSC1", "(select spdsc1 from " + schema + ".FE84101 where trim(splitm) = #{record.zzlitm})");
                this.VALUES("ZZDSC2", "(select spdsc2 from " + schema + ".FE84101 where trim(splitm) = #{record.zzlitm})");
                this.VALUES("ZZE8NAME", "(select spe8name from " + schema + ".FE84101 where trim(splitm) = #{record.zzlitm})");
            }

            this.VALUES("ZZEXDJ", "(SELECT TO_CHAR(TO_DATE(#{dj}, \'yyyy- mm-dd\'), \'yyyy\') * 1000 +TO_CHAR(TO_DATE(#{dj}, \'yyyy-mm- dd\'), \'ddd \') - 1900000 FROM DUAL)");
            return this.toString();
        }
    }
}
