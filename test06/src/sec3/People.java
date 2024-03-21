package sec3;

public class People {
	public static int selNum = 100; 
	// 고유번호 - static을 넣으면 정적 필드가 됨. (공유 데이터임을 의미.) - 공유 데이터를 사용할때 필요.
	// 객체와 관계없이 메모리가 공유된다.
	public String name;
	// 이름
	public int age;
	// 나이
	public String addr;
	// 주소
	
	public void print1() {
		System.out.println(" selNum : " + this.selNum);
		System.out.println(" name : " + this.name);	
	}
	
	public static void print2() {
		System.out.println(" Name : 아무개");	
		System.out.println(" Age : 25 ");
	}
}
