package test;

public class Bank {
	/*
	 * 함수 : 하나의 기능을 수행하는 일련의 코드
	 * 메소드 : 클래스 안에 정의된 함수
	 * 	입력을 받아서 처리결과를 반환하는 기능
	 * 	** 메소드를 호출할 때 메소드명이 일치해야 하며, 매개변수의 갯수와 type이 일치해야한다.
	 * public 반환자료형 메소드명(매개변수1, 매개변수 2, ..){
	 * 	수행문 
	 * }
	 * 반환자료형이 void일 때에는 결과값을 반호나하지 않는다.
	 * */
	
	private String name;									// 이름
	private String bankName;								// 은행이름
	private String accountNumber;						// 계좌번호
	//private int capital;									// 자본
	//private int fan;											// 부채
	//private int assets = capital + fan;
	private int assets;										// 자산
	private int deposit;										// 출금
	private int withdraw;									// 예금
	private boolean wdValid = true;					// 체크포인트(checkPoint)
	
	public Bank() {
		System.out.println("기본생성자 호출");
	}
	
	public Bank(String name, String bankName, String accountNumber, int assets, int deposit, int withdraw) {
		setName(name);
		setBankName(bankName);
		setAccountNumber(accountNumber);
		setAssets(assets);
		setDeposit(deposit);
		setWithdraw(withdraw);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAssets() {
		return assets;
	}

	public void setAssets(int assets) {
		this.assets = assets;
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
		if(assets+deposit < withdraw) {
			wdValid = false;
		} else {
			wdValid = true;
		}
		this.withdraw = withdraw;
	}

	// 금액 check_point
	public void inValidCheck(int money) {
		if(money < 0) {
			System.out.println("정확한 금액 정보가 아닙니다.");
		} else {
			System.out.println(money);
		}
	}
	
	public double calInterest() {
		if(assets + deposit - withdraw > 1000000) {
			return 2.0;
		} else {
			return 1.0;
		}
	}
	
	public void printBankInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("은행명 : " + getBankName());
		System.out.println("계좌번호 : " + getAccountNumber());
		System.out.println("자산 : "); inValidCheck(assets);
		System.out.println("입금 : "); inValidCheck(deposit);
		if(wdValid) {
		System.out.print("출금 : "); inValidCheck(withdraw);
		} else {
			System.out.println("출금할 돈이 없습니다.");
		}
		System.out.print("나의 잔고 : " ); inValidCheck(assets + deposit - withdraw);
		System.out.println("이율 : " + calInterest());
		System.out.println("이율 산출 금액 : " + (assets + deposit - withdraw) * (calInterest()/100));
		System.out.print("이율 합산 잔고 : "); inValidCheck(assets+deposit-withdraw + (int)((assets + deposit - withdraw) * (calInterest()/100)));
		
	}
	
}
