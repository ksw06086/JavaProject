package test.tv;

public class TV {
	private String maker;
	private int size;
	private String color;
	private int channel, volume;
	
	// setter(필드값 설정), getter(필드값 반환) 메소드 구현
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	public void powerOn() {
		System.out.println(maker + "전자 TV 켜짐");
	}
	
	public void powerOff() {
		System.out.println(maker + "전자 TV 꺼짐");
	}
	
	public void volumeUp() {
		System.out.println("볼륨올림: " + ++volume);
	}
	
	public void volumeDown() {
		System.out.println("볼륨내림: " + --volume);
	}
	
	public void upChannel() {
		System.out.println("채널올림: " + ++channel);
	}
	
	public void downChannel() {
		System.out.println("채널내림: " + --channel);
	}
	
}
