package ch04;

public class _08_SingleTonEx {
	public static void main(String[] args) {
		// 4�ܰ� : ������ ����ϴ� �ڵ� �����
		_08_Company company = _08_Company.getInstance();
		_08_Company company2 = _08_Company.getInstance();
		System.out.println(company == company2);
	}
}
