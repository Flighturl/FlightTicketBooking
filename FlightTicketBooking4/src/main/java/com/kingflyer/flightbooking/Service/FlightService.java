package com.kingflyer.flightbooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.Model.Flight;
import com.kingflyer.flightbooking.Repository.FlightRepo;

@Service

public class FlightService {

	@Autowired
	FlightRepo repo;

	public Flight addFlightDetails(Flight f) {

		return repo.save(f);
	}

		public List<Flight> findByDepartureLocationAndArrivalLocation(String departureLocation, String arrivalLocation) {
		return repo.findByDepartureLocationAndArrivalLocation(departureLocation,arrivalLocation);
	}



	
}
