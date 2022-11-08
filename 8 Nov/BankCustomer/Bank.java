import java.util.ArrayList;
import java.util.Iterator;
 
public class Bank {
    public static void main(String[] args) {
        // Creating an ArrayList of Object type
        ArrayList<Object> array = new ArrayList<Object>();
        array.add(101);
        array.add("Kaustubh");
        array.add(5000);
        
        ArrayList<Object> array2 = new ArrayList<Object>();
        array2.add(102);
        array2.add("Sakshi");
        array2.add(6000);

        ArrayList<Object> array3 = new ArrayList<Object>();
        array2.add(103);
        array2.add("Vanga");
        array2.add(7000);

        array.addAll(array2);
        array.addAll(array3);

        // This is for 1st Bank Customer data
        Iterator<Object> iterator = array.iterator();
        System.out.println("The bank customer name are given by there ID, Name and there salary:  ");
        while (iterator.hasNext()){  
            System.out.print(iterator.next() + " ");  
            System.out.println();  
        }
        
    }
}