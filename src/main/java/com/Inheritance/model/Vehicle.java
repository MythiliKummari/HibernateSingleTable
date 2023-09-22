package com.Inheritance.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)


public class Vehicle 
{
	@Id
	@GeneratedValue
	@Column(name="vehicle_id")
    private int vehicleId;
	
	@Column(name="vehicle_name")
    private String vehicleName;

	public int getVehicleId() 
	{
		return vehicleId;
	}
	public void setVehicleId(int vehicleId)
	{
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() 
	{
		return vehicleName;
	}

	public void setVehicleName(String vehicleName)
	{
		this.vehicleName = vehicleName;
	}

	public Vehicle(int vehicleId, String vehicleName) 
	{
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
	}
  public Vehicle() 
    {
	super();
		// TODO Auto-generated constructor stub
	}
	}


