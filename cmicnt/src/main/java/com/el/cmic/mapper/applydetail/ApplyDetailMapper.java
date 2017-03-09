package com.el.cmic.mapper.applydetail;

import com.el.cmic.domain.applydetail.Fe8nt006;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by king_ on 2017/2/21.
 */
@Repository(value = "applyDetailMapper")
public interface ApplyDetailMapper {
    String UPMJ = "(SELECT TO_CHAR(sysdate, 'yyyy') * 1000 + TO_CHAR(sysdate, 'ddd ') - 1900000 JULIAN  FROM DUAL)";
    String TDAY = "(select to_char(sysdate, 'HH24')*10000+to_char(sysdate, 'mi')*100+to_char(sysdate, 'ss') from dual)";

    final class SqlProvider extends SQL{
        public String selectFe8nt006DateByPK(@Param("schema") String schema, @Param("kd58bdoc") String kd58bdoc, @Param("kd58bsn") BigDecimal kd58bsn, @Param("kdlnid") BigDecimal kdlnid){
            SELECT("KD58BDOC");
            SELECT("KD58BSN");
            SELECT("KDLNID");
            SELECT("KDINDATE");
            SELECT("KDREDATE");
            FROM(schema+".fe8nt006");
            WHERE("trim(KD58BDOC) = #{kd58bdoc,jdbcType=NCHAR}");
            WHERE("trim(KD58BSN) = #{kd58bsn,jdbcType=DECIMAL}");
            WHERE("trim(KDLNID) = #{kdlnid,jdbcType=DECIMAL}");
            return toString();
        }

        public String updateFe8nt006ByPK(@Param("schema") String schema, @Param("record") Fe8nt006 record){
            UPDATE(schema+".fe8nt006");
            SET("KD58BCODE = #{record.kd58bcode,jdbcType=NCHAR}");
            SET("KD58BINVNUM = #{record.kd58binvnum,jdbcType=NCHAR}");
            SET("KDLITM = #{record.kdlitm,jdbcType=NCHAR}");
            SET("KD58BINAME = #{record.kd58biname,jdbcType=NCHAR}");
            SET("KD58BTYPE = #{record.kd58btype,jdbcType=NCHAR}");
            SET("KD58BUNIT = #{record.kd58bunit,jdbcType=NCHAR}");
            //-------------
            SET("KD58BQTY = #{record.kd58bqty,jdbcType=DECIMAL}*10");
            //-------------
            //SET("KD58BPRICE = #{record.kd58bprice,jdbcType=DECIMAL}");
            SET("KDE8PRICE = #{record.kde8price,jdbcType=DECIMAL}");
            //-------------------
            SET("KD58BAMT = #{record.kd58bamt,jdbcType=DECIMAL}");
            SET("KD58BTAX = #{record.kd58btax,jdbcType=DECIMAL}");
            SET("KD58BTAMT = #{record.kd58btamt,jdbcType=DECIMAL}");
            SET("KDCBURST5 = #{record.kdcburst5,jdbcType=NCHAR}");
            SET("KDE8STR200 = #{record.kde8str200,jdbcType=NCHAR}");



           /* SET("KDCBURST6 = #{record.kdcburst6}");
            SET("KDCBURST7 = #{record.kdcburst7}");
            SET("KDCBURST8 = #{record.kdcburst8}");*/
            SET("KDDL01 = #{record.kddl01,jdbcType=NCHAR}");
            SET("KDDL02 = #{record.kddl02,jdbcType=NCHAR}");
            SET("KDDL03 = #{record.kddl03,jdbcType=NCHAR}");
            SET("KDDL04 = #{record.kddl04,jdbcType=NCHAR}");
            SET("KDDL05 = #{record.kddl05,jdbcType=NCHAR}");
            /*
            SET("KDDL06 = #{record.kddl06}");
            SET("KDDL07 = #{record.kddl07}");
            SET("KDCBURST2 = #{record.kdcburst2}");
            */
            SET("KDINDATE = #{record.kdindate,jdbcType=TIMESTAMP}");
            SET("KDREDATE = #{record.kdredate,jdbcType=TIMESTAMP}");

            /*SET("KDIR01 = #{record.kdir01}");
            SET("KDIR02 = #{record.kdir02}");
            SET("KDIR03 = #{record.kdir03}");
            SET("KDIR04 = #{record.kdir04}");
            SET("KDIR05 = #{record.kdir05}");

            SET("KDHRB = #{record.kdhrb}");
            SET("KDPSAL = #{record.kdpsal}");
            SET("KDIPAY = #{record.kdipay}");
            SET("KDTDSC = #{record.kdtdsc}");
            SET("KDEFHR = #{record.kdefhr}");
            SET("KDCRTJ = #{record.kdcrtj}");
            SET("KDDIVJ = #{record.kddivj}");
            SET("KDEXDJ = #{record.kdexdj}");
            SET("KDAFDJ = #{record.kdafdj}");
            SET("KDCKDT = #{record.kdckdt}");*/

            /*
            SET("KDUSER = #{record.kduser}");
            SET("KDPID = #{record.kdpid}");
            SET("KDJOBN = #{record.kdjobn}");
            */
            SET("KDUPMJ ="+UPMJ);
            //SET("KDUPMT = #{record.kdupmt}");
            SET("KDTDAY ="+TDAY);
            /*
            SET("KDURCD = #{record.kdurcd}");
            SET("KDURDT = #{record.kdurdt}");
            SET("KDURAT = #{record.kdurat}");
            SET("KDURAB = #{record.kdurab}");
            SET("KDURRF = #{record.kdurrf}");
            */


            WHERE("trim(KD58BDOC) = #{record.kd58bdoc,jdbcType=NCHAR}");
            WHERE("trim(KD58BSN) = #{record.kd58bsn,jdbcType=DECIMAL}");
            WHERE("trim(KDLNID) = #{record.kdlnid,jdbcType=DECIMAL}");
            return toString();
        }

