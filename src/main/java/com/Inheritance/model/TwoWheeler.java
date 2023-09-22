package com.Inheritance.model;
import javax.persistence.Column;

import javax.persistence.Entity;

@Entity

public class TwoWheeler extends Vehicle
{
	@Column(name="steering_handle")
	private String steeringHandle;

	public String getSteeringHandle() 
	{
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) 
	{
		this.steeringHandle = steeringHandle;
	}

	public TwoWheeler(int vehicleId, String vehicleName, String steeringHandle) {
		super(vehicleId, vehicleName);
		this.steeringHandle = steeringHandle;
	}
    public TwoWheeler() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
  public TwoWheeler(int vehicleId, String vehicleName)
	{
		super(vehicleId, vehicleName);
		// TODO Auto-generated constructor stub
	}
	}




