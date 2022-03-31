package com.kingflyer.flightbooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.Model.Booking;
import com.kingflyer.flightbooking.Service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingservice;

	@PostMapping("/addBooking")
	@ResponseBody
	public ResponseEntity<String> addBooking(@RequestBody Booking b) {

	 Booking bo = bookingservice.addBooking(b);
		return new ResponseEntity<String>("Seat Booked Successfully", HttpStatus.OK);

	}
}