        public String insertFe8nt006(@Param("schema") String schema,@Param("record") Fe8nt006 record){
            INSERT_INTO(schema+".fe8nt006");
            VALUES("KD58BDOC","#{record.kd58bdoc,jdbcType=NCHAR}");
            VALUES("KD58BSN","#{record.kd58bsn,jdbcType=DECIMAL}");
            VALUES("KDLNID","#{record.kdlnid,jdbcType=DECIMAL}");
            VALUES("KD58BCODE","#{record.kd58bcode,jdbcType=NCHAR}");
            VALUES("KD58BINVNUM","#{record.kd58binvnum,jdbcType=NCHAR}");
            VALUES("KDLITM","#{record.kdlitm,jdbcType=NCHAR}");
            VALUES("KD58BINAME","#{record.kd58biname,jdbcType=NCHAR}");
            VALUES("KD58BTYPE","#{record.kd58btype,jdbcType=NCHAR}");
            VALUES("KD58BUNIT","#{record.kd58bunit,jdbcType=NCHAR}");
            //-------------------------
            VALUES("KD58BQTY","#{record.kd58bqty,jdbcType=DECIMAL}*10");
            //-------------------------
            //VALUES("KD58BPRICE","#{record.kd58bprice,jdbcType=DECIMAL}");
            VALUES("KDE8PRICE","#{record.kde8price,jdbcType=DECIMAL}");
            //-------------------------

            VALUES("KD58BAMT","#{record.kd58bamt,jdbcType=DECIMAL}");
            VALUES("KD58BTAX","#{record.kd58btax,jdbcType=DECIMAL}");
            VALUES("KD58BTAMT","#{record.kd58btamt,jdbcType=DECIMAL}");
            VALUES("KDCBURST5","#{record.kdcburst5,jdbcType=NCHAR}");
            VALUES("KDE8STR200","#{record.kde8str200,jdbcType=NCHAR}");

            VALUES("KDINDATE","#{record.kdindate,jdbcType=TIMESTAMP}");
            VALUES("KDREDATE","#{record.kdredate,jdbcType=TIMESTAMP}");

            VALUES("KDDL01","#{record.kddl01,jdbcType=NCHAR}");
            VALUES("KDDL02","#{record.kddl02,jdbcType=NCHAR}");
            VALUES("KDDL03","#{record.kddl03,jdbcType=NCHAR}");
            VALUES("KDDL04","#{record.kddl04,jdbcType=NCHAR}");
            VALUES("KDDL05","#{record.kddl05,jdbcType=NCHAR}");

            //---------------
            VALUES("KDCBURST6","' '");
            VALUES("KDCBURST7","' '");
            VALUES("KDCBURST8","' '");



            VALUES("KDDL06","' '");
            VALUES("KDDL07","' '");
            VALUES("KDCBURST2","' '");



            VALUES("KDIR01","' '");
            VALUES("KDIR02","' '");
            VALUES("KDIR03","' '");
            VALUES("KDIR04","' '");
            VALUES("KDIR05","' '");
            VALUES("KDHRB","0");
            VALUES("KDPSAL","0");
            VALUES("KDIPAY","0");
            VALUES("KDTDSC","0");
            VALUES("KDEFHR","0");
            VALUES("KDCRTJ","0");
            VALUES("KDDIVJ","0");
            VALUES("KDEXDJ","0");
            VALUES("KDAFDJ","0");
            VALUES("KDCKDT","0");
            //-----------------------------------------------------


            VALUES("KDUSER","'NT'");
            VALUES("KDPID","'Interface'");
            VALUES("KDJOBN","'Service'");
            VALUES("KDUPMJ",UPMJ);
            VALUES("KDUPMT","0");
            VALUES("KDTDAY",TDAY);
            VALUES("KDURCD","' '");
            VALUES("KDURDT","0");
            VALUES("KDURAT","0");
            VALUES("KDURAB","0");
            VALUES("KDURRF","' '");
            return toString();
        }
        public String deleteFe8nt006ByPK(@Param("schema") String schema , @Param("kd58bdoc") String kd58bdoc, @Param("kd58bsn") BigDecimal kd58bsn, @Param("kdlnid") BigDecimal kdlnid){
            DELETE_FROM(schema+".fe8nt006");
            WHERE("trim(KD58BDOC) = #{kd58bdoc,jdbcType=NCHAR}");
            WHERE("trim(KD58BSN) = #{kd58bsn,jdbcType=DECIMAL}");
            WHERE("trim(KDLNID) = #{kdlnid,jdbcType=DECIMAL}");
            return toString();
        }
    }

    @SelectProvider(type = SqlProvider.class ,method = "selectFe8nt006DateByPK")
    Fe8nt006 selectFe8nt006DateByPK(@Param("schema") String schema, @Param("kd58bdoc") String kd58bdoc, @Param("kd58bsn") BigDecimal kd58bsn, @Param("kdlnid") BigDecimal kdlnid);

    @UpdateProvider(type = SqlProvider.class , method = "updateFe8nt006ByPK")
    int updateFe8nt006ByPK(@Param("schema") String schema, @Param("record") Fe8nt006 record);

    @InsertProvider(type = SqlProvider.class , method = "insertFe8nt006")
    int insertFe8nt006(@Param("schema") String schema,@Param("record") Fe8nt006 record);

    @DeleteProvider(type = SqlProvider.class , method = "deleteFe8nt006ByPK")
    int deleteFe8nt006ByPK(@Param("schema") String schema , @Param("kd58bdoc") String kd58bdoc, @Param("kd58bsn") BigDecimal kd58bsn, @Param("kdlnid") BigDecimal kdlnid);
}
