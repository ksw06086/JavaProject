package ch04;

public class _01_StudentMainEx {
	public static void main(String[] args) {
		/**
		 * 참조변수명에는 생성한 객체의 힙메모리공간 주소값이 들어있다.
		 * 앞의 클래스명은 데이터타입이고, 참조변수로 접근할 때 사용한다.
		 * 뒤의 클래스명은 *메모리에 객체생성시 사용되는 생성자이다.
		 * */
		_01_Student st = new _01_Student();
		st.studentID = 1001;
		st.studentName = "김선우";
		st.grade = 1;
		st.address = "서울시 마포구";
		st.e_mail = "k-sunwo@naver.com";
		st.score = 100;
		st.showStudentInfo();
		
		System.out.println();
		
		_01_Student st2 = new _01_Student();
		st2.studentID = 1002;
		st2.studentName = "김선우B";
		st2.grade = 2;
		st2.address = "서울시 강서구";
		st2.e_mail = "k-sunwo@naver.com";
		st2.score = 99;
		st2.showStudentInfo();
	}
}