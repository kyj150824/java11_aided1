package edu.kh.test;

import edu.kh.test.model.Person;

public class Test04 {

	public static void main(String[] args) {
		
		Person[] pArr = new Person[3]; 
		pArr[0]= new Person("�����", 43);
		pArr[1]= new Person("��ƹ���", 42); 
		pArr[2]= new Person("�̾ƹ���", 43);
		// ����ְų� �ʱ�ȭ �Ǿ����� ���� pArr �迭�� Person ��ü�� �����Ͽ� �� ��ҿ� ������ ��ü�� ����
		
		for(int i = 0; i < pArr.length; i++) {
		// for(int i = 0; i <= pArr.length; i++) {
			// ���� ������ �迭�� �������� �� ���� ���� �ݺ� ������ �ȴ�.(��û�� Ƚ���� �迭������ �� ����) => ArrayIndexOutOfBoundsException �߻�
			System.out.println(pArr[i].getName());
			// System.out.println(pArr[i].getName());
			// Person�� �迭����� pArr ��ü�� �ʱ�ȭ(���� ����)�Ǿ� ���� �ʾ� => NullPointerException�� �߻�.
		}

	}

}
