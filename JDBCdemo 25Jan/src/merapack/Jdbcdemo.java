package merapack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbcdemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","123kau456stubh");
//		CallableStatement cs = cn.prepareCall("{call insert(?,?,?)}");
		PreparedStatement st=cn.prepareStatement("insert into users values (?,?,?)");
		ps.setInt(1, 05);
		ps.setString(2,"Kaustubh");
		ps.setInt(3, 69000);
		ps.setInt(1, 06);
		ps.setString(2,"Devang");
		ps.setInt(3, 70000);
		ps.setInt(1, 02);
		ps.setString(2,"Devesh");
		ps.setInt(3, 50000);
		int x = ps.executeUpdate();
		System.out.println(x + "rows inserted");
		cn.close();
	}

}
