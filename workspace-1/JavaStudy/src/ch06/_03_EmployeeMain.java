package ch06;

public class _03_EmployeeMain {
	public static void main(String[] args) {
		_03_Sawon saw = new _03_Sawon();
		saw.setSabun(1001);
		saw.setName("ȫ�浿");
		saw.setDeptName("ȭ��� û��");
		saw.setSalary(3000000);
		saw.setSudang(300000);
		saw.printInfo();
		
		_03_Manager man = new _03_Manager();
		man.setSabun(101);
		man.setName("�輱��");
		man.setDeptName("���ߺ�");
		man.setSalary(5000000);
		man.setBonus(900000);
		man.printInfo();
	}
}
