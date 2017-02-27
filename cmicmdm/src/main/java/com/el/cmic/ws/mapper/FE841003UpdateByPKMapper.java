//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841003;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe841003UpdateByPKMapper")
public interface FE841003UpdateByPKMapper {
    @UpdateProvider(
            type = FE841003UpdateByPKMapper.SqlProvider.class,
            method = "updateByPrimaryKeySelective"
    )
    int updateByPrimaryKeySelective(@Param("schema") String var1, @Param("record") Fe841003 var2);

    @UpdateProvider(
            type = FE841003UpdateByPKMapper.SqlProvider.class,
            method = "updateByan8"
    )
    int updateByan8(@Param("schema") String var1, @Param("record") Fe841003 var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String updateByPrimaryKeySelective(@Param("schema") String schema, @Param("record") Fe841003 record) {
            this.UPDATE(schema + ".FE841003");
            this.SET("SQFLAG = #{record.sqflag}");
            if(record.getSqflag() == "R") {
                this.SET("SQA202 = (select ACA202 FROM " + schema + ".FE84202A where ACA204=\'Y\' and ACE8SPLX = (select SQE8SPLX From " + schema + ".FE841003 where squkid = #{record.squkid}) and ACCO = (select SQKCOO From " + schema + ".FE841003 where squkid = #{record.squkid}))");
                this.SET("SQPP01 = (select ACPP01 FROM " + schema + ".FE84202A where ACA204=\'Y\' and ACE8SPLX = (select SQE8SPLX From " + schema + ".FE841003 where squkid = #{record.squkid}) and ACCO = (select SQKCOO From " + schema + ".FE841003 where squkid = #{record.squkid}))");
            }

            this.WHERE("Trim(SQUKID) = #{record.squkid}");
            return this.toString();
        }

        public String updateByan8(@Param("schema") String schema, @Param("record") Fe841003 record) {
            this.UPDATE(schema + ".FE841003");
            this.SET("SQFLAG = #{record.sqflag}");
            this.WHERE("SQAN8 = #{record.sqan8}");
            return this.toString();
        }
    }
}
