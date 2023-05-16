package com.Flights.service;

import java.util.List;
import com.Flights.entity.Flight;

public interface FlightService {

	public List<Flight> getflights(Long userid);
}
