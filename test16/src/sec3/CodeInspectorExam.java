package sec3;
// 코드 인스펙션 => 성능개선, 코드 작성 규칙 준수, 에러 발생 가능성 최소화하기 위한 소스 코드 검증 작업
// PMD : 코드 인스펙션 도구  
// Code Inspection Level
// name Symbol Level Comment
// Blocker 
// Critical
// Urgent
// Important
// Warning


public class CodeInspectorExam {
	public static void main(String[] args) {
			Reader r1 = new Reader();
			Reader r2 = new Reader(2,"http://www.naver.com", "네이버 사이트", 1);
			r1.def= "시작 페이지"; 
		//	System.out.println(r2.toString());
		//	System.out.println(r2.def);
	}

}
