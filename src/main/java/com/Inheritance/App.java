package com.Inheritance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.Inheritance.model.FourWheeler;
import com.Inheritance.model.TwoWheeler;
import com.Inheritance.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
         Session session=sessionFactory.openSession();
         session.beginTransaction();
         
         try 
         {
         	Vehicle vehicle=new Vehicle();
         	vehicle.setVehicleName("Lamborghini");
         	
         	TwoWheeler bike=new TwoWheeler();
         	bike.setVehicleName("Bajaj");
         	bike.setSteeringHandle("Bajaj steering Handle");
         	
         	FourWheeler car=new FourWheeler();
         	car.setVehicleName("Mahindra");
         	car.setSteeringWheel("Mahindra Steering wheel");
         	
         	session.save(vehicle);
         	session.save(bike);
         	session.save(car);
         	
         	session.getTransaction().commit();
         		
         }
         finally 
         {
         	 session.close();
         	 sessionFactory.close();
         }
         
     }
  }

