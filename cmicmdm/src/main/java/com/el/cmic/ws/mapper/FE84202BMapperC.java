package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe84202B;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2017/1/18.
 * "select",
 "ALUKIDP, ALUKID, ALKCOO, ALE8SPLX, ALAN8, ALDL01, ALAA02, ALD1, ALUPMT, ALUSER, ",
 "ALPID, ALUPMJ, ALTDAY, ALD2, ALD3, ALD4, ALD5, ALD6, ALECV1, ALECV2, ALECV3, ",
 "ALECV4, ALECV5, ALDL02, ALDL03, ALDL04, ALDL05, ALDL06, ALDL07, ALAB01, ALAB02, ",
 "ALTRATE01, ALTRATE02, ALBN01, ALBN02, ALBN03",
 "from CRPDTA.FE84202B"
 */
@Repository(value = "fE84202BMapperC")
public interface FE84202BMapperC {
    final class SqlProvider extends SQL{
        public String insertSelective(@Param("schema")String schema, @Param("record") Fe84202B record) {
            INSERT_INTO(schema+".Fe84202B");
            VALUES("ALUKIDP","(select (UKUKID+1) FROM "+schema+".F00022 where trim(ukobnm) = 'FE84202B')");
            if(record.getAlukid() != null){
                VALUES("ALUKID","#{record.alukid}");
            }
            if(record.getAlukid() != null){
                VALUES("ALKCOO","(select SQKCOO From "+schema+".Fe841001 where trim(squkidp) = #{record.alukid})");
            }
            if(record.getAlukid() != null){
                VALUES("ALE8SPLX","(select SQE8SPLX From "+schema+".Fe841001 where trim(squkidp) = #{record.alukid})");
            }
            if(record.getAlan8() != null){
                VALUES("ALAN8","#{record.alan8}");
            }
            if(record.getAle8spyj() != null){
                VALUES("ALE8SPYJ","#{record.ale8spyj}");
            }
            if(record.getAlaa02() != null){
                VALUES("ALAA02","#{record.alaa02}");
            }
            if(record.getAld1() !=null){
                VALUES("ALD1","#{record.ald1}");
            }
            if(record.getAlupmt() != null){
                VALUES("ALUPMT","#{record.alupmt}");
            }
            if(record.getAluser() != null){
                VALUES("ALUSER","#{record.aluser}");
            }
            if(record.getAlpid() != null){
                VALUES("ALPID","#{record.alpid}");
            }
            if(record.getAlupmj() != null){
                VALUES("ALUPMJ","#{record.alupmj}");
            }
            if(record.getAltday() != null){
                VALUES("ALTDAY","#{record.altday}");
            }
            if(record.getAlukid() != null){
                VALUES("ALDL01","' '");
                VALUES("ALD2","0");
                VALUES("ALD3","0");
                VALUES("ALD4","0");
                VALUES("ALD5","0");
                VALUES("ALD6","0");

                VALUES("ALECV1","0");
                VALUES("ALECV2","0");
                VALUES("ALECV3","0");
                VALUES("ALECV4","0");
                VALUES("ALECV5","0");

                VALUES("ALDL02","' '");
                VALUES("ALDL03","' '");
                VALUES("ALDL04","' '");
                VALUES("ALDL05","' '");
                VALUES("ALDL06","' '");
                VALUES("ALDL07","' '");

                VALUES("ALAB01","0");
                VALUES("ALAB02","0");

                VALUES("ALTRATE01","0");
                VALUES("ALTRATE02","0");

                VALUES("ALBN01","0");
                VALUES("ALBN02","0");
                VALUES("ALBN03","0");

            }

            return toString();
        }
    }

    @InsertProvider(type=SqlProvider.class, method="insertSelective")
    int insertSelective (@Param("schema")String schema, @Param("record") Fe84202B record);
}
