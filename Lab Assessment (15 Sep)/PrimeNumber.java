/*
Program - To find the prime number by user input via given in the range
author - Kaustubh Wahane
Date - 15 Sep 2022
*/
import java.util.Scanner;
class PrimeNumber
{
   public static void main (String ...args)
   {
	//Let's take the first and second number which is the last as this variables
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the two numbers ");
	 int first = sc.nextInt(); //This will store the first variable
	 
	 int first = sc.nextInt(); //This will store the second variable
	 
	 int second = sc.nextInt();
     for (int i = first ; i <= second ; i++) //Here i am taking the first number as the smaller and the second number as larger
       if (checkPrime (i)) //using the static method
	   {
        System.out.println (i);
	   }
   }
   
//Taking return type as boolean
   static boolean checkPrime (int n)
   {
     int checkNumber = 0;

     // As this numbers 0, 1 negative numbers are not prime
     if (n < 2)
       return false;

     // checking the number of divisors between 1 and the number n-1
     for (int i = 2; i < n; i++)
       {
		if (n % i == 0)
        return false; //This will return the divisors of the number 
       }
     // if the value reached here then must be true		
     return true; //This will reached that the value is prime number 
	
   }
 
}