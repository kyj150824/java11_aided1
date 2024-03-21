package org.kh.object1;

public class Student {
		
	String name = "아무개";
	int kor = 100;
	int eng = 100;
	int mat = 100;
	public int tot() {
		return this.kor + this.eng + this.mat;
	}
	public float avg() {
		return(this.kor + this.eng + this.mat)/ 3.0f;
	}
	void resulting() {
		System.out.println("이름: "+this.name+", 총점: "+ this.tot() +"평균: "+this.avg());
	}
}
	

