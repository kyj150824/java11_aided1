package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		String names = "����� �̼��� ������ ���ָ� �ο�����"; //���ڿ�
		
		List<IPInfo> ipList = new ArrayList<>();	//List
		ipList.add(new IPInfo("192.168.0.191", "�̼���"));
		ipList.add(new IPInfo("192.168.1.132", "�̿���"));
		ipList.add(new IPInfo("192.168.3.24", "�����"));
		ipList.add(new IPInfo("192.168.1.3", "������"));
		
		String str = "�̼���";
		
		System.out.println("String���� ã��");
		if(names.contains(str)) {
			System.out.println(str+"�� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println(str+"�� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
		
		System.out.println("\nArrayList���� ã��");

		boolean sw = false;
		for(IPInfo i:ipList) {
			if(i.getUser().equals(str)) {
				sw = true;
			}
		}
		
		if(sw) {
			System.out.println(str+"�� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println(str+"�� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
	}

}
