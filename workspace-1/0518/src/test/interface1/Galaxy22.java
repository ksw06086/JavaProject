package test.interface1;

public class Galaxy22 implements MobilePhone, MP3 {

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

}
