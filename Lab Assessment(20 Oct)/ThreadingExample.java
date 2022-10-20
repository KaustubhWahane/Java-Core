class ThreadingExample extends Thread{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
    ThreadingExample t1=new ThreadingExample();  
    ThreadingExample t2=new ThreadingExample();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("Kaustubh Wahane");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  