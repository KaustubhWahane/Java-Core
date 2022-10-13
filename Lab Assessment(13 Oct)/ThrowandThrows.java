package mypack2;

public class ThrowandThrows {
	static void checkNumber(int number)throws ArithmeticException {
	    if (number == 18) {
	    	 throw new ArithmeticException("The number is not the perfect number ");
	    }
	    else {
	      System.out.println("The number is the perfect number");
	    }
	   }
	public static void main(String[] args) {
		 checkNumber(18);
		 checkNumber(20);

	}

}
