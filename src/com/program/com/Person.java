package com.program.com;

public class Person implements EmployeeRules,FamilyRules
{
	public void dotask()
	{
	
	}
	public void relocate()
	{
	System.out.println("other state");	
	}
	public void workhours()
	{
	System.out.println(" Work hours :8 hours per day");	
	}
	public void dresscode()
	{
	System.out.println("Dress code :Formal");	
	}
	public void eattogether()
	{
	System.out.println("Eat to gether with family members");	
	}
	public void helptomother()
	 {
	 System.out.println("He has to help his mother cook"); 
	 }
	public void respectparents()
	 {
	  System.out.println("He should respect those he has parents");	 
	 }


	public static void main(String[] args) 
	{
	 Person obj=new Person();
	 obj.dotask();
	 System.out.println("Employee rules:");
	 System.out.println("Salary "+obj.salary);
     System.out.println("leave days"+obj.leave);
	 obj.relocate();
     obj.dresscode();
     obj.workhours();
     System.out.println("Family Rules:");
     obj.helptomother();
     obj.eattogether();
     obj.respectparents();
   
     
	}

}
