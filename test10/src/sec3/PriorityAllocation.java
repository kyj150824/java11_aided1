package sec3;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("그 다음 우선순위를 가진 분이 상담을 받습니다.");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("급한 순서대로 우선순위를 배분합니다.");
		
	}

		
}
