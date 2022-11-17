package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudOperations {
	static Connection cn;
	public static void connection()throws SQLException {
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123kau456stubh");
	}
	
	public static void create() throws SQLException {
		PreparedStatement s1 = cn.prepareStatement("create table Students(Sid int primary key , Sname varchar(20), marks int, course varchar(10));");
		ResultSet rs = s1.executeQuery();
		System.out.println(rs+ "table created");
	}
	
	public static void read() throws SQLException {
		PreparedStatement s1 = cn.prepareStatement("select * from Students");
		ResultSet rs = s1.executeQuery();
		System.out.println(rs + "Details shown");
	}
	
	public static void insert() throws SQLException {
		PreparedStatement s1 = cn.prepareStatement("");
		//1st Data 		
		s1.setInt(1, 001);
		s1.setString(2, "Kaustubh");
		s1.setInt(3, 30000);
		s1.setString(4, "JavaScript");
		//2nd Data		
		s1.setInt(1, 002);
		s1.setString(2, "Sakshi");
		s1.setInt(3, 40000);
		s1.setString(4, "Java");
		//3rd Data		
		s1.setInt(1, 003);
		s1.setString(2, "Vanga");
		s1.setInt(3, 50000);
		s1.setString(4, "Python");
		ResultSet rs =s1.executeQuery();
		System.out.println("Data inserted to table");
	}
	
	public static void update() throws SQLException {
		PreparedStatement s1 = cn.prepareStatement("update Students set Sname=? where Sid=?");
		ResultSet rs = s1.executeQuery();
		System.out.println(rs + "Data updated");
	}

	public static void delete() throws SQLException {
		PreparedStatement s1 = cn.prepareStatement("delete from Students where Sid=003");
		ResultSet rs = s1.executeQuery();
		System.out.println(rs + "Row deleted");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Mentioning all the methods to use CRUD operations all at once
		//Connection to connect all the CRUD operations		
		connection();
		//Creating a table		
		create();
		//Inserting the data
		insert();
		//Updating a particular row		
		update();
		//Checking all the column data		
		read();
		//Deleting one row from the table		
		delete();
		cn.close();
		//4)Create Students.txt file and store details in Emp table?		
		
	
	}
}
