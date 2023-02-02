package test.condition;

public class ThreeCondition {
	public static void main(String[] args) {
//		나이 입력하면 미성년인지 성인인지 파악
		int age = 24;
		
		String result = ""; // empty string = ""
		
		result = (age >= 20) ? "성인" : "미성년";
		System.out.println("귀하는 " + result + "입니다.");
 		
		
	}
}
