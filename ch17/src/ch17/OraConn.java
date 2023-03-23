package ch17;
import java.sql.*;
public class OraConn {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // oracle 정식버전 xe => orcl
		try {
			Class.forName(driver);  // driver load
			Connection conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("연결 성공 ㅋㅋ");
			conn.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}