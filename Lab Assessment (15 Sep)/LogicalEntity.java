/*
Program - Real time logical Entity
author - Kaustubh Wahane
Date - 15 Sep 2022
*/
class LogicalEntity
{
	//Declaring local variables
	int color;
	String penName;
	int ink;
	// This is one parameter type constructor
	LogicalEntity(String p) 
	{
		penName = p; 		
	}
	// This is a two parameter type constructor
	LogicalEntity(String p, int c) 
	{
		penName = p; 
		color = c ;		
	}
	// This is a three parameter type constructor
	LogicalEntity(String p, int c , int i)
	{
	  	penName = p; 
		color = c ;
		ink = i;
	}
	//Now creating  void method to store the respective three parameter types values
	void showData()
	{
		System.out.println("This pen name "+ penName+ " " + "and it's color" + color + " " + "the ink it has is " + " " + ink);
	}
	//Calling the main method here
	public static void main (String ... args)
	{
		
		LogicalEntity l1 = new LogicalEntity("Trimax");
		l1.showData();
		LogicalEntity l2 = new LogicalEntity("RazorPen" , 10);
		l1.showData();
		LogicalEntity l3 = new LogicalEntity("GoldenTrimax" ,  115, 11);
		l1.showData();
		
	}
}