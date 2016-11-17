package com.el.cmic.ws.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

/**
 * Created by king_ on 2016/10/30.
 */
@Repository(value = "f00165MapperCustom")
public interface F00165MapperCustom {
    final class SqlProvider extends SQL{
        public String UpdateA(@Param("schema")String schema,@Param("filename")String filename,
                              @Param("filename2")String filename2,@Param("filepath") String filepath,
                              @Param("gdtxky")String gdtxky){
            UPDATE(schema+".F00165");
            SET("GDGTITBN = #{filename2}");
            SET("GDGTFILENM = #{filename}");
            WHERE("Trim(GDGTMOTYPE)=5");
            WHERE("Trim(GDOBNM)=GTE842001");
            WHERE("Trim(GDTXKY)=#{gdtxky}");
            return null;

        }

    }
    @UpdateProvider(type=SqlProvider.class, method="UpdateA")
    int updateByPrimaryKeySelective(@Param("schema")String schema,@Param("filename")String filename,
                                    @Param("filename2")String filename2,@Param("filepath") String filepath,
                                    @Param("gdtxky")String gdtxky);
}
