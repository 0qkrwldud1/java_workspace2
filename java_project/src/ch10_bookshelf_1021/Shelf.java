package ch10_bookshelf_1021;

import java.util.ArrayList;

public class Shelf {
	
	//상속을 받은 클래스에서만 보임.
	protected ArrayList<String> shelf;
	
	//기본생성자 -> 객체를 만들면 자동으로 어레이 리스트가 만들어진다.
	public Shelf(){
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount(){
		return shelf.size();
	}
}
