import java.util.HashSet;
import java.util.Iterator;

class HashSetExample {
   public static void main(String[] args){
       HashSet<String> hashSet = new HashSet<String>();
       hashSet.add("Soul");
       hashSet.add("Watashiwa");
       hashSet.add("Yokoso");
      //Add Duplicate Element
      hashSet.add("Society");
      Iterator iterator = hashSet.iterator(); 
  
        System.out.println("List elements are: "); 
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); 
        }
   }
}