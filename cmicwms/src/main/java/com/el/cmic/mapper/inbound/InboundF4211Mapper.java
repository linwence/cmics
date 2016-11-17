/**
 * 
 */
package com.el.cmic.mapper.inbound;

import org.apache.ibatis.annotations.Update;

import com.el.cfg.domain.F4211;
import com.el.cfg.mapper.F4211Mapper;

/**
 * @author Smile
 *
 */
public interface InboundF4211Mapper extends F4211Mapper {

	@Update({
        "update F4211",
        "set SDNXTR = #{sdnxtr,jdbcType=NCHAR},",
          "SDLTTR = #{sdlttr,jdbcType=NCHAR},",
          "SDUSER = #{sduser,jdbcType=NCHAR},",
          "SDPID = #{sdpid,jdbcType=NCHAR},",
          "SDJOBN = #{sdjobn,jdbcType=NCHAR},",
          "SDUPMJ = #{sdupmj,jdbcType=DECIMAL},",
          "SDTDAY = #{sdtday,jdbcType=DECIMAL}",
        "where SDDOCO = #{sddoco,jdbcType=DECIMAL}",
          "and SDDCTO = #{sddcto,jdbcType=NCHAR}",
          "and SDKCOO = #{sdkcoo,jdbcType=NCHAR}",
          "and SDLNID = #{sdlnid,jdbcType=DECIMAL}"
    })
    int updateStatus(F4211 record);

//    @Update({
//		"<script>",
//		"<foreach  collection='updList' item='upd' separator=';'>",
//        "update F4211",
//        "set SDNXTR = #{upd.sdnxtr,jdbcType=NCHAR},",
//          "SDLTTR = #{upd.sdlttr,jdbcType=NCHAR},",
//          "SDUSER = #{upd.sduser,jdbcType=NCHAR},",
//          "SDPID = #{upd.sdpid,jdbcType=NCHAR},",
//          "SDJOBN = #{upd.sdjobn,jdbcType=NCHAR},",
//          "SDUPMJ = #{upd.sdupmj,jdbcType=DECIMAL},",
//          "SDTDAY = #{upd.sdtday,jdbcType=DECIMAL}",
//        "where SDDOCO = #{upd.sddoco,jdbcType=DECIMAL}",
//          "and SDDCTO = #{upd.sddcto,jdbcType=NCHAR}",
//          "and SDKCOO = #{upd.sdkcoo,jdbcType=NCHAR}",
//          "and SDLNID = #{upd.sdlnid,jdbcType=DECIMAL}",
//		"</foreach>",
//		"</script>"
//	})
//	int updateStatusBatch(@Param("updList") List<F4211> updList);

}
