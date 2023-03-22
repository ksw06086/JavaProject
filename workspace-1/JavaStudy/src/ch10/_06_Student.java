package ch10;

public class _06_Student {
	// 멤버변수
	private String studentID;				// 학번
	private String studentName;		// 이름
	private String email; 					// 이메일
	
	public _06_Student() {}
	
	public _06_Student(String studentID, String studentName, String email) {
		this.email = email;
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "학번 : " + studentID + ", 이름 : " + studentName + ", email : " + email;
	}
}