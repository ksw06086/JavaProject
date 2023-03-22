package ch06;

public class _03_Employee {
	private int sabun;					// 사번
	private String name;				// 이름
	private String deptName;			// 부서
	private int salary;					// 급여
	
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
		System.out.println("사번 : " + sabun + ", 이름 : " + name + ", 부서 : " + deptName + ", 급여 : " + salary);
	}
}