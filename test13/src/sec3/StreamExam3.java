package sec3;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// reduce() 활용하기
// 예시: 여러 문자열(String)의 배열에서 가장 글자수가 많은 ( 이진수 값이 가장 큰 ) 문자 열을 찾아 반환하는 
// BinaryOperateor : 문자든 숫자든 모두 2진수로 반환하여 비교하거나 처리하고자 할때 활용되는 인터페이스
class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1; 
			else return s2;
	}
	
	
}
public class StreamExam3 {

	public static void main(String[] args) {
		String[] arr = {" 어쩔 ", "티비 ", "저쩔 ", "티비 ", "흥 ", "퉤", "칫"};
		System.out.println(Arrays.stream(arr).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
		System.out.println("BinaryOperator를 활용한 reduce");
		String res = Arrays.stream(arr).reduce(new CompareString()).get();
		System.out.println(res);
		
	}

}
