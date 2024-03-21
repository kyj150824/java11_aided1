package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		String[] email = { "kkt09072", "kbs@naver.com", "naver@naver.com", "kyj150824com"};
		Pattern p1 = Pattern.compile("[a-zA=Z0-9]+@[a-zA-z0-9]+\\.[a-z]+$");
		// 이메일 패턴
		for(int i =0; i<email.length; i++) {
			Matcher m = p1.matcher(email[i]);
		if(m.matches()) {
			System.out.println("이메일 형식이 맞습니다.");
			System.out.println(email[i]);
			}else {
				System.out.println("이메일 형식이 아닙니다.");
			}
		}
		
		String[] phone = {"010-9148-7549", "010-1234-5697", "010-123-4558", "010-1234-56758"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");
		// 휴대폰 패턴 가운데 자리 숫자 3인 경우도 휴대전화 형식에 들어가는 경우를 포함 시킴.
		//Pattern p2 = Pattern.compile ("01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$"); - 틀린건 아니지만 위에 것이 더 작음.
		for(int i =0; i<phone.length; i++) {
			Matcher m = p2.matcher(phone[i]);
		if(m.matches()) {
			System.out.println("휴대전화 형식이 맞습니다.");
			System.out.println(phone[i]);
			} else {
				System.out.println("전화 형식이 아닙니다");
			}
		}
		
		String[] jm = {"123456-1234567", "123456-1234567", "123456-1234567", "123456-1234567"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		for(int i =0; i<jm.length; i++) {
			Matcher m = p3.matcher(jm[i]);
		if(m.matches()) {
			System.out.println("주민번호 형식이 맞습니다.");
			System.out.println(jm[i]);
			} else {
				System.out.println("주민번호 형식이 아닙니다");
			}
		}
		
		String[] post = {"123-123", "123-12", "1523-123", "123-12" };
		// 우편번호 패턴 : 100번대 (1xx-yy) - 700번대(7xx-yy)
		Pattern p4 = Pattern.compile("\\d[3,4]-\\d[2,3]");
		for(int i =0; i<post.length; i++) {
			Matcher m = p4.matcher(jm[i]);
		if(m.matches()) {
			System.out.println("우편 형식이 맞습니다.");
			System.out.println(post[i]);
			} else {
			System.out.println("우편 형식이 아닙니다");
			}
		}
		
		// 비밀번호 패턴: 4~10 글자로 영문 대/소문자와 특수문자(!@#$%^&*?_) 그리고 숫자를 모두 최소 1문자를 포함
		// () 반드시 포함
		// ? 한문자
		// =. 이상
		// * 뒤에나오는 조건
		// (?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.[!@##$%^&*?_]).{4,10}$
		String[] pw = {"abcd1234", "A123a", "1234","ABCD!1234","ADFE!1004"};
		
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");	//비밀번호 패턴
		for(int i =0; i<pw.length; i++) {
			Matcher m = p5.matcher(pw[i]);
		if(m.matches()) {
			System.out.println("비밀번호 형식이 맞습니다.");
			System.out.println(pw[i]);
			} else {
			System.out.println("비밀번호 형식이 아닙니다");
			}
		}
	
	}
	}

	


