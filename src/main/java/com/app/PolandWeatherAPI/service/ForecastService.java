package com.app.PolandWeatherAPI.service;

import java.util.List;

import com.app.PolandWeatherAPI.entity.FetchedForecastEntity;


public interface ForecastService {
	public List<FetchedForecastEntity> getForecastForFiveBiggestCities();
}
