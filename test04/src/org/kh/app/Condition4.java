package org.kh.app;

import java.util.Scanner;

//조건문 다단계 if
public class Condition4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력 [0-100]:");
		int point = scan.nextInt();
		String result;
		/* 학점(result)은 점수 (point) 
		 * 97~100이면, 'A++', 93~96이면, 'A0', 90~92이면,'A-'
		 * 87~80이면, 'B++', 83~86이면, 'B0', 80~82이면,'B-'
		 * 77~70이면, 'C++', 73~96이면, 'C0', 70~72이면,'C-'
		 * 67~60이면, 'D++', 63~66이면, 'D0', 60~62이면,'D-'
		 다단계 if를 사용해서 해보자 */	
		
		
		
		if(point >= 90) {
			result = "A";
		} else if ( point >= 80) {
			result = "B";
		} else if ( point >= 70) {
			result = "C";
		} else if ( point >= 60) {
		} else 
			result = "F";
		}
					
}
	
	
	
	
	
	
	
	
	
	
	
	
	

