package com.Flights.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Flights.entity.Flight;

@Service
public class FlightServiceImpl implements FlightService{

	List<Flight> list=List.of( new Flight(11L,"Airindia","1234",1L),
			new Flight(12L,"india","1234",2L),
			new Flight(13L,"Aindia","124",3L),
			new Flight(13L,"goindia","123",4L));
	
	@Override
	public List<Flight> getflights(Long userid) {
		
		return list.stream()
		   .filter( flight -> flight.getFlightNo().equals(userid)).collect(Collectors.toList());
		
	}

}
