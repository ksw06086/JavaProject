package test;

public class CDInfo {
	private int registerNo;			// CD��ȣ
	private String title;				// CD�̸�
	
	public CDInfo(int registerNo, String title) {
		this.registerNo = registerNo;
		this.title = title;
	}

	public int getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
