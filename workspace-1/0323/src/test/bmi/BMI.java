package test.bmi;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		// BMI: 체중, 키, 단위(㎏/㎥), 공식(체중/키제곱승)
		System.out.println("###### BMI(체질량지수) ######");
		System.out.println();
		// 체중, 키를 키보드로 입혁
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("* 성명 입력 : ");
		String name = sc2.nextLine();
		
		System.out.print("체중(kg) 입력 : ");
		double w = sc.nextDouble();
		
		System.out.print("신장(cm) 입력 : ");
		double h = sc.nextDouble();
		
		double bmi = w/Math.pow(h/100, 2);
		
		String result = "";
		
		if(bmi < 18.5)
			result = "저";
		else if(bmi < 25)
			result = "정상";
		else if(bmi < 30)
			result = "과";
		else if(bmi < 35)
			result = "비만";
		else
			result = "고도비만";
		
	
		// System.out.println("# BMI(체질량지수)는 " + bmi + "㎏/㎥ 입니다.");
		System.out.printf("%s님의 # BMI(체질량지수)는 %.2f㎏/㎥ 이므로 %s체중입니다.",name, bmi, result);
		
		
		sc.close();
		sc2.close();
	}
}
