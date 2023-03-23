package ch17;
import java.sql.*;
import java.util.Scanner;
public class OraInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; Statement stmt = null; 
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		// 문자와 숫자를 반복해서 입력할 경우는 문자로 숫자로 형 변환하여야 한다
//		sc.nextInt(); 숫자와 문자가 한줄에 있으면 숫자까지만 읽고 문자부분은 처리하지 않음
		int deptno = Integer.parseInt(sc.nextLine()); // 13 enter
//		String deptno = sc.nextLine(); 
		System.out.println("부서명을 입력하세요");
		String dname = sc.nextLine();  // enter
		System.out.println("근무지를 입력하세요");
		String loc = sc.nextLine();
//	값이 숫자일 떄는 그냥 사용, 문자열일 때는 앞뒤로 작은 따움표
//		String sql = "insert into dept values("+deptno+",'"+dname+"','"+loc+"')";
		String sql=String.format("insert into dept values(%d,'%s','%s')",deptno,dname,loc);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
//	입력/수정/삭제는 executeUpdate, 성공한 갯수를 반환한다		
			int result = stmt.executeUpdate(sql); 
			if (result > 0) System.out.println("입력 성공 ㅋㅋ"); // result==1이지만 result>0를 권장
			else System.out.println("입력 실패 ㅠㅠ");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			stmt.close(); conn.close();
		}
		sc.close();
	}
}