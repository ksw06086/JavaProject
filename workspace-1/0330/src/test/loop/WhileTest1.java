package test.loop;

public class WhileTest1 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 7) {
			System.out.print(i+1 + "\t");
			i++;
		}
		
		System.out.println();
		
		for(int j = 0; j < 7; j++) {
			System.out.print(j+1 + "\t");
		}
	}
}
