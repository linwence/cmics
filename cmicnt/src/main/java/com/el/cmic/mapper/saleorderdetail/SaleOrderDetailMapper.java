package com.el.cmic.mapper.saleorderdetail;

import com.el.cmic.domain.saleorderdetail.Fe8nt004;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by king_ on 2017/2/17.
 */
@Repository(value = "saleOrderDetailMapper")
public interface SaleOrderDetailMapper {
    final String UPMJ = "(SELECT TO_CHAR(sysdate, 'yyyy') * 1000 + TO_CHAR(sysdate, 'ddd ') - 1900000 JULIAN  FROM DUAL)";
    final String TDAY = "(select to_char(sysdate, 'HH24')*10000+to_char(sysdate, 'mi')*100+to_char(sysdate, 'ss') from dual)";
    final class SqlProvider extends SQL{

        public String selectDateByPK(@Param("schema") String schema, @Param("sde8from") String sde8from, @Param("sde8type")String sde8type,
                                     @Param("sde8odno") String sde8odno, @Param("sde8lnid")BigDecimal sde8lnid){
            SELECT("SDE8FROM");
            SELECT("SDE8TYPE");
            SELECT("SDE8ODNO");
            SELECT("SDE8LNID");
            SELECT("SDINDATE");
            SELECT("SDREDATE");
            FROM(schema+".Fe8nt004");
            WHERE("trim(SDE8FROM) = #{sde8from}");
            WHERE("trim(SDE8TYPE) = #{sde8type,jdbcType = NCHAR}");
            WHERE("trim(SDE8ODNO) = #{sde8odno,jdbcType = NCHAR}");
            WHERE("trim(SDE8LNID) = #{sde8lnid,jdbcType=DECIMAL}");
            return toString();
        }

