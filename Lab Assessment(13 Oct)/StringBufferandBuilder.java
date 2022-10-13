package mypack2;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		
		//String buffer class
		  StringBuffer sb = new StringBuffer("Hello ");
		  StringBuffer sb2 = new StringBuffer("Yokoso");
		  //Equals method
		    System.out.println(sb.equals(sb2));
		  
		    //Reverse method
		    System.out.println(sb.reverse());
		    
		    //Append Method
		    System.out.println(sb.append("Yokoso"));
		    
		  	//Insert method
	        sb.insert(0, "Java"); 
	        System.out.println(sb);
	        
	        //Delete method
	        System.out.println(sb2.delete(0, 4));
	}

}
