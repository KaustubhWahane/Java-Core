package pookage;

import java.util.Scanner;

public class Food_Factory {

/*
 Imagine this situation you want a specific food from a hotel and this two 
 hotels have it so
 */
	
	//Ye niche ki line sir ko puchunga ki  isme datatype kyu nahi liya
	Restaurant getHotel() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the hotel name");
		String hotelname = sc.nextLine();
		sc.close();
		
		if (hotelname.equalsIgnoreCase("ramdevhotel")) {
			return new Ramdevhotel();
		}
		
		else if(hotelname.equalsIgnoreCase("gurudevhotel")){
			return new Gurudevhotel();
		}
		else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
