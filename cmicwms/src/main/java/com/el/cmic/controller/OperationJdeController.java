package com.el.cmic.controller;

import java.util.Map;

/**
 * 调用第三方 接口   
 * @author zhanhao
 *
 */
public interface OperationJdeController {

	/**
	 * 实现此接口    获取业务数据data  和 业务数据 id(代表一条业务数据的唯一键)
	 * @return  加密后的data字符串  和  业务数据id List集合   返回map集合
	 */
	public Map<String,Object> Base64Data();
	
	/**
	 * 实现接口   发送请求 (调用第三方接口 )
	 * @return  响应结果  ,需要更新的业务数据的id List 返回map集合
	 */
	public Map<String,Object> sendPostRequest();
	
	/**
	 * 此接口  jde调用接口    用来操作jde数据 
	 */
	public void operationJdeData();
	
	
}
