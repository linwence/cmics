package com.el.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 用于Base64编码以及解码
 * Created by Vincent on 2016/9/18.
 */
public class Base64Util {
    /**
     * base64编码
     * @param str 需要进行编码的字符串
     * @return 加密过的字符串结果
     */
    public static String encodeBase64(String str) {
        String ret = "";
        try {
            byte[] bytes = str.getBytes("utf-8");
            BASE64Encoder base64Encoder = new BASE64Encoder();
            ret = base64Encoder.encode(bytes);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * 对base64字符编码进行解码
     * @param str 待解码的字符串
     * @return 已解码的字符串
     */
    public static String decodeBase64(String str){
        String ret="";
        BASE64Decoder base64Decoder=new BASE64Decoder();
        try {
            byte[] bytes= base64Decoder.decodeBuffer(str);
            ret=new String(bytes,"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    //测试
    public static void main(String[] args) {
        String str="{\"success\":true,\"code\":\"0000\",\"message\":\"成功\"}";

       String ret= Base64Util.encodeBase64(str);

        System.out.println("....ret...."+ret);

        String deRet=Base64Util.decodeBase64(ret);
        System.out.println("...deRet..."+deRet);
    }
}
