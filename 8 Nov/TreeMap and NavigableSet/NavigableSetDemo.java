import java.util.NavigableSet;
import java.util.TreeSet;
public class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet<String> ns = new TreeSet<String>();
		ns.add("Yokoso");
		ns.add("Watashiwa");
		ns.add("Soul");
		ns.add("Society");
        
          //   Using for each loop by using the Map Interface to printing the key and  value elements
        for (String value : ns)
        System.out.print(value + " ");
        System.out.println();
	}
}
