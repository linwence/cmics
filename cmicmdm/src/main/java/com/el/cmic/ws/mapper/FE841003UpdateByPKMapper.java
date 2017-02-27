package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841003;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/13.
 */
@Repository(value = "fe841003UpdateByPKMapper")
public interface FE841003UpdateByPKMapper {
    final class SqlProvider extends SQL{
        public String updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") Fe841003 record){


            UPDATE(schema+".FE841003");



            SET("SQFLAG = #{record.sqflag}");

            if(record.getSqflag() == "R"){
               // SET("SQBFNU = (select ACDL01 FROM "+schema+".FE84202A where ACA204='Y' and ACE8SPLX = (select SQE8SPLX From "+schema+".FE841001 where squkidp = #{record.squkidp}) and ACCO = (select SQKCOO From "+schema+".FE841001 where squkidp = #{record.squkidp}))");
                SET("SQA202 = (select ACA202 FROM "+schema+".FE84202A where ACA204='Y' and ACE8SPLX = (select SQE8SPLX From "+schema+".FE841003 where squkid = #{record.squkid}) and ACCO = (select SQKCOO From "+schema+".FE841003 where squkid = #{record.squkid}))");
                SET("SQPP01 = (select ACPP01 FROM "+schema+".FE84202A where ACA204='Y' and ACE8SPLX = (select SQE8SPLX From "+schema+".FE841003 where squkid = #{record.squkid}) and ACCO = (select SQKCOO From "+schema+".FE841003 where squkid = #{record.squkid}))");

            }
            //SET("SQEV02 = #{record.sqev02}");

            WHERE("Trim(SQUKID) = #{record.squkid}");

            return toString();
        }

        public String updateByan8(@Param("schema")String schema,@Param("record") Fe841003 record){
            UPDATE(schema+".FE841003");



            SET("SQFLAG = #{record.sqflag}");
            WHERE("SQAN8 = #{record.sqan8}");
            return toString();
        }
    }

    @UpdateProvider(type=SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") Fe841003 record);

    @UpdateProvider(type=SqlProvider.class, method="updateByan8")
    int updateByan8(@Param("schema")String schema,@Param("record") Fe841003 record);
}
