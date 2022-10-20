import java.util.TreeMap;
import java.util.Map;
class TreeMapDemo{
    public static void main(String[] args) {
        Map<String, Integer> tree = new TreeMap<String, Integer>();
        
        //Adding elements
        tree.put("One", 1);
        tree.put("Five", 5);
        tree.put("Three", 3);
        //Removing one element
        tree.remove("One");

        //Updating one element
        tree.replace("Three", 10);
        
      System.out.println("TreeMap: " + tree);
    }
}