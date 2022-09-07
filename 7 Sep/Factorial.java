/*
Program - To print the factorial number of any positive number
author - Kaustubh Wahane
Date - 7 Sep 2022
*/

//Creating a class
import java.util.Scanner;
class Factorial
{  
	 static void factorial()
	{  
	//Making three integer values
		  int n, c, f = 1;
		System.out.println("Enter a number to calculate its factorial ");
		//Gettin user input
		Scanner in = new Scanner(System.in);
		//Storing the user input to value n 
		n = in.nextInt();
		// Using if else because we don't want to find the factorial of negative numbers
		if (n < 0)
		  System.out.println("Number should be non-negative. ");
		else
		{
		  for (c = 1; c <= n; c++)
			f = f*c;

		  System.out.println("Factorial of "+ n +" is = " + f); 
			  
		}		  
	
	}	
	//calling the main method
	public static void main (String args[])
	{
		factorial();
	}	
}  