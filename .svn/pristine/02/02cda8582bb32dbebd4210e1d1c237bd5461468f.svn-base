package com.el.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Created on 16/4/28.
 *
 * @author panlw
 */
public final class DateUtil {

    private static final Logger log = LoggerFactory.getLogger(DateUtil.class);

    private static final String UI_YMD_FMT = "yyyy-M-d";
    private static final SimpleDateFormat UI_YMD = new SimpleDateFormat(UI_YMD_FMT);
    private static final String UI_HMS_FMT = "HH:mm:ss";
    private static final SimpleDateFormat UI_HMS = new SimpleDateFormat(UI_HMS_FMT);

    /**
     * Convert Date to LocalDate.
     * @param d
     * @return
     */
    public static LocalDate toLocalDate(Date d) {
        return d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * 两个日期之间的天数
     * @param from
     * @param to
     * @return 天数
     */
    public static long daysBetween(Date from, Date to) {
        return DAYS.between(toLocalDate(from), toLocalDate(to));
    }

    /**
     * @param phpTime PHP的time()返回值
     * @return 日期
     */
    public static Date toDate(Long phpTime) {
        Date t = new Date();
        t.setTime(phpTime * 1000);
        return t;
    }

    /**
     * 从现在到指定日期的天数
     * @param to
     * @return 天数
     */
    public static long daysTo(Date to) {
        if (to == null) return 0;
        return DAYS.between(LocalDate.now(), toLocalDate(to));
    }

    /**
     * @return 日期日历(时,分,秒,毫秒均为0)
     */
    public static Calendar pureDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal;
    }

    /**
     * 计算制定日期一周以后的日期
     * @param date 制定日期
     * @return 一周以后的日期
     */
    public static Date oneWeekAfter(Date date) {
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.WEEK_OF_YEAR, 1);
        return cal.getTime();
    }

    /**
     * Format date to text.
     * @param date date
     * @return ymd
     */
    public static String toYmd(Date date) {
        return date == null ? "" : UI_YMD.format(date);
    }

    /**
     * Format date to text.
     * @param date date
     * @return hms
     */
    public static String toHms(Date date) {
        return date == null ? "" : UI_HMS.format(date);
    }

    /**
     * Parse text to date.
     * @param ymd ymd
     * @return null if parsing error
     */
    public static Date fromYmd(String ymd) {
        if (StringUtils.isEmpty(ymd)) {
            return null;
        }
        try {
            return UI_YMD.parse(ymd);
        } catch (ParseException e) {
            log.debug(String.format(
                "[SMS] Parsing date format(%s) error: %s", UI_YMD_FMT, ymd));
            return null;
        }
    }

    private DateUtil() {}

}
