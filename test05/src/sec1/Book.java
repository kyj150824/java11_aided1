package sec1;
// 교재코드 (bno), 교재명(bname), 가격(price), 가격(price), 저자(author), 출판사(pub) 등을 요소로 하며 직접 접근이 되지 않도록
// 정보 은닉을 하고 , getter/setter 등을 작성하며, 출력 메소드 print(0 를 추가 작성하되 매개 변수의 개수를 따라 출력될 수 있도록 하시오.

public class Book {
		
		private String bno;
		private String bname;
		private int price;
		private String author;
		private String pub;
		
		
		public void print() {
			System.out.println("교재정보");
		}
		
		public void println(String bname) {
			System.out.println("교재명 :" + bname);
		}
		
		public void print(int price) {
			System.out.println("교재가격 :" + price);
		}
		
		public void print(String bname, int price) {
			System.out.println("교재명 :" + bname);
			System.out.println("교재가격 :" + price);
			
		}
		
		public void print(String bname, int price, String author) {
			System.out.println("교재명 :" + bname);
			System.out.println("교재 가격 :" + price);
			System.out.println("저자 :" + author);
		}
		
		public void print(String bno, String bname, int price, String author) {
			System.out.println("교재코드: " + bno);
			System.out.println("교재명 :" + bname);
			System.out.println("교재 가격 :" + price);
			System.out.println("저자 :" + author);
		}
		
		public void print(String bno, String bname, int price, String author, String pub) {
			System.out.println("교재코드: " + bno);
			System.out.println("교재명 :" + bname);
			System.out.println("교재 가격 :" + price);
			System.out.println("저자 :" + author);
			System.out.println("출판사 :" + pub);
			
		}
		
		
		public String getBno() {
			return bno;
		}
		
		public void setBno(String bno) {
			this.bno = bno;
		}
		
		public String getBname() {
			return bname;
		}
		
		public void setBname(String bname) {
			this.bname = bname;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public String getPub() {
			return pub;
		}
		
		public void setPub(String pub) {
			this.pub = pub;
		}

		@Override
		public String toString() {
			return "Book [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
					+ "]";
		}
		
		

}
