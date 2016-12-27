package com.el.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vincent on 2016/12/1.
 */
public class CommonUtil {
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
}
