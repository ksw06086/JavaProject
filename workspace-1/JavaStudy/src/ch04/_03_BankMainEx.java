package ch04;

import test.Bank;

public class _03_BankMainEx {
	public static void main(String[] args) {
		_03_Bank bank = new _03_Bank();
		bank.setBankName("대한");
		bank.setAccountNumber("123-4567-89");
		bank.setDeposit(300000);
		bank.setWithdraw(2000000);
		
		bank.printBankInfo();
		System.out.println();
		
		_03_Bank bank2 = new _03_Bank("대한", "123-456-789", 30000000, 50000000);
		bank2.printBankInfo();
	}
}
