package test.interface1;

public class Iphone13 implements SmartPhone {

	@Override
	public void sendCall() {
		System.out.println("IPhone13 : 전화를 걸다");

	}

	@Override
	public void recieveCall() {
		System.out.println("IPhone13 : 전화를 받다");

	}

	@Override
	public void sendSMS() {
		System.out.println("IPhone13 : 문자를 보내다");

	}

	@Override
	public void recieveSMS() {
		System.out.println("IPhone13 : 문자를 받다");

	}

	@Override
	public void searchMusic(String name) {
		System.out.println("IPhone13 : " + name + "음악을 검색하다");

	}

	@Override
	public void playMusic(String name) {
		System.out.println("IPhone13 : " + name + "음악을 재생하다");

	}

	@Override
	public void stopMusic() {
		System.out.println("IPhone13 : 음악을 중지하다");

	}

	@Override
	public void installApp(String name) {
		System.out.println("IPhone13 : " + name + "앱을 설치하다.");

	}

	@Override
	public void runApp(String name) {
		System.out.println("IPhone13 : " + name + "앱을 실행하다");

	}

}
