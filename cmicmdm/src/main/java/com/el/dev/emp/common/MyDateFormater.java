package com.el.dev.emp.common;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Vincent on 2016/8/22.
 */
public class MyDateFormater implements Formatter<Date> {
    public Date parse(String s, Locale locale) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(s);

    }

    public String print(Date date, Locale locale) {
        return null;
    }
}
