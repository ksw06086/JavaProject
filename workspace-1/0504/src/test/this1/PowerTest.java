package test.this1;

public class PowerTest {
	int n;
	
	public void power(int n) {
		this.n = n*n;
		System.out.println(this.n + "ÀÇ Á¦°ö½ÂÀº " + n + "ÀÔ´Ï´Ù.");
	}
	
	public static void main(String[] args) {
		PowerTest p = new PowerTest();
		p.power(8);
		
	}
}
