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
        public String updateFe84101(Fe84101 fe84101) {
            UPDATE("FE84101");
            if (!StringUtils.isEmpty(fe84101.getSpev01())) {
                SET("Spev01=#{spev01}");
            }
            if (!StringUtils.isEmpty(fe84101.getSpflag())) {
                SET("spflag=#{spflag}");
            }
            if(!StringUtils.isEmpty(fe84101.getSpe8sptym())){
                SET("SPE8SPTYM = #{spe8sptym}");
            }
            WHERE("trim(SPLITM)=#{splitm}");
            return toString();
        }

        public String updateF4101(F4101 f4101) {
            UPDATE("F4101");
            SET("IMAITM=#{imaitm}");
            WHERE("trim(imlitm)=#{imlitm}");
            return toString();
        }

        public String updateFe841001(Fe841001 fe841001) {
            UPDATE("FE841001");
            SET("SQFLAG=#{sqflag}");
            WHERE("trim(SQUKIDP)=#{squkidp}");
            return toString();
        }

        public String updateFe84101z(Fe84101z fe84101z){
            UPDATE("Fe84101z");
            SET("zzflag = #{zzflag}");
            WHERE("trim(zzco) = #{zzco}");
            WHERE("trim(zzlitm) = #{zzlitm}");

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
    int updateFe84101(Fe84101 fe84101);

    @UpdateProvider(type = SqlProvider.class, method = "updateF4101")
    int updateF4101(F4101 f4101);

    @UpdateProvider(type = SqlProvider.class, method = "updateFe841001")
    int updateFe841001(Fe841001 fe841001);

    @UpdateProvider(type = SqlProvider.class,method = "updateFe84101z")
    int updateFe84101z(Fe84101z fe84101z);

    @SelectProvider(type = SqlProvider.class,method = "selectcountP")
    int selectcountP(@Param("zzlitm")String zzlitm,@Param("schema")String schema);
}
