package pookage;

public class Restaurant_main {

	public static void main(String[] args) {
		
		//This topic is about Runtime Polymorphism
		Restaurant r1 = new Food_Factory().getHotel();
		
		Hotelcheck h1 = new Hotelcheck();
		if(r1 != null) {
		h1.hotelcheck(r1);
		}
		else {
			System.out.println("Sorry we don't have the typed hotel you want");
		}
		
	}

}
