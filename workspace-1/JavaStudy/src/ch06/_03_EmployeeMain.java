package ch06;

public class _03_EmployeeMain {
	public static void main(String[] args) {
		_03_Sawon saw = new _03_Sawon();
		saw.setSabun(1001);
		saw.setName("홍길동");
		saw.setDeptName("화장실 청소");
		saw.setSalary(3000000);
		saw.setSudang(300000);
		saw.printInfo();
		
		_03_Manager man = new _03_Manager();
		man.setSabun(101);
		man.setName("김선우");
		man.setDeptName("개발부");
		man.setSalary(5000000);
		man.setBonus(900000);
		man.printInfo();
	}
}