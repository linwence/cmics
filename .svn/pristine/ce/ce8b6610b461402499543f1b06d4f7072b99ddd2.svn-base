package com.el.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

/**
 * Created on 16/4/24.
 *
 * @author panlw
 * @see <a href="http://www.kirix.com/stratablog/jd-edwards-date-conversions-cyyddd">JD Edwards Date Conversions (CYYDDD)</a>
 */
public final class JdeDateUtil {

    /**
     * 今天(儒日历)
     */
    public static final String JDE_TODAY = "(TO_CHAR(SYSDATE, 'yyyyddd') - 1900000)";

    /**
     * Julian 日历的起始年份
     */
    private static final int JULIAN_YEAR = 1900;
    /**
     * Julian CYYDDD 中的 DDD 部分
     */
    private static final int THOUSAND = 1000;

    /**
     * Julian HHMM 中的 HH 部分
     */
    private static final int TEN_THOUSANDS = 10000;
    /**
     * Julian HHMM 中的 MM 部分
     */
    private static final int HUNDRED = 100;

    /**
     * 计算指定小数位数的放大倍数.
     * @param dec 小数位数
     * @return 放大倍数
     */
    public static BigDecimal dec2zoom(int dec) {
        return BigDecimal.valueOf((long)Math.pow(10, dec));
    }

    /**
     * @param ymd yyyy-M-d
     * @return JDE日期
     */
    public static Integer toJdeDateYmd(String ymd) {
        return toJdeDate(DateUtil.fromYmd(ymd));
    }

    /**
     * @param date 日期
     * @return JDE日期
     */
    public static Integer toJdeDate(Date date) {
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(YEAR);
        int dayOfYear = cal.get(DAY_OF_YEAR);
        return (year - JULIAN_YEAR) * THOUSAND + dayOfYear;
    }
    /**
     * @param jdeDate JDE日期
     * @return 日期
     */
    public static Date fromJdeDate(Integer jdeDate) {
        if (jdeDate == null) {
            return null;
        }
        Calendar cal = DateUtil.pureDate();
        cal.set(YEAR, JULIAN_YEAR + jdeDate / THOUSAND);
        cal.set(DAY_OF_YEAR, jdeDate % THOUSAND);
        return cal.getTime();
    }

    /**
     * @param date 时间
     * @return Jde时间
     */
    public static Integer toJdeTime(Date date) {
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(HOUR_OF_DAY) * TEN_THOUSANDS
            + cal.get(MINUTE) * HUNDRED + cal.get(SECOND);
    }

    /**
     * @param jdeTime JDE日期
     * @return 日期
     */
    public static Date fromJdeTime(Integer jdeTime) {
        if (jdeTime == null) {
            return null;
        }
        Calendar cal = DateUtil.pureDate();
        cal.set(HOUR_OF_DAY, jdeTime / TEN_THOUSANDS);
        cal.set(MINUTE, (jdeTime % TEN_THOUSANDS)/HUNDRED);
        cal.set(SECOND, jdeTime % HUNDRED);
        return cal.getTime();
    }

    /**
     * JDE单价: 小数位数
     */
    private static final int DEC_PRC = 4;
    /**
     * JDE数量: 小数位数
     */
    private static final int DEC_QTY = 3;
    /**
     * JDE金额: 小数位数
     */
    private static final int DEC_AMT = 2;

    /**
     * 四舍五入取整
     * @param num 数值
     * @return 整数值
     */
    public static BigDecimal toIntNumber(BigDecimal num) {
        return num.setScale(0, RoundingMode.HALF_UP);
    }
    /**
     * @param prc 单价
     * @return JDE单价
     */
    public static BigDecimal toJdePrc(BigDecimal prc) {
        return toIntNumber(prc.movePointRight(DEC_PRC));
    }
    /**
     * @param prc JDE单价
     * @return 单价
     */
    public static BigDecimal fromJdePrc(BigDecimal prc) {
        return prc.movePointLeft(DEC_PRC);
    }
    /**
     * @param qty 数量
     * @return JDE数量
     */
    public static BigDecimal toJdeQty(BigDecimal qty) {
        return toIntNumber(qty.movePointRight(DEC_QTY));
    }
    /**
     * @param qty JDE数量
     * @return 数量
     */
    public static BigDecimal fromJdeQty(BigDecimal qty) {
        return qty.movePointLeft(DEC_QTY);
    }
    /**
     * @param amt 金额
     * @return 金额
     */
    public static BigDecimal toJdeAmt(BigDecimal amt) {
        return toIntNumber(amt.movePointRight(DEC_AMT));
    }
    /**
     * @param amt JDE金额
     * @return 金额
     */
    public static BigDecimal fromJdeAmt(BigDecimal amt) {
        return amt.movePointLeft(DEC_AMT);
    }

    private JdeDateUtil() {}
}
