package com.beatles.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date utility
 * 
 * @author zhang lj
 * @createTime 2018年1月16日 上午9:47:53
 */
public class DateUtils {
	private final static String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";

	/**
	 * Get current Datetime
	 * 
	 * @return
	 */
	public static String getCurrentDateTime() {
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
		return format.format(new Date());
	}

	/**
	 * let type of Date format to String
	 * 
	 * @param date
	 * @return
	 */
	public static String date2String(Date date) {
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
		return format.format(date);
	}
}
