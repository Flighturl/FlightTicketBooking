package com.kingflyer.flightbooking.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Flight")
public class Flight {
	private static final long serialVersionUID = 1L;

	@Id

	private int flightId;

	private String departureLocation;

	private String arrivalLocation;

	private int remainingEconomySeats;
	private int remainingPremiumSeats;
	private int remainingBusinessSeats;
	private LocalDate departureTime;
	private LocalDate arrivalTime;

	public Flight() {
		super();
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public int getRemainingEconomySeats() {
		return remainingEconomySeats;
	}

	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}

	public int getRemainingPremiumSeats() {
		return remainingPremiumSeats;
	}

	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}

	public int getRemainingBusinessSeats() {
		return remainingBusinessSeats;
	}

	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Flight(int flightId, String departureLocation, String arrivalLocation, int remainingEconomySeats,
			int remainingPremiumSeats, int remainingBusinessSeats, LocalDate departureTime, LocalDate arrivalTime) {
		super();
		this.flightId = flightId;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.remainingEconomySeats = remainingEconomySeats;
		this.remainingPremiumSeats = remainingPremiumSeats;
		this.remainingBusinessSeats = remainingBusinessSeats;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;

	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", departureLocation=" + departureLocation + ", arrivalLocation="
				+ arrivalLocation + ", remainingEconomySeats=" + remainingEconomySeats + ", remainingPremiumSeats="
				+ remainingPremiumSeats + ", remainingBusinessSeats=" + remainingBusinessSeats + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + "]";
	}

}
