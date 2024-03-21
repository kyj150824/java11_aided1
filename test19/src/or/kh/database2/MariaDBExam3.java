package or.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		Connection con = null;
		// 연결
		PreparedStatement pstmt = null;
		// 전원 명령 전달
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student (5, "윤상", 90);
		String sql = "insert into student values (?, ?, ?)";
		int i = 0;
		
		// Maria DB의 temp 데이터베이스의 student 테이블 3번 학생의 데이터 updSt의 내용으로 
		// 레코드가 변경될 수 있도록 자바 프로그래밍을 변경하시오.
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,newSt.getPoint());
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getNo());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i + "건이 정상적으로 처리되었습니다.");
				} else {
					System.out.println("SQL 처리 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터 벵스 연결 실패 또는 SQL 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} if(con!=null) {
				try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		}

	}
}

