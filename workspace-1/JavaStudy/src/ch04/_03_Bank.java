package ch04;

public class _03_Bank {
	private String bankName;					// 은행명
	private String accountNumber;			// 계좌번호
	private int deposit;							// 입금
	private int withdraw;						// 출금
	
	// 생성자
	// 디폴트 생성자는 컴파일러가 자동 생성해주므로 생략해도 된다.
	// 단 프로그래머가 생성자를 직접 추가하면 디폴트 생성자는 만들어지지 않는다.
	public _03_Bank() {
		System.out.println("디폴트 생성자 호출~~");
		bankName = "나은행";
		accountNumber = "1616-16161-15151-16";
		deposit = 5000;
		withdraw = 2000;
	}
	
	// 매개변수 생성자
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
	
	// 출력 정보
	public void printBankInfo() {
		System.out.println("은행명 : " + bankName);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("입금액 : " + deposit);
		System.out.println("출금액 : " + withdraw);
	}
}
