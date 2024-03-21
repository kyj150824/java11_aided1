package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "\'김기태\'";
		short age = 44;
		float height = 173.6f;
		double weight = 71.9;
		char init = 'k';

		System.out.printf("%n이름: \" %s \"", name);
		System.out.printf("%n나이: %d",age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중: %.3f", weight); /*소수점 3자리까지만
		System.out.printf("\n이니셜:", +init);
		
		/* 이스케이프 문자
		 \n: 줄바꿈
		 \t: 탭
		 \\ : \를 출력
		 \' : "를 출력
		 \" : '를 출력
		
		 ex) loc = " c: \\ kim \\new \\temp ;
		
		 대문자로 시작할경우 - 여러개를 저장 할 수 있음, 소문자로 시작할경우 - 하나만 저장 가능.
		
		 
		 
		 */
		
	}

}
