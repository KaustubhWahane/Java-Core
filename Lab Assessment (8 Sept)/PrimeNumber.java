/*
Program - To check if it's prime number or not
author - Kaustubh Wahane
Date - 8 Sep 2022
*/

//Creating a class
class PrimeNumber
{   
	//Creating a static method
    static void checkPrimeNumber(int n)
	{
		boolean checkNumber = false;
		//Creating a for loop if the number is more than 1 or infinity
			for (int i = 2; i <= n / 2; i++)
				{
				  //This is the condition for non prime number
						  if (n % i == 0) 
						  {
			
							checkNumber= true;
							break;
					      }
				}

		if (!checkNumber) // If the number is true
		  System.out.println(n + " is a prime number.");
		else
		  System.out.println(n + " is a composite number");
	}
	//calling the main method
	public static void main (String args[])
	{
		checkPrimeNumber(2);
		checkPrimeNumber(69);
		checkPrimeNumber(7);
		checkPrimeNumber(30);
	}
}