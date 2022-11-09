package com.app.PolandWeatherAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FetchedForecastEntity {
	
	private Location location;
	private Forecast forecast;
	
	
}
