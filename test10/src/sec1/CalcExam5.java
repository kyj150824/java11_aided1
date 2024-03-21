package sec1;

public class CalcExam5 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		
		Repeator rep1;
		
		rep1 = new Repeator(){
			public int add(int num1, int num2) {
				return num1 + num2;
			};

			public int subtract(int num1, int num2) {
				int su = 0;
				if(num1 > num2) su = num1 - num2;
				else su = num2 - num1;
				return su;
			};
			public int multiply(int num1, int num2) {
				return num1 * num2;
			};


			public int divide(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1 / num2;
				else su = num2 / num1;
				return su;
			};

			int power(int num1, int num2) { // 2, 3
				int tmp = num1;
				for(int i=1;i<num2;i++) { // 1 2 
					num1 = num1 * tmp;
				}
				return num1;
			};
		
		};
		System.out.println("원주율" +rep1.PI);
		System.out.println("덧셈" + rep1.add(num1, num2));
		System.out.println("뺄셈"+ rep1.subtract(num1, num2));
		System.out.println("나누기" + rep1.multiply(num1, num2));
		System.out.println("곱하기" + rep1.divide(num1, num2));
		System.out.println("제곱근" + rep1.power(num1, num2));

	}
}