package com.el.utils;
/**
 * 补齐空格
 * @author zhanhao
 *
 */
public class AddSpaceUtil {
	
	/**
	 * 向左补齐空格   
	 * @param str
	 * @param num  num指定str添加空格后的长度
	 * @return
	 */
	public static String addSpanceLeft(String str,int num){
		String resultStr="";
		if(str.length()==num){
			return resultStr=str;
		}
		
		if(str.length() < num){
			for(int i=0;i<num-str.length();i++){
				resultStr+=" ";
			}
			resultStr+=str;
			return resultStr;
		}
		
		if(str.length() > num){
			for(int i=0;i<str.length()-num;i++){
				resultStr+=" ";
			}
			resultStr+=str;
			return resultStr;
		}
		return str;
	}
	
	/**
	 * 向右补齐空格   
	 * @param str
	 * @param num  num指定str添加空格后的长度
	 * @return
	 */
	public static String addSpanceRight(String str,int num){
		String resultStr="";
		if(str.length()==num){
			return resultStr=str;
		}
		
		if(str.length() < num){
			for(int i=0;i<num-str.length();i++){
				resultStr+=" ";
			}
			str+=resultStr;
			return str;
		}
		
		if(str.length() > num){
			for(int i=0;i<str.length()-num;i++){
				resultStr+=" ";
			}
			resultStr+=str;
			return resultStr;
		}
		return str;
	}

}
