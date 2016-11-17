package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe841005;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/13.
 */
@Repository(value = "fe841005UpdateByUkidpMapper")
public interface FE841005UpdateByUkidpMapper {
    final class SqlProvider extends SQL{
        public String updateByUpidp(@Param("schema")String schema,@Param("record") Fe841005 record){

            UPDATE(schema+".FE841005");


            SET("SCFLAG = #{record.scflag}");


            WHERE("Trim(SCUKIDP) = #{record.scukidp}");
            return toString();
        }
    }
    @UpdateProvider(type=SqlProvider.class, method="updateByUpidp")
    int updateByUkidp(@Param("schema")String schema,@Param("record") Fe841005 record);
}
