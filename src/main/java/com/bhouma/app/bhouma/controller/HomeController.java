package com.bhouma.app.bhouma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhouma.app.bhouma.service.GeoService;
import com.bhouma.app.bhouma.service.vo.Geo;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private GeoService geoService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String getHome () {
		return "hi";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/location/{cityName}")
	@ResponseBody
	public Geo getCoordinates (@PathVariable(required=true) String cityName) {
		Geo geo = geoService.getLocationByCity(cityName);
		return geo;
	}
}
