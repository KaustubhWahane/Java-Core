package collection;
import java.util.Collection;  
import java.util.LinkedList;  
public class Customer{  
 public static void main(String args[]){  
    Collection<Object> data1 =new LinkedList<Object>();  
           data1.add(01);  
           data1.add("Kaustubh");  
           data1.add(69000); 
           Collection<Object> data2 =new LinkedList<Object>();  
           data2.add(02);  
           data2.add("Luffy");  
           data2.add(80000); 
           Collection<Object> data3 =new LinkedList<Object>();  
           data3.add(03);  
           data3.add("Yhwach");  
           data3.add(99999);
           data1.addAll(data2); 
           data1.addAll(data3); 
       for(Object x : data1){
        System.out.println(x);
       }
 }  
}  