package or.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MariaDB {
	Connection con = null;
	// 연결할때 사용
	PreparedStatement pstmt = null;
	// 상태 변경 (On/Off) 하고, SQL 문장실행
	ResultSet rs = null;
	// 검색(Select문)의 결과를 반환받음
	String driver = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost:3308/temp";
	String userid = "root";
	String userpw = "1234";
	
	public Connection connect() {
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
