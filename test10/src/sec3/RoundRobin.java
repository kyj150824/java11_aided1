package sec3;
// 시 분할 처리 시스템 : 하나의 시스템을 여러명이 사용하기 위해 서로 
// 하나의 시스템을 여러명이 사용하기 위한 시스템 사용 계획표
// 5명이 1시간씩 교대로 시스템을 사용.
// A 3시간
// B 2시간
// C 4시간
// D 3시간
// E 2시간

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("다음 상담전화를 가져옵니다.");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("다음 상담원에게 전화를 넘깁니다.");
		
	}
	

}
