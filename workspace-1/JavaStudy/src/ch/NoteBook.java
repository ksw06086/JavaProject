package ch;

public class NoteBook extends ElectroProduct{
	private String name;		// 이름
	
	public NoteBook() {}
	public NoteBook(int price, String name) {
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
		System.out.println("제품명 : " + name);
	}
	
}
