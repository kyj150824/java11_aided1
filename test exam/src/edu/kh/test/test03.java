package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class test03 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
		 // list는 추상체이면서 선언만 되어있기 때문에 객체가 생성이 안되어 있기 때문에 NullPointerException이 발생
		 // ArrayList로 객체 생성을 해주어야 한다.
		 // list<int>같은 기본형은 안되고 참조형인 integer로 사용해야함.
		 
		 list.add(4);
		 list.add(-5);
		 list.add(0);
		 list.add(-3);
		 list.add(2);
		 list.add(1); // list.add(1.23456); 
		 // list의 선언시 요소의 데이터 타입이 Integer로 되어 있기 때문에, 정수만 입력받을 수 있으므로 타입 오류가 발생 할 수 있다.
		 
		 for(int num: list) {
			 char ch;
			 
			 if(num < 0) { // if(num <= 0)
				 // if문의 조건에서 0을 포함하여 음수라고 표현 하였기 때문에.
				 // 0이어도 음수가 발생하고, 0인 경우 정상적으로 처리 되어야할 else 문이 실행되지 않는 오류가 발생함. 
				 // 정상적인 경우 0일 경우 "@@@@@@@"이 출력되어야함.
				 ch = '-';
			 } else if(num>0) {
				 ch = '+';
			 } else {
				 System.out.println("@@@@@@@@@@@");
				 continue;
			 }
			 //-5 => 5
			 // int Math.abs(정수) : 정수의 절대값을 반환.
			 for(int i = 1; i<=Math.abs(num); i++){
			//for (int i = 0; i<Math.abs(num); i++){ - 로 해도 정답.	 
				 // i를 1이 아닌 0으로 정의 해줘야한다. 
				 // 해당 숫자의 횟수만큼 부호를 출력해야 하는데 한 번씩 덜 출력이 되기 때문에 오류가 난다.
				 // for 반복문의 실행 조건이 해당 숫자를 포함하는 것이 아닌 작을 때 까지만 실항하게 되어 
				 // 해당 숫자의 횟수 만큼 부호를 출력해야하는데 한번씩 덜 출력하기 때문에 오류가 난다.
				 System.out.print(ch); // +++ ----
			 }
			 System.out.println();
		 }
	}
}