        public String updateFe8nt004ByPK(@Param("schema") String schema, @Param("record") Fe8nt004 fe8nt004){
            UPDATE(schema+".Fe8nt004");
            SET("SDEDSP = #{record.sdedsp,jdbcType = NCHAR}");
            SET("SDRKCO = #{record.sdrkco,jdbcType = NCHAR}");
            SET("SDRCTO = #{record.sdrcto,jdbcType = NCHAR}");
            SET("SDRORN = #{record.sdrorn,jdbcType = NCHAR}");
            SET("SDRLLN = #{record.sdrlln,jdbcType=DECIMAL}");
            SET("SDKCOO = #{record.sdkcoo,jdbcType = NCHAR}");
            SET("SDDCTO = #{record.sddcto,jdbcType = NCHAR}");
            SET("SDDOCO = #{record.sddoco,jdbcType=DECIMAL}");
            SET("SDLNID = #{record.sdlnid,jdbcType=DECIMAL}");
            SET("SDCO = #{record.sdco,jdbcType = NCHAR}");
            SET("SDALPH = #{record.sdalph,jdbcType = NCHAR}");
            SET("SDMCU = #{record.sdmcu,jdbcType = NCHAR}");
            SET("SDAITM = #{record.sdaitm,jdbcType = NCHAR}");
            SET("SDLITM = #{record.sdlitm,jdbcType = NCHAR}");
            SET("SDLOTN = #{record.sdlotn,jdbcType = NCHAR}");
            SET("SDDLEJ = #{record.sddlej,jdbcType=DECIMAL}");
            SET("SDMMEJ = #{record.sdmmej,jdbcType=DECIMAL}");
            SET("SDE8ZZBM = #{record.sde8zzbm,jdbcType = NCHAR}");
            SET("SDE8DSC1 = #{record.sde8dsc1,jdbcType = NCHAR}");
            SET("SDE8DSC2 = #{record.sde8dsc2,jdbcType = NCHAR}");
            SET("SDUOM = #{record.sduom,jdbcType = NCHAR}");
            SET("SDUOM3 = #{record.sduom3,jdbcType = NCHAR}");
            //-----------------
            SET("SDUORG = #{record.sduorg,jdbcType=DECIMAL}*10");
            //-----------------
            SET("SDTUPRC = #{record.sdtuprc,jdbcType=DECIMAL}");
            SET("SDTAEXP = #{record.sdtaexp,jdbcType=DECIMAL}");
            SET("SDE8TPRRC = #{record.sde8tprrc,jdbcType=DECIMAL}");
            SET("SDE8TAEXP = #{record.sde8taexp,jdbcType=DECIMAL}");
            SET("SDAN8 = #{record.sdan8,jdbcType=DECIMAL}");
            SET("SDDSC1 = #{record.sddsc1,jdbcType = NCHAR}");
            SET("SDE8DSY = #{record.sde8dsy,jdbcType = NCHAR}");
            SET("SDSHAN = #{record.sdshan,jdbcType=DECIMAL}");
            SET("SDDRQJ = #{record.sddrqj,jdbcType=DECIMAL}");
            SET("SDTRDJ = #{record.sdtrdj,jdbcType=DECIMAL}");
            SET("SDADDJ = #{record.sdaddj,jdbcType=DECIMAL}");
            SET("SDDL01 = #{record.sddl01,jdbcType = NCHAR}");
            SET("SDDL02 = #{record.sddl02,jdbcType = NCHAR}");
            SET("SDDL03 = #{record.sddl03,jdbcType = NCHAR}");
            SET("SDDL04 = #{record.sddl04,jdbcType = NCHAR}");
            SET("SDDL05 = #{record.sddl05,jdbcType = NCHAR}");
            SET("SDDL06 = #{record.sddl06,jdbcType = NCHAR}");
            SET("SDDL07 = #{record.sddl07,jdbcType = NCHAR}");
            SET("SDDL08 = #{record.sddl08,jdbcType = NCHAR}");
            SET("SDDL09 = #{record.sddl09,jdbcType = NCHAR}");
            SET("SDDL10 = #{record.sddl10,jdbcType = NCHAR}");
            SET("SDINDATE = #{record.sdindate,jdbcType=TIMESTAMP}");
            SET("SDREDATE = #{record.sdredate,jdbcType=TIMESTAMP}");
            SET("SDIR01 = #{record.sdir01,jdbcType = NCHAR}");
            SET("SDIR02 = #{record.sdir02,jdbcType = NCHAR}");
            SET("SDIR03 = #{record.sdir03,jdbcType = NCHAR}");
            SET("SDIR04 = #{record.sdir04,jdbcType = NCHAR}");
            SET("SDIR05 = #{record.sdir05,jdbcType = NCHAR}");
            SET("SDHRB = #{record.sdhrb,jdbcType=DECIMAL}");
            SET("SDPSAL = #{record.sdpsal,jdbcType=DECIMAL}");
            SET("SDIPAY = #{record.sdipay,jdbcType=DECIMAL}");
            SET("SDTDSC = #{record.sdtdsc,jdbcType=DECIMAL}");
            SET("SDEFHR = #{record.sdefhr,jdbcType=DECIMAL}");
            SET("SDCRTJ = #{record.sdcrtj,jdbcType=DECIMAL}");
            SET("SDDIVJ = #{record.sddivj,jdbcType=DECIMAL}");
            SET("SDEXDJ = #{record.sdexdj,jdbcType=DECIMAL}");
            SET("SDAFDJ = #{record.sdafdj,jdbcType=DECIMAL}");
            SET("SDCKDT = #{record.sdckdt,jdbcType=DECIMAL}");


           // SET("SDUSER = #{record.sduser}");
            SET("SDUPMJ ="+UPMJ);
            SET("SDTDAY ="+TDAY);
            /*SET("SDPID = #{record.sdpid}");
            SET("SDJOBN = #{record.sdjobn}");
            SET("SDURCD = #{record.sdurcd}");
            SET("SDURDT = #{record.sdurdt}");
            SET("SDURAT = #{record.sdurat}");
            SET("SDURAB = #{record.sdurab}");
            SET("SDURRF = #{record.sdurrf}");*/
            WHERE("trim(SDE8FROM) = #{record.sde8from}");
            WHERE("trim(SDE8TYPE) = #{record.sde8type}");
            WHERE("trim(SDE8ODNO) = #{record.sde8odno}");
            WHERE("trim(SDE8LNID) = #{record.sde8lnid}");
            return toString();
        }

