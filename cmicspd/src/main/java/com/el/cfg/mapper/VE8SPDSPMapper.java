package com.el.cfg.mapper;

import com.el.cfg.domain.VE8SPDSP;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface VE8SPDSPMapper {
    @Select({
        "select",
        "SPDBS, ERPBS, CO, NAME, LITM, E8NAME, E8TYM, DSC1, ZCSB, DSC2, CD, ALPH, DWMC, ",
        "BZ, ZBZ, TM, E8PZWH, E8ZZBM, ZZEXDJ, LBSX, LB, JX, CCTJ, QYWYGL, QTFL1, QTFL2, ",
        "QTFL3, BZ1, STKT, FCSJ",
        "from VE8SPDSP"
    })
    @Results({
        @Result(column="SPDBS", property="spdbs", jdbcType=JdbcType.CHAR),
        @Result(column="ERPBS", property="erpbs", jdbcType=JdbcType.CHAR),
        @Result(column="CO", property="co", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="LITM", property="litm", jdbcType=JdbcType.NCHAR),
        @Result(column="E8NAME", property="e8name", jdbcType=JdbcType.NCHAR),
        @Result(column="E8TYM", property="e8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="DSC1", property="dsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="ZCSB", property="zcsb", jdbcType=JdbcType.CHAR),
        @Result(column="DSC2", property="dsc2", jdbcType=JdbcType.NCHAR),
        @Result(column="CD", property="cd", jdbcType=JdbcType.CHAR),
        @Result(column="ALPH", property="alph", jdbcType=JdbcType.CHAR),
        @Result(column="DWMC", property="dwmc", jdbcType=JdbcType.CHAR),
        @Result(column="BZ", property="bz", jdbcType=JdbcType.CHAR),
        @Result(column="ZBZ", property="zbz", jdbcType=JdbcType.CHAR),
        @Result(column="TM", property="tm", jdbcType=JdbcType.CHAR),
        @Result(column="E8PZWH", property="e8pzwh", jdbcType=JdbcType.CHAR),
        @Result(column="E8ZZBM", property="e8zzbm", jdbcType=JdbcType.CHAR),
        @Result(column="ZZEXDJ", property="zzexdj", jdbcType=JdbcType.CHAR),
        @Result(column="LBSX", property="lbsx", jdbcType=JdbcType.CHAR),
        @Result(column="LB", property="lb", jdbcType=JdbcType.CHAR),
        @Result(column="JX", property="jx", jdbcType=JdbcType.CHAR),
        @Result(column="CCTJ", property="cctj", jdbcType=JdbcType.CHAR),
        @Result(column="QYWYGL", property="qywygl", jdbcType=JdbcType.CHAR),
        @Result(column="QTFL1", property="qtfl1", jdbcType=JdbcType.CHAR),
        @Result(column="QTFL2", property="qtfl2", jdbcType=JdbcType.CHAR),
        @Result(column="QTFL3", property="qtfl3", jdbcType=JdbcType.CHAR),
        @Result(column="BZ1", property="bz1", jdbcType=JdbcType.CHAR),
        @Result(column="STKT", property="stkt", jdbcType=JdbcType.CHAR),
        @Result(column="FCSJ", property="fcsj", jdbcType=JdbcType.CHAR)
    })
    List<VE8SPDSP> selectAll();
}