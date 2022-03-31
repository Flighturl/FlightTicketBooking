package com.kingflyer.flightbooking.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.Model.Admin;
import com.kingflyer.flightbooking.Model.Flight;

@Repository
public interface AdminRepo extends JpaRepository<Flight, Integer> {
	public Optional<Flight> findByRemainingEconomySeats(int remainingEconomySeats);

	public Optional<Flight> findByArrivalLocation(String arrivalLocation);

	
    public Flight UpdateFlightById(int flightId);

	public Admin save(Admin ad);
}
