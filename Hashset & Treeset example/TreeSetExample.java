import java.util.Iterator;
import java.util.TreeSet;
class TreeSetExample {
   public static void main(String[] args){
      TreeSet<String> treeset = new TreeSet<String>();
      treeset.add("My");
      treeset.add("Name?");
      treeset.add("Is");
      //Add Duplicate Element
      treeset.add("Kaustubh");
      Iterator iterator = treeset.iterator(); 
  
        System.out.println("List elements are: "); 
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); 
        }
   }
}