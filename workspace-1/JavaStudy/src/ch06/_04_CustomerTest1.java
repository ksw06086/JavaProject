package ch06;

public class _04_CustomerTest1 {
	public static void main(String[] args) {
		// 일반고객
		_04_Customer custLee = new _04_Customer();
		custLee.setCustomerID(10010);
		custLee.setCustomerName("이순신");
		custLee.calcPrice(1000);
		System.out.println(custLee.showCustomerInfo());
		
		// VIP고객
		_04_VIPCustomer custKim = new _04_VIPCustomer();
		custKim.setCustomerID(10020);
		custKim.setCustomerName("김유신");
		custKim.calcPrice(1000000);
		System.out.println(custKim.showCustomerInfo());
		
	}
}