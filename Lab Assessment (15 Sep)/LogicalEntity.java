/*
Program - Real time logical Entity
author - Kaustubh Wahane
Date - 15 Sep 2022
*/
class LogicalEntity
{
	//Declaring local variables
	String color;
	String penName;
	String ink;
	
	//This is a Default constructor
	LogicalEntity() 
	{
		System.out.println(color + penName + ink);
	}
	// This is a two parameter type constructor
	LogicalEntity(String p, String c) 
	{
		this.penName = p; 
		this.color = c ;
		System.out.println("Two parameter type constructor");		
	}
	// This is a three parameter type constructor
	LogicalEntity(String p, String c , String i)
	{
	  	this.penName = p; 
		this.color = c ;
		this.ink = i;
		System.out.println("Three parameter type constructor");	
	}
	
	//Now creating three void methods to store the respective three parameter types values
	void showData1()
	{
		System.out.println("This pen name "+ penName);
	}
	void showData2()
	{
		System.out.println("This pen name "+ penName + "and it's color" + color);
	}
	void showData3()
	{
		System.out.println("This pen name "+ penName + "and it's color" + color + "the ink it has is " + ink);
	}
	//Calling the main method here
	public static void main (String ... args)
	{
		LogicalEntity l1 = new LogicalEntity();
		l1.showData();
		LogicalEntity l2 = new LogicalEntity("Trimax" , "Black");
		l1.showData2();
		LogicalEntity l3 = new LogicalEntity("Trimax" , "Black" , "Red-Type");
		l1.showData3();
		
	}
}