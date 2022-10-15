import java.util.Scanner;

public class EvenNumbersRange {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        Evennumbers(n); 
        sc.close();
    }
 
    //Making a separate static method which will check n
         static void Evennumbers(int n)
        {
            System.out.println("Even numbers are: ");
            for(int i=0;i<=n;i+=2)
            {
            System.out.print(i+"  ");   
            }
        }
}
        

