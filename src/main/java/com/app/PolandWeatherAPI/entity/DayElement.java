package com.app.PolandWeatherAPI.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DayElement {
	
	private double maxtemp_c;
	private double mintemp_c;
	private double avgtemp_c;
	private double totalprecip_mm;
	private int avghumidity;
	private double maxwind_kph;

}
