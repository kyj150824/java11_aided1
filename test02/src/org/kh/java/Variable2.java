package org.kh.java;

public class Variable2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			byte b = 10; // 선언 (o), 초기화 (o)
			byte s = 20;
			byte i; // 선언(o) 초기화 (x)
			// => 초기화 되지 않은 상태 그대로 출력시 Null Pointer 오류를 일으킴
			long l;
			i = 30; //초기화
			l = 40L; //초기화
			System.out.println("b="+b);
			System.out.println("s="+s);
			System.out.println("i="+i);
			System.out.println("l="+l);
		}
}
