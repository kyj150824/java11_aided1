package sec1;

public class AnimalExam1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		// 부모 클라스 == 자식 클라스 가능. 자식 클라스 == 부모 클라스 불가능. 
		// Mammal1 m1 = new Animal(); 의 경우 사용 불가. 
		
		Mammal m1 = new Mammal();
		// Mammal m2 = new Birds(); 의 같이 자신 클라스 == 형제 클라스는 불가능.
		
		Animal a4; 
		// 선언
		a4 = new Animal();
		// Animal 객체 생성
		a4.setName("구렁이");
		a4.setSpine(true);
		System.out.println(a4.print());
		
		a4 = new Mammal();
		// a4.setLegs(); - 안되는 이유 클래스 선언이 Animal 클래스로 선언되어 있기 때문에 형 전환을 하더라도 안됨.
		// Mammal 객체로 형 변환
		a4.setName("호랑이");
		System.out.println(a4.print());
		
		a4 = new Birds();
		// a4.setWings();- 안되는 이유 클래스 선언이 Animal 클래스로 선언되어 있기 때문에 형 전환을 하더라도 안됨.
		// Birds 객체로 형 변환
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		// 메소드 오버라이딩 : 부모 클래스로 부터 상속 받은 메소드를 다르게 구현 (== 다형성)
		// 그러므로, 부모 클래스로 선언되는 객체는 부모 자신 또는 자식 생성자를 활용하여 다양하게 형 변환 할 수 있다. => (== 다형성)
		// 클래스 => 캡슐화, 정보 은닉, 재사용성, 다형성, 추상화
	}

}
