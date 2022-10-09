import java.util.Scanner;

public class Student{
    int studentId;
    String studentName;
    double marks;
    void input(){
        System.out.println("Enter your student id");
        Scanner sc = new Scanner(System.in);
        this.studentId = sc.nextInt();
        System.out.println("Enter your Name");
        Scanner sc1 = new Scanner(System.in);
         this.studentName= sc1.nextLine();
        System.out.println("Enter your marks");
        Scanner sc2 = new Scanner(System.in);
        this.marks= sc2.nextDouble();
        sc.close();
        sc1.close();
        sc2.close();
    }   
    void output(){
        System.out.println("Your details inputed are " + this.studentId +" " + this.studentName +" "+ this.marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        s1.output();
    }
}