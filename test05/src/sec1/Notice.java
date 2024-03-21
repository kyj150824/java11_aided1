package sec1;

public class Notice {
		
		private int bno;
		private String title;
		private String uname;
		private String content;
		private String resdate;
		private String visited;
		
		public Notice(int bno, String title, String uname, String content, String resdate, String visited) {
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
			return "Notice [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content
					+ ", resdate=" + resdate + ", visited=" + visited + "]";
		}
		

}


