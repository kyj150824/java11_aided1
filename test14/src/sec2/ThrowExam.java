package sec2;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowExam {
// 예외떠넘기기
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		String absolutPath = "d:\\kyj\\java2\\test14\\bin\\sec2\\a.txt"; 
		// 절대경로
		String relativePath = "./a.txt"; 
		// 상대 경로 -> 현재 디렉토리
		String relativetPath2 = "../a.txt";
		// 상대 경로 -> 상위디렉토리 
		String relativetPath3 = "../a.txt";
		// 상대 경로 -> test14 디렉토리 안에
		fis = new FileInputStream(absolutPath);
		if(fis != null) {
			fis.close();
		}

	}

}
