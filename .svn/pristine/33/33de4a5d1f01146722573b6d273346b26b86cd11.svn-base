package com.el.cmic.ws.mapper;

import com.el.cfg.domain.F0116;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/11.
 */
@Repository(value = "f0116UpdateByAn8Mapper")
public interface F0116UpdateByAn8Mapper {
    final class SqlProvider extends SQL {
        public String updateByAn8(@Param("schema")String schema,@Param("record") F0116 record, @Param("datatype") String datatype){

            UPDATE(schema+".F0116");

            if(datatype.equals("C01")){
                SET("ALCTR = #{record.alctr}");
                if(record.getAladds()!=null) {


                    SET("ALADDS = #{record.aladds}");
                }
                if(record.getAlcty1()!=null) {
                    SET("ALCTY1 = #{record.alcty1}");
                }
                if(record.getAlcoun()!=null){
                    SET("ALCOUN = #{record.alcoun}");

                }

                SET("ALADD1 = #{record.aladd1}");
                SET("ALADD2 = #{record.aladd2}");
                SET("ALADD3 = #{record.aladd3}");
                SET("ALADD4 = #{record.aladd4}");
            }


            WHERE("Trim(ALAN8) = #{record.alan8}");


            return toString();
        }

    }

    @UpdateProvider(type=SqlProvider.class, method="updateByAn8")
    int updateByAn8(@Param("schema")String schema,@Param("record") F0116 record, @Param("datatype") String datatype);
}
