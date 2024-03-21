package org.kh.site;

public class Operation5 {

//관계　（비교）　연산자　：　＝＝，　！＝（다르다），　＞（초과），　＞＝　（이상），　＜　（미만），　＜＝　（이하）－－－－＞　결과적으로　ｔｒｕｅ／　ｆａｌｓｅ　가　도출됨．

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 25;
		int b = 28;
		int c = 27;
		
		System.out.println("a와 b가 같습니까?" + (a==b));
		System.out.println("a와 b가 다릅니까?" + (a!=b));
		System.out.println("a와 b가 큽니까?" + (a>b));
		System.out.println("b와 c가 크거나 같습니까?" + (b>=c));
		System.out.println("a와 b가 작습니까?" + (a<b));
		System.out.println("b가 c보다 작거나 같습니까?" + (b<=c));
}
}