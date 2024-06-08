package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_Insert {

	    static final String url = "jdbc:mysql://localhost:3306/techm=false";

	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Connection conn = null;
	        Statement stmt = null;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(url, "root", "Akshaya04");
	            stmt = conn.createStatement();
	            int result = stmt.executeUpdate(
	                "INSERT INTO customers (customerId, customername, balance) VALUES (3, 'rinnu', 30000)");

	            if (result > 0)
	                System.out.println("Successfully inserted");
	            else
	                System.out.println("Unsuccessful insertion");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

