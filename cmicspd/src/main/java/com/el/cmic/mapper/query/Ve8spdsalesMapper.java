package com.el.cmic.mapper.query;

import com.el.cmic.domain.query.SaleQryCondition;
import com.el.cmic.domain.query.Ve8spdsales;

import java.util.List;

import com.el.utils.ReadPropertiesUtil;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;
import org.springframework.util.StringUtils;

public interface Ve8spdsalesMapper {
    final String schema = ReadPropertiesUtil.getPropertyValue("/config/db.properties", "schema");
    @Select({
            "select",
            "SDKCOO, SDDOCO, SDDCTO, SDLNID, SDLITM, SDDSC1, SDTRDJ, SDADDJ, SDUOM, UOM, ",
            "SDUORG, SDSOQS, SDSOBK, SDSOCN, DTTUPRC, DTTAEXP, SDUNCS, SDECST, SDAN8, PHE8PSDWN, ",
            "PHE8PSDWBE, PHE8YHYY, PHE8YHYYN, PHE8YHKSN, PHE8YHKS, PHE8SHKSN, PHE8SHKS, PHE8QGLX, ",
            "PHE8CGDD, PHE8KSD, PHE8YLJGD, PHE8YYYCN, SPE8DSC2, PHE8SCCS, EHE8ZZBM, IOLOT1, ",
            "IOLOT2, PRODDATE, IOMMEJ, MJRQ, PHE8YYYCE, PHE8SPDDW, PHUORG, PHUPRC, AEXP, ",
            "SPE8XLHGL, SPE8QTCC, EHE8FHDBH, CPDL, TSFL, CPFL, RMK",
            "from CRPDTA.VE8SPDSALES"
    })
    @Results({
            @Result(column = "SDKCOO", property = "sdkcoo", jdbcType = JdbcType.NCHAR),
            @Result(column = "SDDOCO", property = "sddoco", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDDCTO", property = "sddcto", jdbcType = JdbcType.NCHAR),
            @Result(column = "SDLNID", property = "sdlnid", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDLITM", property = "sdlitm", jdbcType = JdbcType.NCHAR),
            @Result(column = "SDDSC1", property = "sddsc1", jdbcType = JdbcType.NCHAR),
            @Result(column = "SDTRDJ", property = "sdtrdj", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "SDADDJ", property = "sdaddj", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "SDUOM", property = "sduom", jdbcType = JdbcType.NCHAR),
            @Result(column = "UOM", property = "uom", jdbcType = JdbcType.NCHAR),
            @Result(column = "SDUORG", property = "sduorg", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDSOQS", property = "sdsoqs", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDSOBK", property = "sdsobk", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDSOCN", property = "sdsocn", jdbcType = JdbcType.DECIMAL),
            @Result(column = "DTTUPRC", property = "dttuprc", jdbcType = JdbcType.DECIMAL),
            @Result(column = "DTTAEXP", property = "dttaexp", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDUNCS", property = "sduncs", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDECST", property = "sdecst", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SDAN8", property = "sdan8", jdbcType = JdbcType.DECIMAL),
            @Result(column = "PHE8PSDWN", property = "phe8psdwn", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8PSDWBE", property = "phe8psdwbe", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8YHYY", property = "phe8yhyy", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8YHYYN", property = "phe8yhyyn", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8YHKSN", property = "phe8yhksn", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8YHKS", property = "phe8yhks", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8SHKSN", property = "phe8shksn", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8SHKS", property = "phe8shks", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8QGLX", property = "phe8qglx", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8CGDD", property = "phe8cgdd", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8KSD", property = "phe8ksd", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8YLJGD", property = "phe8yljgd", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8YYYCN", property = "phe8yyycn", jdbcType = JdbcType.NCHAR),
            @Result(column = "SPE8DSC2", property = "spe8dsc2", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8SCCS", property = "phe8sccs", jdbcType = JdbcType.NCHAR),
            @Result(column = "EHE8ZZBM", property = "ehe8zzbm", jdbcType = JdbcType.NCHAR),
            @Result(column = "IOLOT1", property = "iolot1", jdbcType = JdbcType.NCHAR),
            @Result(column = "IOLOT2", property = "iolot2", jdbcType = JdbcType.NCHAR),
            @Result(column = "PRODDATE", property = "proddate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "IOMMEJ", property = "iommej", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "MJRQ", property = "mjrq", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "PHE8YYYCE", property = "phe8yyyce", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHE8SPDDW", property = "phe8spddw", jdbcType = JdbcType.NCHAR),
            @Result(column = "PHUORG", property = "phuorg", jdbcType = JdbcType.DECIMAL),
            @Result(column = "PHUPRC", property = "phuprc", jdbcType = JdbcType.DECIMAL),
            @Result(column = "AEXP", property = "aexp", jdbcType = JdbcType.DECIMAL),
            @Result(column = "SPE8XLHGL", property = "spe8xlhgl", jdbcType = JdbcType.NCHAR),
            @Result(column = "SPE8QTCC", property = "spe8qtcc", jdbcType = JdbcType.NCHAR),
            @Result(column = "EHE8FHDBH", property = "ehe8fhdbh", jdbcType = JdbcType.NCHAR),
            @Result(column = "CPDL", property = "cpdl", jdbcType = JdbcType.NCHAR),
            @Result(column = "TSFL", property = "tsfl", jdbcType = JdbcType.NCHAR),
            @Result(column = "CPFL", property = "cpfl", jdbcType = JdbcType.NCHAR),
            @Result(column = "RMK", property = "rmk", jdbcType = JdbcType.NCHAR)
    })
    List<Ve8spdsales> selectAll();

    final class SqlProvider extends SQL {
        public String selectSalesByCondition(@Param("saleQryCondition") SaleQryCondition saleQryCondition) {
            SELECT("#{saleQryCondition.guid} as guid");
            SELECT("ROWNUM");
            SELECT("sdkcoo");
            SELECT("sddoco");
            SELECT("sddcto");
            SELECT("sdlnid");
            SELECT("sdlitm");
            SELECT("sddsc1");
            SELECT("sdtrdj");
            SELECT("sdaddj");
            SELECT("sduom");
            SELECT("uom");
            SELECT("sduorg");
            SELECT("sdsoqs");
            SELECT("sdsobk");
            SELECT("sdsocn");
            SELECT("dttuprc");
            SELECT("dttaexp");
            SELECT("sduncs");
            SELECT("sdecst");
            SELECT("sdan8");
            SELECT("phe8psdwn");
            SELECT("phe8psdwbe");
            SELECT("Phe8yhyy");
            SELECT("Phe8yhyyn");
            SELECT("Phe8yhksn");
            SELECT("Phe8yhks");
            SELECT("Phe8shksn");
            SELECT("Phe8shks");
            SELECT("Phe8qglx");
            SELECT("Phe8cgdd");
            SELECT("Phe8ksd");
            SELECT("Phe8yljgd");
            SELECT("Phe8yyycn");
            SELECT("Spe8dsc2");
            SELECT("Phe8sccs");
            SELECT("Ehe8zzbm");
            SELECT("Iolot1");
            SELECT("Iolot2");
            SELECT("proddate");
            SELECT("iommej");
            SELECT("mjrq");
            SELECT("Phe8yyyce");
            SELECT("Phe8spddw");
            SELECT("phuorg");
            SELECT("Phuprc");
            SELECT("aexp");
            SELECT("Spe8xlhgl");
            SELECT("Spe8qtcc");
            SELECT("ehe8fhdbh");
            SELECT("cpdl");
            SELECT("tsfl");
            SELECT("cpfl");
            SELECT("rmk");
            SELECT("sdnxtr");
            SELECT("drdl01");
            FROM(schema+".ve8spdsales");
            WHERE("sdkcoo=#{saleQryCondition.erpco}");
            if(!StringUtils.isEmpty(saleQryCondition.getDoco())){
                WHERE("sddoco=#{saleQryCondition.doco}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getDcto())){
                WHERE("sddcto=#{saleQryCondition.dcto}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getKcoo())){
                WHERE("sdkcoo=#{saleQryCondition.kcoo}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getLnid())){
                WHERE("sdlnid=#{saleQryCondition.lnid}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getLnid())){
                WHERE("sdlnid=#{saleQryCondition.lnid}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getLitm())){
                WHERE("TRIM(sdlitm)=#{saleQryCondition.litm}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getDsc1())){
                WHERE("TRIM(sddsc1)=#{saleQryCondition.dsc1}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getTrdj())){
                WHERE("sdtrdj=#{saleQryCondition.trdj}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getAddj())){
                WHERE("sdaddj=#{saleQryCondition.addj}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getAn8())){
                WHERE("sdan8=#{saleQryCondition.an8}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8psdwn())){
                WHERE("TRIM(phe8psdwn)=#{saleQryCondition.e8psdwn}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8yhyy())){
                WHERE("TRIM(Phe8yhyyn)=#{saleQryCondition.e8yhyy}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8yhksn())){
                WHERE("TRIM(Phe8yhksn)=#{saleQryCondition.e8yhksn}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8shksn())){
                WHERE("TRIM(Phe8shksn)=#{saleQryCondition.e8shksn}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8qglx())){
                WHERE("TRIM(Phe8qglx)=#{saleQryCondition.e8qglx}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8cgdd())){
                WHERE("TRIM(Phe8cgdd)=#{saleQryCondition.e8cgdd}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8ksd())){
                WHERE("TRIM(Phe8ksd)=#{saleQryCondition.e8ksd}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8dsc2())){
                WHERE("TRIM(Spe8dsc2)=#{saleQryCondition.e8dsc2}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8sccs())){
                WHERE("TRIM(Phe8sccs)=#{saleQryCondition.e8sccs}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getLot1())){
                WHERE("TRIM(Iolot1)=#{saleQryCondition.lot1}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getLot2())){
                WHERE("TRIM(Iolot2)=#{saleQryCondition.lot2}");
            }
            if(!StringUtils.isEmpty(saleQryCondition.getE8fhdbh())){
                WHERE("TRIM(ehe8fhdbh)=#{saleQryCondition.e8fhdbh}");
            }
            if (saleQryCondition.getStartRowNum() > 0 && saleQryCondition.getEndRowNum() > 0) {
                WHERE("ROWNUM between #{saleQryCondition.startRowNum} and #{saleQryCondition.endRowNum}");
            }
            return toString();
        }

    }
    @SelectProvider(type = SqlProvider.class,method = "selectSalesByCondition")
    List<Ve8spdsales> selectSalesByCondition(@Param("saleQryCondition") SaleQryCondition saleQryCondition);
}