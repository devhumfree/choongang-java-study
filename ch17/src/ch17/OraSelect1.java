package ch17;
import java.sql.*;
public class OraSelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		Connection conn = null;  // DB연결
		Statement stmt = null;   // sql실행할 객체 생성하는 클래스, main 메서드 전체 사용 가능
		ResultSet rs = null;     // 조회한 데이터를 저장하는 클래스
		String sql = "select * from dept";
		try {
			Class.forName(driver);  // driver load
			conn = DriverManager.getConnection(url,"scott", "tiger"); // db연결
			stmt = conn.createStatement(); // 실행할 객체 생성
//	조회 : executeQuery, 입력/수정/삭제 : executeUpdate
			rs = stmt.executeQuery(sql);  // sql을 실행하고 그 결과를 rs에 저장
			while(rs.next()) { // 포인터 다음에 있는 데이터를 읽어서 읽으면 true 못 읽으면 false
				System.out.println("부서코드 : "+rs.getInt("deptno"));  // 1 조회한 컬럼의 순서
				System.out.println("부서명 : "+rs.getString(2));       // 2="dname"
				System.out.println("근무지 : "+rs.getString("loc"));   // 3
				System.out.println("====================");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			rs.close();  stmt.close();  conn.close();
		} 
	}
}