package ch08;

import java.util.ArrayList;

public class _04_Shelf {
	protected ArrayList<String> shelf;		// �ڷḮ��Ʈ : �ڷḦ ������� ������ ArrayList ����
	
	public _04_Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
