package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//�̸������ �ۼ� : Ű����� �̸��� �Է¹޾� �̸����(nameList)�� �߰��ϵ�, �Է� ���� clear�̸�, �̸���� �ʱ�ȭ, exit �̸�, �ݺ������� ����, ����, ���� ���� �ߺ��� �̸��� ������, "�̹� �����ϴ� �̸��Դϴ�" �޽����� ����ϰ�, ��� �Է¸��� ����Ǹ�, ����, �Է� ���� ���� �̸��� �������� ������, �̸���Ͽ� �̸��� �߰��ϰ�, �ݺ��� ����Ǹ�, �̸������ ����Ѵ�.
public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();

		while(true) {
			System.out.print("�߰��� �̸��� �Է��ϼ��� : ");
			String name = sc.next();
			
			if(name.equals("clear")) { //if(name == "clear") { //String �񱳴� ==�� �ƴϰ�, equals()�� ��� �ϹǷ� ==�� ����Ͽ��� ��� ����񱳰� ���� �ʴ´�.
				System.out.println("�̸� ����� �ʱ�ȭ �մϴ�.");
				nameList.clear();
				continue; //continue ������ �����ؾ��� �ٸ� ���庸�� �ռ� �־ continue ���� ������ ������ ������� ����.
			}
			
			if(name.equals("exit")) { //if(name == "exit") { //String �񱳴� ==�� �ƴϰ�, equals()�� ��� ��.
				System.out.println("<<�Է� ����>>");
				break; //return ;	//exit�� �Էµ� ��� �Ʒ� �ݺ���� ������ �������� ���ϰ�, main �Լ�(�޼ҵ�)�� ������ Ż���ع�����. 
			}
			
			if(nameList.contains(name)) {
				System.out.println("<�̹� �����ϴ� �̸��Դϴ�>");
			} else {
				nameList.add(name); //�̸����(nameList)�� �̸��� �߰��ϴ� ���� �ڵ��� �������� ���� �߰����� ����.
				System.out.println(name + " �߰� �Ϸ�");
			}
		}
		
		for(String name : nameList) {
			System.out.println(name);
		}
	}
}