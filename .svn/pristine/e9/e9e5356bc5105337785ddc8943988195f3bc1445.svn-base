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
            FROM(schema+"Fe8nt004");
            WHERE("trim(SDE8FROM) = #{sde8from}");
            WHERE("trim(SDE8TYPE) = #{sde8type}");
            WHERE("trim(SDE8ODNO) = #{sde8odno}");
            WHERE("trim(SDE8LNID) = #{sde8lnid}");
            return toString();
        }

        public String updateFe8nt004ByPK(@Param("schema") String schema, @Param("record") Fe8nt004 fe8nt004){
            UPDATE(schema+".Fe8nt004");
            SET("SDEDSP = #{record.sdedsp}");
            SET("SDRKCO = #{record.sdrkco}");
            SET("SDRCTO = #{record.sdrcto}");
            SET("SDRORN = #{record.sdrorn}");
            SET("SDRLLN = #{record.sdrlln}");
            SET("SDKCOO = #{record.sdkcoo}");
            SET("SDDCTO = #{record.sddcto}");
            SET("SDDOCO = #{record.sddoco}");
            SET("SDLNID = #{record.sdlnid}");
            SET("SDCO = #{record.sdco}");
            SET("SDALPH = #{record.sdalph}");
            SET("SDMCU = #{record.sdmcu}");
            SET("SDAITM = #{record.sdaitm}");
            SET("SDLITM = #{record.sdlitm}");
            SET("SDLOTN = #{record.sdlotn}");
            SET("SDDLEJ = #{record.sddlej}");
            SET("SDMMEJ = #{record.sdmmej}");
            SET("SDE8ZZBM = #{record.sde8zzbm}");
            SET("SDE8DSC1 = #{record.sde8dsc1}");
            SET("SDE8DSC2 = #{record.sde8dsc2}");
            SET("SDUOM = #{record.sduom}");
            SET("SDUOM3 = #{record.sduom3}");
            SET("SDUORG = #{record.sduorg}");
            SET("SDTUPRC = #{record.sdtuprc}");
            SET("SDTAEXP = #{record.sdtaexp}");
            SET("SDE8TPRRC = #{record.sde8tprrc}");
            SET("SDE8TAEXP = #{record.sde8taexp}");
            SET("SDAN8 = #{record.sdan8}");
            SET("SDDSC1 = #{record.sddsc1}");
            SET("SDE8DSY = #{record.sde8dsy}");
            SET("SDSHAN = #{record.sdshan}");
            SET("SDDRQJ = #{record.sddrqj}");
            SET("SDTRDJ = #{record.sdtrdj}");
            SET("SDADDJ = #{record.sdaddj}");
            SET("SDDL01 = #{record.sddl01}");
            SET("SDDL02 = #{record.sddl02}");
            SET("SDDL03 = #{record.sddl03}");
            SET("SDDL04 = #{record.sddl04}");
            SET("SDDL05 = #{record.sddl05}");
            SET("SDDL06 = #{record.sddl06}");
            SET("SDDL07 = #{record.sddl07}");
            SET("SDDL08 = #{record.sddl08}");
            SET("SDDL09 = #{record.sddl09}");
            SET("SDDL10 = #{record.sddl10}");
            SET("SDINDATE = #{record.sdindate}");
            SET("SDREDATE = #{record.sdredate}");
            SET("SDIR01 = #{record.sdir01}");
            SET("SDIR02 = #{record.sdir02}");
            SET("SDIR03 = #{record.sdir03}");
            SET("SDIR04 = #{record.sdir04}");
            SET("SDIR05 = #{record.sdir05}");
            SET("SDHRB = #{record.sdhrb}");
            SET("SDPSAL = #{record.sdpsal}");
            SET("SDIPAY = #{record.sdipay}");
            SET("SDTDSC = #{record.sdtdsc}");
            SET("SDEFHR = #{record.sdefhr}");
            SET("SDCRTJ = #{record.sdcrtj}");
            SET("SDDIVJ = #{record.sddivj}");
            SET("SDEXDJ = #{record.sdexdj}");
            SET("SDAFDJ = #{record.sdafdj}");
            SET("SDCKDT = #{record.sdckdt}");


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
            INSERT_INTO(schema+"Fe8nt004");
            VALUES("SDEDSP","{record.sdedsp}");
            VALUES("SDRKCO","{record.sdrkco}");
            VALUES("SDRCTO","{record.sdrcto}");
            VALUES("SDRORN","{record.sdrorn}");
            VALUES("SDRLLN","{record.sdrlln}");
            VALUES("SDKCOO","{record.sdkcoo}");
            VALUES("SDDCTO","{record.sddcto}");
            VALUES("SDDOCO","{record.sddoco}");
            VALUES("SDLNID","{record.sdlnid}");
            VALUES("SDCO","{record.sdco}");
            VALUES("SDALPH","{record.sdalph}");
            VALUES("SDMCU","{record.sdmcu}");
            VALUES("SDAITM","{record.sdaitm}");
            //VALUES("SDLITM","{record.sdlitm}");
            VALUES("SDLITM","0");
            VALUES("SDLOTN","{record.sdlotn}");
            VALUES("SDDLEJ","{record.sddlej}");
            VALUES("SDMMEJ","{record.sdmmej}");
            VALUES("SDE8ZZBM","{record.sde8zzbm}");
            VALUES("SDE8DSC1","{record.sde8dsc1}");
            VALUES("SDE8DSC2","{record.sde8dsc2}");
            VALUES("SDUOM","{record.sduom}");
            VALUES("SDUOM3","{record.sduom3}");
            VALUES("SDUORG","{record.sduorg}");
            VALUES("SDTUPRC","{record.sdtuprc}");
            VALUES("SDTAEXP","{record.sdtaexp}");
            VALUES("SDE8TPRRC","{record.sde8tprrc}");
            VALUES("SDE8TAEXP","{record.sde8taexp}");
            VALUES("SDAN8","{record.sdan8}");
            VALUES("SDDSC1","{record.sddsc1}");
            VALUES("SDE8DSY","{record.sde8dsy}");
            VALUES("SDSHAN","{record.sdshan}");
            VALUES("SDDRQJ","{record.sddrqj}");
            VALUES("SDTRDJ","{record.sdtrdj}");
            VALUES("SDADDJ","{record.sdaddj}");
            VALUES("SDDL01","{record.sddl01}");
            VALUES("SDDL02","{record.sddl02}");
            VALUES("SDDL03","{record.sddl03}");
            VALUES("SDDL04","{record.sddl04}");
            VALUES("SDDL05","{record.sddl05}");
            VALUES("SDDL06","{record.sddl06}");
            VALUES("SDDL07","{record.sddl07}");
            VALUES("SDDL08","{record.sddl08}");
            VALUES("SDDL09","{record.sddl09}");
            VALUES("SDDL10","{record.sddl10}");
            VALUES("SDINDATE","{record.sdindate}");
            VALUES("SDREDATE","{record.sdredate}");
            VALUES("SDIR01","{record.sdir01}");
            VALUES("SDIR02","{record.sdir02}");
            VALUES("SDIR03","{record.sdir03}");
            VALUES("SDIR04","{record.sdir04}");
            VALUES("SDIR05","{record.sdir05}");
            VALUES("SDHRB","{record.sdhrb}");
            VALUES("SDPSAL","{record.sdpsal}");
            VALUES("SDIPAY","{record.sdipay}");
            VALUES("SDTDSC","{record.sdtdsc}");
            VALUES("SDEFHR","{record.sdefhr}");
            VALUES("SDCRTJ","{record.sdcrtj}");
            VALUES("SDDIVJ","{record.sddivj}");
            VALUES("SDEXDJ","{record.sdexdj}");
            VALUES("SDAFDJ","{record.sdafdj}");
            VALUES("SDCKDT","{record.sdckdt}");
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
            VALUES("SDPID ","Interface");
            VALUES("SDJOBN","Server");
            VALUES("SDURCD","' '");
            VALUES("SDURDT","0");
            VALUES("SDURAT","0");
            VALUES("SDURAB","0");
            VALUES("SDURRF","' '");
            //

            //VALUES("SDE8FROM","{record.sde8from}");
            VALUES("SDE8FROM","'NT'");
            VALUES("SDE8TYPE","{record.sde8type}");
            VALUES("SDE8ODNO","{record.sde8odno}");
            VALUES("SDE8LNID","{record.sde8lnid}");
            return toString();
        }

        public String deleteFe8nt004ByPK(@Param("schema") String schema, @Param("sde8from") String sde8from, @Param("sde8type")String sde8type,
                                         @Param("sde8odno") String sde8odno, @Param("sde8lnid")BigDecimal sde8lnid){
            DELETE_FROM(schema+".fe8nt004");
            WHERE("trim(SDE8FROM) = #{record.sde8from}");
            WHERE("trim(SDE8TYPE) = #{record.sde8type}");
            WHERE("trim(SDE8ODNO) = #{record.sde8odno}");
            WHERE("trim(SDE8LNID) = #{record.sde8lnid}");
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