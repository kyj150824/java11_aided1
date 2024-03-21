package org.kh.object2;

import org.kh.object1.Member;

public class Member01 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		
		mem1.setId("kim");// mem1.id = "kim";
		mem1.setPw("1234");// mem1.pw = "1234";
		mem1.setEmail("kkt09072@gmail.com");// mem1.email = "kkt09072@gmail.com";
		mem1.setBirth(1981);// mem1.birth = 1981;	
		mem1.setTel("01032151255");// mem1. tel = "01032151255";
		System.out.println("id : " + mem1.getId());
		System.out.println("pw : " + mem1.getPw());
		System.out.println("Email : " + mem1.getEmail());
		System.out.println("Birth : " + mem1.getBirth());
		System.out.println("Tel: " + mem1.getTel());
		System.out.println(mem1.toString());	
	}
}

