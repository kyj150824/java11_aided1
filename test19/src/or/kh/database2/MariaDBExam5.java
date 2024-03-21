package or.kh.database2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.database.Student;

public class MariaDBExam5 {

	public static void main(String[] args) {
		Connection con = null;
		// 연결할때 사용
		PreparedStatement pstmt = null;
		// 상태 변경 (On/Off) 하고, SQL 문장실행
		ResultSet rs = null;
		// 검색(Select문)의 결과를 반환받음
		MariaDB maria = new MariaDB();
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>();
		
		try {
			con = maria.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student();
				stList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			maria.close(rs, pstmt, con);
		}
	}

}