        public String insertFe8nt004(@Param("schema") String schema,@Param("record") Fe8nt004 record){
            INSERT_INTO(schema+".Fe8nt004");
            VALUES("SDEDSP","'N'");
            VALUES("SDRKCO","#{record.sdrkco,jdbcType = NCHAR}");
            VALUES("SDRCTO","#{record.sdrcto,jdbcType = NCHAR}");
            VALUES("SDRORN","#{record.sdrorn,jdbcType = NCHAR}");
            VALUES("SDRLLN","#{record.sdrlln,jdbcType=DECIMAL}");
            VALUES("SDKCOO","#{record.sdkcoo,jdbcType = NCHAR}");
            VALUES("SDDCTO","#{record.sddcto,jdbcType = NCHAR}");
            VALUES("SDDOCO","#{record.sddoco,jdbcType=DECIMAL}");
            VALUES("SDLNID","#{record.sdlnid,jdbcType=DECIMAL}");
            VALUES("SDCO","#{record.sdco,jdbcType = NCHAR}");
            VALUES("SDALPH","#{record.sdalph,jdbcType = NCHAR}");
            VALUES("SDMCU","#{record.sdmcu,jdbcType = NCHAR}");
            VALUES("SDAITM","#{record.sdaitm,jdbcType = NCHAR}");
            //VALUES("SDLITM","{record.sdlitm}");
            VALUES("SDLITM","0");
            VALUES("SDLOTN","#{record.sdlotn,jdbcType = NCHAR}");
            VALUES("SDDLEJ","#{record.sddlej,jdbcType=DECIMAL}");
            VALUES("SDMMEJ","#{record.sdmmej,jdbcType=DECIMAL}");
            VALUES("SDE8ZZBM","#{record.sde8zzbm,jdbcType = NCHAR}");
            VALUES("SDE8DSC1","#{record.sde8dsc1,jdbcType = NCHAR}");
            VALUES("SDE8DSC2","#{record.sde8dsc2,jdbcType = NCHAR}");
            VALUES("SDUOM","#{record.sduom,jdbcType = NCHAR}");
            VALUES("SDUOM3","#{record.sduom3,jdbcType = NCHAR}");
            //-----------
            VALUES("SDUORG","#{record.sduorg,jdbcType=DECIMAL}*10");
            //-----------
            VALUES("SDTUPRC","#{record.sdtuprc,jdbcType=DECIMAL}");
            VALUES("SDTAEXP","#{record.sdtaexp,jdbcType=DECIMAL}");
            VALUES("SDE8TPRRC","#{record.sde8tprrc,jdbcType=DECIMAL}");
            VALUES("SDE8TAEXP","#{record.sde8taexp,jdbcType=DECIMAL}");
            VALUES("SDAN8","#{record.sdan8,jdbcType=DECIMAL}");
            VALUES("SDDSC1","#{record.sddsc1,jdbcType = NCHAR}");
            VALUES("SDE8DSY","#{record.sde8dsy,jdbcType=DECIMAL}");
            VALUES("SDSHAN","#{record.sdshan,jdbcType=DECIMAL}");
            VALUES("SDDRQJ","#{record.sddrqj,jdbcType=DECIMAL}");
            VALUES("SDTRDJ","#{record.sdtrdj,jdbcType=DECIMAL}");
            VALUES("SDADDJ","#{record.sdaddj,jdbcType=DECIMAL}");
            VALUES("SDDL01","#{record.sddl01,jdbcType = NCHAR}");
            VALUES("SDDL02","#{record.sddl02,jdbcType = NCHAR}");
            VALUES("SDDL03","#{record.sddl03,jdbcType = NCHAR}");
            VALUES("SDDL04","#{record.sddl04,jdbcType = NCHAR}");
            VALUES("SDDL05","#{record.sddl05,jdbcType = NCHAR}");
            VALUES("SDDL06","#{record.sddl06,jdbcType = NCHAR}");
            VALUES("SDDL07","#{record.sddl07,jdbcType = NCHAR}");
            VALUES("SDDL08","#{record.sddl08,jdbcType = NCHAR}");
            VALUES("SDDL09","#{record.sddl09,jdbcType = NCHAR}");
            VALUES("SDDL10","#{record.sddl10,jdbcType = NCHAR}");
            VALUES("SDINDATE","#{record.sdindate,jdbcType=TIMESTAMP}");
            VALUES("SDREDATE","#{record.sdredate,jdbcType=TIMESTAMP}");
            VALUES("SDIR01","#{record.sdir01,jdbcType = NCHAR}");
            VALUES("SDIR02","#{record.sdir02,jdbcType = NCHAR}");
            VALUES("SDIR03","#{record.sdir03,jdbcType = NCHAR}");
            VALUES("SDIR04","#{record.sdir04,jdbcType = NCHAR}");
            VALUES("SDIR05","#{record.sdir05,jdbcType = NCHAR}");
            VALUES("SDHRB","#{record.sdhrb,jdbcType=DECIMAL}");
            VALUES("SDPSAL","#{record.sdpsal,jdbcType=DECIMAL}");
            VALUES("SDIPAY","#{record.sdipay,jdbcType=DECIMAL}");
            VALUES("SDTDSC","#{record.sdtdsc,jdbcType=DECIMAL}");
            VALUES("SDEFHR","#{record.sdefhr,jdbcType=DECIMAL}");
            VALUES("SDCRTJ","#{record.sdcrtj,jdbcType=DECIMAL}");
            VALUES("SDDIVJ","#{record.sddivj,jdbcType=DECIMAL}");
            VALUES("SDEXDJ","#{record.sdexdj,jdbcType=DECIMAL}");
            VALUES("SDAFDJ","#{record.sdafdj,jdbcType=DECIMAL}");
            VALUES("SDCKDT","#{record.sdckdt,jdbcType=DECIMAL}");
            //非json传输字段
            /*VALUES("SDUSER","{record.sduser}");
            VALUES("SDUPMJ","{record.sdupmj}");
            VALUES("SDTDAY","{record.sdtdayL}");
            VALUES("SDPID ","{record.sdpid}");
            VALUES("SDJOBN","{record.sdjobn}");
            VALUES("SDURCD","{record.sdurcd}");
            VALUES("SDURDT","{record.sdurdt}");
            VALUES("SDURAT","{record.sdurat}");
            VALUES("SDURAB","{record.sdurab}");
            VALUES("SDURRF","{record.sdurrf}");*/

            VALUES("SDUSER","'NT'");
            VALUES("SDUPMJ",UPMJ);
            VALUES("SDTDAY",TDAY);
            VALUES("SDPID ","'Interface'");
            VALUES("SDJOBN","'Server'");
            VALUES("SDURCD","' '");
            VALUES("SDURDT","0");
            VALUES("SDURAT","0");
            VALUES("SDURAB","0");
            VALUES("SDURRF","' '");
            //

            //VALUES("SDE8FROM","{record.sde8from}");
            VALUES("SDE8FROM","'NT'");
            VALUES("SDE8TYPE","#{record.sde8type,jdbcType=NCHAR}");
            VALUES("SDE8ODNO","#{record.sde8odno,jdbcType=NCHAR}");
            VALUES("SDE8LNID","#{record.sde8lnid,jdbcType=DECIMAL}");
            return toString();
        }

