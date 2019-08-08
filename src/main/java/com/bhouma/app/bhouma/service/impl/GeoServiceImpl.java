package com.bhouma.app.bhouma.service.impl;

import org.springframework.web.client.RestTemplate;

import com.bhouma.app.bhouma.service.GeoService;
import com.bhouma.app.bhouma.service.vo.Geo;

public class GeoServiceImpl implements GeoService {

	private RestTemplate restTemplate;
	public static final String GEO_API_TEMPLATE = "https://geocode.xyz/?locate=%s&geoit=JSON";
	
	public GeoServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Override
	public Geo getLocationByCity(String cityName) {
		String url = String.format(GEO_API_TEMPLATE, cityName);
		return null;
	}

	
	
}
