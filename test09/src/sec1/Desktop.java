package sec1;

public class Desktop implements Computer {

	@Override
	public void display() {
		System.out.println(" 데스크 탑의 모니터 기본 해상도: 1920 x 1080 ");
		
	}

	@Override
	public void typing() {
		System.out.println(" 데스크 탑은 별도의 마련된 키보드를 타이핑 합니다. ");
		
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println(" 데스크 탑의 전원을 켭니다. ");
		else System.out.println(" 데스크 탑의 전원을 끕니다. ");
	}
	
	// 오버 로딩이 된것 - 오버 라이딩이 아님.
	public void power(String name, boolean sw) {
		
	}
	
}
