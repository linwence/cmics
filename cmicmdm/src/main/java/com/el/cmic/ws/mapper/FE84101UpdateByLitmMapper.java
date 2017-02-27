//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe84101;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe84101UpdateByLitmMapper")
public interface FE84101UpdateByLitmMapper {
    @UpdateProvider(
            type = FE84101UpdateByLitmMapper.SqlProvider.class,
            method = "updateByLitmSelective"
    )
    int updateByLitmSelective(@Param("schema") String var1, @Param("record") Fe84101 var2, @Param("datatype") String var3);

    @UpdateProvider(
            type = FE84101UpdateByLitmMapper.SqlProvider.class,
            method = "updatesametym"
    )
    int updatesametym(@Param("schema") String var1, @Param("e8lsm") String var2, @Param("e8tym") String var3);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String updateByLitmSelective(@Param("schema") String schema, @Param("record") Fe84101 record, @Param("datatype") String datatype) {
            this.UPDATE(schema + ".FE84101");
            if(datatype.equals("E01")) {
                if(record.getSpe8yyks() != null) {
                    this.SET("SPE8YYKS = #{record.spe8yyks}");
                }

                if(record.getSpev01() != null) {
                    this.SET("SPEV01 = #{record.spev01}");
                }

                if(record.getSpe8name() != null) {
                    this.SET("SPE8NAME = #{record.spe8name}");
                }

                if(record.getSpan8() != null) {
                    ;
                }

                if(record.getSpe8pzwh() != null) {
                    this.SET("SPE8PZWH = #{record.spe8pzwh}");
                }

                if(record.getSporig() != null) {
                    this.SET("SPORIG = #{record.sporig}");
                }

                if(record.getSpe8fxdj() != null) {
                    this.SET("SPE8FXDJ = #{record.spe8fxdj}");
                }

                if(record.getSpe8cctj() != null) {
                    this.SET("SPE8CCTJ = #{record.spe8cctj}");
                }

                if(record.getSpe8qtcc() != null) {
                    this.SET("SPE8QTCC = #{record.spe8qtcc}");
                }

                if(record.getSpe8jgg() != null) {
                    this.SET("SPE8JGG = #{record.spe8jgg}");
                }

                if(record.getSpe8cpdl() != null) {
                    this.SET("SPE8CPDL = #{record.spe8cpdl}");
                }

                if(record.getSpe8tsfl() != null) {
                    this.SET("SPE8TSFL = #{record.spe8tsfl}");
                }

                if(record.getSpe8cpfl() != null) {
                    this.SET("SPE8CPFL = #{record.spe8cpfl}");
                }

                if(record.getSpe8sptym() != null) {
                    this.SET("SPE8SPTYM = #{record.spe8sptym}");
                }

                if(record.getSpe8dsc2() != null) {
                    this.SET("SPE8DSC2 = #{record.spe8dsc2}");
                }
            }

            if(datatype.equals("E02")) {
                this.SET("SPEV01 = #{record.spev01}");
                this.SET("SPE8NAME = #{record.spe8name}");
                this.SET("SPE8PZWH = #{record.spe8pzwh}");
                if(record.getSpe8zdyl() != null) {
                    this.SET("SPE8ZDYL = #{record.spe8zdyl}");
                }

                if(record.getSpe8fxdj() != null) {
                    this.SET("SPE8FXDJ = #{record.spe8fxdj}");
                }

                if(record.getSpe8cctj() != null) {
                    this.SET("SPE8CCTJ = #{record.spe8cctj}");
                }

                if(record.getSpe8qtcc() != null) {
                    this.SET("SPE8QTCC = #{record.spe8qtcc}");
                }

                if(record.getSpe8jgg() != null) {
                    this.SET("SPE8JGG = #{record.spe8jgg}");
                }

                if(record.getSpe8sptym() != null) {
                    this.SET("SPE8SPTYM = #{record.spe8sptym}");
                }

                if(record.getSpe8dsc2() != null) {
                    this.SET("SPE8DSC2 = #{record.spe8dsc2}");
                }

                this.SET("SPE8JHG = #{record.spe8jhg}");
                this.SET("SPE8ZTW = #{record.spe8ztw}");
                this.SET("SPE8GFG = #{record.spe8gfg}");
                this.SET("SPE8PTYP = #{record.spe8ptyp}");
                this.SET("SPE8ATCDL = #{record.spe8atcdl}");
                this.SET("SPE8ATCXL = #{record.spe8atcxl}");
                this.SET("SPORIG = #{record.sporig}");
            }

            if(datatype.equals("E03")) {
                if(record.getSpe8fxdj() != null) {
                    this.SET("SPE8FXDJ = #{record.spe8fxdj}");
                }

                if(record.getSpe8cctj() != null) {
                    this.SET("SPE8CCTJ = #{record.spe8cctj}");
                }

                if(record.getSpe8qtcc() != null) {
                    this.SET("SPE8QTCC = #{record.spe8qtcc}");
                }

                if(record.getSpe8jgg() != null) {
                    this.SET("SPE8JGG = #{record.spe8jgg}");
                }

                if(record.getSpe8sptym() != null) {
                    this.SET("SPE8SPTYM = #{record.spe8sptym}");
                }

                if(record.getSpe8dsc2() != null) {
                    this.SET("SPE8DSC2 = #{record.spe8dsc2}");
                }

                this.SET("SPEV01 = #{record.spev01}");
                this.SET("SPE8NAME = #{record.spe8name}");
                this.SET("SPE8JHG = #{record.spe8jhg}");
                this.SET("SPE8ZTW = #{record.spe8ztw}");
                this.SET("SPORIG = #{record.sporig}");
                this.SET("SPE8CPDL = #{record.spe8cpdl}");
                this.SET("SPE8TSFL = #{record.spe8tsfl}");
            }

            if(datatype.equals("E04")) {
                if(record.getSpe8sptym() != null) {
                    this.SET("SPE8SPTYM = #{record.spe8sptym}");
                }

                this.SET("SPEV01 = #{record.spev01}");
                this.SET("SPE8NAME = #{record.spe8name}");
            }

            if(datatype.equals("MEGE")) {
                this.SET("spe8str200 = concat(concat(trim(spe8str200),\';\'),#{record.spe8str200})");
                this.SET("SPE8SPTYM = #{record.spe8sptym}");
            }

            if(datatype.equals("UMEGE")) {
                this.SET("spe8str200 = #{record.spe8str200}");
                this.SET("SPE8SPTYM = #{record.spe8sptym}");
            }

            if(datatype.equals("SELE")) {
                this.SET("SPE8SFFC = #{record.spe8sffc}");
            }

            if(datatype.equals("S")) {
                this.SET("SPFLAG = #{record.spflag}");
            }

            if(datatype.equals("N")) {
                this.SET("SPE8BGBS = #{record.spe8bgbs}");
            }

            this.WHERE("Trim(SPLITM) = #{record.splitm}");
            return this.toString();
        }

        public String updatesametym(@Param("schema") String schema, @Param("e8lsm") String e8lsm, @Param("e8tym") String e8tym) {
            this.UPDATE(schema + ".FE84101");
            this.SET("SPE8SPTYM = #{e8tym}");
            this.WHERE("Trim(SPE8SPTYM) = #{e8lsm}");
            return this.toString();
        }
    }
}
