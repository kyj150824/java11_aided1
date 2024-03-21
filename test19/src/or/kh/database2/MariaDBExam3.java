package or.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		Connection con = null;
		// ����
		PreparedStatement pstmt = null;
		// ���� ��� ����
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student (5, "����", 90);
		String sql = "insert into student values (?, ?, ?)";
		int i = 0;
		
		// Maria DB�� temp �����ͺ��̽��� student ���̺� 3�� �л��� ������ updSt�� �������� 
		// ���ڵ尡 ����� �� �ֵ��� �ڹ� ���α׷����� �����Ͻÿ�.
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
					System.out.println(i + "���� ���������� ó���Ǿ����ϴ�.");
				} else {
					System.out.println("SQL ó�� ����");
				}
			} catch (SQLException e) {
				System.out.println("������ ���� ���� ���� �Ǵ� SQL ó�� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
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

