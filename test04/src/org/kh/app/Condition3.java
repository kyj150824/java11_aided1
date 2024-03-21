package org.kh.app;

import java.util.Scanner;

//조건문 if~ else if(~else~)
public class Condition3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner은 Java에 있지만 다른 프로그래밍에서 가져와야 해서 문자에 마우스 올려둔 후 input 눌러줘야함.
		System.out.print("점수 입력 [0-100] :");
		int point = scan.nextInt(); //scan. 에서 오는 숫자가 정수면 int 실수면 float 나 double, 문자나 문장은 그냥 next()로 한다.
		char result;
		
		//학점(result)은 점수(point)가 100 ~ 90이면 'A', 80 ~ 89 이면 'B', 70 ~ 79 이면 'C', 60 ~ 69 이면 'D', 60미만이면 'F'
		
		if(point >= 90) {
			result = 'A';
		} 
		else if ( point >= 80) {
			result = 'B';
		} 
		else if ( point >= 70) {
			result = 'C';
		} 
		else if ( point >= 60) {
			result= 'D';
		} 
		else {
			result = 'F';
		
	
		/*if(point>=90 && point<=100) result = 'A';
		  if(point>=80 && point<=89) result = 'B';
		  *if(point>=70 && point<=79) result = 'C';
		  **if(point>=60 && point<=69) result = 'D';
		  **if(point>=0 && point<=59) result = 'F'; */
 }
			System.out.printf("\n당신의 점수는 : %d 입니다. \n", point);
					// 위의 객체를 Scanner 객체라고 한다.
			System.out.println("당신의 점수는 :" + point ); // 이렇게도 가능함.
			System.out.printf("당신의 학점은 : %c \n", result);
	}	
	}


