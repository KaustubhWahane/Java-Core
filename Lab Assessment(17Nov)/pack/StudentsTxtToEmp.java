package pack;
import java.io.*;
import java.io.PrintWriter;
public class StudentsTxtToEmp {
	    public static void main(String[] args) throws IOException {
	        FileOutputStream fin  = new FileOutputStream("emp.txt");
	        if(fin.exists()){
	        	fin.createNewFile();
	        }
	        PrintWriter p1 = new PrintWriter(file);
	        p1.println("Student name: - Kaustubh");
	        p1.println("Student id: - 25");
	        p1.println("Student marks - 60");
	        p1.println("Student course - JavaScript");
	        p1.close();
	        System.out.println("Done");
	}
}
