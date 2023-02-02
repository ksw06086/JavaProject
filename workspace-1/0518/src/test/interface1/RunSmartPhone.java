package test.interface1;

public class RunSmartPhone {
	public static void main(String[] args) {
		Iphone13 i13 = new Iphone13();
		i13.searchMusic("치열");
		i13.playMusic("치열");
		i13.sendSMS();
		i13.sendCall();
		i13.installApp("게임");
		i13.runApp("게임");
	}
}
