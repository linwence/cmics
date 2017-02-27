package com.el.cmic.mapper.goods;

import com.el.cmic.domain.goods.Fe8nt001;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Vincent on 2017/2/14.
 */
public interface ProductMapper {
    final String UPMJ = "(SELECT TO_CHAR(sysdate, 'yyyy') * 1000 + TO_CHAR(sysdate, 'ddd ') - 1900000 JULIAN  FROM DUAL)";
    final String TDAY = "(select to_char(sysdate, 'HH24')*10000+to_char(sysdate, 'mi')*100+to_char(sysdate, 'ss') from dual)";

    @Select({"select spaitm,sprdate,spidate " +
            " from ${tableSchema}.FE8NT001 " +
            " where spaitm=#{litm}"})
    @Results({
            @Result(column = "spaitm", property = "spaitm",jdbcType = JdbcType.NCHAR),
            @Result(column = "sprdate",property = "sprdate",jdbcType = JdbcType.DATE),
            @Result(column = "spidate",property = "spidate",jdbcType = JdbcType.DATE)
    })
    public Fe8nt001 selectFe8nt001ByLitm(String litm);

    final class SqlProvider extends SQL {
        public String insertFe8nt001(@Param("tableSchema") String tableSchema, @Param("fe8nt001") Fe8nt001 fe8nt001) {
            INSERT_INTO("fe8nt001");
            VALUES("spaitm", "#{fe8nt001.spaitm}");
            VALUES("splitm", "' '");
            VALUES("spitm", "0");
            VALUES("spdsc1", "#{fe8nt001.spdsc1}");
            VALUES("spdsc2", "#{fe8nt001.spdsc2}");
            VALUES("spe8tym", "#{fe8nt001.spe8tym}");
            VALUES("spuom1", "#{fe8nt001.spuom1}");
            VALUES("spdl01", "#{fe8nt001.spdl01}");
            VALUES("spglpt", "#{fe8nt001.spglpt}");
            VALUES("spdl02", "#{fe8nt001.spdl02}");
            VALUES("spmmcu", "' '");
            VALUES("span8", "0");
            VALUES("spe8name", "#{fe8nt001.spe8name}");
            VALUES("sporig", "#{fe8nt001.sporig}");
            VALUES("spe8fxdj", "#{fe8nt001.spe8fxdj}");
            VALUES("spdl03", "#{fe8nt001.spdl03}");
            VALUES("spe8cctj", "#{fe8nt001.spe8cctj}");
            VALUES("spdl04", "#{fe8nt001.spdl04}");
            VALUES("spe8qtcc", "#{fe8nt001.spe8qtcc}");
            VALUES("spe8xlhgl", "#{fe8nt001.spe8xlhgl}");
            VALUES("spe8zdyh", "#{fe8nt001.spe8zdyh}");
            VALUES("spe8yhzq", "#{fe8nt001.spe8yhzq}");
            VALUES("spe8cpfl", "#{fe8nt001.spe8cpfl}");
            VALUES("spe8zzlxa", "#{fe8nt001.spe8zzlxa}");
            VALUES("spe8zzbm", "#{fe8nt001.spe8zzbm}");
            VALUES("speftj", "#{fe8nt001.speftj}");
            VALUES("spexdj", "#{fe8nt001.spexdj}");
            VALUES("spe8path", "#{fe8nt001.spe8path}");
            VALUES("spir01", "#{fe8nt001.spir01}");
            VALUES("spir02", "#{fe8nt001.spir02}");
            VALUES("spir03", "#{fe8nt001.spir03}");
            VALUES("spir04", "#{fe8nt001.spir04}");
            VALUES("spir05", "#{fe8nt001.spir05}");
            VALUES("sphrb", "#{fe8nt001.sphrb}");
            VALUES("sppsal", "#{fe8nt001.sppsal}");
            VALUES("spipay", "#{fe8nt001.spipay}");
            VALUES("sptdsc", "#{fe8nt001.sptdsc}");
            VALUES("spefhr", "#{fe8nt001.spefhr}");
            VALUES("spcrtj", "#{fe8nt001.spcrtj}");
            VALUES("spdivj", "#{fe8nt001.spdivj}");
            VALUES("spafdj", "#{fe8nt001.spafdj}");
            VALUES("spckdt", "#{fe8nt001.spckdt}");
            VALUES("spflag", "#{fe8nt001.status}");
            VALUES("SPIDATE", "#{fe8nt001.spidate}");
            VALUES("SPRDATE", "#{fe8nt001.sprdate}");

            VALUES("spuser", "'NT'");
            VALUES("spupmj", UPMJ);
            VALUES("sptday", TDAY);
            VALUES("sppid", "'Interface'");
            VALUES("spjobn", "'Server'");
            VALUES("spurcd", "' '");
            VALUES("spurdt", "0");
            VALUES("spurat", "0");
            VALUES("spurab", "0");
            VALUES("spurrf", "' '");

            VALUES("spedsp", "'N'");
            VALUES("spev01", "' '");
            VALUES("spev02", "' '");
            VALUES("spev03", "' '");

            return toString();
        }

