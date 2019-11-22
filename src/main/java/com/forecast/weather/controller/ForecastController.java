package com.forecast.weather.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.forecast.weather.model.Forecast;
import com.forecast.weather.model.Forecast.daily.data;
import com.forecast.weather.service.ForecastService;
import com.forecast.weather.util.DateTimeUtil;

@Controller
public class ForecastController {
	@Autowired
	ForecastService forecastService;
	
	@GetMapping("/")
    public ModelAndView display() {
		List<Forecast> forecast=forecastService.getForeCastList();
		for(Forecast fcast:forecast) {
			int index=0;
			for(data data:fcast.getDaily().getData()) {
				data.setSummary(DateTimeUtil.getDay(index++));
				data.setDewPoint(Math.round(data.getDewPoint()));
			}
		}
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("forecast", forecast);
		return modelAndView;		
	}
}

