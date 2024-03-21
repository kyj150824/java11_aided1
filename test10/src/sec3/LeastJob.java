package sec3;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("가장 짧은 대기열을 가진 상담원에게 전달합니다.");
		
	}
	
	
}
