package sec2;

public interface RemoteControl {
	int MAX = 10; // 상수
	int MIN = 0;
	
	// 추상 메소드
	void turnOff();
	public void turnOn();
	public void setVolume(int volume);
	default void setMute(boolean mute){
	// 인터페이스에 메소드는 기본 추상 메소드이므로 선언만 해야한다. 기본 접근 제한자는 public 이다.
	// 그러나, 구현 내용을 기술하고 싶을 경우, 기본 접근 제한자 default 로 명시하면 된다.	
	// 디폴트 메소드(default method)
	// 같은 패키지 내에 있는 클래스에서 default 메소드를 호출하여 실행할 수 있음.	오버라이딩 할수 있음.
		if (mute)System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	
	// 구현 내용 기술이 필요한 경우 static 으로 지시자를 선언하면 된다.
	// 객체 생성없이 public 접근 제한으로 메소드를 호출하여 실행할 수 있으며, 오버라이딩 할 수 없다.
	static void changeBattery() {
		System.out.println("건전지 교체");		
	}
}

