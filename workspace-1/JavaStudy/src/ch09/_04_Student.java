package ch09;

public class _04_Student {
	int studentId;
	String studentName;
	
	public _04_Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _04_Student) {
			_04_Student st = (_04_Student)obj;
			if(this.studentId == st.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
