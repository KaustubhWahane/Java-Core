package pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudMySql {
	static Connection cn;
	public static void connection()throws SQLException {
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123kau456stubh");
	}
	
	public static void create() throws SQLException {
		Statement s1 = cn.createStatement();
		ResultSet n = s1.executeQuery("create table studentData(rollNo int primary key, studentName varchar(20));");
		System.out.println(n+ "table inserted");
	}
	
	public static void read() throws SQLException {
		Statement s1 = cn.createStatement();
		ResultSet y = s1.executeQuery("select * from studentData");
		System.out.println(y + "row deleted");
	}
	
	public static void insert() throws SQLException {
		Statement s1 = cn.createStatement();
		ResultSet x = s1.executeQuery("insert into studentData(12, 'Kaustubh'),(13, 'Sakshi'),(14, 'Vanga'),(15, 'Nashedi')");
		System.out.println(x + "rows inserted");
	}
	
	public static void update() throws SQLException {
		Statement s1 = cn.createStatement();
		int y = s1.executeUpdate("update studentData set studentName where rollNo =12");
		System.out.println(y + "row updated");
	}

	public static void delete() throws SQLException {
		Statement s1 = cn.createStatement();
		int y = s1.executeUpdate("delete from studentData where rollNo=13");
		System.out.println(y + "row deleted");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Mentioning all the methods to use CRUD operations all at once		
		connection();
		create();
		read();
		update();
		delete();
	}

}
