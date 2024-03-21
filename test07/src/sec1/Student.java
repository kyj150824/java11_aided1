package sec1;
// 번호, 국어, 영어, 수학
// 메소드 : getter/setter 및 총점, 평균, 학점, 모든 학생 정보 출력
public class Student {
	private int num;
	private int kor;
	private int eng;
	private int math;
	public Student() { }
	public Student(int no, int kor, int eng, int math) {
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int tot() {
		// 총점 계산
		return (this.kor + this.math +this.eng);
	}
	
	public double avg() {
		// 평균 계산
		return (this.tot()/3.0f);
	}
	
	public String hak() {
		// 학점계산
		String h = "F";
		if(this.avg()>=90) h = "A";
		else if(this.avg()>=80) h = "B";
		else if(this.avg()>=70) h = "C";
		else if(this.avg()>=60) h = "D";
		else h = "F";
		return h;
	}	
	
	public void print() { 
	 	System.out.printf("%d\t%d\t%d\t%d\t%d\t.1f\t%s\n", this.num, this.kor, this.eng, this.math, this.tot(), this.avg(), this.hak());
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}


	}
	

	

