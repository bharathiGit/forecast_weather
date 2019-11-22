package com.forecast.weather.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

public class DateTimeUtil {
	static Logger log = Logger.getLogger("DateTimeUtil");
	private static final String DAY_3LETTER_FORMAT="EEE";
	public static String getDay(int addDay){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, addDay);
		SimpleDateFormat sdf = new SimpleDateFormat(DAY_3LETTER_FORMAT);
		String formatDay = sdf.format(cal.getTime());
        return formatDay.toUpperCase();
	}
}
