package com.ride.com;




public class Parent 
{
		   public void doYoga()
		   {
		      System.out.println("good for health");
		   }
		   public void newsReading()
		   {
			   System.out.println("Reading newspapers will improve your knowledge");
		   }
		}

		class Son extends Parent
		{
		   public void doYoga() 
		   {
		      System.out.println("Yoga is good for Health");
		   }
		}

		class Main 
		{
		   public static void main(String[] args) 
		   {
		      Son obj = new Son();
		      obj.newsReading();
		      obj.doYoga();
		   }
		}




