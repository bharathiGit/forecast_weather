package com.forecast.weather.service;

import java.util.List;

import com.forecast.weather.model.Forecast;

public interface ForecastService {
	public Forecast getForeCastInformation(String latlon);
	public List<Forecast> getForeCastList();
}
