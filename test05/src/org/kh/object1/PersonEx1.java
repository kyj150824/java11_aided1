package org.kh.object1;

public class PersonEx1 {

	public static void main(String[] args) {
		
		Person kim = new Person();
		kim.name = "김기태";
		kim.year = 1981;
		kim.gender = "남성";
		kim.job = "미치광이 개발자";
		kim.running();
		
		int name;
	
		Person lee = new Person();
		lee.name = "이완석";
		lee.running();
	}
}