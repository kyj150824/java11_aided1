package org.kh.object1;

public class Compute01 {
	void fnc1() {
		// 반환 (x), 매개변수(x)
		System.out.println("메소드함수(함수)1");
	}
	void fnc2(int a) {
		// 변환 (x), 매개변수 (o)
		System.out.println(a+ "를 입력하셨습니다.");
	}
	int fnc3() {
		// 변환 (o), 매개변수 (x)
		return 1004;
	}
	String fnc4(int point) {
		// 변환 (o), 매개변수 (o)
		if(point>=80) return "합격";
		else return "불합격";
	}
}

