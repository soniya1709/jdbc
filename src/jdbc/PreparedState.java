package jdbc;
import java.sql.*;
public class PreparedState {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdatabase","root","Zqaws123!");
	PreparedStatement ptst=con.prepareStatement("update employee set ename=? where empid=?");
	
//	 ptst.setInt(1,6);
	 ptst.setString(1,"Akshay");
	 ptst.setInt(2, 6);
    int res=ptst.executeUpdate();
    System.out.println(res+"record insertd");
	ptst.close();
	con.close();
}
}
