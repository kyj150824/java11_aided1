package ord.kh.java;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 입력 :");
			
			int input = sc.nextInt();
			
		if( input <= 9) {
			for(int num = 1; num <=9; num++) {
				System.out.printf("%d*%d = %d\n", input, num, input*num );
			}
		} else {
			System.out.println("2 이상 9 이하만 입력");
		}
			
		}

	}

}
