package mypack;

import java.util.LinkedList;

class Student{
	int sid;
	String sname;
	String gname;
	public Student(int sid, String sname, String gname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gname = gname;
	}
	
	public String toString() {
		return sid + " " + sname +" "+ gname;
	}
}
public class Student_main {

	public static void main(String[] args) {

		Student s1 = new Student(25, "siva","ece" );
		Student s2 = new Student(27, "manoj","eee" );
		Student s3 = new Student(28, "suraj","ece" );
		Student s4 = new Student(29, "vamsi","cse" );
		Student s5 = new Student(30, "rakesh","ece" );
		Student s6 = new Student(31, "nea","eee" );

		LinkedList<Student> ls = new LinkedList<Student>();
		
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		ls.add(s5);
		ls.add(s6);
		for (Student s: ls) {
			System.out.println(s);
		}

	}

}
