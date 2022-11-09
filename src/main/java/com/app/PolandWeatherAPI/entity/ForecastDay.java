package com.app.PolandWeatherAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ForecastDay {
	
	private String date;
	private DayElement day;
	
}
