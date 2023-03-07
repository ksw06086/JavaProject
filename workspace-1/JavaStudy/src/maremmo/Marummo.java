package maremmo;

public class Marummo {
	/*
	 *         *
	 *       ***
	 *     *****
	 *   *******
	 * *********
	 *   *******
	 *     *****
	 *       ***
	 *         *   
	 * */
	public static void main(String[] args) {
		String star = "*";
		
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<Math.abs(4-i); j++) {
				System.out.print("  ");
			}
			for(int j = 9; j > Math.abs(8-(i*2)); j--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
