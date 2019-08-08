package com.bhouma.app.bhouma.service.impl;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bhouma.app.bhouma.service.GeoService;
import com.bhouma.app.bhouma.service.vo.Geo;

@Component
public class GeoServiceImpl implements GeoService {

	@Autowired
	private RestTemplate restTemplate;
	public static final String GEO_API_TEMPLATE = "https://geocode.xyz/?locate=%s&geoit=JSON";
	public static final Logger LOGGER = LoggerFactory.getLogger(GeoServiceImpl.class);
	
	public GeoServiceImpl() {
		//this.restTemplate = restTemplate;
	}
	
	@Override
	public Geo getLocationByCity(String cityName) {
		URI url;
		try {
			String str = String.format(GEO_API_TEMPLATE, cityName);
			url = new URI(str);
			LOGGER.debug("url : {}, {}", cityName, str);
			ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
			LOGGER.debug(result.getBody());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Geo.builder().latitude("122").latitude("321").build();
	}

	
	
}
