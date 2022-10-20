import java.util.*;   
public class StudentList { 
    public static void main(String[] args) 
    { 
              ArrayList<String> arrlist = new ArrayList<String>(); 
  
            // adding element to arrlist 
            arrlist.add("I"); 
            arrlist.add("love"); 
            arrlist.add("playing"); 
            arrlist.add("games"); 
  
              // using listIterator() method 
            ListIterator<String>  iterator = arrlist.listIterator(); 
  
            // Printing the elements value in forward direction
            while (iterator.hasNext()) { 
                System.out.println("Value are : " + iterator.next()); 
            } 
            ListIterator<String>  iterator2 = arrlist.listIterator(); 
  
            // Printing the elements value in reverse direction
            while (iterator.hasPrevious()) { 
                System.out.println("Value are : " + iterator2.previous()); 
            } 
    } 

 }