package test.inheritance1;

public class RunStInfo {
	public static void main(String[] args) {
		SubStInfo s = new SubStInfo();
		s.name = "김유한";
		s.stuId = 2020001;
		s.age = 22;
		s.addr = "경기도 부천시 괴안동";
		
		System.out.println("* 성명 : " + s.name);
		System.out.println("* 학번 : " + s.stuId);
		System.out.println("* 주소 : " + s.addr);
	}
}
