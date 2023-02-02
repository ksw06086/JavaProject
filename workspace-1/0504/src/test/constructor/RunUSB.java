package test.constructor;

public class RunUSB {
	public static void main(String[] args) {
		USBMemory usb1 = new USBMemory(64, "Bule");
		USBMemory usb2 = new USBMemory(128, "silver");
		
		System.out.println(usb1.toString());
		usb1.writeMemory();
		usb1.readMemory();
		System.out.println("========================================");
		
		System.out.printf("* 용량: %dGB\n", usb2.getCapacity());
		System.out.printf("* 색상: %s\n", usb2.getColor());
		usb2.readMemory();
	}
}
