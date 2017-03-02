package com.el.cmic.mapper.applyhead;

import com.el.cmic.domain.applyhead.Fe8nt005;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by king_ on 2017/2/20.
 */
@Repository(value = "applyHeadMapper")
public interface ApplyHeadMapper {
    String UPMJ = "(SELECT TO_CHAR(sysdate, 'yyyy') * 1000 + TO_CHAR(sysdate, 'ddd ') - 1900000 JULIAN  FROM DUAL)";
    String TDAY = "(select to_char(sysdate, 'HH24')*10000+to_char(sysdate, 'mi')*100+to_char(sysdate, 'ss') from dual)";

    final class SqlProvider extends SQL{
        public String selectDateByPK(@Param("schema") String schema,@Param("kp58bdoc") String kp58bdoc, @Param("kp58bsn") BigDecimal kp58bsn, @Param("kp58bsys") String kp58bsys){
            SELECT("KP58BDOC");
            SELECT("KP58BSN");
            SELECT("KP58BSYS");
            SELECT("KPINDATE");
            SELECT("KPREDATE");
            FROM(schema+".Fe8nt005");
            WHERE("trim(KP58BDOC) = #{kp58bdoc,jdbcType=NCHAR}");
            WHERE("trim(KP58BSN) = #{kp58bsn,jdbcType=DECIMAL}");
            WHERE("trim(KP58BSYS) = #{kp58bsys,jdbcType=NCHAR}");

            return toString();
        }

        public String updateFe8nt005ByPK(@Param("schema")String schema,@Param("record") Fe8nt005 record){
            UPDATE(schema+".Fe8nt005");
            SET("KP58BIFT = #{record.kp58bift,jdbcType=NCHAR}");
            SET("KPKCO = #{record.kpkco,jdbcType=NCHAR}");
            SET("KP58BAPPT = #{record.kp58bappt,jdbcType=NCHAR}");
            SET("KPMCU = #{record.kpmcu,jdbcType=NCHAR}");
            SET("KP58BCO = #{record.kp58bco,jdbcType=NCHAR}");
            SET("KP58BINVT = #{record.kp58binvt,jdbcType=NCHAR}");
            SET("KPE8STR200 = #{record.kpe8str200,jdbcType=NCHAR}");
            SET("KP58BLMT = #{record.kp58blmt,jdbcType=DECIMAL}");
            SET("KP58BDLT = #{record.kp58bdlt,jdbcType=NCHAR}");
            SET("KPTRDJ = #{record.kptrdj,jdbcType=DECIMAL}");
            SET("KPAN8 = #{record.kpan8,jdbcType=DECIMAL}");
            SET("KPE8NAME = #{record.kpe8name,jdbcType=NCHAR}");
            SET("KPDOC = #{record.kpdoc,jdbcType=DECIMAL}");
            SET("KPDCT = #{record.kpdct,jdbcType=NCHAR}");
            SET("KP58BAPST = #{record.kp58bapst,jdbcType=NCHAR}");
            SET("KP58BFP = #{record.kp58bfp,jdbcType=NCHAR}");
            SET("KP58BNAME = #{record.kp58bname,jdbcType=NCHAR}");
            SET("KP58BTAXNM = #{record.kp58btaxnm,jdbcType=NCHAR}");
            SET("KP58BADD = #{record.kp58badd,jdbcType=NCHAR}");
            SET("KP58BTEL = #{record.kp58btel,jdbcType=NCHAR}");
            SET("KP58BBANK = #{record.kp58bbank,jdbcType=NCHAR}");
            SET("KP58BBANKNM = #{record.kp58bbanknm,jdbcType=NCHAR}");
            SET("KP58BRMK2 = #{record.kp58brmk2,jdbcType=NCHAR}");
            SET("KP58BRMK1 = #{record.kp58brmk1,jdbcType=NCHAR}");
            SET("KP58BADDSD = #{record.kp58baddsd,jdbcType=NCHAR}");
            SET("KP58BRECP = #{record.kp58brecp,jdbcType=NCHAR}");
            SET("KP58BPCODE = #{record.kp58bpcode,jdbcType=NCHAR}");
            SET("KP58BPHONE = #{record.kp58bphone,jdbcType=NCHAR}");
            SET("KP58BTRD = #{record.kp58btrd,jdbcType=NCHAR}");
            SET("KPIVD = #{record.kpivd,jdbcType=DECIMAL}");
            SET("KPAG = #{record.kpag,jdbcType=DECIMAL}");
            SET("KPSTAM = #{record.kpstam,jdbcType=DECIMAL}");
            SET("KPATXA = #{record.kpatxa,jdbcType=DECIMAL}");
            SET("KPDL03 = #{record.kpdl03,jdbcType=NCHAR}");
            SET("KP58BINVNUM2 = #{record.kp58binvnum2,jdbcType=NCHAR}");
            SET("KPDL01 = #{record.kpdl01,jdbcType=NCHAR}");
            SET("KPDL02 = #{record.kpdl02,jdbcType=NCHAR}");
            SET("KPDL04 = #{record.kpdl04,jdbcType=NCHAR}");
            SET("KPDL05 = #{record.kpdl05,jdbcType=NCHAR}");
            /*
            SET("KPDL06 = #{record.kpdl06}");
            SET("KPDL07 = #{record.kpdl07}");
            */

            SET("KPINDATE = #{record.kpindate,jdbcType=TIMESTAMP}");
            SET("KPREDATE = #{record.kpredate,jdbcType=TIMESTAMP}");
            /*
            SET("KPIR01 = #{record.kpir01}");
            SET("KPIR02 = #{record.kpir02}");
            SET("KPIR03 = #{record.kpir03}");
            SET("KPIR04 = #{record.kpir04}");
            SET("KPIR05 = #{record.kpir05}");
            */
            /*
            SET("KPHRB = #{record.kphrb}");
            SET("KPPSAL = #{record.kppsal}");
            SET("KPIPAY = #{record.kpipay}");
            SET("KPTDSC = #{record.kptdsc}");
            SET("KPEFHR = #{record.kpefhr}");
            SET("KPCRTJ = #{record.kpcrtj}");
            SET("KPDIVJ = #{record.kpdivj}");
            SET("KPEXDJ = #{record.kpexdj}");
            SET("KPAFDJ = #{record.kpafdj}");
            SET("KPCKDT = #{record.kpckdt}");
            */

            //SET("KPUSER = #{record.kpuser}");
            SET("KPPID ="+UPMJ);
            SET("KPJOBN ="+TDAY);
            /*SET("KPUPMJ = #{record.kpupmj}");
            SET("KPUPMT = #{record.kpupmt}");
            SET("KPTDAY = #{record.kptday}");
            SET("KPURCD = #{record.kpurcd}");
            SET("KPURDT = #{record.kpurdt}");
            SET("KPURAT = #{record.kpurat}");
            SET("KPURAB = #{record.kpurab}");
            SET("KPURRF = #{record.kpurrf}");*/

            WHERE("trim(KP58BDOC) = #{kp58bdoc,jdbcType=NCHAR}");
            WHERE("trim(KP58BSN) = #{kp58bsn,jdbcType=DECIMAL}");
            WHERE("trim(KP58BSYS) = #{kp58bsys,jdbcType=NCHAR}");
            return  toString();
        }

