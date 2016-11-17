package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe80101;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by king_ on 2016/10/8.
 */
@Repository(value = "fe80101UpdateByPKMapper")
public interface FE80101UpdateByPKMapper {

    final class SqlProvider extends SQL {
        public String updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") Fe80101 record,@Param("datatype") String datatype){


            UPDATE(schema+".FE80101");
            if(datatype.equals("M01")){
                SET("KSEV01 = #{record.ksev01}");
                SET("KSE8NAME = #{record.kse8name}");
                SET("KSE8SCXKZ = #{record.kse8scxkz}");
                //VALUES("KSE8SCXKZ", "#{record.kse8scxkz}");
            }
            if(datatype.equals("E01")) {
                SET("KSE8SCXKZ = #{record.kse8scxkz}");
                SET("KSE8CP = #{record.kse8cp}");
                //VALUES("KSE8SCXKZ", "#{record.kse8scxkz}");
            }

            if(datatype.equals("C01")){
                if(record.getKsev01()!=null) {
                    SET("KSEV01 = #{record.ksev01}");
                }
                if(record.getKse8name()!=null)
                SET("KSE8NAME = #{record.kse8name}");
                if(record.getKse8scs()!=null)
                SET("KSE8SCS = #{record.kse8scs}");
                if(record.getKse8jxs()!=null)
                SET("KSE8JXS = #{record.kse8jxs}");
                if(record.getKse8jks()!=null)
                SET("KSE8JKS = #{record.kse8jks}");
                if(record.getKse8yy()!=null)
                SET("KSE8YY = #{record.kse8yy}");
                if(record.getKse8yljg()!=null)
                SET("KSE8YLJG = #{record.kse8yljg}");
                if(record.getKse8gr()!=null)
                SET("KSE8GR = #{record.kse8gr}");
                if(record.getKse8qt()!=null)
                SET("KSE8QT = #{record.kse8qt}");
                if(record.getKse8yyyl()!=null)
                SET("KSE8YYYL = #{record.kse8yyyl}");
                if(record.getKse8yygl()!=null)
                SET("KSE8YYGL = #{record.kse8yygl}");
                if(record.getKse8yysb()!=null)
                SET("KSE8YYSB = #{record.kse8yysb}");
                if(record.getKse8yygs()!=null)
                SET("KSE8YYGS = #{record.kse8yygs}");
                if(record.getKse8yljb()!=null)
                SET("KSE8YLJB = #{record.kse8yljb}");
                if(record.getKse8tgyf()!=null)
                SET("KSE8TGYF = #{record.kse8tgyf}");
                if(record.getKse8dl()!=null)
                SET("KSE8DL = #{record.kse8dl}");
                if(record.getKse8xl()!=null)
                SET("KSE8XL = #{record.kse8xl}");
                if(record.getKse8yynsr()!=null)
                SET("KSE8YYNSR = #{record.kse8yynsr}");
                if(record.getKse8sfz()!=null)
                SET("KSE8SFZ = #{record.kse8sfz}");

                if(record.getKse8dwxz()!=null){
                    SET("KSE8DWXZ = #{record.kse8dwxz}");
                }
                if(record.getKse8kstym()!=null){
                    SET("KSE8KSTYM = #{record.kse8kstym}");
                }

            }

            if(datatype.equals("C011")){
                SET("KSE8JYCS = #{record.kse8jycs}");
                SET("KSE8CKDZ = #{record.kse8ckdz}");
                SET("KSE8FR = #{record.kse8fr}");
                SET("KSE8QYFZR = #{record.kse8qyfzr}");
                SET("KSE8YWLXR = #{record.kse8ywlxr}");

            }
            if(datatype.equals("MEGC")){
                //SET("KSAITM = #{record.ksaitm}");
                SET("KSe8str200 = concat(concat(trim(KSe8str200),';'),#{record.kse8str200})");
                SET("KSE8KSTYM = #{record.kse8kstym}");
            }
            if(datatype.equals("UMEGC")){

                SET("KSe8str200 = #{record.kse8str200}");
                SET("KSE8KSTYM = #{record.kse8kstym}");
            }

            if(datatype.equals("SELC")){
                SET("KSE8SFFC = #{record.kse8sffc}");
            }
            if(datatype.equals("S")){
                SET("KSFLAG = #{record.ksflag}");
            }
            WHERE("Trim(KSAN8) = #{record.ksan8}");


            return toString();
        }
    }

    @UpdateProvider(type=SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") Fe80101 record,@Param("datatype") String datatype);

}