        public String deleteFe8nt004ByPK(@Param("schema") String schema, @Param("sde8from") String sde8from, @Param("sde8type")String sde8type,
                                         @Param("sde8odno") String sde8odno, @Param("sde8lnid")BigDecimal sde8lnid){
            DELETE_FROM(schema+".fe8nt004");
            WHERE("trim(SDE8FROM) = #{sde8from}");
            WHERE("trim(SDE8TYPE) = #{sde8type}");
            WHERE("trim(SDE8ODNO) = #{sde8odno}");
            WHERE("trim(SDE8LNID) = #{sde8lnid}");
            return toString();
        }
    }
    @SelectProvider(type = SqlProvider.class,method = "selectDateByPK")
    Fe8nt004 selectDateByPK(@Param("schema") String schema, @Param("sde8from") String sde8from, @Param("sde8type")String sde8type,
                                 @Param("sde8odno") String sde8odno, @Param("sde8lnid")BigDecimal sde8lnid);
    @UpdateProvider(type = SqlProvider.class,method = "updateFe8nt004ByPK")
    int updateFe8nt004ByPK(@Param("schema") String schema, @Param("record") Fe8nt004 fe8nt004);

    @InsertProvider(type = SqlProvider.class,method = "insertFe8nt004")
    int insertFe8nt004(@Param("schema") String schema,@Param("record") Fe8nt004 record);

    @DeleteProvider(type = SqlProvider.class , method = "deleteFe8nt004ByPK")
    int deleteFe8nt004ByPK(@Param("schema") String schema, @Param("sde8from") String sde8from, @Param("sde8type")String sde8type,
                           @Param("sde8odno") String sde8odno, @Param("sde8lnid")BigDecimal sde8lnid);
}