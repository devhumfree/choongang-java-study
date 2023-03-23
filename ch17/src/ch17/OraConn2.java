package ch17;
import java.sql.*;
public class OraConn2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url  = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott","tiger");
			System.out.println("Success");
			conn.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
