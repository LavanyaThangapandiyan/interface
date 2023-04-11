package com.task.com;
import java.util.Scanner;
public class Boat implements Vehicle
{

	@Override
	public void vehicleDetails() 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Boat name");
	String s=sc.nextLine();	
	}
	@Override
	public void fuelConsumption()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the specific Fuel Consumption");
		float sp=sc.nextFloat();
		System.out.println("Enter the HP");
		long hp=sc.nextLong();
		System.out.println("Enter Fuel Specific Weight ");
		float w=sc.nextFloat();
		double cal;
		cal=(sp*hp)/w;
		System.out.println(cal+"GPH Gallon Per Hour");
	}
	@Override
	public void mileageCalculator()
	{
	
	}

	

}
