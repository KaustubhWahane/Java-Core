package pookage;

import java.util.LinkedList;

public class StudentsData {

	public static void main(String[] args) {
		StudentsData s1 = new StudentsData();
		s1.studentDetails();
}
	
	public void studentDetails() {
		LinkedList<Object> l1 = new LinkedList<Object>();
		System.out.println("The following details are printed as \n RollNo \n Name \n Programming Languages");
		l1.add(5);	
		l1.add("Kaustubh");	
		l1.add("JavaScript");
		
		l1.add(2);	
		l1.add("Anushka");	
		l1.add("Java");
		
		l1.add(001);	
		l1.add("Vanga");	
		l1.add("No programming languages");
		
		for(Object s:l1) {
			System.out.println(s);
		}
		
		}
}

