/*
Program - To print the sum of the digits by user input
author - Kaustubh Wahane
Date - 12 Sep 2022
*/

//Creating a class
import java.util.Scanner;
class SumOfDigit
{
	public static void main (String args[])
	{
		//Let's take the following number to assumption as zero
		int num1, sum = 0 ;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the desired number ");
		int number = s1.nextInt();
		while ( number > 0)
		{
			//This finds the last digit of the given number    
			num1= number % 10;
			
			//Now we will add the last digit to the variable sum  
			sum = sum + num1; 
			
			//Last step will be to remove the last digit from the number  
			number = number / 10;
			
			//After this step the digit numbers have been ended so we can't add it any more
			
		}
		//Printing the numbers
		System.out.println("The Sum of Digits: "+ sum);  		
	}
}