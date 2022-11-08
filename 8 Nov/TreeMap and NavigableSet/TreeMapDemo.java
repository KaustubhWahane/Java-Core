import java.util.TreeMap;  
import java.util.Map;  
class TreeMapDemo {  
 public static void main(String args[]) {  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Kaustubh");    
      map.put(102,"Wahane");    
      map.put(101,"Sekiroyooo");    
      map.put(103,"Luffy");    
      
    //   Using for each loop by using the Map Interface to printing the key and  value elements
      for(Map.Entry<Integer,String> m:map.entrySet()){    
       System.out.println(m.getKey() + " " + m.getValue());    
      }    
     }  
}  