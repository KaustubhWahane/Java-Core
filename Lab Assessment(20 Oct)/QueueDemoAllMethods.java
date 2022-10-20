import java.util.*;
 
public class QueueDemoAllMethods {
    public static void main(String[] args) 
    {
         Queue<Integer> Q = new LinkedList<Integer>();
 
        // I am adding numbers to the queue
        Q.add(7855);
        Q.add(3566);
        Q.add(5278);
        Q.add(7438); 
        // Printing Queue using Iterator class
        Iterator<Integer> it = Q.iterator();
        System.out.println("Contents of the queue: ");
        while(it.hasNext()) {
           System.out.println(it.next());
        }

 
        // Remove Method
        System.out.println("Queue's remove method: " + Q.remove());
 
         // Peek Method
        System.out.println("Queue's peek method: " + Q.peek()); 

         // Poll Method
        System.out.println("Queue's poll method: " + Q.poll()); 
        
        // Pop Method
        System.out.println("Queue's poll method: " + ((LinkedList<Integer>) Q).pop()); 


    }
}