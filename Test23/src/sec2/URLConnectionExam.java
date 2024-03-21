package sec2;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionExam {

	public static void main(String[] args) {
		try {
			URL kbs = new URL("https://program.kbs.co.kr/2tv/drama/korea_khitan/pc/index.html");
					try {
						URLConnection kbsCon = kbs.openConnection();
						System.out.println("문서의 타입 :" + kbsCon.getContentType());
						System.out.println("문서의 마지막 수정일자 :"  + new Date(kbsCon.getLastModified()));
						System.out.println("문서의 크기 :" + kbsCon.getContentLength()+ "Bytes");
						int size = kbsCon.getContentLength();
						if(size > 0) {
							System.out.println("***** 문서의 내용은 다음과 같습니다. *****");
							InputStream input = kbsCon.getInputStream();
							int i = size;
							int c;
							while(((c= input.read())))
						}
					}
		}

	}

}
