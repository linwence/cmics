package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841001;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/11.
 */
@Repository(value = "fe841001UpdateByDocoMapper")
public interface FE841001UpdateByDocoMapper {

    final class SqlProvider extends SQL{
        public String updateByDoco(@Param("schema")String schema,@Param("record") Fe841001 record){


            UPDATE(schema+".FE841001");


            if (record.getSqflag() != null) {
                SET("SQFLAG = #{record.sqflag}");
            }

            if(record.getSqflag() == "R"){
                SET("SQBFNU = (select ACDL01 FROM "+schema+".FE84202A where ACA204='Y' and ACE8SPLX = (select SQE8SPLX From "+schema+".FE841001 where squkidp = #{record.squkidp}) and ACCO = (select SQKCOO From "+schema+".FE841001 where squkidp = #{record.squkidp}))");
                SET("SQA202 = (select ACA202 FROM "+schema+".FE84202A where ACA204='Y' and ACE8SPLX = (select SQE8SPLX From "+schema+".FE841001 where squkidp = #{record.squkidp}) and ACCO = (select SQKCOO From "+schema+".FE841001 where squkidp = #{record.squkidp}))");
                SET("SQPP01 = (select ACPP01 FROM "+schema+".FE84202A where ACA204='Y' and ACE8SPLX = (select SQE8SPLX From "+schema+".FE841001 where squkidp = #{record.squkidp}) and ACCO = (select SQKCOO From "+schema+".FE841001 where squkidp = #{record.squkidp}))");

            }

            WHERE("Trim(SQUKIDP) = #{record.squkidp}");

            return toString();
        }

        public String updatebylitm(@Param("schema")String schema,@Param("record") Fe841001 record){
            UPDATE(schema+".FE841001");
            SET("SQFLAG = #{record.sqflag}");
            WHERE("Trim(SQLITM) = #{record.sqlitm}");
            return toString();
        }

    }

    @UpdateProvider(type=SqlProvider.class, method="updateByDoco")
    int updateByDoco(@Param("schema")String schema,@Param("record") Fe841001 record);

    @UpdateProvider(type=SqlProvider.class, method="updatebylitm")
    int updatebylitm(@Param("schema")String schema,@Param("record") Fe841001 record);

}
