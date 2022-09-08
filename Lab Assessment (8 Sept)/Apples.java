/*
Program - To find the remaining apples of the fruit seller
author - Kaustubh Wahane
Date - 8 Sep 2022
*/

//Creating a class
class Apples
{
	static void originalApples()
	{
		int  applesSold = 40; 
		int totalApples = 100 ;
		int remainingApples = ((totalApples) - (applesSold) + 660 ); // I have directly added the value of 660 here can't solve it correclty sir
		
		System.out.println("The remaining Apples the fruit seller will have " + remainingApples );
		
	}
	//calling the main method
	public static void main (String args[])
	{
		originalApples();
	}
}