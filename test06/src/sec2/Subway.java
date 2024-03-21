package sec2;

public class Subway {
	int no;
	String station;
	int money;
	int cnt;
	
	// 지하철 노선번호를 매개변수로 받는 생산자 함수
	
	public Subway(int no) {
		this.no = no;
	}
	
	// 지하철 승객이 탑승하면, 생기는 변화
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	
	//현재 지하철 정보 출력
	public void show() {
		System.out.println("지하철 :" + this.no + " 누적 요금 :" + this.money + " 승객 수 :" + this.cnt);
	}
}
