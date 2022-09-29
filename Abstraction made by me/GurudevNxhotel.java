package pookage;

public class GurudevNxhotel extends Hotel {
	
	@Override
	void tables() {
		System.out.println("We have 45 tables in our hotel");
	}
	
	@Override
	void billing() {
		System.out.println("We have five managers for processing payments");
	}
	
	void specialDish() {
		System.out.println("We have Paneer chicken");
	}
}
