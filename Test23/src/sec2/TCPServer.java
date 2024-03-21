package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		// 서버용 소켓
		Socket socket = null;
		// 클라이언트용 소켓
		Scanner sc = new Scanner(System.in);
		// 메세지 입력 
		
		BufferedReader in = null; 
		// 메세지 받기 
		PrintWriter out = null;
		// 메세지 보내기
	
		try {
			server = new ServerSocket(6000);
			// 특정 포트 번호로 서버 시작
			System.out.println("서버 포트 : 6000");
			// 클라이언트 연결 대기
			socket  = server.accept();
			// 위의 세줄 순서 중요
			System.out.println("연결 대기");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			while(true) {
				// 수신
				String inMessage = in.readLine();
				// 클라이언트로부터 온 메세지
				System.out.println("[From Client] :" + inMessage);
				if(inMessage.contains("quit")) break;
				
				System.out.println("[Send to Message] :");
				// 클라이언트로 보낼 메세지
				String outMessage = sc.nextLine();
				
				// 발신
				out.println(outMessage); 
				// 송신 객체에 메세지 저장
				out.flush();
				// 클라이언트에게 송신 메서지 전달
				if(outMessage.contains("quit")) break;
			}
		} catch(Exception e) {
			e.printStackTrace();	
			System.out.println("[소켓 연결 시작 오류]");
		} finally {
			try {
				sc.close();
				socket.close();
				server.close();
				System.out.println("[연결 종료]");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[소켓 연결 종료 오류]");
			}
		}
	}
}
