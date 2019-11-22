package com.forecast.weather.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;

public class RestAPIUtil {
	static Logger log = Logger.getLogger("RestAPIUtil");
	private static final String ASCII_UTF_8="UTF-8";
	private static final int HTTP_SUCCESS_STATUS_CODE=200;
	public static BufferedReader getDarkSkyRestAPI(String connectionUrl,String reqMethod){
		log.info(">>>>>>>>>> Entering getDarkSkyRestAPI() >>>>>>>>>>>>>");
		log.info("DarkSky URL :: "+connectionUrl);
		log.info("DarkSky Req Method :: "+reqMethod);
		URL url=null;
		HttpsURLConnection conn=null;
		BufferedReader br =null;
		try {
			url=new URL(connectionUrl);
		} catch (MalformedURLException ex) {
			log.error(ex.toString());
		}
		try {
			conn=(HttpsURLConnection)url.openConnection();
			conn.setRequestMethod(reqMethod);
			conn.setRequestProperty("Content-Type",MediaType.APPLICATION_JSON_VALUE);
			conn.connect();
			int responseCode=conn.getResponseCode();
			if(responseCode!=HTTP_SUCCESS_STATUS_CODE){
				log.info("Http Response Code"+responseCode);
			}else{
				br = new BufferedReader(new InputStreamReader(conn.getInputStream(),ASCII_UTF_8));
			}
		} catch (IOException ex) {
			log.error(ex.getMessage());
		}
		return br;
	}
}
