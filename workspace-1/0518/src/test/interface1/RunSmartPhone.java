package test.interface1;

public class RunSmartPhone {
	public static void main(String[] args) {
		Iphone13 i13 = new Iphone13();
		i13.searchMusic("ġ��");
		i13.playMusic("ġ��");
		i13.sendSMS();
		i13.sendCall();
		i13.installApp("����");
		i13.runApp("����");
	}
}
