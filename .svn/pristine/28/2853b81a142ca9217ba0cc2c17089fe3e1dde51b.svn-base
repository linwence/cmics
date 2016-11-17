package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F4104;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/8.
 */
@Repository(value = "f4104UpdateByLitmMapper")
public interface F4104UpdateByLitmMapper {
    final class SqlProvider extends SQL{
        public String updateByPrimaryKeySelective(@Param("schema")String schema, @Param("record") F4104 record){


            UPDATE(schema+".F4104");



            SET("IVCITM = #{record.ivcitm}");

            WHERE("Trim(IVLITM) = #{record.ivlitm}");
            WHERE("Trim(IVXRT) = #{record.ivxrt}");




            return toString();
        }
    }

    @UpdateProvider(type=SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") F4104 record);
}
