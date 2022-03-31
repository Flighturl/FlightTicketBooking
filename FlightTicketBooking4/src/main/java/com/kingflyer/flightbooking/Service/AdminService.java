package com.kingflyer.flightbooking.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.Model.Admin;
import com.kingflyer.flightbooking.Model.Flight;
import com.kingflyer.flightbooking.Repository.AdminRepo;

@Service

public class AdminService {

	private static String FLIGHT_NOT_FOUND_WITH_ID = "Flight with Id: ";
	@Autowired
	private AdminRepo adminrepo;

	public boolean addFlight(Flight flight) throws Exception {

		Optional<Flight> checkFlight = adminrepo.findById(flight.getFlightId());
		if (!checkFlight.isPresent()) {
			adminrepo.save(flight);
			return true;
		}

		else
			throw new Exception(FLIGHT_NOT_FOUND_WITH_ID + flight.getFlightId() + " already exists");

	}

	public boolean deleteFlight(int flightId) throws Exception {

		Optional<Flight> findById = adminrepo.findById(flightId);
		if (findById.isPresent()) {
			adminrepo.deleteById(flightId);
			return true;
		} else
			throw new Exception(FLIGHT_NOT_FOUND_WITH_ID + flightId + " not exists");

	}

	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}
	 public Optional<Flight> findByFlightId(int id) {
	        return adminrepo.findById(id);
	    }
	    public Optional<Flight> findByRemainingEconomySeats(int remainingEconomySeats) {
	        return adminrepo.findByRemainingEconomySeats(remainingEconomySeats);
	    }
}
	

	