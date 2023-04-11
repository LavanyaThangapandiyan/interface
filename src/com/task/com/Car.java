package com.task.com;
import java.util.Scanner;
public class Car implements Vehicle
{
    public void vehicleDetails()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your Car brand name");
     String st=sc.nextLine();
     System.out.println("Enter your Car color");
     String s1=sc.nextLine();
     System.out.println("Enter your Car Number");
     long n=sc.nextLong();
    }
	@Override
	public void mileageCalculator()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Please Enter your Travelling Distance :");
	int dis=in.nextInt();
	System.out.println("Enter Today's Fuel price :");
    double price=in.nextDouble();
    double mileage;
    mileage=dis/price;
    System.out.print(mileage+"k.m  The mileage your car consumes for 1 liter of petrol" );
	}

	public void fuelConsumption()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter Fuel price: ");
	int fuel=sc.nextInt();
	System.out.println("Enter the Mileage of your car");
	int mileage=sc.nextInt();	
	int rate;
	rate=fuel/mileage;
	System.out.println("your vehicle travel to the Distance of 1.km cost is =₹"+rate);
	
	}

	
	

}
