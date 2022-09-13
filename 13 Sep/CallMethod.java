/*
Program - To print the sum of the digits by user input
author - Kaustubh Wahane
Date - 13 Sep 2022
*/

//Creating a class
class CallMethod
{
	int pin;
	String policeStation;
	String city; 
	void info(int p , String s , String c)
	{
		pin = p;
		policeStation = s;
		city = c;
		
	}
	void info()
	{
		System.out.println("The pin of the location is " + pin  );
		System.out.println("The pin of the location is " +  pin + " The PoliceStation is " +  policeStation); 
		System.out.println("The pin of the location is " +  pin + " The PoliceStation is " +  policeStation + "The City is " + city);        
	}
	public static void main (String args[])
	{
		CallMethod c1  = new CallMethod();
		c1.pin = 43; 
		c1.policeStation = "Mumbai Police ";
		c1.city = "BOMBAYYYY";
		c1.info();
	}
}