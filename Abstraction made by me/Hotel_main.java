package pookage;

import java.util.Scanner;

public class Hotel_main {

	public static void main(String[] args) {
		
		//This topic is about Abstraction
		Hotel h1 = new Kubahotel();
		Hotel h2 = new GurudevNxhotel();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the hotel name you want");
		
		String hotelname = sc.nextLine();
		sc.close();
		
		if(hotelname.equalsIgnoreCase("kubahotel")) {
			h1 = new Kubahotel();
			h1.tables();
			h1.billing();
		}
		
		else if (hotelname.equalsIgnoreCase("GurudevNxhotel")) {
			h2 = new GurudevNxhotel();
			h2.tables();
			h2.billing();
		}
		
		
	}
}
