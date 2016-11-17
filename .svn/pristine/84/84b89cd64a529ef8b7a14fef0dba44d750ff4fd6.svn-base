package com.el.cmic.mapper.department;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

import com.el.cmic.domain.department.DepartmentData;


public interface DepartmentDataMapper {
	
	/**
	 * 部门基础数据推送  查询list
	 * @return
	 */
	@SelectProvider(type=DepartmentDataMapper.sqlProvider.class,method=DepartmentDataMapper.sqlProvider.selectDepartmentDatas)
	public List<DepartmentData>  selectDepartmentDatas();
	
	/**
	 * 更新 FE8SPD02  EV01 表的状态  Y  or  N
	 * @param status
	 * @param bmmcu
	 * @return
	 */
	 @UpdateProvider(type = DepartmentDataMapper.sqlProvider.class, method = DepartmentDataMapper.sqlProvider.updateEv01)
	 public Integer updateEv01(@Param("status") String status,@Param("bmmcu") String bmmcu,@Param("bmco") String bmco);
	

	class  sqlProvider extends SQL{
		
		public static final String selectDepartmentDatas="selectDepartmentDatas";
		public String selectDepartmentDatas(){
			//测试使用 CO  SJBMID 视图时空字符串   send没有取值逻辑
			//SELECT(" SPDBS,'JDE' as CO,NAME,'0001' as SJBMID,'ERP上级部门名称' as SJBMMC,MCU,DC,JC,BZ,FC,'00101' as send "); 
			SELECT(" SPDBS,CO,NAME, SJBMID,'ERP上级部门名称' as SJBMMC,MCU,DC,JC,BZ,FC");
			FROM("VE8SPDBM");
			return toString();
		}
		
		public static final String updateEv01="updateEv01";
		public String updateEv01(@Param("status") String status,@Param("bmmcu") String bmmcu,@Param("bmco") String bmco){
			UPDATE("FE8SPD02");
			SET("BMEV01=#{status}");
			WHERE("BMMCU=#{bmmcu} and BMCO=#{bmco}");
	     	return toString();
		}
	}
}
