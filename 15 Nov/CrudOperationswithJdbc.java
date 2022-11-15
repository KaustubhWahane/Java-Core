package mypack;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudOperationswithJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//Class.forName("com.mysql.jdbc.Driver");//register driver
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "123kau456stubh");
		PreparedStatement st=cn.prepareStatement("insert into emp values(?,?,?)");
		st.setInt(1, 12);
		st.setString(2, "Kaustubh");
		st.setInt(3, 30000);
		st.setInt(1, 13);
		st.setString(2, "Sakshi");
		st.setInt(3, 15000);
		st.setInt(1, 14);
		st.setString(2, "Devesh");
		st.setInt(3, 69000);
		int n=st.executeUpdate();
		System.out.println(n+" three values inserted");
		cn.close();
		
	}

}
