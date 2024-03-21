package edu.kh.test;

import edu.kh.test.model.Person;

public class Test04 {

	public static void main(String[] args) {
		
		Person[] pArr = new Person[3]; 
		pArr[0]= new Person("김기태", 43);
		pArr[1]= new Person("김아무개", 42); 
		pArr[2]= new Person("이아무개", 43);
		// 비어있거나 초기화 되어있지 않은 pArr 배열에 Person 객체를 생성하여 각 요소에 생성된 객체를 대입
		
		for(int i = 0; i < pArr.length; i++) {
		// for(int i = 0; i <= pArr.length; i++) {
			// 실제 선언한 배열의 개수보다 더 많은 수의 반복 실행이 된다.(요청한 횟수가 배열수보다 더 많다) => ArrayIndexOutOfBoundsException 발생
			System.out.println(pArr[i].getName());
			// System.out.println(pArr[i].getName());
			// Person의 배열요소인 pArr 객체가 초기화(값이 대입)되어 있지 않아 => NullPointerException이 발생.
		}

	}

}
