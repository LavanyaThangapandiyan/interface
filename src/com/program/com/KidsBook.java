package com.program.com;
import java.util.Scanner;
public class KidsBook implements Book
{
 
	@Override
	public void solvingPuzzle()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Book name");
		 String name=sc.nextLine();
		 String st="solvingPuzzle";
		 boolean contains = name.contains(st);
		 if(contains==true)
		 System.out.println("This is puzzle book");
		 else
	
		 System.out.println("not puzzle book");
			  
	}

	@Override
	public void solvingQuiz()
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s="solvingQuiz";
		boolean contentEquals = s1.contentEquals(s);
		if(contentEquals==true)
			System.out.println("It's a Solving Quiz Book");
		else
			System.out.println("Not a Soving Quiz Book");
		
	}

	@Override
	public void fillingColors() {
		
		String st1="fillingColors";
		boolean equals = st1.equals(st1);
		if(equals==true)
			System.out.println("It's a Fillingcolors Book");
		else
			System.out.println("Not a coloring Book");
	}

	@Override
	public void matchingPictures() 
	{
	Scanner in=new Scanner(System.in);
	String picture=in.nextLine();
	String str="matchingPictures";
	boolean contentEquals = str.contains(str);
	if(contentEquals==true)
		System.out.println("It's a Matching Picture Book");
	else
		System.out.println("Not A Matching Picture Book");
	}
	public void bookDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Author name");
		String authorname=sc.nextLine();
		System.out.println("Enter the year of the book released");
		int year=sc.nextInt();
		System.out.println("Enter Price of the Book");
		int price=sc.nextInt();
		if(price>0) 
		{
		System.out.println("valid ");
	
		System.out.println("Enter the title of the book");
		String title=sc.next();
		
		}
		else
		{
			System.out.println("Please enter valid price of the Book");
		}
		
		
	}

}