        public String insertFe8nt005(@Param("schema")String schema , @Param("record") Fe8nt005 record){
            INSERT_INTO(schema+".fe8nt005");
            VALUES("KP58BIFT","#{record.kp58bift,jdbcType=NCHAR}");
            VALUES("KPKCO","#{record.kpkco,jdbcType=NCHAR}");
            VALUES("KP58BAPPT","#{record.kp58bappt,jdbcType=NCHAR}");
            VALUES("KPMCU","#{record.kpmcu,jdbcType=NCHAR}");
            VALUES("KP58BCO","#{record.kp58bco,jdbcType=NCHAR}");
            VALUES("KP58BINVT","#{record.kp58binvt,jdbcType=NCHAR}");
            VALUES("KPE8STR200","#{record.kpe8str200,jdbcType=NCHAR}");
            VALUES("KP58BLMT","#{record.kp58blmt,jdbcType=DECIMAL}");
            VALUES("KP58BDLT","#{record.kp58bdlt,jdbcType=NCHAR}");
            VALUES("KPTRDJ","#{record.kptrdj,jdbcType=DECIMAL}");
            VALUES("KPAN8","#{record.kpan8,jdbcType=DECIMAL}");
            VALUES("KPE8NAME","#{record.kpe8name,jdbcType=NCHAR}");
            VALUES("KPDOC","#{record.kpdoc,jdbcType=DECIMAL}");
            VALUES("KPDCT","#{record.kpdct,jdbcType=NCHAR}");
            VALUES("KP58BAPST","#{record.kp58bapst,jdbcType=NCHAR}");
            VALUES("KP58BFP","#{record.kp58bfp,jdbcType=NCHAR}");
            VALUES("KP58BNAME","#{record.kp58bname,jdbcType=NCHAR}");
            VALUES("KP58BTAXNM","#{record.kp58btaxnm,jdbcType=NCHAR}");
            VALUES("KP58BADD","#{record.kp58badd,jdbcType=NCHAR}");
            VALUES("KP58BTEL","#{record.kp58btel,jdbcType=NCHAR}");
            VALUES("KP58BBANK","#{record.kp58bbank,jdbcType=NCHAR}");
            VALUES("KP58BBANKNM","#{record.kp58bbanknm,jdbcType=NCHAR}");
            VALUES("KP58BRMK2","#{record.kp58brmk2,jdbcType=NCHAR}");
            VALUES("KP58BRMK1","#{record.kp58brmk1,jdbcType=NCHAR}");
            VALUES("KP58BADDSD","#{record.kp58baddsd,jdbcType=NCHAR}");
            VALUES("KP58BRECP","#{record.kp58brecp,jdbcType=NCHAR}");
            VALUES("KP58BPCODE","#{record.kp58bpcode,jdbcType=NCHAR}");
            VALUES("KP58BPHONE","#{record.kp58bphone,jdbcType=NCHAR}");
            VALUES("KP58BTRD","#{record.kp58btrd,jdbcType=NCHAR}");
            VALUES("KPIVD","#{record.kpivd,jdbcType=DECIMAL}");
            VALUES("KPAG","#{record.kpag,jdbcType=DECIMAL}");
            VALUES("KPSTAM","#{record.kpstam,jdbcType=DECIMAL}");
            VALUES("KPATXA","#{record.kpatxa,jdbcType=DECIMAL}");
            VALUES("KPDL03","#{record.kpdl03,jdbcType=NCHAR}");
            VALUES("KP58BINVNUM2","#{record.kp58binvnum2,jdbcType=NCHAR}");
            VALUES("KPDL01","#{record.kpdl01,jdbcType=NCHAR}");
            VALUES("KPDL02","#{record.kpdl02,jdbcType=NCHAR}");
            VALUES("KPDL04","#{record.kpdl04,jdbcType=NCHAR}");
            VALUES("KPDL05","#{record.kpdl05,jdbcType=NCHAR}");

            VALUES("KPINDATE","#{record.kpindate,jdbcType=TIMESTAMP}");
            VALUES("KPREDATE","#{record.kpredate,jdbcType=TIMESTAMP}");



            VALUES("KPDL06","' '");
            VALUES("KPDL07","' '");
            VALUES("KPIR01","' '");
            VALUES("KPIR02","' '");
            VALUES("KPIR03","' '");
            VALUES("KPIR04","' '");
            VALUES("KPIR05","' '");
            VALUES("KPHRB","0");
            VALUES("KPPSAL","0");
            VALUES("KPIPAY","0");
            VALUES("KPTDSC","0");
            VALUES("KPEFHR","0");
            VALUES("KPCRTJ","0");
            VALUES("KPDIVJ","0");
            VALUES("KPEXDJ","0");
            VALUES("KPAFDJ","0");
            VALUES("KPCKDT","0");

            VALUES("KPUSER","'NT'");
            VALUES("KPPID","'Interface'");
            VALUES("KPJOBN","'Service'");
            VALUES("KPUPMJ",UPMJ);
            VALUES("KPUPMT","0");
            VALUES("KPTDAY",TDAY);
            VALUES("KPURCD","' '");
            VALUES("KPURDT","0");
            VALUES("KPURAT","0");
            VALUES("KPURAB","0");
            VALUES("KPURRF","' '");

            VALUES("KPEDSP","'N'");

            VALUES("KP58BDOC","#{record.kp58bdoc,jdbcType=NCHAR}");
            VALUES("KP58BSN","#{record.kp58bsn,jdbcType=DECIMAL}");
            VALUES("KP58BSYS","#{record.kp58bsys,jdbcType=NCHAR}");


            return toString();

        }
        public String deleteFe8nt005ByPK(@Param("schema") String schema, @Param("kp58bdoc") String kp58bdoc, @Param("kp58bsn") BigDecimal kp58bsn, @Param("kp58bsys") String kp58bsys){
            DELETE_FROM(schema+".fe8nt005");
            WHERE("trim(KP58BDOC) = #{kp58bdoc,jdbcType=NCHAR}");
            WHERE("trim(KP58BSN) = #{kp58bsn,jdbcType=DECIMAL}");
            WHERE("trim(KP58BSYS) = #{kp58bsys,jdbcType=NCHAR}");
            return toString();
        }

    }
    @SelectProvider(type = SqlProvider.class ,method = "selectDateByPK")
    Fe8nt005 selectDateByPK(@Param("schema") String schema, @Param("kp58bdoc") String kp58bdoc, @Param("kp58bsn") BigDecimal kp58bsn, @Param("kp58bsys") String kp58bsys);

    @UpdateProvider(type = SqlProvider.class , method = "updateFe8nt005ByPK")
    int updateFe8nt005ByPK(@Param("schema")String schema,@Param("record") Fe8nt005 record);

    @InsertProvider(type = SqlProvider.class , method ="insertFe8nt005")
    int insertFe8nt005(@Param("schema")String schema , @Param("record") Fe8nt005 record);

    @DeleteProvider(type = SqlProvider.class , method = "deleteFe8nt005ByPK")
    int deleteFe8nt005ByPK(@Param("schema") String schema, @Param("kp58bdoc") String kp58bdoc, @Param("kp58bsn") BigDecimal kp58bsn, @Param("kp58bsys") String kp58bsys);
}
