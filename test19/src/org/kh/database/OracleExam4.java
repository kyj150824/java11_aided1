package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// delete from 테이블명 [where 필드명=값] : 테이블의 특정 조건에 맞는 레코드 삭제 

public class OracleExam4 {

	public static void main(String[] args) {
		Connection con = null;
		// 연결할때 사용
		PreparedStatement pstmt = null;
		// 상태 변경 (On/Off) 하고, SQL 문장실행
		ResultSet rs = null;
		// 검색(Select문)의 결과를 반환받음
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "delete from student";
		Student st = new Student(5, "강범준", 99);
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getNo());
				// pstmt.setString(1, st.getName());
				// pstmt.setInt(1, st.getPoint());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"건이 정상적으로 처리되었습니다.");
				} else {
					System.out.println("처리 실패");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}