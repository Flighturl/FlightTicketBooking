package com.kingflyer.flightbooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.Exception.ResourceNotFoundException;
import com.kingflyer.flightbooking.Model.Flight;
import com.kingflyer.flightbooking.Service.FlightService;

@RestController
@RequestMapping("/Flight")
public class FlightController {
	@Autowired
	FlightService flightService;

	@PostMapping("/addFlightDetails")
	public ResponseEntity<String> addFlightDetails(@RequestBody Flight f) {
		System.out.println(f);
		flightService.addFlightDetails(f);

		return new ResponseEntity<String>("Record inserted successfully", HttpStatus.OK);
	}

	@GetMapping("/getSearchDetails/{departureLocation}/{arrivalLocation}")
	public ResponseEntity<List<Flight>> findByDepartureLocationAndArrivalLocation(
			@PathVariable("departureLocation") String departureLocation,
			@PathVariable("arrivalLocation") String arrivalLocation){
		
		
		
		List<Flight> obj = flightService.findByDepartureLocationAndArrivalLocation(departureLocation,
				arrivalLocation);
		if(obj.isEmpty()) {
			throw new ResourceNotFoundException("Given data not found...");
	    	
		}
	      return new ResponseEntity<List<Flight>>(HttpStatus.OK);
	      }
	}


	


	