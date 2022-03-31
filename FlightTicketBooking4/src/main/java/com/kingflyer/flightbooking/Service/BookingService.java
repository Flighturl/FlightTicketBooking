package com.kingflyer.flightbooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.Model.Booking;
import com.kingflyer.flightbooking.Repository.BookingRepo;

@Component
@Service
public class BookingService {

	@Autowired
	private  BookingRepo bookingrepo;
	
	public Booking addBooking(Booking b) {
		
		
				return bookingrepo.save(b);
	}

	

}
