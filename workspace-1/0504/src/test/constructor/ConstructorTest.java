package test.constructor;

public class ConstructorTest {
	private int stuId;
	private String name;
	
	public ConstructorTest() {
		
	}
	
	public ConstructorTest(int stuId, String name) {
		this.stuId = stuId;
		this.name = name;
	}

	public int getStuId() {
		return stuId;
	}

	public String getName() {
		return name;
	}
	
}
