package org.kh.java;

public class Variable {

	public static void main(String[] args) {
		boolean a = true; 
		// 논리형(true, false) : 1byte
		//byte b = 255;  //-128 ~ 127 까지 표시 가능 => 255는 해당 공간보다 큰 숫자이므로 Overflow 라고 한다.
		//byte b = -128; //해당 공간에 저장 할 수 있는 숫자보다 작은 숫자이므로 Underflow 라고 한다.
		byte b = 126; //1byte = 8bit = 256 (-128~127)
		//short c = 65534; //2byte = 16bit = 65536 (-32768~32767) Overflow
		short c = 32763;
		char d = 'k'; //2byte 
		int e = 234567; //4byte
		float f = 3.14f; //4byte 실수임을 알려주는 f를 붙여야함.
		long g = 23456789; //8byte
		double h = 3.14d; //8byte float랑 구분할때 뒤에 d를 붙여줌.
		System.out.println("byte : " + Byte.MIN_VALUE+ "~" + Byte.MAX_VALUE);
		System.out.println("short : " + Short.MIN_VALUE+ "~" + Byte.MAX_VALUE);
		System.out.println("char : " + Character.MIN_VALUE+ "~" + Character.MAX_VALUE);
		System.out.println("int : " + Integer.MIN_VALUE+ "~" + Integer.MAX_VALUE);
		System.out.println("float : " + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("long : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("double : " + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		
}

}
