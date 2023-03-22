package test;

public class BankMainEx {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setName("시바견");
		bank.setBankName("돈많아은행");
		bank.setAccountNumber("123-4567-89");
		bank.setAssets(10000000);
		bank.setDeposit(300000);
		bank.setWithdraw(2000000);
		
		bank.printBankInfo();
		System.out.println();
		
		Bank bank2 = new Bank("나", "돈없어은행", "123-456-789", 2000000000, 30000000, 50000000);
		bank2.printBankInfo();
	}
}