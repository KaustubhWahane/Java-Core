import java.io.FileOutputStream;
import java.io.IOException;

 class EmployeeDetailsFileHandling {
    // I have created the non static method to create the object of this instance of class
	void setFile() throws IOException {
		try {
			FileOutputStream file = new FileOutputStream("E://EmployeeDetails.txt");
			String empId = "Employee ID:52 " + "\n" + "Employee Name: Kaustubh "  + "\n" + "Employee Salary: 50000 ";
			byte[] byteArrEmp = empId.getBytes();
			file.write(byteArrEmp);
			System.out.println("File has been written successfully");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	public static void main(String[] args) throws IOException {
		EmployeeDetailsFileHandling emp1 = new EmployeeDetailsFileHandling();
		emp1.setFile();
	}
}