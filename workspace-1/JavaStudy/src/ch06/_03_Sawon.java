package ch06;

public class _03_Sawon extends _03_Employee{
	private int sudang; // 수당

	public int getSudang() {
		return sudang;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	/*
	 * 오버라이딩 : 자식클래스의 메소드가 부모클래스의 메소드를 오버라이드(재정의)한다라고 말함
	 * 					ㄴ 부모 기능 무시함
	 * **/
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("수당 : " + sudang);
	}
	
}