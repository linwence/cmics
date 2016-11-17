package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe84101;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by king_ on 2016/10/8.
 */
public class FE84101UpdateByLitmSqlProvider {

    public String updateByLitmSelective(@Param("record") Fe84101 record,@Param("datatype") String datatype) {
        SQL sql = new SQL();
        sql.UPDATE("CRPDTA.FE84101");

        if(datatype.equals("E01")){
            sql.SET("SPE8YYKS = #{record.spe8yyks}");
            sql.SET("SPEV01 = #{record.spev01}");
            sql.SET("SPE8NAME = #{record.spe8name}");
            sql.SET("SPAN8 = #{record.span8}");
            sql.SET("SPE8PZWH = #{record.spe8pzwh}");
            sql.SET("SPORIG = #{record.sporig}");

            sql.SET("SPE8FXDJ = #{record.spe8fxdj}");
            sql.SET("SPE8CCTJ = #{record.spe8cctj}");
            sql.SET("SPE8QTCC = #{record.spe8qtcc}");
            sql.SET("SPE8JGG = #{record.spe8jgg}");
            //-------------------------------------change 10-17 fe84101 add 3
            sql.SET("SPE8CPDL = #{record.spe8cpdl}");
            sql.SET("SPE8TSFL = #{record.spe8tsfl}");
            sql.SET("SPE8CPFL = #{record.spe8cpfl}");
        }
        if(datatype.equals("E02")){
            sql.SET("SPEV01 = #{record.spev01}");
            sql.SET("SPE8NAME = #{record.spe8name}");
            sql.SET("SPAN8 = #{record.span8}");
            sql.SET("SPE8PZWH = #{record.spe8pzwh}");
            sql.SET("SPE8ZDYL = #{record.spe8zdyl}");
            sql.SET("SPE8JHG = #{record.spe8jhg}");
            sql.SET("SPE8ZTW = #{record.spe8ztw}");
            sql.SET("SPE8GFG = #{record.spe8gfg}");
            sql.SET("SPE8PTYP = #{record.spe8ptyp}");
            sql.SET("SPE8ATCDL = #{record.spe8atcdl}");
            sql.SET("SPE8ATCXL = #{record.spe8atcxl}");
            sql.SET("SPORIG = #{record.sporig}");

        }
        if(datatype.equals("E03")){
            sql.SET("SPEV01 = #{record.spev01}");
            sql.SET("SPE8NAME = #{record.spe8name}");
            sql.SET("SPAN8 = #{record.span8}");
            sql.SET("SPE8JHG = #{record.spe8jhg}");
            sql.SET("SPE8ZTW = #{record.spe8ztw}");
            sql.SET("SPORIG = #{record.sporig}");
            //-------------------------------------change 10-17 fe84101 add 3
            sql.SET("SPE8CPDL = #{record.spe8cpdl}");
            sql.SET("SPE8TSFL = #{record.spe8tsfl}");
            sql.SET("SPE8CPFL = #{record.spe8cpfl}");
        }
        if(datatype.equals("E04")){
            sql.SET("SPEV01 = #{record.spev01}");
            sql.SET("SPE8NAME = #{record.spe8name}");
        }



        sql.WHERE("SPLITM = #{record.splitm}");


        return sql.toString();
    }
}
