package ch10_bookshelf_1021;

public class BookShelf extends Shelf implements Queue{

	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); 
		//해당 어레이 리스트의 특정한 포지션의 원소를 제거.
		//0번째제거, 1번째를 땡긴다.
		//제거를 하면서 동시에 문자열로 반환.
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
