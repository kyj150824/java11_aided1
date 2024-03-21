package edu.kh.nettest;

import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) {
		output1();

	}
	public static void output1() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.txt");
			String str = "안녕하세요!";
			while((str = System.in.read() ) != null) {
				System.out.print((char));
			}
			System.out.println(str.toString());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
