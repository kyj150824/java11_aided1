package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<IPInfo> ipInfoList = new ArrayList<IPInfo>(); 
		// List<IPInfo> ipInfoList = null;	
		// ipInfoList�� ArrayList�� �����ؾ� ������, 
		// null�� �����Ͽ����Ƿ� ipInfoList�� ��Ҹ� �߰�(add)�ϴ� 13~15 ������ NullPointerException�� �߻� 
		
		ipInfoList.add(new IPInfo("123.123.123.123","ȫ�浿"));
		ipInfoList.add(new IPInfo("212.133.7.8","�����")); 
		// ���1) IPInfo Ŭ������ �Ű� ���� ip �� �޴� �����ڸ� �߰� 
		// ���2) IPInfo ��ü ������ ip�� user�� �Ű����� ���� ��� �ִ´�. 
		// ipInfoList.add(new IPInfo("212.133.7.8"));  
		// IPInfo Ŭ�������� �Ű����� �ϳ��� ���� �޴� ������(Constructor)�� �����Ƿ� ��ü ���� �Ұ�  
		ipInfoList.add(new IPInfo("177.233.111.222","����"));
		
		System.out.print("ip �Է� : ");
		String ip = sc.next();
		
		for(int i=0 ; i<ipInfoList.size() ; i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) { 
				// if(ipInfoList.get(i) == ip) { 
				// ipInfoList.get(i)�� Ư�� ��°�� IPInfo Ŭ������ ��ü�̰�, ip �� String ���� �̹Ƿ�, 
				System.out.println(ipInfoList.get(i));
				break;
			}  // ��ġ�ϴ� ip ����ڰ� ���� ����� �޽��� ����� ����
		}
	}
}