package test.tv;

public class TV {
	private String maker;
	private int size;
	private String color;
	private int channel, volume;
	
	// setter(�ʵ尪 ����), getter(�ʵ尪 ��ȯ) �޼ҵ� ����
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
		System.out.println(maker + "���� TV ����");
	}
	
	public void powerOff() {
		System.out.println(maker + "���� TV ����");
	}
	
	public void volumeUp() {
		System.out.println("�����ø�: " + ++volume);
	}
	
	public void volumeDown() {
		System.out.println("��������: " + --volume);
	}
	
	public void upChannel() {
		System.out.println("ä�οø�: " + ++channel);
	}
	
	public void downChannel() {
		System.out.println("ä�γ���: " + --channel);
	}
	
}
