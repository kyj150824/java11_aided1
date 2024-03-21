package org.kh.app2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		// 숫자 맞추기 게임: 무작위로 퀴즈 답이 되는 수를 정수 형태로 발생시키고

		int quiz = (int)(Math.random()*100);
		System.out.println(quiz);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 입력 [0-100] : ");
			int n = s.nextInt();
			if(quiz==n) {
				System.out.println("\n축하합니다. 맞추셨습니다.");
				break;
			} { System.out.println("입력하신 숫자는"+ n + "이고, 틀렸습니다. " );
				break;
			} 
			}
		}
	}


