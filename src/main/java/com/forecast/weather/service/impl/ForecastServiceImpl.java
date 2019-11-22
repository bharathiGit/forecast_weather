package com.forecast.weather.service.impl;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.forecast.weather.ForecastURLConstant;
import com.forecast.weather.model.Forecast;
import com.forecast.weather.service.ForecastService;
import com.forecast.weather.util.RestAPIUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service("forecastService")
public class ForecastServiceImpl implements ForecastService{
	
	@Value("${darksky.forecast.url}")
	private String darkSkyForecastURL;
	
	@Value("${darksky.forecast.secret.key}")
	private String darkSkySecretKey;
	
	@Value("${darksky.forecast.request.method}")
	private String reqMethod;
	
	@Value("${campbell_lat_lon_value}")
	private String cambellLatLon;
	
	@Value("${omaha_lat_lon_value}")
	private String omahaLatLon;
	
	@Value("${sustin_lat_lon_value}")
	private String sustinLatLon;
	
	@Value("${niseko_lat_lon_value}")
	private String nisekoLatLon;
	
	@Value("${nara_lat_lon_value}")
	private String naraLatLon;
	
	@Value("${jakarta_lat_lon_value}")
	private String jakartaLatLon;
	
	@Override
	public Forecast getForeCastInformation(String latlon) {
		String connectionURL=darkSkyForecastURL+darkSkySecretKey+ForecastURLConstant.FORWARD_SLASH+latlon;
		BufferedReader forecastInfo=RestAPIUtil.getDarkSkyRestAPI(connectionURL, reqMethod);
		Gson gson = new GsonBuilder().create();
		Forecast forecast =null;
		if(forecastInfo!=null){
			forecast = gson.fromJson(forecastInfo, Forecast.class);
			String city="";
			String forecastLatLon=forecast.getLatitude()+","+forecast.getLongitude();
			// Specified location hardcoded here. otherwise refer to Geolocation API
			if(cambellLatLon.contains(forecastLatLon)) {
				city="Campbell,CA  ";
			}else if(omahaLatLon.contains(forecastLatLon)) {
				city="Omaha,NE  ";
			}else if(sustinLatLon.contains(forecastLatLon)) {
				city="Austin,TX ";
			}else if(nisekoLatLon.contains(forecastLatLon)) {
				city="Niseko,Japan  ";
			}else if(naraLatLon.contains(forecastLatLon)) {
				city="Nara,Japan  ";
			}else if(jakartaLatLon.contains(forecastLatLon)) {
				city="Jakarta,Indonesia  ";
			}else {
				city="";
			}
			forecast.setTimezone(city+forecast.getTimezone());
		}
		return forecast;
	}
	@Override
	public List<Forecast> getForeCastList() {
		List<Forecast> forecastList=new ArrayList<Forecast>();
		forecastList.add(getForeCastInformation(cambellLatLon));
		forecastList.add(getForeCastInformation(omahaLatLon));
		forecastList.add(getForeCastInformation(sustinLatLon));
		forecastList.add(getForeCastInformation(nisekoLatLon));
		forecastList.add(getForeCastInformation(naraLatLon));
		forecastList.add(getForeCastInformation(jakartaLatLon));
		return forecastList;
	}

}
