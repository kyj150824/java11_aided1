package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Set : 값만 저장, 중복 허용하지 않는다. 순서 유지 하지 않는다.
// Set 종류 : HashSet, TreeSet
public class SetExam {

	public static void main(String[] args) {
		// Set의 선언 및 생성
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set1.add("김기태"); // 요소 추가
		set1.add("김이태");
		set1.add("김삼태");
		set1.add("김사태");
		set1.add("김오태");
		set1.add("김육태");
		set1.add("김칠태");
		set1.add("김기태"); // 중복 발 생 -> 중복 허용 하지 않음 
		set1.add("김구태");
		
		System.out.println("요소의 수 : " + set1.size());
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 :");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("해다 이름이 존재합니다.");
		}else {
			set1.add(name);
			System.out.println( "\n" + name + "이 입력되었습니다.");
		}
		
		set1.remove("김기태"); 
		// set1에 특정 요소 삭제
		set1.clear();
		// ser1 비우기
		
		if(set2.isEmpty()) { 
			// set2가  비어 있는지 확인
			System.out.println("set2 가 비어 있습니다.");
		} else {
			System.out.println("set2의 요소의 수 : " + set2.size());
		}
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
	
			// Set의 순회1 -> 항상된 for 문
		for(Integer s : set3) {
			System.out.println(s);
		}
		// Set의 순회2 -> Iterator에 의한 순회
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " \t");
		}
	}
}
