package com.bhouma.app.bhouma.service;

import com.bhouma.app.bhouma.service.vo.Geo;

public interface GeoService {

	public Geo getLocationByCity (String cityName);
}
