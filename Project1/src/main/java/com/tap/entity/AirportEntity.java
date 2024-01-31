package com.tap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airportentity")
public class AirportEntity {
	
	@Id
	@Column(name="id")
	int id;
	@Column(name="name")
	String name;
	@Column(name="location")
	String loc;
	@Column(name="noofplanes")
	int noofplanes;
	@Column(name="noofrunway")
	int noofrunway;
	
	public AirportEntity() {
	}

	public AirportEntity(int id, String name, String loc, int noofplanes, int noofrunway) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.noofplanes = noofplanes;
		this.noofrunway = noofrunway;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getNoofplanes() {
		return noofplanes;
	}

	public void setNoofplanes(int noofplanes) {
		this.noofplanes = noofplanes;
	}

	public int getNoofrunway() {
		return noofrunway;
	}

	public void setNoofrunway(int noofrunway) {
		this.noofrunway = noofrunway;
	}
	
	

}
