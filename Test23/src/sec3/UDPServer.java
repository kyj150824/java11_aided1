package sec3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet = null;
		int port = 7000;
		try {
			socket = new DatagramSocket(7000);
			while(true) {
				byte[] buffer = new byte[512];
				packet = new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				socket.receive(packet);
				// 수신 데이터 패킷 싣기
				String rData = new String(packet.getData());
				// 패킷(byte) 데이터 => String 으로 변환
				System.out.println("수신 데이터 : " + rData);
				
				InetAddress ip = packet.getAddress();
				port = packet.getPort();
				System.out.println("[Client IP Address] :" + ip);
				System.out.println("[Client Port] :" + port);
		
				// 송신(발신)
				packet = new DatagramPacket(packet.getData(), packet.getData().length);
				socket.send(packet);
				// 송신 데이터 패킷 실어 보내기
			}
		} catch(IOException e) {
			e.printStackTrace();
		}	
	}
}
