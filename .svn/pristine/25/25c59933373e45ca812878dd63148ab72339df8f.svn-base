package com.el.utils;

import com.fasterxml.jackson.core.io.CharTypes;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Md5Util {

    /**
     * 进行MD5加密
     *
     * @param input
     * @return
     */
    public static String md5s(String input) {
        StringBuffer sb = new StringBuffer();
        try {
            // 1.初始化MessageDigest信息摘要对象,并指定为MD5不分大小写都可以
            MessageDigest md = MessageDigest.getInstance("md5");
            // 2.传入需要计算的字符串更新摘要信息，传入的为字节数组byte[],
            // 将字符串转换为字节数组使用getBytes()方法完成
            // 指定时其字符编码 为Unicode
            md.update(input.getBytes("utf-8"));
            // 3.计算信息摘要digest()方法
            // 返回值为字节数组
            byte[] hashCode = md.digest();
            // 4.将byte[] 转换为找度为32位的16进制字符串
            // 声明StringBuffer对象来存放最后的值

            // 遍历字节数组
            for (byte b : hashCode) {
                // 对数组内容转化为16进制，
                sb.append(Character.forDigit(b >> 4 & 0xf, 16));
                // 换2次为32位的16进制
                sb.append(Character.forDigit(b & 0xf, 16));
            }
            System.out.println("加密后的结果是:" + sb.toString().toUpperCase());
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sb.toString().toUpperCase();

    }

    /**
     * 字符串转成Unicode
     *
     * @param string
     * @return
     */
    public static String string2Unicode(String string) {

        StringBuffer unicode = new StringBuffer();
        try {
            for (int i = 0; i < string.length(); i++) {

                // 取出每一个字符
                char c = string.charAt(i);
                if (c >= 0x80) {
                    String strUnicode;

                    strUnicode = writeUnicodeEscape(c);

                    // 为所有非ASCII字符生成转义的unicode字符
                    unicode.append(strUnicode);
                } else {
                    // 为ASCII字符中前128个字符使用转义的unicode字符
                    int code = (c < ESCAPE_CODES.length ? ESCAPE_CODES[c] : 0);
                    if (code == 0) {
                        // gen.writeRaw(c); // 此处不用转义
                        unicode.append(c);
                    } else if (code < 0) {
                        String str2 = "";

                        str2 = writeUnicodeEscape((char) (-code - 1));

                        // 通用转义字符
                        unicode.append(str2);
                    } else {
                        /*
                         * String str3 = "";
						 * 
						 * str3 = writeShortEscape((char) code);
						 * 
						 * // 短转义字符 (\n \t // ...) unicode.append(str3);
						 */
                        unicode.append(c);
                    }
                }
                // 转换为unicode
                // unicode.append("\\u" + Integer.toHexString(c));
            }
            System.out.println(unicode.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unicode.toString();
    }

    /**
     * 把中文转成Unicode码
     *
     * @param str
     * @return
     */
    public static String chinaToUnicode(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int chr1 = (char) str.charAt(i);
            if (chr1 >= 19968 && chr1 <= 171941) {// 汉字范围 \u4e00-\u9fa5 (中文)
                result += "\\u" + Integer.toHexString(chr1);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    /**
     * 计算MD5
     *
     * @param input
     * @return
     */
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes("utf-8"));//保证在不同环境下使用相同的字符编码,否则在不同环境下input.getBytes()的结果可能是不一样的。
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32
            // chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext.toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();
    private static final int[] ESCAPE_CODES = CharTypes.get7BitOutputEscapes();

    private static String writeUnicodeEscape(char c) throws IOException {
        StringBuffer sb = new StringBuffer();
        sb.append('\\');
        sb.append('u');
        sb.append(HEX_CHARS[(c >> 12) & 0xF]);
        sb.append(HEX_CHARS[(c >> 8) & 0xF]);
        sb.append(HEX_CHARS[(c >> 4) & 0xF]);
        sb.append(HEX_CHARS[c & 0xF]);
        return sb.toString().toLowerCase();
    }

    private static String writeShortEscape(char c) throws IOException {
        StringBuffer sb = new StringBuffer();
        sb.append('\\');
        sb.append(c);
        return sb.toString();
    }

    public static String getMD5(String timestamp, String data, String appPassword) {
        String input = timestamp + data + appPassword;
        return getMD5(input);
    }

    public static void main(String[] args) {

        String unicodeStr = Md5Util
                .chinaToUnicode("{\"body\":{\"data\":{\"source_order_id\":\"14476408940400\"},\"errno\":20101,\"error\":\"百度外卖:创建订单失败，根据商品名称:麻辣小龙虾>36g\\/只_小份;商户ID:10849534620407109966;找不到系统中对应的商品数据(Fe14101a)\"},\"cmd\":\"resp.order.create\",\"secret\":\"5a5cdda47e233d9c\",\"source\":\"65478\",\"ticket\":\"7B33DD36-F938-29DE-7277-26C9FFFB485A\",\"timestamp\":1447640943,\"version\":\"2.0\"}");
        String md5 = Md5Util.getMD5(unicodeStr);
        System.out.println(md5);
    }
}
