//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F4101z1;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe84101SelectAitm")
public interface FE84101SelectAitm {
    @SelectProvider(
            type = FE84101SelectAitm.SqlProvider.class,
            method = "getlitm"
    )
    List<String> getlitm(@Param("schema") String var1, @Param("lsm") String var2);

    @UpdateProvider(
            type = FE84101SelectAitm.SqlProvider.class,
            method = "updatef4101z1"
    )
    int updatef4101z1(@Param("schema") String var1, @Param("record") F4101z1 var2);

    @SelectProvider(
            type = FE84101SelectAitm.SqlProvider.class,
            method = "selectF4101z1PK"
    )
    F4101z1 selectF4101z1PK(@Param("schema") String var1, @Param("litm") String var2);

    @SelectProvider(
            type = FE84101SelectAitm.SqlProvider.class,
            method = "FE84101Select"
    )
    String FE84101Select(@Param("schema") String var1, @Param("litm") String var2);

    @SelectProvider(
            type = FE84101SelectAitm.SqlProvider.class,
            method = "FE84101SelectTym"
    )
    List<String> FE84101SelectTym(@Param("schema") String var1, @Param("e8sptym") String var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String FE84101Select(@Param("schema") String schema, @Param("litm") String litm) {
            this.SELECT("SPe8str200");
            this.FROM(schema + ".FE84101");
            this.WHERE("trim(SPLITM)=#{litm}");
            return this.toString();
        }

        public String FE84101SelectTym(@Param("schema") String schema, @Param("e8sptym") String e8sptym) {
            this.SELECT("SPLITM");
            this.FROM(schema + ".FE84101");
            this.WHERE("trim(SPE8SPTYM)=#{e8sptym}");
            return this.toString();
        }

        public String selectF4101z1PK(@Param("schema") String schema, @Param("litm") String litm) {
            this.SELECT("SZEDUS");
            this.SELECT("SZEDBT");
            this.SELECT("SZEDTN");
            this.SELECT("SZEDLN");
            this.SELECT("SZMMCU");
            this.SELECT("SZEDCT");
            this.FROM("(select l.sztorg,l.szlitm,l.szedbt,l.szurdt,l.SZEDUS,  l.SZEDTN, l.SZEDLN,l.szmmcu,l.szedct  from(select max(szedbt) as szedbt,szlitm from " + schema + ".f4101z1 i where trim(i.szedct)=\'GS\' and trim(i.szedsp)=\'Y\' and trim(i.sztnac) = \'A\' and trim(i.szitbr) = 1  group by szlitm) j left join (select distinct sztorg,szlitm,szedbt,szurdt,SZEDUS,  SZEDTN, SZEDLN,szmmcu,szedct  from " + schema + ".f4101z1 k  where trim(szedct)=\'GS\' and trim(szedsp)=\'Y\' and trim(sztnac) = \'A\' and trim(szitbr) = 1) l on trim(j.szlitm) = trim(l.szlitm) and trim(j.szedbt) = trim(l.szedbt) )  ");
            this.WHERE("trim(SZLITM) = #{litm}");
            return this.toString();
        }

        public String updatef4101z1(@Param("schema") String schema, @Param("record") F4101z1 record) {
            this.UPDATE(schema + ".F4101z1");
            this.SET("SZIFLA = #{record.szifla}");
            this.WHERE("trim(SZEDUS) = #{record.szedus}");
            this.WHERE("trim(SZEDBT) = #{record.szedbt}");
            this.WHERE("trim(SZEDTN) = #{record.szedtn}");
            this.WHERE("trim(SZEDLN) = #{record.szedln}");
            return this.toString();
        }

        public String getlitm(@Param("schema") String schema, @Param("lsm") String lsm) {
            this.SELECT("SPLITM");
            this.FROM(schema + ".fe84101");
            this.WHERE("trim(spe8sptym) = #{lsm}");
            return this.toString();
        }
    }
}
