package ch06;

public class _04_CustomerTest1 {
	public static void main(String[] args) {
		// �Ϲݰ�
		_04_Customer custLee = new _04_Customer();
		custLee.setCustomerID(10010);
		custLee.setCustomerName("�̼���");
		custLee.calcPrice(1000);
		System.out.println(custLee.showCustomerInfo());
		
		// VIP��
		_04_VIPCustomer custKim = new _04_VIPCustomer();
		custKim.setCustomerID(10020);
		custKim.setCustomerName("������");
		custKim.calcPrice(1000000);
		System.out.println(custKim.showCustomerInfo());
		
	}
}
