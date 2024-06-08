package JDBC;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;


public class JDBC_Delete {
	public static void main(String args[]) throws SQLException {
		    try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm, "root", "Akshaya04");
			Statement stmt= con.createStatement();
				String str="renu";
				int s = stmt.executeUpdate("delete from customers where customername='" + str + "'");
				System.out.println("Number of rows affected is" + s);
		    }
		    catch(Exception ex) {System.out.println("Driver Exception"+ex);}
		 }
	 }
