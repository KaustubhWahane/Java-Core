package mypack;
import java.io.*;
import java.sql.*;
public class CrudOperationswithJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//Class.forName("com.mysql.jdbc.Driver");//register driver
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db9", "root", "123kau456stubh");
		PreparedStatement st=cn.prepareStatement("drop table courses");
        st.executeUpdate("drop table courses");
		System.out.println("Table successfully deleted");		
        cn.close();
	}

}