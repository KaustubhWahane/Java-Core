/*
Program - To create a pattern of * in X-shape
author - Kaustubh Wahane
Date - 8 Sep 2022
*/

//Creating a class
class XPattern
{
	static void createPatternX()
	{
		int rows = 3;
		for (int i = 1; i <= 5; i++) 
		{
			//In this situation for loop I can't do this so i have left this program and its incorrect
			for ( int k = 1; k <= 5; k++)
			{
				System.out.println(" ");
			}
			for (int j = 1 ; j <= i; j++)
			{
				System.out.print("* ");
			} 
		  System.out.println();
		}
	}
	//calling the main method
	public static void main (String args[])
	{
		createPatternX();
	}
}