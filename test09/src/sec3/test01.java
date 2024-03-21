package sec3;
// 칼로리 계산하기
public class test01 {

	public static void main(String[] args) {
		double kcal = cal(5000);	
		
		System.out.println(" 총칼로리 " + kcal + " 입니다. ");
		
	}
	
	public static double cal(int walking) {
		return 0.02 * walking;
	}

}
