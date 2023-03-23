package ch17;
import java.sql.*;
public class MyConn {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
//		                        ip번호      port DB명  
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		try {
			Class.forName(driver);  // driver load
			Connection conn = DriverManager.getConnection(url, "root","cello"); // 연결
			System.out.println("연결성공 ㅋㅋ");
			conn.close();   // 연결 종료
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}