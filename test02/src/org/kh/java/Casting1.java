package org.kh.java;

public class Casting1 {
//형 변환 (AOTO CASTING, FORCE CASTING) = TYPE CONVERSION
	public static void main(String[] args) {
		
		// 작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮겨지면서 타입이 자동으로 변환되는 것을 aoto casting 이라고 한다.
		
		byte b = 20; //1byte
		short s = b; //2byte byte => short
		int i = s;   //4byte short => int
		long l = i;  //8byte int => long
		
		// int i2 = l , short s2 = i, byte b2 = s 큰 크기의 저장소에 있는 데이터 값이 작은 크기의 저장소로 옮길 수 없고 오류가 뜬다.
		// force casting : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 변환 해줘야한다. - 강제 캐스팅 강제로 하는 것이기 때문에 오류가 나타날 수도 있음.
		
		int i2 = (int)l;
		short s2 = (short) i;
		byte b2 = (byte)s;
		

	}

}

