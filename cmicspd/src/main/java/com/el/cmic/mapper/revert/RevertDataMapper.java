package com.el.cmic.mapper.revert;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

import com.el.cmic.domain.revert.RevertData;

public interface RevertDataMapper {
	
	@Insert({"insert into FE8SPD14 (QTUKID,QTEV01,QTE8SPDID,QTE8ERPID,QTE8PSDW,QTE8PSDWE,QTE8PSDWN,QTE8THYY,QTE8THYYE,"
			+ "QTE8THYYN,QTE8THKS,QTE8THKSE,QTE8THKSN,QTE8CKKS,QTE8CKKSE,QTE8CKKSN,QTE8THDH,QTE8THRQ,QTE8XTSJ,QTE8DDZHS) "
			+ "values(#{revertData.qtukid,jdbcType=DECIMAL}, NVL(#{revertData.qtev01,jdbcType=NCHAR}, 'N'),"
			+ "#{revertData.qte8spdid,jdbcType=NCHAR},#{revertData.qte8erpid,jdbcType=NCHAR},"
			+ "#{revertData.qte8psdw,jdbcType=NCHAR},#{revertData.qte8psdwe,jdbcType=NCHAR},"
			+ "#{revertData.qte8psdwn ,jdbcType=NCHAR},#{revertData.qte8thyy ,jdbcType=NCHAR},"
			+ "#{revertData.qte8thyye ,jdbcType=NCHAR},#{revertData.qte8thyyn ,jdbcType=NCHAR},"
			+ "#{revertData.qte8thks ,jdbcType=NCHAR},#{revertData.qte8thkse ,jdbcType=NCHAR},"
			+ "#{revertData.qte8thksn ,jdbcType=NCHAR},#{revertData.qte8ckks ,jdbcType=NCHAR},"
			+ "#{revertData.qte8ckkse ,jdbcType=NCHAR},#{revertData.qte8ckksn ,jdbcType=NCHAR},"
			+ "#{revertData.qte8thdh ,jdbcType=NCHAR},#{revertData.qte8thrq ,jdbcType=INTEGER},"
			+ "#{revertData.qte8xtsj ,jdbcType=INTEGER},#{revertData.qte8ddzhs,jdbcType=DECIMAL})"})
	@SelectKey(statement = "SELECT FE8SPD14_SEQ.NEXTVAL FROM DUAL", keyProperty = "revertData.qtukid", resultType = BigDecimal.class, before = true)
	public Integer  insertRevertData(@Param("revertData") RevertData revertData);

}
