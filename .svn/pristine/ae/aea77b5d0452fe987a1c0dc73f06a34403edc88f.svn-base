package com.el.cmic.mapper.supplier;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

import com.el.cmic.domain.supplier.Supplier;

public interface SupplierMapper {

	/**
	 * 供应商数据推送  查询list
	 * @return
	 */
	@SelectProvider(type=SupplierMapper.sqlProvider.class,method=SupplierMapper.sqlProvider.selectSupplier)
	public List<Supplier>  selectSupplier();
	
	/**
	 * FE8SPD03 EV01  更新状态
	 * @return
	 */
	@UpdateProvider(type=SupplierMapper.sqlProvider.class,method=SupplierMapper.sqlProvider.updateEv01)
	public Integer  updateEv01(@Param("status") String status,@Param("span8") String span8,@Param("spco") String spco);

	class  sqlProvider extends SQL{
		
		public static final String selectSupplier="selectSupplier";
		public String selectSupplier(){
			//SELECT("SPDBS,ERPBS,'00101' as CO,NAME,AN8,ALPH,JC,BZ,FC");//测试使用
			SELECT("SPDBS,ERPBS,CO,NAME,AN8,ALPH,JC,BZ,FC");
			FROM("VE8SPDGY");
			return toString();
		};
		
		public static final String updateEv01="updateEv01";
		public String  updateEv01(@Param("status") String status,@Param("span8") String span8,@Param("spco") String spco){
				UPDATE("FE8SPD03");
	            SET("SPEV01=#{status}");
	            WHERE("SPAN8 =#{span8,jdbcType=NCHAR} and SPCO =#{spco,jdbcType=NCHAR}");
	            return toString();
		}
	}
}
