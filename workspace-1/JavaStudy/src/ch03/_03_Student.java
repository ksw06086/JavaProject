package ch03;

public class _03_Student {
	// �������
	private int studentID; 										// �й�
	private String studentName;							// �̸�
	private int grade;											// �г�
	private String address;									// �ּ�
	
	public _03_Student() {
		System.out.println("�⺻������ ȣ��");
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
