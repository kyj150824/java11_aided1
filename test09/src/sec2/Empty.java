package sec2;

public class Empty {

	// void 가 앞에 전제로 붙어있음.
		/* 데이터베이스(Database) 인터페이스
		connect(String url, String port. String id, String pw)
		close(Connection conn, PreparedStatement pstmt, ResultSet rs)
		select(String tbname, String condition)
		insert(String tbname, String field1, int field2)
		update(String tbname, String field1, int valuel1, String condition)
		delete(String tbname, String condition)

		Oracle 클래스 (Database 상속)
		String url 
		int port
		String id;
		String pw;
		connect(String url, String port, String id, String pw)
			매개변수로 입력된 url, port, Id, pw 를 연결하여 오라클 데이터베이스에 연결
		close(Connection conn, Prepared Statement pstmt, ResultSet rs)
											연결된 오라클 데이터베이스 연결을 종료합니다.
		select(String tbname, String condition)
				select * from tbname condition 출력
		insert(String tbname, String field1, int field2)
				insert into tbname values (field2, field1) 출력
		update(String tbname, String field, int valuel, String condition)
				update tbname set field1=value condition 출력
		delete(String tbname, String condition)
				delete from tbname condition 출력 

		 */
}
