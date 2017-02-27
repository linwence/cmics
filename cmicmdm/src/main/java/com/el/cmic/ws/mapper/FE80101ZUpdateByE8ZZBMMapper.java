//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe80101z;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe80101ZUpdateByE8ZZBMMapper")
public interface FE80101ZUpdateByE8ZZBMMapper {
    @UpdateProvider(
            type = FE80101ZUpdateByE8ZZBMMapper.SqlProvider.class,
            method = "updateByE8ZZBM"
    )
    int updateByE8ZZBM(@Param("schema") String var1, @Param("record") Fe80101z var2, @Param("datatype") String var3, @Param("dj") String var4);

    @SelectProvider(
            type = FE80101ZUpdateByE8ZZBMMapper.SqlProvider.class,
            method = "selectByPrimaryKey"
    )
    int selectByPrimaryKey(@Param("schema") String var1, @Param("record") Fe80101z var2);

    @InsertProvider(
            type = FE80101ZUpdateByE8ZZBMMapper.SqlProvider.class,
            method = "insertSelective"
    )
    int insertSelective(@Param("schema") String var1, @Param("record") Fe80101z var2, @Param("dj") String var3, @Param("reqno") String var4);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String updateByE8ZZBM(@Param("schema") String schema, @Param("record") Fe80101z record, @Param("datatype") String datatype, @Param("dj") String dj) {
            this.UPDATE(schema + ".FE80101Z");
            if(datatype.equals("C01")) {
                this.SET("ZZE8JYFW = #{record.zze8jyfw}");
                if(record.getZze8jyfw2() != null) {
                    this.SET("ZZE8JYFW2 = #{record.zze8jyfw2}");
                }

                if(record.getZze8jyfw3() != null) {
                    this.SET("ZZE8JYFW3 = #{record.zze8jyfw3}");
                }
            }

            if(record.getZzfil2() != null) {
                this.SET("ZZFIL2 = #{record.zzfil2}");
            }

            if(dj != null) {
                this.SET("ZZEXDJ = (SELECT TO_CHAR(TO_DATE(#{dj}, 'yyyy- mm-dd'), 'yyyy') * 1000 +TO_CHAR(TO_DATE(#{dj}, 'yyyy-mm- dd'), 'ddd ') - 1900000 FROM DUAL)");
            }

            this.WHERE("Trim(ZZE8ZZLXA) = #{record.zze8zzlxa}");
            this.WHERE("Trim(ZZE8ZZBM) = #{record.zze8zzbm}");
            this.WHERE("Trim(ZZAN8) = #{record.zzan8}");
            return this.toString();
        }

        public String insertSelective(@Param("schema") String schema, @Param("record") Fe80101z record, @Param("dj") String dj, @Param("reqno") String reqno) {
            this.INSERT_INTO(schema + ".FE80101Z");
            if(record.getZzan8() != null) {
                this.VALUES("ZZAN8", "#{record.zzan8}");
            }

            if(record.getZze8zzlxa() != null) {
                this.VALUES("ZZE8ZZLXA", "#{record.zze8zzlxa}");
            }

            if(record.getZze8zzbm() != null) {
                this.VALUES("ZZE8ZZBM", "#{record.zze8zzbm}");
            }

            if(dj != null) {
                this.VALUES("ZZEXDJ", "(SELECT TO_CHAR(TO_DATE(#{dj}, 'yyyy- mm-dd'), 'yyyy') * 1000 +TO_CHAR(TO_DATE(#{dj}, 'yyyy-mm- dd'), 'ddd ') - 1900000 FROM DUAL)");
            }

            if(record.getZze8jyfw() != null) {
                this.VALUES("ZZE8JYFW", "#{record.zze8jyfw}");
            }

            if(record.getZzfil2() != null) {
                this.VALUES("ZZFIL2", "#{record.zzfil2}");
            }

            if(record.getZze8jyfw2() != null) {
                this.VALUES("ZZE8JYFW2", "#{record.zze8jyfw2}");
            }

            if(record.getZze8jyfw3() != null) {
                this.VALUES("ZZE8JYFW3", "#{record.zze8jyfw3}");
            }

            this.VALUES("ZZPF1", "\'1\'");
            this.VALUES("ZZALPH", "(SELECT abalph from " + schema + ".F0101 where trim(aban8)=#{record.zzan8})");
            if(reqno != null && !reqno.equals("")) {
                this.VALUES("ZZEFTJ", "(select zzeftj from " + schema + ".FE841004 where trim(zzukidp)=#{reqno} and trim(zzan8) = #{record.zzan8} and trim(zze8zzlxa)=#{record.zze8zzlxa} and trim(zze8zzbm)=#{record.zze8zzbm} and trim(zzev02)=\'Y\')");
            }

            return this.toString();
        }

        public String selectByPrimaryKey(@Param("schema") String schema, @Param("record") Fe80101z record) {
            this.SELECT("count(1)");
            this.FROM(schema + ".FE80101Z");
            this.WHERE("Trim(ZZE8ZZLXA) = #{record.zze8zzlxa}");
            this.WHERE("Trim(ZZE8ZZBM) = #{record.zze8zzbm}");
            this.WHERE("Trim(ZZAN8) = #{record.zzan8}");
            return this.toString();
        }
    }
}
