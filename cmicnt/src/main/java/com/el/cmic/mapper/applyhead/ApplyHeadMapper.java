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
            SET("KP58BIFT = #{record.kp58bift}");
            SET("KPKCO = #{record.kpkco}");
            SET("KP58BAPPT = #{record.kp58bappt}");
            SET("KPMCU = #{record.kpmcu}");
            SET("KP58BCO = #{record.kp58bco}");
            SET("KP58BINVT = #{record.kp58binvt}");
            SET("KPE8STR200 = #{record.kpe8str200}");
            SET("KP58BLMT = #{record.kp58blmt}");
            SET("KP58BDLT = #{record.kp58bdlt}");
            SET("KPTRDJ = #{record.kptrdj}");
            SET("KPAN8 = #{record.kpan8}");
            SET("KPE8NAME = #{record.kpe8name}");
            SET("KPDOC = #{record.kpdoc}");
            SET("KPDCT = #{record.kpdct}");
            SET("KP58BAPST = #{record.kp58bapst}");
            SET("KP58BFP = #{record.kp58bfp}");
            SET("KP58BNAME = #{record.kp58bname}");
            SET("KP58BTAXNM = #{record.kp58btaxnm}");
            SET("KP58BADD = #{record.kp58badd}");
            SET("KP58BTEL = #{record.kp58btel}");
            SET("KP58BBANK = #{record.kp58bbank}");
            SET("KP58BBANKNM = #{record.kp58bbanknm}");
            SET("KP58BRMK2 = #{record.kp58brmk2}");
            SET("KP58BRMK1 = #{record.kp58brmk1}");
            SET("KP58BADDSD = #{record.kp58baddsd}");
            SET("KP58BRECP = #{record.kp58brecp}");
            SET("KP58BPCODE = #{record.kp58bpcode}");
            SET("KP58BPHONE = #{record.kp58bphone}");
            SET("KP58BTRD = #{record.kp58btrd}");
            SET("KPIVD = #{record.kpivd}");
            SET("KPAG = #{record.kpag}");
            SET("KPSTAM = #{record.kpstam}");
            SET("KPATXA = #{record.kpatxa}");
            SET("KPDL03 = #{record.kpdl03}");
            SET("KP58BINVNUM2 = #{record.kp58binvnum2}");
            SET("KPDL01 = #{record.kpdl01}");
            SET("KPDL02 = #{record.kpdl02}");
            SET("KPDL04 = #{record.kpdl04}");
            SET("KPDL05 = #{record.kpdl05}");
            /*
            SET("KPDL06 = #{record.kpdl06}");
            SET("KPDL07 = #{record.kpdl07}");
            */

            SET("KPINDATE = #{record.kpindate}");
            SET("KPREDATE = #{record.kpredate}");
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

            WHERE("trim(KP58BDOC) = #{record.kp58bdoc}");
            WHERE("trim(KP58BSN) = #{record.kp58bsn}");
            WHERE("trim(KP58BSYS) = #{record.kp58bsys}");
            return  toString();
        }

        public String insertFe8nt005(@Param("schema")String schema , @Param("record") Fe8nt005 record){
            INSERT_INTO(schema+".fe8nt005");
            VALUES("KP58BIFT","{record.kp58bift}");
            VALUES("KPKCO","{record.kpkco}");
            VALUES("KP58BAPPT","{record.kp58bappt}");
            VALUES("KPMCU","{record.kpmcu}");
            VALUES("KP58BCO","{record.kp58bco}");
            VALUES("KP58BINVT","{record.kp58binvt}");
            VALUES("KPE8STR200","{record.kpe8str200}");
            VALUES("KP58BLMT","{record.kp58blmt}");
            VALUES("KP58BDLT","{record.kp58bdlt}");
            VALUES("KPTRDJ","{record.kptrdj}");
            VALUES("KPAN8","{record.kpan8}");
            VALUES("KPE8NAME","{record.kpe8name}");
            VALUES("KPDOC","{record.kpdoc}");
            VALUES("KPDCT","{record.kpdct}");
            VALUES("KP58BAPST","{record.kp58bapst}");
            VALUES("KP58BFP","{record.kp58bfp}");
            VALUES("KP58BNAME","{record.kp58bname}");
            VALUES("KP58BTAXNM","{record.kp58btaxnm}");
            VALUES("KP58BADD","{record.kp58badd}");
            VALUES("KP58BTEL","{record.kp58btel}");
            VALUES("KP58BBANK","{record.kp58bbank}");
            VALUES("KP58BBANKNM","{record.kp58bbanknm}");
            VALUES("KP58BRMK2","{record.kp58brmk2}");
            VALUES("KP58BRMK1","{record.kp58brmk1}");
            VALUES("KP58BADDSD","{record.kp58baddsd}");
            VALUES("KP58BRECP","{record.kp58brecp}");
            VALUES("KP58BPCODE","{record.kp58bpcode}");
            VALUES("KP58BPHONE","{record.kp58bphone}");
            VALUES("KP58BTRD","{record.kp58btrd}");
            VALUES("KPIVD","{record.kpivd}");
            VALUES("KPAG","{record.kpag}");
            VALUES("KPSTAM","{record.kpstam}");
            VALUES("KPATXA","{record.kpatxa}");
            VALUES("KPDL03","{record.kpdl03}");
            VALUES("KP58BINVNUM2","{record.kp58binvnum2}");
            VALUES("KPDL01","{record.kpdl01}");
            VALUES("KPDL02","{record.kpdl02}");
            VALUES("KPDL04","{record.kpdl04}");
            VALUES("KPDL05","{record.kpdl05}");

            VALUES("KPINDATE","{record.kpindate}");
            VALUES("KPREDATE","{record.kpredate}");



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
            VALUES("KPJOBN","Service");
            VALUES("KPUPMJ",UPMJ);
            VALUES("KPUPMT","0");
            VALUES("KPTDAY",TDAY);
            VALUES("KPURCD","' '");
            VALUES("KPURDT","0");
            VALUES("KPURAT","0");
            VALUES("KPURAB","0");
            VALUES("KPURRF","' '");

            VALUES("KP58BDOC","{record.kp58bdoc}");
            VALUES("KP58BSN","{record.kp58bsn}");
            VALUES("KP58BSYS","{record.kp58bsys}");


            return toString();

        }
        public String deleteFe8nt005ByPK(@Param("schema") String schema, @Param("kp58bdoc") String kp58bdoc, @Param("kp58bsn") BigDecimal kp58bsn, @Param("kp58bsys") String kp58bsys){
            DELETE_FROM(schema+".fe8nt005");
            WHERE("trim(KP58BDOC) = #{record.kp58bdoc}");
            WHERE("trim(KP58BSN) = #{record.kp58bsn}");
            WHERE("trim(KP58BSYS) = #{record.kp58bsys}");
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
