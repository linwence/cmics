package com.el.cmic.service.revert;


import com.el.cmic.common.domain.SpdResult;
import com.el.cmic.domain.revert.RevertData;

public interface RevertDataService {
	
	/**
	 * SPD请退数据接收  主数据  新增
	 * @param revertData
	 * @return
	 */
	public Integer  insertRevertData(RevertData revertData);
	
	/**
	 * SPD请退数据接收  接口  入库
	 * @param data
	 * @return
	 */
	public SpdResult  callInsertRevertData(String data);

}
