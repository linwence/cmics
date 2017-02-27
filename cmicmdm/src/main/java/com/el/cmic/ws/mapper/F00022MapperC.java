package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F00022;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2017/1/18.
 */
@Repository(value = "f00022MapperC")
public interface F00022MapperC {
    final class SqlProvider extends SQL{
        public String updateByKey(@Param("schema") String schema){
            UPDATE(schema+".F00022");
            SET("ukukid = ukukid+1");
            WHERE("trim(ukobnm)='FE84202B'");


            return toString();
        }
    }
    @UpdateProvider(type=SqlProvider.class, method="updateByKey")
    int updateByKey(@Param("schema") String schema);
}
