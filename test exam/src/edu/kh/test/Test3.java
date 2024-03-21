package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); //List<Integer> list = null;	//list ���� �����Ƿ� ��ü ������ �Ǿ� ���� �ʾ� NullPointerException�� �߻�
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1); //list.add(1.23456);	//List�� ����� ����� ������ Ÿ���� Integer�� �����Ǿ� �����Ƿ� ������ �Է� ���� �� �����Ƿ� ������ Ÿ�� ���� �߻�

		for(int num : list) {
			char ch;
			
			if(num < 0) { //if(num <= 0) {	//if���� ���ǿ��� 0�� �����Ͽ� ������� ǥ�������Ƿ� 0�̾ ������ �߻��ϰ�, 0�� ����� �������� ó���Ǿ�� �� else���� ������� �ʴ� ���� �߻�
				ch = '-';
			} else if(num > 0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			
			//int Math.abs(����) : ������ ���밪�� ��ȯ
			for(int i=1 ; i<=Math.abs(num) ; i++) { //for(int i=1 ; i<Math.abs(num) ; i++) { //for �ݺ����� ���� ������ �ش� ���ڸ� �����ϴ� ���� �ƴ� ���� �������� �����ϰ� �Ǿ� => �ش� ������ Ƚ�� ��ŭ ��ȣ�� ����ؾ� �Ǵµ� �� ���� �� ���
				System.out.print(ch); 
			}
			System.out.println();
		}
		
	}
}