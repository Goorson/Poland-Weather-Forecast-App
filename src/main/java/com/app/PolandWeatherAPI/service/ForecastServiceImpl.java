package com.app.PolandWeatherAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.PolandWeatherAPI.entity.FetchedForecastEntity;


@Service
public class ForecastServiceImpl implements ForecastService {
	
	//Defined url for the forecast API
	@Value("${external.api.url}")
	private String forecastAPIUrl;

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<FetchedForecastEntity> getForecastForFiveBiggestCities(){
		
		List<FetchedForecastEntity> citiesForecast = new ArrayList<>();
		
		// Create an Array of five biggest polish cities
		String[] cities = {"Warsaw", "Cracow", "Lodz", "Wroclaw", "Poznan"};
		
		// Loop through the cities and retrieve all forecasts
		for(int i = 0; i < 5; i++) {
			FetchedForecastEntity result = retrieveCityByName(cities[i]);
			citiesForecast.add(result);
		}
		
		return citiesForecast;
	}

	private FetchedForecastEntity retrieveCityByName(String cityName) {
		
		// Get result of fetching the data from the weather API
		FetchedForecastEntity result = restTemplate.getForObject(forecastAPIUrl+cityName, FetchedForecastEntity.class);
		return result;
	}


}
