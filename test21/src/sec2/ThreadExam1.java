package sec2;

import java.awt.Toolkit;

//import com.sun.media.sound.Toolkit;

//Thread(쓰레드) = Process(프로세스) = 현재 컴퓨터에서 실행 중인 프로그램 (작업)
//발생 => 실행대기 => 점유(실행) => 실행대기  => 종료
// 실행 => 실행대기: sleep
// 실행대기 => 실행 : wake up
public class ThreadExam1 {

	public static void FirstThread() {
		System.out.println("첫 번째 쓰레드");
	}
	
	public static void SecoundThread() {
		System.out.println("두번째 쓰레드");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i<10; i++) {
			// 0~9 카운트 작업
			System.out.println(i);
			// toolkit.beep();
			try {
				Thread.sleep(1000); // ms => us
			
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}); 
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
			

	}
}