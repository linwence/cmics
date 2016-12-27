package com.el.cfg.mapper;

import com.el.cfg.domain.FE8WMS14;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FE8WMS14Mapper {
    @Select({
        "select",
        "DZMCU, DZCO, DZLITM, DZE8NAME, DZLOT1, DZUORG, DZDL01, DZDL02, DZDL03, DZAB01, ",
        "DZAB02, DZAB03, DZEV01, DZEV02, DZUSER, DZPID, DZUPMJ, DZTDAY, DZAOD",
        "from FE8WMS14",
        "where DZMCU = #{dzmcu,jdbcType=NCHAR}",
          "and DZCO = #{dzco,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="DZMCU", property="dzmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DZCO", property="dzco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DZLITM", property="dzlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="DZE8NAME", property="dze8name", jdbcType=JdbcType.NCHAR),
        @Result(column="DZLOT1", property="dzlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="DZUORG", property="dzuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZDL01", property="dzdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="DZDL02", property="dzdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="DZDL03", property="dzdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="DZAB01", property="dzab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZAB02", property="dzab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZAB03", property="dzab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZEV01", property="dzev01", jdbcType=JdbcType.NCHAR),
        @Result(column="DZEV02", property="dzev02", jdbcType=JdbcType.NCHAR),
        @Result(column="DZUSER", property="dzuser", jdbcType=JdbcType.NCHAR),
        @Result(column="DZPID", property="dzpid", jdbcType=JdbcType.NCHAR),
        @Result(column="DZUPMJ", property="dzupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZTDAY", property="dztday", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZAOD", property="dzaod", jdbcType=JdbcType.TIMESTAMP)
    })
    FE8WMS14 selectByPrimaryKey(@Param("dzmcu") String dzmcu, @Param("dzco") String dzco);

    @Select({
        "select",
        "DZMCU, DZCO, DZLITM, DZE8NAME, DZLOT1, DZUORG, DZDL01, DZDL02, DZDL03, DZAB01, ",
        "DZAB02, DZAB03, DZEV01, DZEV02, DZUSER, DZPID, DZUPMJ, DZTDAY, DZAOD",
        "from FE8WMS14"
    })
    @Results({
        @Result(column="DZMCU", property="dzmcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DZCO", property="dzco", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="DZLITM", property="dzlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="DZE8NAME", property="dze8name", jdbcType=JdbcType.NCHAR),
        @Result(column="DZLOT1", property="dzlot1", jdbcType=JdbcType.NCHAR),
        @Result(column="DZUORG", property="dzuorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZDL01", property="dzdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="DZDL02", property="dzdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="DZDL03", property="dzdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="DZAB01", property="dzab01", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZAB02", property="dzab02", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZAB03", property="dzab03", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZEV01", property="dzev01", jdbcType=JdbcType.NCHAR),
        @Result(column="DZEV02", property="dzev02", jdbcType=JdbcType.NCHAR),
        @Result(column="DZUSER", property="dzuser", jdbcType=JdbcType.NCHAR),
        @Result(column="DZPID", property="dzpid", jdbcType=JdbcType.NCHAR),
        @Result(column="DZUPMJ", property="dzupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZTDAY", property="dztday", jdbcType=JdbcType.DECIMAL),
        @Result(column="DZAOD", property="dzaod", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FE8WMS14> selectAll();
}