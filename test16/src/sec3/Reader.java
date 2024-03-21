package sec3;

public class Reader {
	private int no;
	private String url;
	private String comment;
	int count;
	static String def;
	
	public Reader() {}
	public Reader(int no, String url, String comment, int count) {
		super();
		this.no = no;
		this.url = url;
		this.comment = comment;
		this.count = count;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "reader [no=" + no + ", url=" + url + ", comment=" + comment + ", count=" + count + "]";
	}
	
	
	
}
