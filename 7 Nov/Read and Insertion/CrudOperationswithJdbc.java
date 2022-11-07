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
		PreparedStatement st=cn.prepareStatement("insert into courses values(?,?,?)");
		st.setString(2, "C-Lang");
		st.setString(1, "Kaustubh");
		st.setInt(3, 15000);
		int n=st.executeUpdate();
		System.out.println(n + "row inserted to table courses");
		
cn.close();
	}

}
