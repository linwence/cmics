//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841001;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe841001UpdateByDocoMapper")
public interface FE841001UpdateByDocoMapper {
    @UpdateProvider(
            type = FE841001UpdateByDocoMapper.SqlProvider.class,
            method = "updateByDoco"
    )
    int updateByDoco(@Param("schema") String var1, @Param("record") Fe841001 var2);

    @UpdateProvider(
            type = FE841001UpdateByDocoMapper.SqlProvider.class,
            method = "updatebylitm"
    )
    int updatebylitm(@Param("schema") String var1, @Param("record") Fe841001 var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String updateByDoco(@Param("schema") String schema, @Param("record") Fe841001 record) {
            this.UPDATE(schema + ".FE841001");
            if(record.getSqflag() != null) {
                this.SET("SQFLAG = #{record.sqflag}");
            }

            if(record.getSqflag() == "R") {
                this.SET("SQBFNU = (select ACDL01 FROM " + schema + ".FE84202A where ACA204=\'Y\' and ACE8SPLX = (select SQE8SPLX From " + schema + ".FE841001 where squkidp = #{record.squkidp}) and ACCO = (select SQKCOO From " + schema + ".FE841001 where squkidp = #{record.squkidp}))");
                this.SET("SQA202 = (select ACA202 FROM " + schema + ".FE84202A where ACA204=\'Y\' and ACE8SPLX = (select SQE8SPLX From " + schema + ".FE841001 where squkidp = #{record.squkidp}) and ACCO = (select SQKCOO From " + schema + ".FE841001 where squkidp = #{record.squkidp}))");
                this.SET("SQPP01 = (select ACPP01 FROM " + schema + ".FE84202A where ACA204=\'Y\' and ACE8SPLX = (select SQE8SPLX From " + schema + ".FE841001 where squkidp = #{record.squkidp}) and ACCO = (select SQKCOO From " + schema + ".FE841001 where squkidp = #{record.squkidp}))");
            }

            this.WHERE("Trim(SQUKIDP) = #{record.squkidp}");
            return this.toString();
        }

        public String updatebylitm(@Param("schema") String schema, @Param("record") Fe841001 record) {
            this.UPDATE(schema + ".FE841001");
            this.SET("SQFLAG = #{record.sqflag}");
            this.WHERE("Trim(SQLITM) = #{record.sqlitm}");
            return this.toString();
        }
    }
}
