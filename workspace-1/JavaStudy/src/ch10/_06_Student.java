package ch10;

public class _06_Student {
	// �������
	private String studentID;				// �й�
	private String studentName;		// �̸�
	private String email; 					// �̸���
	
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
		return "�й� : " + studentID + ", �̸� : " + studentName + ", email : " + email;
	}
}
