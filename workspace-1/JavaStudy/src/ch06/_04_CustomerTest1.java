package ch06;

public class _04_CustomerTest1 {
	public static void main(String[] args) {
		// ¿œπ›∞Ì∞¥
		_04_Customer custLee = new _04_Customer();
		custLee.setCustomerID(10010);
		custLee.setCustomerName("¿Ãº¯Ω≈");
		custLee.calcPrice(1000);
		System.out.println(custLee.showCustomerInfo());
		
		// VIP∞Ì∞¥
		_04_VIPCustomer custKim = new _04_VIPCustomer();
		custKim.setCustomerID(10020);
		custKim.setCustomerName("±Ë¿ØΩ≈");
		custKim.calcPrice(1000000);
		System.out.println(custKim.showCustomerInfo());
		
	}
}
