package com.task.com;
import java.util.Scanner;
public class TestVehicle 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("choose your vehicle type \n 1. Car \n 2. Plane \n 3. Boat");
	int num=sc.nextInt();
	if(num==1)
	{
		Car obj=new Car();
		System.out.println("CAR DETAILS");
		obj.vehicleDetails();
		System.out.println("If you Want to Mileage Calculation press 1. \n If you want to FuelConsumption press 2.");
		int no=sc.nextInt();
		if(no==1)
			obj.mileageCalculator();
		else if(no==2)
		obj.fuelConsumption();
		else
			System.out.println("Please Enter valid Input");
			
	}
	else if(num==2)
	{
		Plane obj=new Plane();
		System.out.println("PLANE DETAILS");
		obj.vehicleDetails();
		System.out.println("If you want to Calculate PLANE FuelConsumption \n PRESS 1 \n Otherwise if you want to know the fuel level for the flight \n PRESS 2");
		int number=sc.nextInt();
		if(number==1)
			obj.fuelConsumption();	
		else if(number==2)
			obj.mileageCalculator();
		else
			System.out.println("Please Enter valid Input");			
	}
	else
	{
		Boat obj=new Boat();
		System.out.println("BOAT DETAILS");
		obj.vehicleDetails();
		obj.fuelConsumption();
	}}

}
