//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841003;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe841003SelectByAn8Mapper")
public interface FE841003SelectByAn8Mapper {
    @SelectProvider(
            type = FE841003SelectByAn8Mapper.SqlProvider.class,
            method = "selectByPrimaryKey"
    )
    Fe841003 selectByPrimaryKey(@Param("schema") String var1, @Param("ukid") BigDecimal var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String selectByPrimaryKey(@Param("schema") String schema, @Param("ukid") BigDecimal ukid) {
            this.SELECT("SQA427");
            this.SELECT("SQE8TYM");
            this.SELECT("SQCNEM");
            this.SELECT("SQCNICL");
            this.SELECT("SQCNYP");
            this.FROM(schema + ".FE841003");
            this.WHERE("SQUKID = #{ukid}");
            return this.toString();
        }
    }
}
