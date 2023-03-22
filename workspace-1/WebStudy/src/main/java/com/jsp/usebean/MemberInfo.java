package com.jsp.usebean;

// 자바빈 	: 자바빈 규약에 따르는 클래스
// 용도 		: 속성을 표현하기 위한 용도 => DTO(Data Transfer(전송) Object)
//       	  (DB 저장 읽어오기 할 때에 그릇으로 사용)
public class MemberInfo {
	// 멤버변수, 속성, 프로퍼티
	private String id;
	private String password;
	private String name;
	private String address;
	private String email;
	
	// 생성자
	public MemberInfo() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
