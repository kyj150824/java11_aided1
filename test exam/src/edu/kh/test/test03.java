package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class test03 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
		 // list�� �߻�ü�̸鼭 ���� �Ǿ��ֱ� ������ ��ü�� ������ �ȵǾ� �ֱ� ������ NullPointerException�� �߻�
		 // ArrayList�� ��ü ������ ���־�� �Ѵ�.
		 // list<int>���� �⺻���� �ȵǰ� �������� integer�� ����ؾ���.
		 
		 list.add(4);
		 list.add(-5);
		 list.add(0);
		 list.add(-3);
		 list.add(2);
		 list.add(1); // list.add(1.23456); 
		 // list�� ����� ����� ������ Ÿ���� Integer�� �Ǿ� �ֱ� ������, ������ �Է¹��� �� �����Ƿ� Ÿ�� ������ �߻� �� �� �ִ�.
		 
		 for(int num: list) {
			 char ch;
			 
			 if(num < 0) { // if(num <= 0)
				 // if���� ���ǿ��� 0�� �����Ͽ� ������� ǥ�� �Ͽ��� ������.
				 // 0�̾ ������ �߻��ϰ�, 0�� ��� ���������� ó�� �Ǿ���� else ���� ������� �ʴ� ������ �߻���. 
				 // �������� ��� 0�� ��� "@@@@@@@"�� ��µǾ����.
				 ch = '-';
			 } else if(num>0) {
				 ch = '+';
			 } else {
				 System.out.println("@@@@@@@@@@@");
				 continue;
			 }
			 //-5 => 5
			 // int Math.abs(����) : ������ ���밪�� ��ȯ.
			 for(int i = 1; i<=Math.abs(num); i++){
			//for (int i = 0; i<Math.abs(num); i++){ - �� �ص� ����.	 
				 // i�� 1�� �ƴ� 0���� ���� ������Ѵ�. 
				 // �ش� ������ Ƚ����ŭ ��ȣ�� ����ؾ� �ϴµ� �� ���� �� ����� �Ǳ� ������ ������ ����.
				 // for �ݺ����� ���� ������ �ش� ���ڸ� �����ϴ� ���� �ƴ� ���� �� ������ �����ϰ� �Ǿ� 
				 // �ش� ������ Ƚ�� ��ŭ ��ȣ�� ����ؾ��ϴµ� �ѹ��� �� ����ϱ� ������ ������ ����.
				 System.out.print(ch); // +++ ----
			 }
			 System.out.println();
		 }
	}
}
