import java.util.Scanner;

public class Largest  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        sc.close();
        //Comparing numbers, a with b and a with c   
        if(a>=b && a>=c)  {
        System.out.println(a+" is the largest Number");  
        }
        
        //Comparing b with a and b with c  
        else if (b>=a && b>=c){  
        System.out.println(b+" is the largest Number");  
        }
        else  {
        
        System.out.println(c+" is the largest number");  
        }
    }
}
