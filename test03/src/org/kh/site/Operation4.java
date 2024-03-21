package org.kh.site;
//증강　연산　：　＋＋，　－－　＝＞　전위　연산，　후위　연산이　각각　있음
public class Operation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		
		// a ++ => a = a+1
		System.out.println("전위 증가 연산 : " + (++a));// a를 먼저 증가시키고 난 후에 출력
		System.out.println("후위 증가 연산 : " + (b++)); // b를 먼저 출력하고 나중에 1씩 증가시킴
		System.out.println("전위 감소 연산 : " + (--a));
		System.out.println("후위 감소 연산 : " + (b--));
		
	
	}

}
