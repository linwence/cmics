package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe80101z;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/11.
 */
@Repository(value = "fe80101ZUpdateByE8ZZBMMapper")
public interface FE80101ZUpdateByE8ZZBMMapper {

    final class SqlProvider extends SQL{
        public String updateByE8ZZBM (@Param("schema")String schema,@Param("record") Fe80101z record, @Param("datatype") String datatype,@Param("dj") String dj){


            UPDATE(schema+".FE80101Z");
            if(datatype.equals("C01")){
                SET("ZZE8ZZLXA = #{record.zze8zzlxa}");
                SET("ZZE8JYFW = #{record.zze8jyfw}");
                SET("ZZEXDJ = (SELECT TO_CHAR(TO_DATE(#{dj}, 'yyyy- mm-dd'), 'yyyy') * 1000 +TO_CHAR(TO_DATE(#{dj}, 'yyyy-mm- dd'), 'ddd ') - 1900000 FROM DUAL)");

            }
            if(record.getZzfil2()!=null){
                SET("ZZFIL2 = #{record.zzfil2}");
            }

            WHERE("Trim(ZZE8ZZBM) = #{record.zze8zzbm}");
            WHERE("Trim(ZZAN8) = #{record.zzan8}");


            return toString();
        }
        public String insertSelective(@Param("schema")String schema,@Param("record") Fe80101z record,@Param("dj") String dj){


            INSERT_INTO(schema+".FE80101Z");

            if (record.getZzan8() != null) {
                VALUES("ZZAN8", "#{record.zzan8}");
            }

            if (record.getZze8zzlxa() != null) {
                VALUES("ZZE8ZZLXA", "#{record.zze8zzlxa}");
            }

            if (record.getZze8zzbm() != null) {
                VALUES("ZZE8ZZBM", "#{record.zze8zzbm}");
            }

            if (record.getZzexdj() != null) {
                VALUES("ZZEXDJ", "(SELECT TO_CHAR(TO_DATE(#{dj}, 'yyyy- mm-dd'), 'yyyy') * 1000 +TO_CHAR(TO_DATE(#{dj}, 'yyyy-mm- dd'), 'ddd ') - 1900000 FROM DUAL)");
            }

            if (record.getZze8jyfw() != null) {
                VALUES("ZZE8JYFW", "#{record.zze8jyfw}");
            }

            if(record.getZzfil2()!=null){
                VALUES("ZZFIL2","#{record.zzfil2}");

            }
            return toString();


        }

    }

    @UpdateProvider(type=SqlProvider.class, method="updateByE8ZZBM")
    int updateByE8ZZBM(@Param("schema")String schema,@Param("record") Fe80101z record, @Param("datatype") String datatype,@Param("dj") String dj);

    @Select({
            "select",
            "count(1)",
            "from CRPDTA.FE80101Z",
            "where  trim(ZZE8ZZBM) = #{zze8zzbm}"
    })
    int selectByPrimaryKey(String zze8zzbm);

    @InsertProvider(type=SqlProvider.class, method="insertSelective")
    int insertSelective(@Param("schema")String schema,@Param("record") Fe80101z record,@Param("dj") String dj);
}
