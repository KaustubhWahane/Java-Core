package mypack;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudOperationswithJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//Class.forName("com.mysql.jdbc.Driver");//register driver
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db9", "root", "123kau456stubh");
		PreparedStatement st=cn.prepareStatement("update courses set sname=? where cname =?");
		st.setString(1, "Yokoso");
		int n=st.executeUpdate();
		System.out.println(n + "row updated to table courses");
		
cn.close();
	}

}
