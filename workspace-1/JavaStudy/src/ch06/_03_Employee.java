package ch06;

public class _03_Employee {
	private int sabun;					// ���
	private String name;				// �̸�
	private String deptName;			// �μ�
	private int salary;					// �޿�
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("��� : " + sabun + ", �̸� : " + name + ", �μ� : " + deptName + ", �޿� : " + salary);
	}
}
