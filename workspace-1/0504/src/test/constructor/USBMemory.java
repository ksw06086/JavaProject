package test.constructor;

public class USBMemory {
	private int capacity;
	private String color;
	
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "USBMemory [capacity="+capacity+", color="+color+"]";
	}
	
	public void writeMemory() {
		System.out.println(color + "색상인 USB Memory에 데이터를 저장한다.");
	}
	
	public void readMemory(){
		System.out.println(color + "색상인 USB Memory에 데이터를 읽어온다.");
	}

	public int getCapacity() {
		return capacity;
	}

	public String getColor() {
		return color;
	}
	
	
}
