package com.Flights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Flights.entity.Flight;
import com.Flights.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightService flightservice;
	
	@GetMapping("/user/{userid}")
	public List<Flight> getflights(@PathVariable("userid") Long userid){
		
		return this.flightservice.getflights(userid);
	}
	
}
