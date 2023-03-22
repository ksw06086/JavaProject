package ch08;

import java.util.ArrayList;

public class _04_Shelf {
	protected ArrayList<String> shelf;	// 자료리스트 : 자료를 순서대로 저장할 ArrayList 선언
	
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