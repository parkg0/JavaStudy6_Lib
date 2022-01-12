package com.google.s3.ex1;

public class MemberDTO { //회원 한명을 뜻함
	//아이디 패스워드 이름 이메일
			//총 3명 
	//회원을 구성하는 구성요소를 선언 
	//멤버변수의 접근지정자는 모두 private
	//외부에서 접근가능하도록 무언가를 만들어라
	//무언가=멤버변수에 값을 집어넣는(setter)(getter)
	//setter 공식 set변수명(매개변수로 값을 받아오고)
	//getter 	get변수명(리턴으로 데이터를 반환)
private String id;
private String pw;
private String name;
private String email;
private int age;

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getId() {
	return id;
}
public void setId(String id) {

	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
