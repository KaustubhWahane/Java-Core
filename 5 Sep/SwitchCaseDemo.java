/*
Name - Kaustubh Wahane
Date -  5 Sept 2022
Program - Switch Demo
*/
//Importing Scanner method
import java.util.Scanner;

//Creating a new class 
class SwitchCaseDemo 
{
	public static void main(String[] args)
  {
		
		char operator;
		Double number1, number2, result;

		// Creating an object of Scanner class
		Scanner input = new Scanner(System.in);

		// Getting user input for operator to use 
		System.out.println("Choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);
		
		//Input for first number
		System.out.println("Enter first number");
		number1 = input.nextDouble();
		
		//Input for second number
		System.out.println("Enter second number");
		number2 = input.nextDouble();

		switch (operator) 
		{

			// Performing addition between numbers
					  case '+':
						result = number1 + number2;
						System.out.println(number1 + " + " + number2 + " = " + result);
						break;

					  // Performing subtraction between numbers
					  case '-':
						result = number1 - number2;
						System.out.println(number1 + " - " + number2 + " = " + result);
						break;

					  // Performing multiplication between numbers
					  case '*':
						result = number1 * number2;
						System.out.println(number1 + " * " + number2 + " = " + result);
						break;

					  // Performing division between numbers
					  case '/':
						result = number1 / number2;
						System.out.println(number1 + " / " + number2 + " = " + result);
						break;
						
						//If the valid operator is a wrong input 
					  default:
						System.out.println("The operator you have inputted is wrong ");
						break;
					}

    
  }
}