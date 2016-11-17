package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe80101;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by king_ on 2016/10/8.
 */
public class FE80101UpdateByPKSqlProvider {
    public String updateByPrimaryKeySelective(@Param("record") Fe80101 record, @Param("datatype") String datatype) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.FE80101");
        if(datatype.equals("M01")){
            sql.SET("KSEV01 = #{record.ksev01}");
            sql.SET("KSE8NAME = #{record.kse8name}");
            sql.VALUES("KSE8SCXKZ", "#{record.kse8scxkz}");
        }
        if(datatype.equals("E01")) {
            sql.VALUES("KSE8SCXKZ", "#{record.kse8scxkz}");
        }

        if(datatype.equals("C01")){
            sql.SET("KSEV01 = #{record.ksev01}");
            sql.SET("KSE8NAME = #{record.kse8name}");
            sql.SET("KSE8SCS = #{record.kse8scs}");
            sql.SET("KSE8JXS = #{record.kse8jxs}");
            sql.SET("KSE8JKS = #{record.kse8jks}");
            sql.SET("KSE8YY = #{record.kse8yy}");
            sql.SET("KSE8YLJG = #{record.kse8yljg}");
            sql.SET("KSE8GR = #{record.kse8gr}");
            sql.SET("KSE8QT = #{record.kse8qt}");
            sql.SET("KSE8YYYL = #{record.kse8yyyl}");
            sql.SET("KSE8YYGL = #{record.kse8yygl}");
            sql.SET("KSE8YYSB = #{record.kse8yysb}");
            sql.SET("KSE8YYGS = #{record.kse8yygs}");
            sql.SET("KSE8YLJB = #{record.kse8yljb}");
            sql.SET("KSE8TGYF = #{record.kse8tgyf");
            sql.SET("KSE8DL = #{record.kse8dl}");
            sql.SET("KSE8XL = #{record.kse8xl}");
            sql.SET("KSE8YYNSR = #{record.kse8yynsr}");
            sql.SET("KSE8SFZ = #{record.kse8sfz}");
            sql.SET("KSE8DWXZ = #{record.kse8dwxz}");

        }

        if(datatype.equals("C011")){
            sql.SET("KSE8JYCS = #{kse8jycs}");
            sql.SET("KSE8CKDZ = #{kse8ckdz");
            sql.SET("KSE8FR = #{kse8fr");
            sql.SET("KSE8QYFZR = #{kse8qyfzr}");
            sql.SET("KSE8YWLXR = #{kse8ywlxr}");

        }
        sql.WHERE("KSAN8 = #{record.ksan8}");

        return sql.toString();
    }
}
