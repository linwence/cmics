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



            WHERE("Trim(SQUKID) = #{record.squkid}");

            return toString();
        }
    }

    @UpdateProvider(type=SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") Fe841003 record);
}
