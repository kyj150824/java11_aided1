package sec2;
// Lambda 람다  식 (Expressin)- 함수 및 메소드를 더 간소화 한 표현식
// 자바의 기본적인 람다식 정의 방법 = > 함수적 인터페이스 (Funtional Interface)
// 함수적 인터페이스는 @FuntionalInerface 로 정의하고 메소드는 오로지 하나만 가져야함. - 해주면 컴파일러가 람다식을 정의한 것이라고 인지.
// @는 자바에서 어노테이션 (Annotation)을 의미
// 어노테이션(Annotation) : 개발자가 컴파일러에게 특정한 것임을 알려주는 것으로 만약, 기술하지 않으면 컴파일러가 정체를 알수 없는 오류를 발생시킨다.

@FunctionalInterface
interface Lambda1 {
	// 매개변수 x, 반환 x
	public void method1();
}

@FunctionalInterface
interface Lambda2 {
	// 매개변수 o, 반환 x
	public void method2(int x, int y);
}

@FunctionalInterface
interface Lambda3 {
	// 매개변수 x, 반환 o
	public int method3();
}

@FunctionalInterface
interface Lambda4 {
	// 매개변수 o, 반환 o
	public int method4(int x, int y);
}


public class LambdaExam {
	public static void main(String[] args) {
		// Lambda1 f1 = new Lambda1() {
			System.out.println(" 람다식 1 - 매개변수 x 반환 x ");
			Lambda1 f1 = () -> {
				int x = 100, y = 200;
				System.out.println(x+y);
			};
			f1.method1();
			
			System.out.println(" 람다식 2 - 매개변수 o 반환 x ");
			Lambda2 f2 = (int x, int y ) -> {
				System.out.println(x + y);
				
			}; 
			f2.method2(100, 200);
			
			System.out.println(" 람다식 3 - 매개변수 x 반환 o");
			Lambda3 f3 = () -> {
				int x = 100;
				int y = 200;
				return x + y;
			};
			System.out.println(" 람다식 4 - 매개변수 o 반환 o");
			Lambda4 f4 = (int x, int y) -> {
				return x + y;
			};
			System.out.println(f4.method4(100, 200));
			
	}

}
