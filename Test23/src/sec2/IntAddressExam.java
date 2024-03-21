package sec2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntAddressExam {
	public static void main(String[] args) {
		InetAddress test = null;
		try {
			test = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("현재 로컬 컴퓨터의 네트워크 정보");
		System.out.println(test.getHostName() + " " + test.getHostAddress());
		InetAddress google_address = null;
		try {
			google_address = InetAddress.getByName("www.google.com"); //도메인 네임
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("\nGoogle 서버의 네트워크 정보");
		System.out.println(google_address);
	}

}

//지정된 URL로부터 정보르 읽어 들이기 위한 객체를 반환하는 메서드입니다.
