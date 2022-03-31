package com.kingflyer.flightbooking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.kingflyer.flightbooking.Model.Flight;
import com.kingflyer.flightbooking.Repository.FlightRepo;
import com.kingflyer.flightbooking.Service.FlightService;


	@SpringBootTest
	public class FlightTests {

		@MockBean
		FlightRepo repo;

		@Autowired
		FlightService service;

		@Test
		public void findByDepartureLocationAndArrivalLocation() {
			String departureLocation = "Pune";
			String ArrivalLocation = "Chennai";

			when(repo.findByDepartureLocationAndArrivalLocation(departureLocation, ArrivalLocation))
					.thenReturn(Stream.of( new Flight(56,"Pune","Chennai",9,10,90,LocalDate.parse("2021-07-06"),LocalDate.parse("2021-07-15"))).collect(Collectors.toList()));

			assertEquals(1, service.findByDepartureLocationAndArrivalLocation(departureLocation, ArrivalLocation).size());
		}
		
	}


