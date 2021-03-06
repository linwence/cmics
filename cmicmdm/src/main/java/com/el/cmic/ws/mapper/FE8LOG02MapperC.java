package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe8log02;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by king_ on 2016/10/20.
 */
@Repository(value = "fe8LOG02MapperC")
public interface FE8LOG02MapperC {
    final class SqlProvider extends SQL{
        public String insertFe8log02(@Param("fe8log02") Fe8log02 fe8log02,@Param("schema")String schema){
            INSERT_INTO(schema+".FE8Log02");

            if (fe8log02.getLgukid() != null) {
                VALUES("lgukid", "#{fe8log02.lgukid}");
            }
            if(fe8log02.getLglitm() !=null){
                VALUES("lglitm","#{fe8log02.lglitm}");
            }



            if (fe8log02.getLgdl01() != null) {
                VALUES("lgdl01", "#{fe8log02.lgdl01}");
            }
            if (fe8log02.getLgdl02() != null) {
                VALUES("lgdl02", "#{fe8log02.lgdl02}");
            }
            if (fe8log02.getLgdl03() != null) {
                VALUES("lgdl03", "#{fe8log02.lgdl03}");
            }
            if (fe8log02.getLgdl04() != null) {
                VALUES("lgdl04", "#{fe8log02.lgdl04}");
            }

            if (fe8log02.getLgdl010() != null) {
                VALUES("lgdl010", "#{fe8log02.lgdl010}");
            }


            if (fe8log02.getLgvar1() != null) {
                VALUES("lgvar1", "#{fe8log02.lgvar1}");
            }

            if (fe8log02.getLgupmj() != null) {
                VALUES("lgupmj", "#{fe8log02.lgupmj}");
            }
            if (fe8log02.getLgupmt() != null) {
                VALUES("lgupmt", "#{fe8log02.lgupmt}");
            }
            if (fe8log02.getLgidate() != null) {
                VALUES("lgidate", "#{fe8log02.lgidate}");
            }





            return  toString();
        }


    }


    @InsertProvider(type = SqlProvider.class, method = "insertFe8log02")
    @SelectKey(statement = "SELECT ${tableSchema}.FE8LOG02_SEQ.NEXTVAL FROM DUAL", keyProperty = "fe8log02.lgukid", resultType = BigDecimal.class, before = true)

    int insert(@Param("fe8log02") Fe8log02 fe8log02,@Param("schema")String schema);
}
