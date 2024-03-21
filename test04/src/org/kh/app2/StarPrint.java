package org.kh.app2;
//중첩 for 문을 활용한 별찍기
public class StarPrint {

	public static void main(String[] args) {
		/*
		  
		  ********
		  ******** 
		  ******** 
		  ********
		  
		  *
		  **
		  ***
		  **** 
		  ***** 
		  ******
		  
		  ******
		  *****
		  ****
		  ***
		  **
		  * 
	 */
		 for(int i=0; i<=6; i++) { // 0 1 2 3 =>4
				for(int j=0; j<i; j++) { // 0~5 => 6
				System.out.print("*"); 		
				}
				System.out.println();
		 	}
		 
				
		for(int i=0; i<=6; i++) { // 0 1 2 3 =>4
			for(int j=0; j<7-i; j++) { // 0~5 => 6
			System.out.print("*"); 		
			}
			System.out.println();
			
		}
	}
}

