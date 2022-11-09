package com.app.PolandWeatherAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.PolandWeatherAPI.entity.FetchedForecastEntity;
import com.app.PolandWeatherAPI.service.ForecastService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
public class ForecastController {
	
	@Autowired
	private ForecastService forecastService;

	@Operation(summary = "Find forecasts for 5 biggest Cities in Poland", description = "Searches for and retrieves chosen forecast data for cities in Poland from https://www.weatherapi.com/")
	@GetMapping("/forecast/fiveBiggest")
	public List<FetchedForecastEntity> getForecastByCityName(){
		
		// Get the list of forecasts
		List<FetchedForecastEntity> citiesForecast = forecastService.getForecastForFiveBiggestCities();
		
		return citiesForecast;
	}

}
