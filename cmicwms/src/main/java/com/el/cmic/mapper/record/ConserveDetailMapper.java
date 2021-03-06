package com.el.cmic.mapper.record;

import com.el.utils.ReadPropertiesUtil;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.jdbc.SQL;

import com.el.cmic.domain.record.ConserveDetail;

public interface ConserveDetailMapper {
	String schema = ReadPropertiesUtil.getPropertyValue("/config/db.properties", "schema");
	
	/**
	 * 养护记录推送  
	 * @param conserveDetail
	 * @return
	 */
	@InsertProvider(type=ConserveDetailMapper.sqlProvider.class,method=ConserveDetailMapper.sqlProvider.insertConserveDetail)
	public Integer   insertConserveDetail(ConserveDetail conserveDetail );
	
	class sqlProvider extends SQL{
		
		public static final String insertConserveDetail="insertConserveDetail";
		public String insertConserveDetail(ConserveDetail conserveDetail){
			INSERT_INTO(schema+".FE8WMS08");
			VALUES("yhukid",schema+".FE8WMS08_SEQ.nextval");
			VALUES("yhitem","'WMS'");
			//VALUES("yhmcu","#{yhmcu,jdbcType=NCHAR}");
			//VALUES("yhco","#{yhco,jdbcType=NCHAR}");
			VALUES("yhmcu","(select LSMCU from "+schema+".FE8WMS20 where trim(LSE8WLZXID) = #{yhmcu,jdbcType=NCHAR} and trim(LSE8HZBM) = #{yhco,jdbcType=NCHAR})");
			VALUES("yhco","(select LSCO from "+schema+".FE8WMS20 where trim(LSE8WLZXID) = #{yhmcu,jdbcType=NCHAR} and trim(LSE8HZBM) = #{yhco,jdbcType=NCHAR})");
			VALUES("yhptut01","#{yhptut01,jdbcType=NCHAR}");
			VALUES("yhdtee","#{yhdtee,jdbcType=DATE}");
			VALUES("yhptut03","#{yhptut03,jdbcType=NCHAR}");
			VALUES("yhe8name","#{yhe8name,jdbcType=NCHAR}");
			VALUES("yhfstr1","#{yhfstr1,jdbcType=NCHAR}");
			VALUES("yhfstr2","#{yhfstr2,jdbcType=NCHAR}");
			VALUES("yhidate","#{yhidate,jdbcType=DATE}");
			VALUES("yhrdate","#{yhrdate,jdbcType=DATE}");
			VALUES("yhuprc","#{yhuprc,jdbcType=DECIMAL}");
			VALUES("yhfstr3","#{yhfstr3,jdbcType=NCHAR}");
			VALUES("yhdat1","#{yhdat1,jdbcType=NCHAR}");
			VALUES("yhdat2","#{yhdat2,jdbcType=NCHAR}");
			VALUES("yhfstr4","#{yhfstr4,jdbcType=NCHAR}");
			VALUES("yhfstr5","#{yhfstr5,jdbcType=NCHAR}");
			VALUES("yhfstr6","#{yhfstr6,jdbcType=NCHAR}");
			VALUES("yhconstr1","#{yhconstr1,jdbcType=NCHAR}");
			VALUES("yhfstr61","#{yhfstr61,jdbcType=NCHAR}");
			VALUES("yhfstr62","#{yhfstr62,jdbcType=NCHAR}");
			VALUES("yhfstr63","#{yhfstr63,jdbcType=NCHAR}");
			VALUES("yhahl1","#{yhahl1,jdbcType=NCHAR}");
			VALUES("yhconstr2","#{yhconstr2,jdbcType=NCHAR}");
			VALUES("yhahl2","#{yhahl2,jdbcType=NCHAR}");
			VALUES("yhdl011","#{yhdl011,jdbcType=NCHAR}");
			VALUES("yhconstr3","#{yhconstr3,jdbcType=NCHAR}");
			VALUES("YHE8MJRQ","(SELECT TO_CHAR(nvl(#{mjrq,jdbcType=DATE},to_date('1900-01-01','yyyy-MM-dd')), 'yyyy') * 1000 +TO_CHAR(nvl(#{mjrq,jdbcType=DATE},to_date('1900-01-01','yyyy-MM-dd')), 'ddd ') - 1900000 JULIAN FROM DUAL)");
			VALUES("YHE8MJSXQ","(SELECT TO_CHAR(nvl(#{mjsxq,jdbcType=DATE},to_date('1900-01-01','yyyy-MM-dd')), 'yyyy') * 1000 +TO_CHAR(nvl(#{mjsxq,jdbcType=DATE},to_date('1900-01-01','yyyy-MM-dd')), 'ddd ') - 1900000 JULIAN FROM DUAL)");

			return toString();
		}
	}

}
