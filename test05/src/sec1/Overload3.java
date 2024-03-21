package sec1;

public class Overload3 {

	public static void main(String[] args) {
		
		Board b1 = new Board();
		
		b1.setBno(1);
		b1.setTitle("즐거운 자바코딩");
		b1.setUname("abc");
		
		Board b2 = new Board(101);
		b2.setTitle("다음 주");
		b2.setUname("wolf");
		
		Board b3 = new Board(102, "주말");
		b3.setUname("walkman");
		
		Notice b4 = new Notice (1, "즐거운자바코딩","abc","다음 주","wolf","주말");
			System.out.println(b4.toString());
	}

}
