package org.kh.java;

public class Constant1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상수와 값(LITERAL)
				
		final int MAX_POINT = 100;
				final int MIN_POINT = 0;
				final double PI = 3.141592;
				final String MY_NAME = "김기태";
			// MY_NAME = "강기태"; 상수는 값이 변형되지 않기 때문에 오류로 뜬다.
				
				// 위와 같이 FINAL 지시자가 선언되고, 대문자로 표기된 것을 상수라고 하며, 항상 값이 같아 더 이상 변할 수 없는 값을 뜻함.
				// 변수나 상수에 대입되는 값을 리터럴(LITERAL)이라고 함.
				// 2진수 10진수 8진수 16진수 정수 실수 문자 문자열 - 전부 리터럴이라고 함.
				System.out.println(" 최소 점수: " + MIN_POINT);
				System.out.println(" 최고 점수: " + MAX_POINT);
				System.out.println(" 나의 이름: " + MY_NAME);
				System.out.println("반지름이 10인 원의 둘레 길이: "+ (10*2*PI));
	}

}
