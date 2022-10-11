	/*
			A typical structure of a Java
			program contains the following elements:
			
			Documentation Section
			Package Declaration
			Import Statements
			Interface Section
			Class Definition
			Class Variables and Variables
			Main Method Class
			Methods and Behaviors
	 */
	/*
	 Every program has a chronological order which is
	 package >> import >> class >> Interface >> Class define > Class variables & methods >> Main method >> Method behaviors
	 */
	//This is package in which the class is placed.
	package mypack4;
	
	//We use the import keyword to import the class or classes, Here i used Scanner class. 
	import java.util.Scanner;
	
	// We use the interface keyword to create an interface. 
	interface StructureImagination {
		void start();  
		void stop(); 
	}
	
	//We use the class keyword to define the class.
	public class Structure implements StructureImagination {
	
		//we define variables and constants that are to be used later in the program.
		static String name = "Kaustubh";
		static int y = 69;
		
		//These are the two methods defined by user to implement on specific use
		public void start() {
			System.out.println("To start a program");
		}
		
		public void stop() {
			System.out.println("To stop a program");
		}
		
		/*This is the main method + method behavior
		 The methods are the set of instructions that we want to perform. 
		 */
		public static void main(String[] args) {
			
			//Importation of Scanner class
			Scanner s1 = new Scanner(System.in);
			
			System.out.println("Enter any number");
			int x = s1.nextInt();
			s1.close();
			//This is a printstream which prints to console(Output_
			System.out.println(x);
			
			System.out.println(name);
			
			System.out.println(y);
	
		}
	
	}
