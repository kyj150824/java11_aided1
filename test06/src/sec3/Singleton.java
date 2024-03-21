package sec3;
// 싱글톤 : 하나의 객체 생성만 허용되는 클래스
public class Singleton {
	private static Singleton instance;
	// 내부에서만 공유 가능한 데이터
	// 정척 객체 선언
	private Singleton() { }
	// 외부에서 생성할 수 없도록 private
	public static synchronized Singleton getInstance() {
		//synchronized : 동기화
		if(instance == null) instance = new Singleton();
		return instance;
	}
	
}
