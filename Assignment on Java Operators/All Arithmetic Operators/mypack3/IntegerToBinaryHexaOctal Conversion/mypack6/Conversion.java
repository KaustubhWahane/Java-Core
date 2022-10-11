package mypack6;

public class Conversion {

	public static void main(String[] args) {
		//Integer to HexaDecimal
		  int val = 768;
	       System.out.println("Integer: "+val);
	       //Using the toHexString method
	       	System.out.println("Hex String = " + Integer.toHexString(val));

	      //Integer to Decimal
	       	int i = 5647;
	       	float j = (float) (((float) i)/1000.0);
	       	System.out.println(j);
	       	
	      //Integer to Octal & Using the toOctalString method	
	        System.out.println("Octal String = " + Integer.toOctalString(val));    	
	}
}
