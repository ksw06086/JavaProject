package test.circle;

public class RunCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setR(5);
		c1.calcCircum();
		c1.calcArea();
		
		c2.setR(12);
		c2.calcCircum();
		c2.calcArea();
		
		System.out.printf("반지름이 %d㎝인 원의 둘레는 %.2f㎝입니다.\n", c1.getR(), c1.getCircum());
		System.out.printf("반지름이 %d㎝인 원의 둘레는 %.2f㎠니다.\n", c1.getR(), c1.getArea());
		
		System.out.printf("반지름이 %d㎝인 원의 둘레는 %.2f㎝입니다.\n", c2.getR(), c2.getCircum());
		System.out.printf("반지름이 %d㎝인 원의 둘레는 %.2f㎠니다.\n", c2.getR(), c2.getArea());
		
		
	}
}

// 중간고사 30%

// 1. 시험범위
// - 1~4장 프로그램 4-3까지
// - 11문제 => 1~3장이 10문제 4장 1문제 10점
// - total 30점
// - 시험유형 : 10문제는 - 객관식, 단답식, 짧은 서술형
// - TV 또는 Circle을 객체지향 방법을 사용하여 구현하는 내용
// - 정리 내용을 동영상으로 올려줄 것 거기에서만 문제가 나올 것 다른 곳에서 나오지 않음


