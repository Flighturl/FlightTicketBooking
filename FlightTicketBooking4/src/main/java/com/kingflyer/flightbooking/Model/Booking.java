package com.kingflyer.flightbooking.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {
	private static final long serialVersionUID = 1L;
	@Id
	
	private int BookingId;
	private long bookingNumber;
	private LocalDate bookingDate;
	private LocalDate travelDate;
	private double totalCost;
	private int seatsBooked;
	private String seatClass;

	public int getBookingId() {
		return BookingId;
	}

	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}

	public long getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	@Override
	public String toString() {
		return "Booking [BookingId=" + BookingId + ", bookingNumber=" + bookingNumber + ", bookingDate=" + bookingDate
				+ ", travelDate=" + travelDate + ", totalCost=" + totalCost + ", seatsBooked=" + seatsBooked
				+ ", seatClass=" + seatClass + "]";
	}
	

	public Booking( int bookingId, long bookingNumber, LocalDate bookingDate,
			LocalDate travelDate, double totalCost, int seatsBooked, String seatClass) {
		super();
		BookingId = bookingId;
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.totalCost = totalCost;
		this.seatsBooked = seatsBooked;
		this.seatClass = seatClass;
	}

	public Booking() {
		super();

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
