package test.interface1;

public class Iphone13 implements SmartPhone {

	@Override
	public void sendCall() {
		System.out.println("IPhone13 : ��ȭ�� �ɴ�");

	}

	@Override
	public void recieveCall() {
		System.out.println("IPhone13 : ��ȭ�� �޴�");

	}

	@Override
	public void sendSMS() {
		System.out.println("IPhone13 : ���ڸ� ������");

	}

	@Override
	public void recieveSMS() {
		System.out.println("IPhone13 : ���ڸ� �޴�");

	}

	@Override
	public void searchMusic(String name) {
		System.out.println("IPhone13 : " + name + "������ �˻��ϴ�");

	}

	@Override
	public void playMusic(String name) {
		System.out.println("IPhone13 : " + name + "������ ����ϴ�");

	}

	@Override
	public void stopMusic() {
		System.out.println("IPhone13 : ������ �����ϴ�");

	}

	@Override
	public void installApp(String name) {
		System.out.println("IPhone13 : " + name + "���� ��ġ�ϴ�.");

	}

	@Override
	public void runApp(String name) {
		System.out.println("IPhone13 : " + name + "���� �����ϴ�");

	}

}
