package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// String 타입의 List stream 방식 활용
public class StreamExam2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("1");
		lst.add("2");
		lst.add("6");
		lst.add("4");
		lst.add("5");
		lst.add("3");
			
		// ArrayList의 Stream화
		Stream<String> stream = lst.stream();
		System.out.println(" 정렬 전 ");
		stream.forEach(s -> System.out.println(s));
		System.out.println(" 정렬 후 ");
		lst.stream().sorted().forEach(s -> System.out.println(s));
		
		// 요소의 수 계산하여 출력
		int cnt = (int)lst.stream().count();
		System.out.println(" 인원수 : " + cnt );
	}

}