        public String updateFe8nt001(@Param("tableSchema") String tableSchema, @Param("fe8nt001") Fe8nt001 fe8nt001) {
            UPDATE(tableSchema + ".Fe8nt001");
            SET("spdsc1=#{fe8nt001.spdsc1}");
            SET("spdsc2=#{fe8nt001.spdsc2}");
            SET("spe8tym=#{fe8nt001.spe8tym}");
            SET("spuom1=#{fe8nt001.spuom1}");
            SET("spdl01=#{fe8nt001.spdl01}");
            SET("spglpt=#{fe8nt001.spglpt}");
            SET("spdl02=#{fe8nt001.spdl02}");
            SET("spe8name={fe8nt001.spe8name}");
            SET("sporig=#{fe8nt001.sporig}");
            SET("spe8fxdj=#{fe8nt001.spe8fxdj}");
            SET("spdl03=#{fe8nt001.spdl03}");
            SET("spe8cctj=#{fe8nt001.spe8cctj}");
            SET("spdl04=#{fe8nt001.spdl04}");
            SET("spe8qtcc=#{fe8nt001.spe8qtcc}");
            SET("spe8xlhgl=#{fe8nt001.spe8xlhgl}");
            SET("spe8zdyh=#{fe8nt001.spe8zdyh}");
            SET("spe8yhzq=#{fe8nt001.spe8yhzq}");
            SET("spe8cpfl=#{fe8nt001.spe8cpfl}");
            SET("spe8zzlxa=#{fe8nt001.spe8zzlxa}");
            SET("spe8zzbm=#{fe8nt001.spe8zzbm}");
            SET("speftj=#{fe8nt001.speftj}");
            SET("spexdj=#{fe8nt001.spexdj}");
            SET("spe8path=#{fe8nt001.spe8path}");
            SET("spir01=#{fe8nt001.spir01}");
            SET("spir02=#{fe8nt001.spir02}");
            SET("spir03=#{fe8nt001.spir03}");
            SET("spir04=#{fe8nt001.spir04}");
            SET("spir05=#{fe8nt001.spir05}");
            SET("sphrb=#{fe8nt001.sphrb}");
            SET("sppsal=#{fe8nt001.sppsal}");
            SET("spipay=#{fe8nt001.spipay}");
            SET("sptdsc=#{fe8nt001.sptdsc}");
            SET("spefhr=#{fe8nt001.spefhr}");
            SET("spcrtj=#{fe8nt001.spcrtj}");
            SET("spdivj=#{fe8nt001.spdivj}");
            SET("spafdj=#{fe8nt001.spafdj}");
            SET("spckdt=#{fe8nt001.spckdt}");
            SET("spflag=#{fe8nt001.status}");
            SET("SPIDATE=#{fe8nt001.spidate}");
            SET("SPRDATE=#{fe8nt001.sprdate}");
            SET("spupmj=" + UPMJ);
            SET("sptday=" + TDAY);
            // SET("spmmcu=' '");
            //  SET("span8=0");
            WHERE("spaitm=#{fe8nt001.spaitm}");

            //VALUES("splitm", "' '");
            //VALUES("spitm", "0");
         /*   VALUES("spuser", "'NT'");
            VALUES("spupmj", UPMJ);
            VALUES("sptday", TDAY);
            VALUES("sppid", "'Interface'");
            VALUES("spjobn", "'Server'");
            VALUES("spurcd", "' '");
            VALUES("spurdt", "0");
            VALUES("spurat", "0");
            VALUES("spurab", "0");
            VALUES("spurrf", "' '");

            VALUES("spedsp", "'N'");
            VALUES("spev01", "' '");
            VALUES("spev02", "' '");
            VALUES("spev03", "' '");*/
            return toString();
        }
    }

    @InsertProvider(type = SqlProvider.class, method = "insertFe8nt001")
    public int insertFe8nt001(@Param("tableSchema") String tableSchema, @Param("fe8nt001") Fe8nt001 fe8nt001);

    @UpdateProvider(type = SqlProvider.class, method = "updateFe8nt001")
    public int updateFe8nt001(@Param("tableSchema") String tableSchema, @Param("fe8nt001") Fe8nt001 fe8nt001);
}
