import java.util.*;
    class HashMapDemo {
    public static void main(String args[]) {
    HashMap<String, Double> hm = new HashMap<String, Double>();
    // Putting the elements to the map
    hm.put("Nashedi Yo",  (3434.34));
    hm.put("Devang Vanga", (123.22));
    hm.put("Kaustubh Wahane", (1378.00));
    Set<Map.Entry<String, Double>> set = hm.entrySet();

    //Using the for loop to iterate the set
    for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
            }
            System.out.println();
             //Removing one element from HashMap
                hm.remove("Tod Hall");
                // Depositing 1000 into Kaustubh Wahane account.
                double balance = hm.get("Kaustubh Wahane");
                hm.put("Kaustubh Wahane", balance + 2000);
                System.out.println("Kaustubh Wahane new balance: " +hm.get("Kaustubh Wahane"));
    }
}