package sec1;

public class News {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String resdate;
	private int visited;
	

	// 합다운 함수의 오버로딩.
	
	public News() {
		this(1);
	}

	public News(int bno) {
		this(bno, "뉴스 제목");
	}

	public News(int bno, String title) {
		this(bno, title, "admin");
	}
	
	public News(int bno, String title, String uname) {
		this(bno, title, uname, "뉴스 내용");
	}
	
	public News(int bno, String title, String uname, String content) {
		this(bno, title, uname, content, "2024-02-23");
	}
	
	public News(int bno, String title, String uname, String content, String resdate) {
		this(bno, title, uname, content, resdate, 0  );
	}
	
	public News(int bno, String title, String uname, String content, String resdate, int visited) {
		super();
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}

	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
		
}
