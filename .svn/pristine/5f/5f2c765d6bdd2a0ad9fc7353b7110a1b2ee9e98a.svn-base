package com.el.cmic.common.mapper;

import com.el.cmic.common.domain.Fe8spdlg;

import java.math.BigDecimal;
import java.util.List;

import com.el.cmic.domain.settlement.Settlement;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface Fe8spdlgMapper {
    @Select({
            "select",
            "LGUKID, LGE8CGDD, LGE8QGLX, LGE8ERPID, LGE8RZLX, LGE8RZFX, LGE8JKMC, LGE8RZNR, ",
            "LGE8SPDID, LGE8SPDURL, LGPID, LGJOBN, LGUSER, LGUPMJ, LGTDAY",
            "from ${tableSchema}.FE8SPDLG",
            "where LGUKID = #{lgukid,jdbcType=DECIMAL}"
    })
    @Results({
            @Result(column = "LGUKID", property = "lgukid", jdbcType = JdbcType.DECIMAL, id = true),
            @Result(column = "LGE8CGDD", property = "lge8cgdd", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8QGLX", property = "lge8qglx", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8ERPID", property = "lge8erpid", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8RZLX", property = "lge8rzlx", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8RZFX", property = "lge8rzfx", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8JKMC", property = "lge8jkmc", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8RZNR", property = "lge8rznr", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8SPDID", property = "lge8spdid", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8SPDURL", property = "lge8spdurl", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGPID", property = "lgpid", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGJOBN", property = "lgjobn", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGUSER", property = "lguser", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGUPMJ", property = "lgupmj", jdbcType = JdbcType.DECIMAL),
            @Result(column = "LGTDAY", property = "lgtday", jdbcType = JdbcType.DECIMAL)
    })
    Fe8spdlg selectByPrimaryKey(BigDecimal lgukid);

    @Select({
            "select",
            "LGUKID, LGE8CGDD, LGE8QGLX, LGE8ERPID, LGE8RZLX, LGE8RZFX, LGE8JKMC, LGE8RZNR, ",
            "LGE8SPDID, LGE8SPDURL, LGPID, LGJOBN, LGUSER, LGUPMJ, LGTDAY",
            "from ${tableSchema}.FE8SPDLG"
    })
    @Results({
            @Result(column = "LGUKID", property = "lgukid", jdbcType = JdbcType.DECIMAL, id = true),
            @Result(column = "LGE8CGDD", property = "lge8cgdd", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8QGLX", property = "lge8qglx", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8ERPID", property = "lge8erpid", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8RZLX", property = "lge8rzlx", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8RZFX", property = "lge8rzfx", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8JKMC", property = "lge8jkmc", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8RZNR", property = "lge8rznr", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8SPDID", property = "lge8spdid", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGE8SPDURL", property = "lge8spdurl", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGPID", property = "lgpid", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGJOBN", property = "lgjobn", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGUSER", property = "lguser", jdbcType = JdbcType.NCHAR),
            @Result(column = "LGUPMJ", property = "lgupmj", jdbcType = JdbcType.DECIMAL),
            @Result(column = "LGTDAY", property = "lgtday", jdbcType = JdbcType.DECIMAL)
    })
    List<Fe8spdlg> selectAll();

    @Insert({"insert into ${tableSchema}.Fe8spdlg (LGUKID, LGE8CGDD, ", "LGE8QGLX, LGE8ERPID, ", "LGE8RZLX, LGE8RZFX, ",
            "LGE8JKMC, LGE8RZNR, ", "LGE8SPDID, LGE8SPDURL, ", "LGPID, LGJOBN, ", "LGUSER, LGUPMJ, ",
            "LGTDAY,LGE8STR200,LGAOD)",
            "select #{fe8spdlg.lgukid,jdbcType=DECIMAL},#{fe8spdlg.lge8cgdd,jdbcType=NCHAR}, ",
            "#{fe8spdlg.lge8qglx,jdbcType=NCHAR}, #{fe8spdlg.lge8erpid,jdbcType=NCHAR}, ",
            "#{fe8spdlg.lge8rzlx,jdbcType=NCHAR}, #{fe8spdlg.lge8rzfx,jdbcType=NCHAR}, ",
            "#{fe8spdlg.lge8jkmc,jdbcType=NCHAR}, #{fe8spdlg.lge8rznr,jdbcType=NCHAR}, ",
            "#{fe8spdlg.lge8spdid,jdbcType=NCHAR}, #{fe8spdlg.lge8spdurl,jdbcType=NCHAR}, ",
            "'SPD', 'Interface', ",
            "'Server', (TO_CHAR(sysdate, 'YYYYDDD') - 1900000), ",
            " TO_CHAR(sysdate, 'HH24MISS'),#{fe8spdlg.lge8str200,jdbcType=NCHAR},SYSDATE",
            " from  dual"})
    @SelectKey(statement = "SELECT ${tableSchema}.fe8spdlg_seq.NEXTVAL FROM DUAL", keyProperty = "fe8spdlg.lgukid", resultType = BigDecimal.class, before = true)
    int insertFe8spdlg(@Param("fe8spdlg") Fe8spdlg fe8spdlg);
}