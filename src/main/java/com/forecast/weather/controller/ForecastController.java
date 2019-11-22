package com.forecast.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.forecast.weather.model.Forecast;
import com.forecast.weather.service.ForecastService;

@Controller
public class ForecastController {
	@Autowired
	ForecastService forecastService;
	
	@GetMapping("/")
    public ModelAndView display() {
		List<Forecast> forecast=forecastService.getForeCastList();
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("forecast", forecast);
		return modelAndView;
		//return "home";		
	}
}

