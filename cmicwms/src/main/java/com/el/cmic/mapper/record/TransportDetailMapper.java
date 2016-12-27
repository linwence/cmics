package com.el.cmic.mapper.record;

import com.el.utils.ReadPropertiesUtil;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.jdbc.SQL;

import com.el.cmic.domain.record.TransportDetail;

/**
 * 运输记录推送  jde提供服务
 * @author zhanhao
 *
 */
public interface TransportDetailMapper {
	String schema = ReadPropertiesUtil.getPropertyValue("/config/db.properties", "schema");
	@InsertProvider(type=TransportDetailMapper.sqlProvider.class,method=TransportDetailMapper.sqlProvider.insertTranportDetaol)
	public  Integer insertTranportDetaol(TransportDetail transportDetail );
	
	class sqlProvider extends SQL{
		
		public static final String insertTranportDetaol="insertTranportDetaol";
		public  String insertTranportDetaol(TransportDetail transportDetail ){
			INSERT_INTO(schema+".FE8WMS09");
			VALUES("YSUKID", schema+".FE8WMS09_SEQ.NEXTVAL ");
			//VALUES("ysmcu","#{ysmcu,jdbcType=NCHAR}");
			//VALUES("ysco","#{ysco,jdbcType=NCHAR}");
			VALUES("ysmcu","(select LSMCU from "+schema+".FE8WMS20 where trim(LSE8WLZXID) = #{ysmcu,jdbcType=NCHAR} and trim(LSE8HZBM) = #{ysco,jdbcType=NCHAR})");
			VALUES("ysco","(select LSCO from "+schema+".FE8WMS20 where trim(LSE8WLZXID) = #{ysmcu,jdbcType=NCHAR} and trim(LSE8HZBM) = #{ysco,jdbcType=NCHAR})");
			VALUES("ysdoco","#{ysdoco,jdbcType=DECIMAL}");
			VALUES("yslnid","#{yslnid,jdbcType=DECIMAL}");
			VALUES("ysptut01","#{ysptut01,jdbcType=NCHAR}");
			VALUES("ysptut02","#{ysptut02,jdbcType=NCHAR}");
			VALUES("yse8tym","#{yse8tym,jdbcType=NCHAR}");
			VALUES("ysptut03","#{ysptut03,jdbcType=NCHAR}");
			VALUES("yse8name","#{yse8name,jdbcType=NCHAR}");
			VALUES("ysfstr1","#{ysfstr1,jdbcType=NCHAR}");
			VALUES("ysfstr2","#{ysfstr2,jdbcType=NCHAR}");
			VALUES("ysidate","#{ysidate,jdbcType=DATE}");
			VALUES("ysrdate","#{ysrdate,jdbcType=DATE}");
			VALUES("ysuprc","#{ysuprc,jdbcType=NCHAR}");
			VALUES("yscnyp","#{yscnyp,jdbcType=NCHAR}");
			VALUES("ysdtee","#{ysdtee,jdbcType=DATE}");
			VALUES("ysdtetp","#{ysdtetp,jdbcType=DATE}");
			VALUES("ysfstr3","#{ysfstr3,jdbcType=NCHAR}");
			VALUES("ysfstr4","#{ysfstr4,jdbcType=NCHAR}");
			VALUES("ysfstr5","#{ysfstr5,jdbcType=NCHAR}");
			VALUES("ysconstr1","#{ysconstr1,jdbcType=NCHAR}");
			VALUES("ysdcto","#{ysdcto,jdbcType=NCHAR}");
	/*		VALUES("ysuser","#{ysuser,jdbcType=NCHAR}");
			VALUES("yspid","#{yspid,jdbcType=NCHAR}");
			VALUES("ysupmj","#{ysupmj,jdbcType=DECIMAL}");
			VALUES("ystday","#{ystday,jdbcType=DECIMAL}");*/
			return toString();
		};
	}

}
