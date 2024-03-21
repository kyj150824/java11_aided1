package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {
		Book book1 = new Book();
		/*book1.print();
		book1.print("456465");
		book1.print("교재이름");
		book1.print(150);
		book1.print("454153","교재이름", 500);
		*/
		book1.setBno("100");
		book1.setBname("정보처리기사");
		book1.setPrice(42000);
		book1.setAuthor("김기태");
		book1.setPub("교보");
		
		Book book2 = new Book();
		book2.setBno("100");
		book2.setBname("정보처리기사");
		book2.setPrice(42000);
		book2.setAuthor("김기태");
		book2.setPub("교보");
		
		
		Book book3 = new Book();
		book3.setBno("100");
		book3.setBname("정보처리기사");
		book3.setPrice(42000);
		book3.setAuthor("김기태");
		book3.setPub("교보");
		
		Book book4 = new Book();
		book4.print();
		book4.print(book1.getBno(), book1.getBname(),book1.getPrice(), book1.getAuthor(), book1.getPub());
		book4.print(book2.getBno(), book2.getBname(),book2.getPrice(), book2.getAuthor(), book2.getPub());
		book4.print(book3.getBno(), book3.getBname(),book3.getPrice(), book3.getAuthor(), book3.getPub());
	}	
}
