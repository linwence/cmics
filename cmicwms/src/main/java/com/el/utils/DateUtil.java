package com.el.utils;

import java.text.ParseException;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 此工具类 对时间的操作
 *
 * @author zhanhao
 */
public class DateUtil {

	/**
	 * @param format
	 *            日期格式 默认 yy-MM-dd
	 * @param date
	 *            日期
	 * @return String
	 */
	public static String formatDate(String format, Date date) {
		if (date == null) {
			return "";
		}
		if (format == null || "".equals(format)) {
			format = "yyyy-MM-dd";
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.format(date);
	}

	/**
	 * 重载
	 *
	 * @param format
	 *            日期格式 默认 yy-MM-dd
	 * @param date
	 *            日期
	 * @return String
	 */
	public static String formatDate(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(date);
	}

	/**
	 * 儒略历转成日期 date
	 *
	 * @param date
	 * @return 返回date日期类型
	 */
	public static java.util.Date juLianToDate(int date) {
		int year = (date / 1000) + 1900;
		int dayOfYear = date % 1000;

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);

		return calendar.getTime();
	}

	/**
	 * 儒略历转成日期字符串
	 *
	 * @param date
	 * @return
	 */
	public static String juLianFormatDate(Integer date) {
		if (date == null) {
			return "";
		}
		Date dateJ = juLianToDate(date);
		return formatDate(dateJ);
	}

	/**
	 * data日期类型 转换为儒略历格式
	 * 
	 * @param date
	 * @return int
	 */
	public static int dateToJuLian(java.util.Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR) - 1900;
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		return year * 1000 + dayOfYear;
	}

	/**
	 * 日期字符串类型（yyyy-MM-dd） 转换为儒略历格式
	 * 
	 * @param date
	 * @return int
	 */
	public static int dateStrToJuLian(String str) {
		if ("".equals(str) || str == null)
			return 0;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		int time = 0;
		try {
			date = simpleDateFormat.parse(str);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int year = calendar.get(Calendar.YEAR) - 1900;
			int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
			time = year * 1000 + dayOfYear;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}

	/**
	 * 获取当前时间的时间戳 返回是年月日时分秒 例如20161026101049
	 * 
	 * @return
	 */
	public static String getTimeStamp() {
		Calendar calendar = Calendar.getInstance();
		Date nowDate = calendar.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyyMMddHHmmss");
		return simpleDateFormat.format(nowDate);
	}

	public static void main(String[] args) {
		String now = DateUtil.getTimeStamp();
		System.out.println(now);
	}

}
