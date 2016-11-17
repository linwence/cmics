package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F0101;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/9/29.
 */
@Repository(value = "f0101UpdateByPKMapper")
public interface F0101UpdateByPKMapper {
    final class SqlProvider extends SQL{
        public String updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") F0101 record, @Param("datatype") String datatype){


           UPDATE(schema+".F0101");

            if (datatype.equals("E01")) {
                SET("ABAC28 = #{record.abac28}");
            }
            if(datatype.equals("UMEGC")) {
                SET("ABALKY = #{record.abalky}");
            }
            if(datatype.equals("M01")){
                SET("ABALKY = #{record.abalky}");
             //   SET("ABAC28 = #{record.abac28}");
            }

            WHERE("Trim(ABAN8) = #{record.aban8}");


            return toString();
        }
        public String updateByAlky(@Param("schema")String schema,@Param("falky") String falky,@Param("aalky") String aalky,@Param("datatype") String datatype){
            UPDATE(schema+".F4101");
            SET("ABALKY = #{aalky}");
            WHERE("Trim(ABALKY) = #{falky}");
            return toString();

        }
    }

    @UpdateProvider(type=SqlProvider.class, method="updateByAlky")
    int updateByAlky (@Param("schema")String schema,@Param("falky") String falky,@Param("aalky") String aalky,@Param("datatype") String datatype);

    @UpdateProvider(type=SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") F0101 record, @Param("datatype") String datatype);
}
