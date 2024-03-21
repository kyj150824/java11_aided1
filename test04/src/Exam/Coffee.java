package Exam;

public class Coffee {

	public String name;
	public int pay;
	public Coffee(String name) {
		this.name = name;
	}

	
	
	public void Star(int pay) {
		this.pay += pay;
	}
	
	public void showInfo() {
		System.out.println("김씨가 산 메뉴의 이름은" + name + "이고" + pay + "을 냈습니다.");
	}
	
	
}
