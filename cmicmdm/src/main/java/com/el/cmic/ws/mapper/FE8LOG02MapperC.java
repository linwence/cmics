package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe8log02;
import org.apache.ibatis.annotations.InsertProvider;
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
        public String insertFe8log02(Fe8log02 fe8log02){
            INSERT_INTO("FE8Log02");

            if (fe8log02.getLgukid() != null) {
                VALUES("lgukid", "#{lgukid}");
            }
            if(fe8log02.getLglitm() !=null){
                VALUES("lglitm","#{lglitm}");
            }



            if (fe8log02.getLgdl01() != null) {
                VALUES("lgdl01", "#{lgdl01}");
            }
            if (fe8log02.getLgdl02() != null) {
                VALUES("lgdl02", "#{lgdl02}");
            }
            if (fe8log02.getLgdl03() != null) {
                VALUES("lgdl03", "#{lgdl03}");
            }
            if (fe8log02.getLgdl04() != null) {
                VALUES("lgdl04", "#{lgdl04}");
            }

            if (fe8log02.getLgdl010() != null) {
                VALUES("lgdl010", "#{lgdl010}");
            }


            if (fe8log02.getLgvar1() != null) {
                VALUES("lgvar1", "#{lgvar1}");
            }

            if (fe8log02.getLgupmj() != null) {
                VALUES("lgupmj", "#{lgupmj}");
            }
            if (fe8log02.getLgupmt() != null) {
                VALUES("lgupmt", "#{lgupmt}");
            }
            if (fe8log02.getLgidate() != null) {
                VALUES("lgidate", "#{lgidate}");
            }





            return  toString();
        }


    }


    @InsertProvider(type = SqlProvider.class, method = "insertFe8log02")
    @SelectKey(statement = "SELECT FE8LOG02_SEQ.NEXTVAL FROM DUAL", keyProperty = "lgukid", resultType = BigDecimal.class, before = true)

    int insert(Fe8log02 fe8log02);
}
