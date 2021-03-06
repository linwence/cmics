package com.el.cmic.mapper.query;

import com.el.cmic.domain.query.LedgerQryCondition;
import com.el.cmic.domain.query.Ve8spdf4111;

import java.util.List;

import com.el.utils.ReadPropertiesUtil;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;
import org.springframework.util.StringUtils;

public interface Ve8spdf4111Mapper {
    final String schema = ReadPropertiesUtil.getPropertyValue("/config/db.properties", "schema");

    final class SqlProvider extends SQL {

        public String selectF4111(@Param("ledgerQryCondition") LedgerQryCondition ledgerQryCondition) {
            SELECT("#{ledgerQryCondition.guid} as guid");
            SELECT("ROWNUM");
            SELECT("MCCO");
            SELECT("ILLITM");
            SELECT("IMDSC1");
            SELECT("ILMCU");
            SELECT("ILDOC");
            SELECT("ILDCT");
            SELECT("ILKCO");
            SELECT("ILLOCN");
            SELECT("ILTRUM");
            SELECT("DRDL01");
            SELECT("ILTRQT");
            SELECT("IOLOT1");
            SELECT("IOLOT2");
            SELECT("PRODDATE");
            SELECT("LOTINVALIDDATE");
            SELECT("LOT2INVALIDDATE");
            SELECT("ILDOCO");
            SELECT("ILDCTO");
            SELECT("ILKCOO");
            SELECT("ILLNID");
            SELECT("CPDL");
            SELECT("TSFL");
            SELECT("CPFL");
            SELECT("MJRQ");
            SELECT("STKT");
            SELECT("ABALPH");
            SELECT("FCE8ZZBM");
            SELECT("JHG");
            SELECT("PHE8PSDWN");
            SELECT("PHE8PSDWBE");
            SELECT("PHE8YHYY");
            SELECT("PHE8YHYYN");
            SELECT("PHE8YHKSN");
            SELECT("PHE8YHKS");
            SELECT("PHE8SHKSN");
            SELECT("PHE8SHKS");
            SELECT("PHE8QGLX");
            SELECT("PHE8CGDD");
            SELECT("PHE8KSD");
            SELECT("PHE8YLJGD");
            SELECT("PHE8YYYCN");
            SELECT("ILLOTN");
            FROM(schema + ".VE8SPDF4111");
            if (!StringUtils.isEmpty(ledgerQryCondition.getLitm())) {
                WHERE("ILLITM=#{litm}");
            }
            WHERE("MCCO=#{ledgerQryCondition.erpco}");
            if (ledgerQryCondition.getStartRowNum() > 0 && ledgerQryCondition.getEndRowNum() > 0) {
                WHERE("ROWNUM between #{ledgerQryCondition.startRowNum} and #{ledgerQryCondition.endRowNum}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getMcu())) {
                WHERE("TRIM(ILMCU)=#{ledgerQryCondition.mcu}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getLocn())) {
                WHERE("TRIM(ILLOCN)=#{ledgerQryCondition.locn}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getLotn())) {
                WHERE("TRIM(ILLOTN)=#{ledgerQryCondition.lotn}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getDoco())) {
                WHERE("TRIM(ILDOCO)=#{ledgerQryCondition.doco}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getDcto())) {
                WHERE("TRIM(ILDCTO)=#{ledgerQryCondition.dcto}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getKcoo())) {
                WHERE("TRIM(ILKCOO)=#{ledgerQryCondition.kcoo}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getLnid())) {
                WHERE("ILLNID=#{ledgerQryCondition.lnid}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getCpdl())) {
                WHERE("TRIM(CPDL)=#{ledgerQryCondition.cpdl}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getTsfl())) {
                WHERE("TRIM(TSFL)=#{ledgerQryCondition.tsfl}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getCpfl())) {
                WHERE("TRIM(CPFL)=#{ledgerQryCondition.cpfl}");
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getStkt())) {
                if (ledgerQryCondition.getStkt().equals("Y")) {
                    WHERE("IMSTKT='O'");
                }
            }
            if (!StringUtils.isEmpty(ledgerQryCondition.getAlph())) {
                WHERE("trim(ABALPH)=#{ledgerQryCondition.alph,jdbcType=NCHAR}");
            }

            if (!StringUtils.isEmpty(ledgerQryCondition.getEbzzbm())) {
                WHERE("trim(FCE8ZZBM)=#{ledgerQryCondition.ebzzbm,jdbcType=NCHAR}");
            }
            return toString();
        }
    }

    @SelectProvider(type = SqlProvider.class, method = "selectF4111")
    @Results({
            @Result(column = "ILLITM", property = "illitm", jdbcType = JdbcType.NCHAR),
            @Result(column = "IMDSC1", property = "imdsc1", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILMCU", property = "ilmcu", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILDOC", property = "ildoc", jdbcType = JdbcType.DECIMAL),
            @Result(column = "ILDCT", property = "ildct", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILKCO", property = "ilkco", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILJELN", property = "iljeln", jdbcType = JdbcType.DECIMAL),
            @Result(column = "ILLOCN", property = "illocn", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILTRUM", property = "iltrum", jdbcType = JdbcType.NCHAR),
            @Result(column = "DRDL01", property = "drdl01", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILTRQT", property = "iltrqt", jdbcType = JdbcType.DECIMAL),
            @Result(column = "IOLOT1", property = "iolot1", jdbcType = JdbcType.NCHAR),
            @Result(column = "IOLOT2", property = "iolot2", jdbcType = JdbcType.NCHAR),
            @Result(column = "PRODDATE", property = "proddate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "LOTINVALIDDATE", property = "lotinvaliddate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "LOT2INVALIDDATE", property = "lot2invaliddate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "ILDOCO", property = "ildoco", jdbcType = JdbcType.DECIMAL),
            @Result(column = "ILDCTO", property = "ildcto", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILKCOO", property = "ilkcoo", jdbcType = JdbcType.NCHAR),
            @Result(column = "ILLNID", property = "illnid", jdbcType = JdbcType.DECIMAL)
    })
    List<Ve8spdf4111> selectF4111(@Param("ledgerQryCondition") LedgerQryCondition ledgerQryCondition);
}