package com.kingflyer.flightbooking.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.Model.Booking;

@Repository
public interface BookingRepo extends CrudRepository<Booking, Integer>{
	
	
	
	 

}
