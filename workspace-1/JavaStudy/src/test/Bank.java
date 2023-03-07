package test;

public class Bank {
	/*
	 * �Լ� : �ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�
	 * �޼ҵ� : Ŭ���� �ȿ� ���ǵ� �Լ�
	 * 	�Է��� �޾Ƽ� ó������� ��ȯ�ϴ� ���
	 * 	** �޼ҵ带 ȣ���� �� �޼ҵ���� ��ġ�ؾ� �ϸ�, �Ű������� ������ type�� ��ġ�ؾ��Ѵ�.
	 * public ��ȯ�ڷ��� �޼ҵ��(�Ű�����1, �Ű����� 2, ..){
	 * 	���๮ 
	 * }
	 * ��ȯ�ڷ����� void�� ������ ������� ��ȣ������ �ʴ´�.
	 * */
	
	private String name;									// �̸�
	private String bankName;								// �����̸�
	private String accountNumber;						// ���¹�ȣ
	//private int capital;									// �ں�
	//private int fan;											// ��ä
	//private int assets = capital + fan;
	private int assets;										// �ڻ�
	private int deposit;										// ���
	private int withdraw;									// ����
	private boolean wdValid = true;					// üũ����Ʈ(checkPoint)
	
	public Bank() {
		System.out.println("�⺻������ ȣ��");
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

	// �ݾ� check_point
	public void inValidCheck(int money) {
		if(money < 0) {
			System.out.println("��Ȯ�� �ݾ� ������ �ƴմϴ�.");
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
		System.out.println("�̸� : " + getName());
		System.out.println("����� : " + getBankName());
		System.out.println("���¹�ȣ : " + getAccountNumber());
		System.out.println("�ڻ� : "); inValidCheck(assets);
		System.out.println("�Ա� : "); inValidCheck(deposit);
		if(wdValid) {
		System.out.print("��� : "); inValidCheck(withdraw);
		} else {
			System.out.println("����� ���� �����ϴ�.");
		}
		System.out.print("���� �ܰ� : " ); inValidCheck(assets + deposit - withdraw);
		System.out.println("���� : " + calInterest());
		System.out.println("���� ���� �ݾ� : " + (assets + deposit - withdraw) * (calInterest()/100));
		System.out.print("���� �ջ� �ܰ� : "); inValidCheck(assets+deposit-withdraw + (int)((assets + deposit - withdraw) * (calInterest()/100)));
		
	}
	
}
