package ch08;

public class _01_Main {
	public static void main(String[] args) {
		_01_SubCalc cal = new _01_SubCalc();
		System.out.println(cal.add(10, 2));
		System.out.println(cal.substract(10, 2));
		System.out.println(cal.times(10, 2));
		System.out.println(cal.divide(10, 2));
		cal.showInfo();
		
		System.out.println();
		
		// ������ ���� : �θ�Ÿ�� �������� = new �ڽ�Ŭ����();
		_01_CalcImpl calc = new _01_SubCalc();
		System.out.println(calc.add(10, 2));
		System.out.println(calc.substract(10, 2));
		System.out.println(calc.times(10, 2));
		System.out.println(calc.divide(10, 2));
		// �ٿ�ĳ����
		_01_SubCalc s = (_01_SubCalc)calc;
		s.showInfo();
	}
}
