package edu.kh.test;

public class Food {
	private String name;
	private int kcal;
	
	public Food() {}
	
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInfo() {
		return kcal;
	}
	public void setInfo(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Food [ name=" + name + ", kcal=" + kcal + "]";
	}

	}


