package com.app.PolandWeatherAPI.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Forecast {
	
	private List<ForecastDay> forecastday;
	
}
