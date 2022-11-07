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
		PreparedStatement st=cn.prepareStatement("create table games(gameName varchar(10),gameProductKey varchar(25), gamePrice int)(?,?,?)");
		st.setString(2, "Sekiro-Shadows Die Twice");
		st.setString(1, "M3CY9-QT7C4-2TR7M-TXYCV");
		st.setInt(3, 4000);
		int n=st.executeUpdate();
		System.out.println(n + "row created to table courses");
		cn.close();
	}

}
