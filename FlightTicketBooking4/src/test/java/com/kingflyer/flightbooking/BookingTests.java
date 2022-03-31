package com.kingflyer.flightbooking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.kingflyer.flightbooking.Model.Booking;
import com.kingflyer.flightbooking.Repository.BookingRepo;
import com.kingflyer.flightbooking.Service.BookingService;

@SpringBootTest
public class BookingTests {
	@MockBean
	private BookingRepo repository;

	@Autowired
	private BookingService bookingservice;

	@Test
	public void saveBooking() {
		Booking b = new Booking(8, 456, LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-06"), 4500, 8, "AC");
		when(repository.save(b)).thenReturn(b);
		assertEquals(b, bookingservice.addBooking(b));

	}
}


