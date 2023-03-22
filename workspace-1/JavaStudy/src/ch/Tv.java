package ch;

public class Tv extends ElectroProduct{
	private String name;		// 이름
	
	public Tv() {}
	public Tv(int price, String name) {
		super(price);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
	}
	
}
