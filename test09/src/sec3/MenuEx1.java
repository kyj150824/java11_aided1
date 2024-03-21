package sec3;

public class MenuEx1 {

	public static void main(String[] args) {
		Lunch lu;
		
		lu = new Korean();
		lu.eating("김치찌개");
		
		lu = new Chinese();
		lu.eating("간풍기");
		
		lu = new Japanese();
		lu.eating("김치나베");		
	}
}
