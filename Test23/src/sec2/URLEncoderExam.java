package sec2;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderExam {

	public URLEncoderExam() {
		String msg = "abc가나다def1234學校";
		String enc_data;
		try {
			enc_data = URLEncoder.encode(msg, "UTF-8");
			System.out.println("인코딩 : " + enc_data);
			
			String dec_data = URLDecoder.decode(enc_data, "UTF-8");
			System.out.println("디코딩 :" + dec_data);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new URLEncoderExam();
	}

}
