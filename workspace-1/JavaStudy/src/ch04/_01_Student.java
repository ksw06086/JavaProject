package ch04;

public class _01_Student {
	/**
	 * 클래스 : 객체에 대한 설계도, 디자인, 청사진(미래에 대한 희망적인 계획이나 구상)
	 * 		- 멤버변수(속성, 필드) + 멤버메소드(기능, 동작) + 생성자
	 * 
	 * 클래스는 설계도(디자인)이며, 객체는 이 설계도를 바탕으로 만들어진 힙메모리 공간이다.
	 * 그 결과 주소값이 만들어지며, 참조변수에 할당된다.(대입된다.)
	 * **/
	int studentID; 									// 학번
	String studentName;							// 이름
	int grade;											// 학년
	String address;									// 주소
	String e_mail;									// 이메일
	int score;											// 점수
	
	// 생성자
	public _01_Student() {
		
	}
	
	// 멤버메소드 - 기능
	public void showStudentInfo() {
		System.out.println("studentID : " + studentID);
		System.out.println("studentName : " + studentName);
		System.out.println("grade : " + grade);
		System.out.println("address : " + address);
		System.out.println("e_mail : " + e_mail);
		System.out.println("score : " + score);
	}
	
	
	
	
}