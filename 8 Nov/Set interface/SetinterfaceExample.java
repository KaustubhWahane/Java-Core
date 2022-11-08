import java.util.Set;
import java.util.HashSet;
public class SetinterfaceExample {
    public static void main(String[] args)  {
        Set<Integer> hash_Set = new HashSet<Integer>();
        hash_Set.add(51);
        hash_Set.add(52);
        hash_Set.add(53);
        hash_Set.add(54);
        hash_Set.add(55);
        // Using the contain method to check the element
        System.out.println(hash_Set.contains(54));
        // Using for each loop to print all the elements
        for(int i : hash_Set){
            System.out.println(i);
        }
    }
}