package test.this3;

public class Student {
	String name;
	int stuId;
	int age;
	String addr;
	
	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int stuId) {
		this(name);
		this.stuId = stuId;
	}

	public Student(String name, int stuId, int age) {
		this(name, stuId);
		this.age = age;
	}

	public Student(String name, int stuId, int age, String addr) {
		this(name, stuId, age);
		this.addr = addr;
	}
	
	
	
}
