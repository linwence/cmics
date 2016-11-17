package com.el.cmic.ws.mapper;


import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/9.
 */
@Repository(value = "fe84101ZSelectByE8ZZBM")

public interface FE84101ZSelectByE8ZZBM {
    final class SqlProvider extends SQL{
        public String Fe84101zselect(@Param("schema") String schema,@Param("litm")String litm,@Param("e8zzbm")String e8zzbm,@Param("co")String co){
            SELECT("count(1)");
            FROM(schema+".FE84101Z");
            WHERE("Trim(zzlitm)=#{litm}");
            WHERE("Trim(zze8zzbm)=#{e8zzbm}");
            WHERE("Trim(zzco)=#{co}");
            return toString();
        }
    }
   @SelectProvider(type = SqlProvider.class,method = "Fe84101zselect")
    int Fe84101zselect(@Param("schema") String schema,@Param("litm")String litm,@Param("e8zzbm")String e8zzbm,@Param("co")String co);
}
