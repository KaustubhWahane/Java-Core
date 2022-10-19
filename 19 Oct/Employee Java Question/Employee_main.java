package myoack;
import java.util.*;

//Using Comparable Interface to compare the Employee Id Numbers
class Employee  implements Comparable<Employee>
{
	int eid;
	String ename;
	double salary;
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee details are [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(eid == o.eid) 
			return 0; 
			else if(eid > o.eid) 
			return 1; 
			else 
			return -1;
	}
}
public class Employee_main {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(69, "Kaustubh", 26000)); 
		al.add(new Employee(619, "Luffy", 27000)); 
		al.add(new Employee(169, "Ichigo", 21000));
		
		//Using the collections class
		 Collections.sort(al); 
		 
		 Iterator iterator = al.iterator(); 
		 System.out.println("List elements : "); 
		 while (iterator.hasNext()) {
		 System.out.print(iterator.next() + " "); 
		 System.out.println(); 
		 }
	}

}
