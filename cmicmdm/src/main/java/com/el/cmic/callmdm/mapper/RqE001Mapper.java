package com.el.cmic.callmdm.mapper;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.Fe841001;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84101z;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

/**
 * Created by Vincent on 2016/10/9.
 */
public interface RqE001Mapper {

    final class SqlProvider extends SQL {
        public String updateFe84101(@Param("fe84101") Fe84101 fe84101,@Param("schema") String schema) {
            UPDATE(schema+".FE84101");
            if (!StringUtils.isEmpty(fe84101.getSpev01())) {
                SET("Spev01=#{fe84101.spev01}");
            }
            if (!StringUtils.isEmpty(fe84101.getSpflag())) {
                SET("spflag=#{fe84101.spflag}");
            }
            if(!StringUtils.isEmpty(fe84101.getSpe8sptym())){
                SET("SPE8SPTYM = #{fe84101.spe8sptym}");
            }
            WHERE("trim(SPLITM)=#{fe84101.splitm}");
            return toString();
        }

        public String updateF4101(@Param("f4101") F4101 f4101,@Param("schema") String schema) {
            UPDATE(schema+".F4101");
            SET("IMAITM=#{f4101.imaitm}");
            WHERE("trim(imlitm)=#{f4101.imlitm}");
            return toString();
        }

        public String updateFe841001(@Param("fe841001") Fe841001 fe841001,@Param("schema") String schema) {
            UPDATE(schema+".FE841001");
            SET("SQFLAG=#{fe841001.sqflag}");
            WHERE("trim(SQUKIDP)=#{fe841001.squkidp}");
            return toString();
        }

        public String updateFe84101z(@Param("fe84101z") Fe84101z fe84101z,@Param("schema") String schema){
            UPDATE(schema+".Fe84101z");
            SET("zzflag = #{fe841001.zzflag}");
            WHERE("trim(zzco) = #{fe841001.zzco}");
            WHERE("trim(zzlitm) = #{fe841001.zzlitm}");

            return toString();
        }
        public String selectcountP(@Param("zzlitm")String zzlitm,@Param("schema")String schema){
            SELECT("count(1)");
            FROM(schema+".Fe84101z");
            //WHERE("trim(zzco) = #{zzco}");
            WHERE("trim(zzlitm) = #{zzlitm}");
            WHERE("trim(zzflag) = 'P'");
            return toString();
        }

    }

    @UpdateProvider(type = SqlProvider.class, method = "updateFe84101")
    int updateFe84101(@Param("fe84101") Fe84101 fe84101,@Param("schema") String schema);

    @UpdateProvider(type = SqlProvider.class, method = "updateF4101")
    int updateF4101(@Param("f4101") F4101 f4101,@Param("schema") String schema);

    @UpdateProvider(type = SqlProvider.class, method = "updateFe841001")
    int updateFe841001(@Param("fe841001") Fe841001 fe841001,@Param("schema") String schema);

    @UpdateProvider(type = SqlProvider.class,method = "updateFe84101z")
    int updateFe84101z(@Param("fe84101z") Fe84101z fe84101z,@Param("schema") String schema);

    @SelectProvider(type = SqlProvider.class,method = "selectcountP")
    int selectcountP(@Param("zzlitm")String zzlitm,@Param("schema")String schema);
}
