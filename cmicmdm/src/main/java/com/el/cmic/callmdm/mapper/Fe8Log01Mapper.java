package com.el.cmic.callmdm.mapper;

import com.el.cfg.domain.Fe8log01;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Vincent on 2016/10/9.
 */
@Repository(value = "fe8Log01Mapper")
public interface Fe8Log01Mapper {
    final class SqlProvider extends SQL {
        private static final String INSERT_SQL = "insert";

        public String insert(@Param("fe8Log01") Fe8log01 fe8Log01,@Param("schema") String schema) {
            INSERT_INTO(schema+".FE8Log01");
            if (fe8Log01.getLgukid() != null) {
                VALUES("lgukid", "#{fe8Log01.lgukid}");
            }
            if (fe8Log01.getLgukidp() != null) {
                VALUES("lgukidp", "#{fe8Log01.lgukidp}");
            }
            if (fe8Log01.getLglitm() != null) {
                VALUES("lglitm", "#{fe8Log01.lglitm}");
            }
            if (fe8Log01.getLgdl01() != null) {
                VALUES("lgdl01", "#{fe8Log01.lgdl01}");
            }
            if (fe8Log01.getLgdl02() != null) {
                VALUES("lgdl02", "#{fe8Log01.lgdl02}");
            }
            if (fe8Log01.getLgdl03() != null) {
                VALUES("lgdl03", "#{fe8Log01.lgdl03}");
            }
            if (fe8Log01.getLgdl04() != null) {
                VALUES("lgdl04", "#{fe8Log01.lgdl04}");
            }
            if (fe8Log01.getLgdl05() != null) {
                VALUES("lgdl05", "#{fe8Log01.lgdl05}");
            }

            if (fe8Log01.getLgdl010() != null) {
                VALUES("lgdl010", "#{fe8Log01.lgdl010}");
            }
            if (fe8Log01.getLgvar1() != null) {
                VALUES("lgvar1", "#{fe8Log01.lgvar1}");
            }
            if (fe8Log01.getLguser() != null) {
                VALUES("lguser", "#{fe8Log01.lguser}");
            }
            if (fe8Log01.getLgpid() != null) {
                VALUES("lgpid", "#{fe8Log01.lgpid}");
            }
            if (fe8Log01.getLgjobn() != null) {
                VALUES("lgjobn", "#{fe8Log01.lgjobn}");
            }
            if (fe8Log01.getLgupmj() != null) {
                VALUES("lgupmj", "#{fe8Log01.lgupmj}");
            }
            if (fe8Log01.getLgupmt() != null) {
                VALUES("lgupmt", "#{fe8Log01.lgupmt}");
            }
            if (fe8Log01.getLgidate() != null) {
                VALUES("lgidate", "#{fe8Log01.lgidate}");
            }
            if (fe8Log01.getLgdf01() != null) {
                VALUES("lgdf01", "#{fe8Log01.lgdf01}");
            }
            if (fe8Log01.getLgrdate() != null) {
                VALUES("lgrdate", "#{fe8Log01.lgrdate}");
            }
            if (fe8Log01.getLgdf02() != null) {
                VALUES("lgdf02", "#{fe8Log01.lgdf02}");
            }
            if (fe8Log01.getLgstatus() != null) {
                VALUES("lgstatus", "#{fe8Log01.lgstatus}");
            }
            if (fe8Log01.getLgflag() != null) {
                VALUES("lgflag", "#{fe8Log01.lgflag}");
            }

            return toString();
        }
    }


    @InsertProvider(type = SqlProvider.class, method = SqlProvider.INSERT_SQL)
    //@Insert("INSERT INTO FE8Log01 (lgukid,lgdl01) VALUES(#{lgukid},#{lgdl01})")
    @SelectKey(statement = "SELECT ${tableSchema}.FE8LOG01_SEQ.NEXTVAL FROM DUAL", keyProperty = "fe8Log01.lgukid", resultType = BigDecimal.class, before = true)
        // @Options(useGeneratedKeys = true, keyProperty = "lgukid", keyColumn = "lgukid")
    int insert(@Param("fe8Log01") Fe8log01 fe8Log01,@Param("schema") String schema);
}
