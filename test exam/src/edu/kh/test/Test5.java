package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		// <> = �÷��� - �̰����� ���� �����ϱ� ������.
			list.add(new Fruit("���", "����"));
			list.add(new Fruit("���", "�ʷ�"));
			list.add(new Fruit("����", "����"));
			list.add(new Fruit("�ٳ���", "���"));
			// list.add("�ٳ���"); - list(ArrayList)�� ���׸� Ÿ���� Fruit�� �����Ǿ� �����Ƿ� Fruit���� ��ü�� �����Ͽ� 
			// ��Ҹ� �߰��ؾ� ������, �ڵ忡�� String�� ��ҷ� �߰��Ͽ���. = Type Error �� �߻��ߴ�.
			
			// for(int = 0; i< list.length; i++) {
			for(int = 0; i< list.size; i++) {
				// list(ArrayList) �÷��� ������ ��ũ�� length�� ����ؾ� ����� ���� ���� �� �ִ�. => Not Found Attribute(�Ӽ�) Error �߻�
				System.out.println(get[i].getName());
				// System.out.println(list[i].getName());
				// [�ε���]�� �迭 ��ü���� Ȱ���ؾ� ������, list(ArrayList)�� ���� �迭 ��� ���� ������ []�� ���Ǿ��� => ����� �� ���� ����(����) �߻� Not Allowed operation(Operation Not permmitted) Error �߻� 
			}
				

	}

}
