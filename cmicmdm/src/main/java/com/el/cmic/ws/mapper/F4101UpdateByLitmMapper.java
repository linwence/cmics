package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F4101;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/9/29.
 */
@Repository(value = "f4101UpdateByLitmMapper")
public interface F4101UpdateByLitmMapper {
    final class SqlProvider extends SQL{
        public String updateByLitmSelective(@Param("schema")String schema,@Param("record") F4101 record, @Param("datatype") String datatype){


            UPDATE(schema+".F4101");
           // SET("IMAITM = #{record.imaitm}");
            if(!datatype.equals("E04")) {
                SET("IMDSC1 = #{record.imdsc1}");
                //SET("IMDSC2 = #{record.imdsc2}");
                if(!datatype.equals("E03")){
                    SET("IMUOM1 = #{record.imuom1}");
                }
            }

            //String a =toString();


            WHERE("Trim(IMLITM) = #{record.imlitm}");

            return toString();
        }
        public String updateByAitm(@Param("schema")String schema,@Param("faitm") String faitm,@Param("aaitm") String aaitm,@Param("datatype") String datatype){
            UPDATE(schema+".F4101");
            //SET("IMAITM = #{aaitm}");
            WHERE("Trim(IMAITM) = #{faitm}");
            return toString();

        }

    }

    @UpdateProvider(type=SqlProvider.class, method="updateByAitm")
    int updateByAitm(@Param("schema")String schema,@Param("faitm") String faitm,@Param("aaitm") String aaitm,@Param("datatype") String datatype);

    @UpdateProvider(type=SqlProvider.class, method="updateByLitmSelective")
    int updateByLitmSelective(@Param("schema")String schema,@Param("record") F4101 record, @Param("datatype") String datatype);


}
