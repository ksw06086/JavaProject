package test.datatype;

public class DataTypeTest {

	public static void main(String[] args) {
//		숫자형 
//		정수형
		byte b = 127; // -128~127
		short s = b; // 묵시적(자동) 형변환
		int i = s + 5;
		long l = 1000000000;
		l = b;
		
//		실수형
		float f = 107.7f; // 명시적 형변환
		f = (float)303.3; // 명시적 형변환
		f = 100;
		f = 1; // 실수는 정수를 포함하기 때문에 정수형 값이나 정수형 변수의 값을 대입할 수 있다.
		double d = f;
		d = 1000000;
		d = 22.777;
		d = 1;
		d = s;
		
//		정수를 정수로 나눌 때는 명시적 형변환이 필요하다.
		int a1 = 55;
		int a2 = 33;
		double result = a1 / a2;
		System.out.println(result);
		result = a1 / (a2 * 1.0);
		System.out.println(result);
		System.out.printf("%.2f\n", result);
		
//		숫자가 아닌 형(Non-Numeric Type)
		char ch = 'T';
		ch = 65; // 묵시적 형변환
		System.out.println(ch);
		System.out.println(ch+7);
		System.out.println((char)(ch + 7));
		
		boolean bb = false;
		if(bb)
			System.out.println("boolean형의 값이 true 일 때만 실행됩니다.");
	}
}
