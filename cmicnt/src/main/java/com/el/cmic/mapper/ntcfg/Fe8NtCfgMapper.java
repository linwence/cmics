package com.el.cmic.mapper.ntcfg;

import com.el.cmic.domain.ntcfg.Fe8NtCfg;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * Created by Vincent on 2017/2/15.
 */
public interface Fe8NtCfgMapper {

    @Select({"SELECT interfacename,calldate,successflag,successdate,url,intervaltime",
            " FROM ${tableSchema}.Fe8NtCfg ",
            "where trim(interfacename)=#{interfacename}"})
    @Results({
            @Result(column = "interfacename", property = "interfacename", jdbcType = JdbcType.NCHAR),
            @Result(column = "calldate", property = "calldate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "successflag", property = "successflag", jdbcType = JdbcType.NCHAR),
            @Result(column = "successdate", property = "successdate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "url",property = "url",jdbcType = JdbcType.NCHAR),
            @Result(column = "intervaltime",property = "intervalTime",jdbcType = JdbcType.INTEGER)
    })
    public Fe8NtCfg selectFe8nttime(String interfacename);


    @Insert({" insert into ${tableSchema}.Fe8NtCfg(interfacename,calldate,successflag,successdate)",
            "values(#{fe8NtCfg.interfacename},#{fe8NtCfg.calldate,jdbcType=TIMESTAMP},#{fe8NtCfg.successflag},#{fe8NtCfg.successdate,jdbcType=TIMESTAMP})"})
    public int insertFe8nttime(@Param("fe8NtCfg") Fe8NtCfg fe8NtCfg);

    @Update({" UPDATE  ${tableSchema}.Fe8NtCfg ",
            "SET calldate=#{fe8NtCfg.calldate,jdbcType=TIMESTAMP},",
            "successflag=#{fe8NtCfg.successflag},",
            "successdate=#{fe8NtCfg.successdate,jdbcType=TIMESTAMP}",
            "where trim(interfacename)=#{fe8NtCfg.interfacename}"})
    public int updateFe8nttime(@Param("fe8NtCfg") Fe8NtCfg fe8NtCfg);
}
