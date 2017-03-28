
package com.el.cmic.utils;

/**
 * 提供对字符串的全角->半角，半角->全角转换
 * Created by Administrator on 3/28/2017.
 */
public class BCConvert {
    /**
     * <PRE>
     * 全角字符->半角字符转换
     * 只处理全角的空格，全角！到全角～之间的字符，忽略其他
     * </PRE>
     */
    public static String qj2bj(String input) {
        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 12288) {
                c[i] = (char) 32;
                continue;
            }
            if (c[i] == 12290) {
                c[i] = (char) 46;
            }
            if (c[i] > 65280 && c[i] < 65375)
                c[i] = (char) (c[i] - 65248);
        }
        return new String(c);
    }

    public static void main(String[] args) {
        // System.out.println(StringUtils.trimToEmpty(" a,b ,c "));
        String s = "髓内钉系统(商品名：T2) 你好（）()nihaoｈｋ　｜　　　ｎｉｈｅｈｅ　，，。。　７８　　７　";

        //s=BCConvert.qj2bj(s);
        s = BCConvert.qj2bj(s);
        System.out.println(s);



    }
}
