package com.forecast.weather.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

public class DateTimeUtil {
	static Logger log = Logger.getLogger("DateTimeUtil");
	private static final String DAY_3LETTER_FORMAT="EEE";
	private static final String DAY_FORMAT="EEE";
	private static final String MILLISECONDS_FORMAT="SSS";
	public static String convertMilliSecondsToDateFormat(String formatDate,String milliseconds){
		log.info(">>>>>>>>>>>>>>>  Entering convertStringToDateFormat ()  >>>>>>>>>>>>>>>");
		String formatDateTime ="";
		log.info("Get milliseconds ::"+milliseconds);
		if(!StringUtil.isNullOrEmpty(milliseconds)){
			DateTimeFormatter strFormat = DateTimeFormatter.ofPattern(MILLISECONDS_FORMAT);
			LocalDate dateTime = LocalDate.parse(milliseconds, strFormat);
			log.info("Given Date : " + dateTime);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDate);
			formatDateTime = dateTime.format(formatter);
			log.info("Date Formatted :: " + formatDateTime);
		}
        return formatDateTime;
	}
	public static String getDay3Letters(String milliseconds){
        String formatDay = convertMilliSecondsToDateFormat(DAY_3LETTER_FORMAT,milliseconds);
        return formatDay;
	}
	public static String getDay(String milliseconds){
        String formatDay = convertMilliSecondsToDateFormat(DAY_FORMAT,milliseconds);
        return formatDay;
	}
}
