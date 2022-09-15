/*
Program - Employee salary
author - Kaustubh Wahane
Date - 15 Sep 2022
*/
class Employee
{
	public static void main (String ...args)
	{
		int averageSalary = 10000;
		int Emp1 = 11000;
		int Emp2 = 5000;
		int remainingEmployee = (averageSalary * 3) - (Emp1 + Emp2) ; //Reason is there are 3 employees so multiplied by 3
		System.out.println("Therefore the Average Salary of the third employee will be " + remainingEmployee);
	}
}