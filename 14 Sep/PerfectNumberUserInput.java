/*
Program - To find the perfect number by user input via given in the range
author - Kaustubh Wahane
Date - 14 Sep 2022
*/

//Creating a class
import java.util.Scanner;
class PerfectNumberUserInput
{
	//This is for the addition of the numbers which are divisible
	static void Perfect(int x  , int y)			
	
		{
			int s  = 0;

			for(int i = x;i <= y; i++)
				{
					if (PerfectNumberUserInput.checkPerfect(i) )
					{
					s = s +1;
					}

				}
				System.out.println( "Total count of perfect number between " + x + " and " + y + " is : " +s );
		}
		
		//Sir this is your method of taking boolean and checking the perfect number
	static boolean checkPerfect(int n)					
		
	{
			int sum=0;

			for(int i = 1; i<n ; i++)
			{
				if( n % i == 0)
				{
				sum= sum + i;
				}
	}

		if(n == sum) 
		return true; return false;
	}
	//The number we have took let's simplify it by taking two methods lowest and largest
	static int checkLowest(int x , int y) // Lowest
	{
		if (x == y)
		{
			return 0;
		}
		else if (x > y)
		{
			return y;
		}
		else if ( x < y)
		{
			return x;
		}
		return;
	}
	static int checkLargest(int x , int y) // Largest
	{
		if (x == y)
		{
			return 0;
		}
		else if (x > y)
		{
			return x;
		}
		else if ( x < y)
		{
			return y;
		}
		
	}
	//Calling the main method to execute all the processes
	public static void main (String ...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();	
		int ff = checkLowest(a , b);
		int kk = PerfectNumberUserInput.Largest(a,b);
		Perfect(ff ,kk);
		
	}
	
}
