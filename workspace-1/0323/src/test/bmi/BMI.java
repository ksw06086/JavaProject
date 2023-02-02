package test.bmi;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		// BMI: ü��, Ű, ����(��/��), ����(ü��/Ű������)
		System.out.println("###### BMI(ü��������) ######");
		System.out.println();
		// ü��, Ű�� Ű����� ����
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("* ���� �Է� : ");
		String name = sc2.nextLine();
		
		System.out.print("ü��(kg) �Է� : ");
		double w = sc.nextDouble();
		
		System.out.print("����(cm) �Է� : ");
		double h = sc.nextDouble();
		
		double bmi = w/Math.pow(h/100, 2);
		
		String result = "";
		
		if(bmi < 18.5)
			result = "��";
		else if(bmi < 25)
			result = "����";
		else if(bmi < 30)
			result = "��";
		else if(bmi < 35)
			result = "��";
		else
			result = "����";
		
	
		// System.out.println("# BMI(ü��������)�� " + bmi + "��/�� �Դϴ�.");
		System.out.printf("%s���� # BMI(ü��������)�� %.2f��/�� �̹Ƿ� %sü���Դϴ�.",name, bmi, result);
		
		
		sc.close();
		sc2.close();
	}
}
