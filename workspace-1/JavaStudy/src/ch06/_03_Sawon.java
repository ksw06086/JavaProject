package ch06;

public class _03_Sawon extends _03_Employee{
	private int sudang; // ����

	public int getSudang() {
		return sudang;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	/*
	 * �������̵� : �ڽ�Ŭ������ �޼ҵ尡 �θ�Ŭ������ �޼ҵ带 �������̵�(������)�Ѵٶ�� ����
	 * 					�� �θ� ��� ������
	 * **/
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("���� : " + sudang);
	}
	
}
