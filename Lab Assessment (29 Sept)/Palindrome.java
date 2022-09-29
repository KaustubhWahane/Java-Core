import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        String input= sc.nextLine();
        //checking whether it's palindrome or not
        sc.close();
        if(isPalindrome(input))
        {
            System.out.println(input+" is a Palindrome string");
        }
        else
        {
            System.out.println(input+" is not a Palindrome string");
        }
    }
 
    public static boolean isPalindrome(String str) {

        //taking left side of string as the index of 0
        //taking right side of string as the length by subtracting -1 from it
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        //If it's a string then we will return the value
        return true;
    } 
}