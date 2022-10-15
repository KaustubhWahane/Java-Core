import java.util.Scanner;

public class NumbersIntoWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
        sc.close();

	    String words[] = {"Zero", "One", "Two", "Three", "Four", 
                         "Five", "Six","Seven","Eight","Nine"}; 
        int ones = num % 10;  //Removing every last digit from num and storing in ones variable  

        System.out.println("The word for "+words[ones]+" is"); 

        int tens=(num/10) % 10; //extracting tens digit from num and storing in tens variable  

        if (tens==1){          //if tens=1, then print tens like 11,12,13...19  
            System.out.print(words[tens*10+ones]);    
         }    
             if (tens!=0 && ones!=0){  
                System.out.print("-");
             }
             if (ones>0){
                 System.out.print(words[ones]);
                 }
                    else{
                        System.out.print(words[tens]); }
                    }
            }
