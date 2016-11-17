package com.el.cmic.mapper.goods;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

import com.el.cmic.domain.goods.Bale;

public interface BaleMapepr {
	
	
	/**
	 * 商品基础数据推送  查询list
	 * @return
	 */
	@SelectProvider(type=BaleMapepr.sqlProvider.class,method=BaleMapepr.sqlProvider.selectBales)
	public List<Bale>  selectBales();
	
	/**
	 * FE8SPD01 EV01  更新状态
	 * @return
	 */
	@UpdateProvider(type=BaleMapepr.sqlProvider.class,method=BaleMapepr.sqlProvider.updateEv01)
	public Integer  updateEv01(@Param("status") String status,@Param("splitm") String splitm);

	class  sqlProvider extends SQL{
		
		//动态 获取  db.properties  文件属性值
		public static final String selectBales="selectBales";
		public String selectBales(){
			//测试  QYWYGL  数据库是空格   java int类型转换错误  测试从新赋值为空字符串
			//SELECT("SPDBS,ERPBS ,CO ,NAME ,LITM ,E8NAME  ,E8TYM  ,DSC1  ,ZCSB ,DSC2  ,CD ,ALPH ,DWMC  ,BZ  ,ZBZ  ,TM  ,E8PZWH  ,LB ,JX ,CCTJ ,'' as QYWYGL ,QTFL1,QTFL2,QTFL3,BZ1,STKT,FCSJ");
			SELECT("SPDBS,ERPBS ,CO ,NAME ,LITM ,E8NAME  ,E8TYM  ,DSC1  ,ZCSB ,DSC2  ,CD ,ALPH ,DWMC  ,BZ  ,ZBZ  ,TM  ,E8PZWH  ,LB ,JX ,CCTJ ,QYWYGL ,QTFL1,QTFL2,QTFL3,BZ1,STKT,FCSJ");
			SELECT("(select   listagg(trim(to_char(ZZE8ZZBM)),',') within group( order by ZZE8ZZBM) as  ZZE8Z2ZBM from FE84101Z     where ZZLITM=VE8SPDSP.LITM) as ZZE8ZZBM");
			//SELECT("(select    min(ZZEXDJ)  from FE84101Z     where ZZLITM=VE8SPDSP.LITM) as ZZEXDJ");
			SELECT("(select min((to_date(trunc(ZZEXDJ/1000)  +1900||'-01-01','yyyy-MM-dd')+mod( ZZEXDJ, 1000)-1)) from FE84101Z where ZZLITM = VE8SPDSP.LITM) as ZZEXDJ");
			FROM("VE8SPDSP");
			return toString();
		}
		
		public static final String updateEv01="updateEv01";
		public String  updateEv01(@Param("status") String status,@Param("splitm") String splitm){
				UPDATE("FE8SPD01");
	            SET("SPEV01=#{status}");
	            WHERE("SPLITM =#{splitm}");
	            return toString();
		}
	}
}
