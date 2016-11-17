/**
 * 
 */
package com.el.cmic.mapper.inbound;

import org.apache.ibatis.annotations.Update;

import com.el.cfg.domain.F4311;
import com.el.cfg.mapper.F4311Mapper;

/**
 * @author Smile
 *
 */
public interface InboundF4311Mapper extends F4311Mapper {

	@Update({
        "update F4311",
        "set PDNXTR = #{pdnxtr,jdbcType=NCHAR},",
          "PDLTTR = #{pdlttr,jdbcType=NCHAR},",
          "PDUSER = #{pduser,jdbcType=NCHAR},",
          "PDPID = #{pdpid,jdbcType=NCHAR},",
          "PDJOBN = #{pdjobn,jdbcType=NCHAR},",
          "PDUPMJ = #{pdupmj,jdbcType=DECIMAL},",
          "PDTDAY = #{pdtday,jdbcType=DECIMAL}",
        "where PDDOCO = #{pddoco,jdbcType=DECIMAL}",
          "and PDDCTO = #{pddcto,jdbcType=NCHAR}",
          "and PDKCOO = #{pdkcoo,jdbcType=NCHAR}",
          "and PDSFXO = #{pdsfxo,jdbcType=NCHAR}",
          "and PDLNID = #{pdlnid,jdbcType=DECIMAL}"
    })
    int updateStatus(F4311 record);

//    @Update({
//		"<script>",
//		"<foreach  collection='updList' item='upd' separator=';'>",
//        "update F4311",
//        "set PDNXTR = #{upd.pdnxtr,jdbcType=NCHAR},",
//          "PDLTTR = #{upd.pdlttr,jdbcType=NCHAR},",
//          "PDUSER = #{upd.pduser,jdbcType=NCHAR},",
//          "PDPID = #{upd.pdpid,jdbcType=NCHAR},",
//          "PDJOBN = #{upd.pdjobn,jdbcType=NCHAR},",
//          "PDUPMJ = #{upd.pdupmj,jdbcType=DECIMAL},",
//          "PDTDAY = #{upd.pdtday,jdbcType=DECIMAL}",
//        "where PDDOCO = #{upd.pddoco,jdbcType=DECIMAL}",
//          "and PDDCTO = #{upd.pddcto,jdbcType=NCHAR}",
//          "and PDKCOO = #{upd.pdkcoo,jdbcType=NCHAR}",
//          "and PDSFXO = #{upd.pdsfxo,jdbcType=NCHAR}",
//          "and PDLNID = #{upd.pdlnid,jdbcType=DECIMAL}",
//		"</foreach>",
//		"</script>"
//	})
//	int updateStatusBatch(@Param("updList") List<F4311> updList);

}
