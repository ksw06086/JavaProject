package ch03;

public class _03_Student {
	// 멤버변수
	private int studentID; 										// 학번
	private String studentName;							// 이름
	private int grade;											// 학년
	private String address;									// 주소
	
	public _03_Student() {
		System.out.println("기본생성자 호출");
	}
	
	public _03_Student(int studentID, String studentName, int grade, String address) {
		setStudentID(studentID); 				// this.studentID = studentID;
		setStudentName(studentName); 		// this.studentName = studentName;
		setGrade(grade); 								// this.grade = grade;
		setAddress(address); 						// this.address = address;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printInfo() {
		System.out.println("studentID : " + studentID);
		System.out.println("studentName : " + studentName);
		System.out.println("grade : " + grade);
		System.out.println("address : " + address);
	}
	
}