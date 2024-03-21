package sec1;
// 객체 배열
import java.util.Scanner;

// 5명의 국어 영어 수학 점수를 Scanner를 활용하여 키보드로 입력받아 총점, 평균, 학점을 계산하여 아래와 같은 출력 형태로 출력하도록 하는 프로그램을 작성해라.
/* 
 * 번호 국어 영어 수학 총점 평균		 학점 
 * 	1	90  90	90 	270 90		 A
 * 	2	80	70	60	210	70		 C
 * 	3	90	80	70	240	80		 B	
 * 	4	60	90	70	220	73.3	 C
 * 	5	70	90	90	250	83.3	 B 
 */

public class StudentExam {

	public static void main(String[] args) {
		// 5명의 학생 배열 객체 선언
		// int[] arr = {6, 3, 1, 7, 5, 4, 2};
		Student[] s = new Student[5]; //s[0].kor, s[0].eng ~ s[4].kor, s[4].eng ...
		Scanner scn = new Scanner (System.in); 
		for(int i=0; i<5; i++) {
			s[i] = new Student();
			// 개별 객체 생성
			s[i].setNum(i+1);
			System.out.print((i + 1) + "번째 국어 : ");
			s[i].setKor(scn.nextInt());
			System.out.print((i + 1) + "번째 영어 : ");
			s[i].setEng(scn.nextInt());
			System.out.print((i + 1) + "번째 수학 : ");
			s[i].setMath(scn.nextInt());
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(int i=0; i<5; i++) {
			s[i].print();
		}

	}

}
