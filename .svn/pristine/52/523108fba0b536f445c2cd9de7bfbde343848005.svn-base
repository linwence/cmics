package com.el.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * 读取Properties  配置文件的工具类
 * @author zhanhao
 *
 */
public class ReadPropertiesUtil {
	
	/**
	 *
	 * @param url  此路径 相对于class文件路径
	 * @param key   配置文件  属性键值
	 * @return  返回属性键值 对应的属性值    否则返回 空字符串   
	 */
	public static String getPropertyValue(String url,String key){
		//得到class文件位置
		String classPath = Thread.currentThread().getContextClassLoader().getResource("").getPath(); 
		String  value="";//存储 键值的变量
		Properties prop = new Properties();
		//读取配置文件
		try {
			//获得 配置文件的io流
			InputStream inputStre = new BufferedInputStream(new FileInputStream(classPath+url));
			 prop.load(inputStre);     //加载属性列表
			 
			 //循环遍历  查找key对应的键值
			  Iterator<String> it=prop.stringPropertyNames().iterator();
			  while(it.hasNext()){
			      		String key1=it.next();
			      		if(key1.equals(key)){
			      			value=prop.getProperty(key1);break;//跳出循环
			      		}
			 }
			  //关闭io流
			  inputStre.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
