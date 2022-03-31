package com.kingflyer.flightbooking.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.Model.Flight;


@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer> {

	

	List<Flight> findByDepartureLocationAndArrivalLocation(String departureLocation, String arrivalLocation);

	

	
	
	
	
	
}
