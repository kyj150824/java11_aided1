package sec1;
class Outer3{
	// 외부 클래스 
	// 익명의 내부 클래스를 선언시에는 Runnable 로 구현해야 한다.
	Runnable getRunnable(int i) {
		// Runnable 은 인터페이스 이므로 인스턴스 생성시 기본 메소드인 run() 메소드의 구현 내용을 기술하여 생성해야함.
		int num = 100;
		
		return new Runnable() {

			@Override
			public void run() {
				// int i; - 매개 변수로 이미 상단에 i가 있기 때문에.
				// int num; - 지역 변수로 이미 상단에 num이 있기 때문에.
				System.out.println(i);
				// i는 매개 변수
				System.out.println(num);
				// num은 지역 변수
				
				// Runnable 을 메소드로 하는 인스턴스를 만든 것.
			}
			
		};
	}
	// 익명의 실행 인스턴스(객체)를 Runnable 생성
	Runnable runner = new Runnable() {
		// Runnable은 추상화 이기 때문에 내가 직접 구현 내용을 만들어 줘야함.
		@Override
		public void run() {
			System.out.println("Runnable로 구현된 익명의 내부 클래스.");
			
		}
		
	};
	
}

public class AnonymousInnerExam {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.getRunnable(500);
		// 오류는 없지만 Runnable이 만들어지지 않아 실행되지 않음.
		out.runner.run();
		
		Runnable runAble = out.getRunnable(500);
		runAble.run();
		
		// 외부 클래스의 내부 클래스 없이 생성된 인스턴스(runnAble)는 Runnable로 선언하여 생성된다.

	}

}
