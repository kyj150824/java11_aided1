package sec2;

public class BookExam {

	public static void main(String[] args) {
		
		Book[] book = new Book[100];
		/*for(int i=0; i<0; i++) {
			book[i] = new Book("책 제목" + i, "저자"+ i);
		}
		*/
		book[0] = new Book("책1", "저자1");
		book[1] = new Book("책2", "저자2");
		book[2] = new Book("책3", "저자3");
		book[3] = new Book("책4", "저자4");
		book[4] = new Book("책5", "저자5");
		
		for(int i=0; i<0; i++) {
			System.out.println(book[i].toString());
		}
	}
}	
