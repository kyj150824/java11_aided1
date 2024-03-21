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
		// �����Ҷ� ���
		PreparedStatement pstmt = null;
		// ���� ���� (On/Off) �ϰ�, SQL �������
		ResultSet rs = null;
		// �˻�(Select��)�� ����� ��ȯ����
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
