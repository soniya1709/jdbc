package jdbc;
import java.sql.*;
public class JdbcDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdatabase","root","Zqaws123!");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from student");
	String userdata="";
	while(rs.next()) {
		userdata=rs.getInt(1) + " : " +rs.getString("sname") + " : " +rs.getString("saddress");
		System.out.println(userdata);
	}
	stmt.close();
	con.close();
}
}
