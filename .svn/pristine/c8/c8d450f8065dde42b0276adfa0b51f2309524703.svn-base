package com.el.utils;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

@Component
public class CallWebServiceImp {
	
	public  String CallWSI(Map<String,Object> param) throws UnsupportedEncodingException{
		String str ="{\"success\":false,\"code\":\"0000\",\"message\":\"成功\"}";
		String encodeData = Base64Utils.encodeToString(str.getBytes("utf-8"));
		return encodeData;
	}

}
