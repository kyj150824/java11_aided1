package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		/* 
		  for(초기식;조건식;증감식)와 마찬가지로 조건이 만족하는 동안만 반복수행
		  그러나 while의 괄호에 조건만 기입하고 해들 불록 안에 종강식이 기재됨.
		  
		  초기식;
		  while 조건식 {
			증감식;
			반복할문장;
			증감식;
		}
		*/
		
		int i = 0, tot = 0;
		while(i<5) { 
			i++; 
			// 증감식 i++; 가 없을경우 무한 반복된다 : 무한루프
			// i = i + 1
			tot+=i; 
			// tot = tot + i
		}
		System.out.println("결과 :" + tot);
		// 해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 [2~9] : ");
		int n = sc.nextInt();
		/*int j = 0;
		while(j < 9){
			j++;
			System.out.println(n + "*" + j + "=" +(n*j));
				
			}
		 */
		for(int k = 1; k < 10; k++) {
			System.out.println();
		}
		
		}
	
	}

