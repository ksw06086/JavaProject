package ch04;

public class _03_Bank {
	private String bankName;					// �����
	private String accountNumber;			// ���¹�ȣ
	private int deposit;							// �Ա�
	private int withdraw;						// ���
	
	// ������
	// ����Ʈ �����ڴ� �����Ϸ��� �ڵ� �������ֹǷ� �����ص� �ȴ�.
	// �� ���α׷��Ӱ� �����ڸ� ���� �߰��ϸ� ����Ʈ �����ڴ� ��������� �ʴ´�.
	public _03_Bank() {
		System.out.println("����Ʈ ������ ȣ��~~");
		bankName = "������";
		accountNumber = "1616-16161-15151-16";
		deposit = 5000;
		withdraw = 2000;
	}
	
	// �Ű����� ������
	public _03_Bank(String bankName, String accountNumber, int deposit, int withdraw) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	// ��� ����
	public void printBankInfo() {
		System.out.println("����� : " + bankName);
		System.out.println("���¹�ȣ : " + accountNumber);
		System.out.println("�Աݾ� : " + deposit);
		System.out.println("��ݾ� : " + withdraw);
	}
}
