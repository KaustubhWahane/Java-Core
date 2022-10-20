import java.util.LinkedHashMap;

class LinkedHashMapDemo {
 
    // Main driver method
    public static void main(String args[])
    {
        LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();
        hm1.put(3, "Kaustubh");
        hm1.put(2, "Yokoso");
        hm1.put(1, "Luffy");
 
        // Printing the elements  
        System.out.println("Elements before using remove method added are : "+ hm1);

        //Removing one element
        hm1.remove(3);
        System.out.println("Elements after using remove method added are : "+hm1);  
        
         //Updating the first key  element
        hm1.replace(1, "Naruto");
        System.out.println("After updating the element" + hm1);
    }
}