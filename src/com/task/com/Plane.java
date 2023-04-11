package com.task.com;
import java.util.Scanner;

public class Plane implements Vehicle
{

	public void vehicleDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the plane name");
		String s=sc.nextLine();
		
	}

	public void fuelConsumption() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Distance of kilo metre");
		int km=sc.nextInt();
		System.out.println("A plane consumes 12 liters of fuel per kilometer \n ");
		int f=12,fuel;
		fuel=f*km;
		System.out.println(fuel+"L your distance for requires this amount of fuel");	
	}
	public void mileageCalculator() 
	{
	System.out.println("A plane like a uses approximately 1 gallon (about 4 liters) of fuel every second.\n Over the course of a 10-hour flight, it might burn 36,000 gallons (150,000 liters).\n The 747 burns approximately 5 gallons of fuel per mile\n (12 liters of fuel per kilometer).");
	}

	

}
