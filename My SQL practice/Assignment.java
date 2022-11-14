import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//		Class.forName("com.mysql.jdbc.Driver");//register driver
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "123kau456stubh");
		Statement st=cn.createStatement();
		int n=st.executeUpdate("insert into students values(101,'Kaustubh',24000)");
		int x=st.executeUpdate("insert into students values(102,'Sakshi',69000)");
		int z=st.executeUpdate("insert into students values(103,'Neelam',15000)");
		System.out.println(n +x+z+"rows inserted");
			
	}
}