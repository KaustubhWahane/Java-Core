package mypack3;

public class AllOperators {

	public static void main(String[] args) {
		
		//This is Arithmetic Operators
	    int a = 5, b = 2;

	    // Addition
	    System.out.println("a + b = " + (a + b));

	    // Subtraction 
	    System.out.println("a - b = " + (a - b));

	    // Multiplication 
	    System.out.println("a * b = " + (a * b));

	    // Division 
	    System.out.println("a / b = " + (a / b));

	    // Modulus
	    System.out.println("a % b = " + (a % b));
	    
	    
	    //This is Assignment Operators
	    int b1 = 4;
	    int var;

	    // Assign value using =
	    var = b1;
	    System.out.println("Var using =: " + var);

	    // Assign value using =+
	    var += b1;
	    System.out.println("Var using +=: " + var);

	    // Assign value using =*
	    var *= b1;
	    System.out.println("Var using *=: " + var);
	    
	    //The rest of arithmetic operators are the same
	    
	  //This is Relational Operators
	    
	    int c = 7, d = 11;

	    // value of a and b
	    System.out.println("a is " + c + " and b is " + d);

	    // == operator
	    System.out.println(c == d);  

	    // Not equals != operator
	    System.out.println(c != d);  

	    // Greater than > operator
	    System.out.println(c > d);  

	    // Lesser than < operator
	    System.out.println(c < d);  

	    //Greater than or equal to >= operator
	    System.out.println(c >= d);  

	    // Lesser than or equal to <= operator
	    System.out.println(c <= d); 
	    
	    //This is Logical Operators
	    
	    // And && operator
	    System.out.println((5 > 3) && (8 > 5));  
	    System.out.println((5 > 3) && (8 < 5));  

	    // Or || operator
	    System.out.println((5 < 3) || (8 > 5));  
	    System.out.println((5 > 3) || (8 < 5));  
	    System.out.println((5 < 3) || (8 < 5));  

	    // Not equal to ! operator
	    System.out.println(!(5 == 3));  
	    System.out.println(!(5 > 3));
	    
	    
	    //This is Unary Operator
	    int e = 12, f = 12;
	    int result1, result2;

	    // Original value
	    System.out.println("Value of a: " + e);

	    // Increment operator
	    result1 = ++e;
	    System.out.println("After increment: " + result1);

	    System.out.println("Value of b: " + f);

	    // Decrement operator
	    result2 = --f;
	    System.out.println("After decrement: " + result2);
	    
	    //This is Bitwise Operator
	    int g = 5;
        int h = 7;
 
        // bitwise and 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (g & h));
 
        // bitwise or 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (g | h));
 
        // bitwise Xor 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (g ^ h));
	    
        //This is ternary operator
        int n1 = 5, n2 = 10, max, min;
        
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
        // Smallest among n1 and n2
        min = (n1 < n2) ? n1 : n2;
 
        // It will print the largest number
        System.out.println("Maximum is = " + max);
        System.out.println("Minimum is = " + min);
	}

}
