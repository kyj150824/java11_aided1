package org.kh.object1;
// public - 어디서든지 구성요소를 접근할 수 있음. > protected > default > private 
// 모든 패키지나 클래스 = *(모든것이라는 뜻) > 동일, 상속, 연관 > 동일 > 현재클래스
public class Member {
	
	private  String id;
	private  String pw;
	private  String email;
	private  int birth;
	private  String tel;
	
	// void가 들어가는 경우 전하기만 하면 되니깐.
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getEmail() {
		return email;
	}
	public int getBirth() {
		return birth;
	}
	public String getTel() {
		return tel;
	}
	@Override
	// 상속받아서 내용을 바꿔 정의하는 것
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
}




