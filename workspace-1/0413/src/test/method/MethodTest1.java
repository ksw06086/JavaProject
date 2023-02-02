package test.method;

import java.util.Iterator;

public class MethodTest1 {
	// static : 자바 메모리 영역이 있음, 검찰청가면 조사실 있는 곳 같은 곳
	// static은 Heap 영역과 다른데 그래서 static을 안붙이면 static 메소드에서 사용 불가
	static void printHead(char symbol, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printHead('♣',25);
		System.out.println("Yuhan University");
		printHead('♠',30);
		System.out.println("ComputerSoftware");
		printHead('☆',21);
	}
}
