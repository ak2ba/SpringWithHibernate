package com.tap.acad;

import org.springframework.stereotype.Component;

@Component
public class Airport {
	String airportName;
	String airportLocation;
	boolean isAirportInternational;
	int noOfRunways;
	Runway runway;

	public Airport() {
		// TODO Auto-generated constructor stub
	}

	public Airport(String airportName, String airportLocation, boolean isAirportInternational, int noOfRunways,
			Runway runway) {
		super();
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.isAirportInternational = isAirportInternational;
		this.noOfRunways = noOfRunways;
		this.runway = runway;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	public boolean isAirportInternational() {
		return isAirportInternational;
	}

	public void setAirportInternational(boolean isAirportInternational) {
		this.isAirportInternational = isAirportInternational;
	}

	public int getNoOfRunways() {
		return noOfRunways;
	}

	public void setNoOfRunways(int noOfRunways) {
		this.noOfRunways = noOfRunways;
	}

	public Runway getRunway() {
		return runway;
	}

	public void setRunway(Runway runway) {
		this.runway = runway;
	}

}
