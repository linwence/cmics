package com.el.cmic.ws.mapper;


import com.el.cfg.domain.Fe84101z;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/9/29.
 */
@Repository(value = "fe84101ZUpdateByPKMapper")
public interface FE84101ZUpdateByPKMapper {
    final class SqlProvider extends SQL{
        public String updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") Fe84101z record, @Param("datatype") String datatype,@Param("dj")String dj) {

            UPDATE(schema+".FE84101Z");
          //  if(datatype.equals("E01")) {

            if(dj!=null)
                SET("ZZEXDJ = (SELECT TO_CHAR(TO_DATE(#{dj}, 'yyyy- mm-dd'), 'yyyy') * 1000 +TO_CHAR(TO_DATE(#{dj}, 'yyyy-mm- dd'), 'ddd ') - 1900000 FROM DUAL)");
  //-----------------------------------------------------------------------------------------------------------------------

            //    SET("ZZSELECT TO_CHAR(TO_DATE('2016-10-18', 'yyyy- mm-dd'), 'yyyy') * 1000 +TO_CHAR(TO_DATE('2016-10-18', 'yyyy-mm- dd'), 'ddd ') - 1900000 JULIAN FROM DUAL");
  //-----------------------------------------------------------------------------------------------------------------------

            if(record.getZze8zzlxa()!=null)
                SET("ZZE8ZZLXA = #{record.zze8zzlxa}");


   //         }
            WHERE("Trim(ZZLITM) = #{record.zzlitm}");
            WHERE("Trim(ZZE8ZZBM) = #{record.zze8zzbm}");
            WHERE("Trim(ZZCO) = #{record.zzco}");

            return toString();
        }
        public String insertSelective(@Param("schema")String schema,@Param("record") Fe84101z record,@Param("dj")String dj) {

            INSERT_INTO(schema+".FE84101Z");
            if(record.getZzco()!=null){
                VALUES("ZZCO","#{record.zzco}");

            }

            if (record.getZzlitm() != null) {
                VALUES("ZZLITM", "#{record.zzlitm}");
            }

            if (record.getZze8zzlxa() != null) {
                VALUES("ZZE8ZZLXA", "#{record.zze8zzlxa}");
            }

            if (record.getZze8zzbm() != null) {
                VALUES("ZZE8ZZBM", "#{record.zze8zzbm}");
            }


                VALUES("ZZEXDJ", "(SELECT TO_CHAR(TO_DATE(#{dj}, 'yyyy- mm-dd'), 'yyyy') * 1000 +TO_CHAR(TO_DATE(#{dj}, 'yyyy-mm- dd'), 'ddd ') - 1900000 FROM DUAL)");



            return toString();
        }
    }
;

    @UpdateProvider(type=SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@Param("schema")String schema,@Param("record") Fe84101z record, @Param("datatype") String datatype,@Param("dj")String dj);

    @InsertProvider(type=SqlProvider.class, method="insertSelective")
    int insertSelective(@Param("schema")String schema,@Param("record") Fe84101z record,@Param("dj")String dj);
}
