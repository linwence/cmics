package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F4101z1;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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
        public String selectF4101z1PK(@Param("schema")String schema,@Param("litm")String  litm){
            SELECT("SZEDUS");
            SELECT("SZEDBT");
            SELECT("SZEDTN");
            SELECT("SZEDLN");
            SELECT("SZMMCU");
            SELECT("SZEDCT");
            FROM("(select l.sztorg,l.szlitm,l.szedbt,l.szurdt,l.SZEDUS,  l.SZEDTN, l.SZEDLN,l.szmmcu,l.szedct  from" +
                    "(select max(szedbt) as szedbt,szlitm from "+schema+".f4101z1 i where trim(i.szedct)='GS' and trim(i.szedsp)='Y' and trim(i.sztnac) = 'A' and trim(i.szitbr) = 1  group by szlitm) j " +
                    "left join (select distinct sztorg,szlitm,szedbt,szurdt,SZEDUS,  SZEDTN, SZEDLN,szmmcu,szedct  from "+schema+".f4101z1 k  where trim(szedct)='GS' and trim(szedsp)='Y' and trim(sztnac) = 'A' and trim(szitbr) = 1) l on trim(j.szlitm) = trim(l.szlitm) and trim(j.szedbt) = trim(l.szedbt) )  ");
            WHERE("trim(SZLITM) = #{litm}");

            return toString();
        }

        public String updatef4101z1(@Param("schema") String schema, @Param("record")F4101z1 record){
            UPDATE(schema+".F4101z1");
            SET("SZURCD = #{record.szurcd}");
            WHERE("trim(SZEDUS) = #{record.szedus}");
            WHERE("trim(SZEDBT) = #{record.szedbt}");
            WHERE("trim(SZEDTN) = #{record.szedtn}");
            WHERE("trim(SZEDLN) = #{record.szedln}");
            return toString();
        }

        public String getlitm(@Param("schema") String schema,@Param("lsm") String lsm){
            SELECT("SPLITM");
            FROM(schema+".fe84101");
            WHERE("trim(spe8sptym) = #{lsm}");
            return toString();

        }
    }

    @SelectProvider(type = SqlProvider.class,method = "getlitm")
    List<String> getlitm(@Param("schema") String schema,@Param("lsm") String lsm);

    @UpdateProvider(type = SqlProvider.class,method ="updatef4101z1")
    int updatef4101z1(@Param("schema") String schema, @Param("record")F4101z1 record);
    @SelectProvider(type = SqlProvider.class,method = "selectF4101z1PK")
    F4101z1 selectF4101z1PK(@Param("schema")String schema,@Param("litm")String  litm);

    @SelectProvider(type = SqlProvider.class,method = "FE84101Select")
    String FE84101Select(@Param("schema")String schema,@Param("litm") String litm);
    @SelectProvider(type = SqlProvider.class,method = "FE84101SelectTym")
    List<String> FE84101SelectTym(@Param("schema")String schema,@Param("e8sptym") String e8sptym);
}
