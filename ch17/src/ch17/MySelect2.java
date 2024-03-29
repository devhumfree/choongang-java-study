package ch17;
import java.sql.*;
import java.util.Scanner;
public class MySelect2 {
	// 사번을 받아서  이름, 입사일, 부서명
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null; Statement stmt = null; ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("사번을 입력하세요");
		int empno = sc.nextInt();
		String sql="select ename,hiredate,dname from emp e,dept d "
				+ "where e.deptno=d.deptno and empno="+empno;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement();  // stmt에는 url, 아이디, 패스워드를 가진 객체
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("이름 : "+rs.getString("ename"));
				System.out.println("입사일: "+rs.getDate(2));
				System.out.println("부서명 : "+rs.getString("dname"));
			} else System.out.println("없는 사원입니다. 꺼져");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			rs.close(); stmt.close(); conn.close();
		}
		sc.close();
	}
}