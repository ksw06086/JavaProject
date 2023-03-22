package ch03;

public class _03_StudentMainEx {
	public static void main(String[] args) {
		_03_Student st = new _03_Student();
		
		// 방법 1. set메소드를 통해서 학생정보 설정
		st.setStudentID(25);
		st.setStudentName("사이타마");
		st.setGrade(232);
		st.setAddress("F시 구역");
		
		// 출력메소드 호출
		System.out.println("setter 메소드를 이용한 출력");
		st.printInfo();
		
		System.out.println();
		
		// 방법 2. 매개변수 생성자를 통해서 학생정보 설정
		_03_Student st2 = new _03_Student(2000, "김선우", 3, "서울시 마포구");
		System.out.println("매개변수 생성자를 이용해서 출력");
		st2.printInfo();
		
	}
}