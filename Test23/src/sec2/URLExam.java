package sec2;

import java.net.MalformedURLException;
import java.net.URL;

public class URLExam{
	public static void main(String[] args) throws MalformedURLException {
		URL kbs = new URL("https://program.kbs.co.kr/2tv/drama/korea_khitan/pc/index.html");
		System.out.println("프로토콜 종류: " + kbs.getProtocol());
		System.out.println("포트번호 :" + kbs.getPort());
		System.out.println("호스트 이름 :" + kbs.getHost());
		System.out.println("파일 (경로포함)" + kbs.getFile());
		System.out.println("전체 URL :" + kbs.toExternalForm());
	}
}