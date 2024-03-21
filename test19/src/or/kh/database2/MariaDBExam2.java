package or.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		
		Student newSt = new Student (6, "kim", 95);
		String sql = "insert into student values (?, ?, ?)";
		
		int i = 0;
		
		// MariaDB�� temp �����ͺ��̽��� student ���̺��� newSt�� ������ ���ڵ�� �߰��ǵ��� 
		// �ڹ����α׷����� �ϼ��Ͻÿ�.
	
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, newSt.getNo());
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i + "���� ���������� ó�� �Ǿ����ϴ�.");
				} else {
					System.out.println("SQL ���� ����");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
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
	/*	try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(6, newSt.getNo());
				pstmt.setString("kim", newSt.getName());
				pstmt.setInt(95, newSt.getPoint());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i + "���� ���������� ó�� �Ǿ����ϴ�.");
				} else {
					System.out.println("SQL ���� ����");
				}
				
		} catch (ClassNotFoundException e) { 
				e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.println("�����ͺ��̽� ���� ���� �Ǵ� SQL �������� ����");
				e1.printStackTrace();

	}

}
	
*/