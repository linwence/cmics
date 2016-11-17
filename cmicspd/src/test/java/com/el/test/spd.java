package com.el.test;

import com.alibaba.fastjson.annotation.JSONField;

public class spd  {
	
	 @JSONField(name = "接口类型")
	public String interfaceType;
	 @JSONField(name = "接收系统标识")
	public String interfaceId;
	 @JSONField(name = "接口数据")
	public String interfaceData;


}
