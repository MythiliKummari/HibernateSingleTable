package com.Inheritance.model;
import javax.persistence.Column;

import javax.persistence.Entity;

@Entity

public class FourWheeler extends Vehicle 
{
	@Column(name="steering_wheel")
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public FourWheeler(int vehicleId, String vehicleName, String steeringWheel) {
		super(vehicleId, vehicleName);
		this.steeringWheel = steeringWheel;
	}

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(int vehicleId, String vehicleName) {
		super(vehicleId, vehicleName);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}




