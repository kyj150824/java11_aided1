package sec2;

public class LombokExam1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("kkt");
		mem1.setPw("1234");
		mem1.setPoint(63);
		
		System.out.println(mem1.toString());
	
		Board b1 = new Board();
		b1.setBno(1);
		b1.setTitle("1");
		b1.setContent("¿À");
		b1.setViewCnt(1);
		System.out.println(b1.toString());
	
	}

}
