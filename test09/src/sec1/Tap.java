package sec1;

public class Tap implements Computer {

	@Override
	public void display() {
		System.out.println(" 태블릿 pc 의 크기는 14 인치");
		
	}

	@Override
	public void typing() {
		System.out.println(" 터치를 하거나, 블루투스 키보드로 타이핑합니다. ");
		
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("전원을 켭니다.");
		else System.out.println("전원을 끕니다.");
		
	}
	
	public void power(String name, boolean sw) {
	
	}

}